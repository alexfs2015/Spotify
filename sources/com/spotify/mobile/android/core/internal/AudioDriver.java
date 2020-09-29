package com.spotify.mobile.android.core.internal;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.AudioTrack.OnPlaybackPositionUpdateListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.SparseArray;
import com.google.common.util.concurrent.AtomicDouble;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AudioDriver implements OnPlaybackPositionUpdateListener {
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int DELAY_IN_WRITES_BEFORE_ENABLING_EQUALIZER = 32;
    static final float DUCKING_LOWEST_VOLUME = 0.25f;
    private static final int DUCKING_RAMPDOWN_TIME_MS = 200;
    private static final int DUCKING_RAMPUP_TIME_MS = 1000;
    private static final int DUCKING_RAMP_TIME_DELTA_MS = 50;
    private static final boolean LOGGING_ENABLED = false;
    static final int MESSAGE_SET_VOLUME = 1;
    private static final int MINIMUM_WRITTEN_BEFORE_PLAY = 512;
    public static final int SPOTIFY_MAX_VOLUME = 65535;
    private static final SparseArray<AudioDriver> sSessionToSoundDriverMap = new SparseArray<>();
    private static final List<SoundDriverListener> sSoundDriverListeners = new ArrayList();
    private static SoundDriverVolumeController sSoundDriverVolumeController;
    private int mAudioContentType;
    private int mAudioStreamType;
    /* access modifiers changed from: private */
    public AudioTrack mAudioTrack;
    private int mBufferSizeInBytes;
    private int mBytesPerFrame;
    private int mChannelConfig;
    private boolean mCreateFailed;
    /* access modifiers changed from: private */
    public final AtomicDouble mCurrentVolumeGain;
    private float mCurrentVolumeTarget;
    /* access modifiers changed from: private */
    public final Object mDestructionMutex;
    private final AtomicInteger mEqualizerEnableCountdown;
    private int mFramesBufferedBeforePlay;
    private VolumeHandler mHandler;
    private HandlerThread mHandlerThread;
    private Looper mLooper;
    private int mMarkerFallbackPosition;
    private final NativeWrapper mNativeWrapper;
    private boolean mOpen;
    private boolean mPaused;
    private boolean mPlaying;
    private final Object mPositionMutex;
    private int mSampleRate;
    private long nThis;

    class DefaultNativeWrapper implements NativeWrapper {
        private DefaultNativeWrapper() {
        }

        public void onBufferUnderrun() {
            AudioDriver.this.onBufferUnderrun();
        }

        public void onDestroy() {
            AudioDriver.this.onDestroy();
        }

        public void onFlush() {
            AudioDriver.this.onFlush();
        }
    }

    public interface NativeWrapper {
        void onBufferUnderrun();

        void onDestroy();

        void onFlush();
    }

    public interface SoundDriverListener {
        void onAudioTrackCreated(int i);

        void onAudioTrackDestroyed(int i);

        void onEqualizerShouldBeEnabled(int i);

        void onPaused(boolean z);
    }

    public interface SoundDriverVolumeController {
        int onGetVolume();

        void onSetVolume(int i);
    }

    static class VolumeHandler extends Handler {
        private final AudioDriver mAudioDriver;

        private VolumeHandler(Looper looper, AudioDriver audioDriver) {
            super(looper);
            this.mAudioDriver = audioDriver;
        }

        public void handleMessage(Message message) {
            synchronized (this.mAudioDriver.mDestructionMutex) {
                try {
                    if (message.what == 1) {
                        if (this.mAudioDriver.mAudioTrack != null) {
                            Float f = (Float) message.obj;
                            AudioDriver.setAudioTrackVolume(f.floatValue(), this.mAudioDriver.mAudioTrack);
                            this.mAudioDriver.mCurrentVolumeGain.a((double) f.floatValue());
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    public AudioDriver() {
        this.mPositionMutex = new Object();
        this.mDestructionMutex = new Object();
        this.mEqualizerEnableCountdown = new AtomicInteger(32);
        this.mCurrentVolumeGain = new AtomicDouble((double) AudioTrack.getMaxVolume());
        this.mCurrentVolumeTarget = 1.0f;
        this.mNativeWrapper = new DefaultNativeWrapper();
    }

    AudioDriver(NativeWrapper nativeWrapper, Looper looper) {
        this.mPositionMutex = new Object();
        this.mDestructionMutex = new Object();
        this.mEqualizerEnableCountdown = new AtomicInteger(32);
        this.mCurrentVolumeGain = new AtomicDouble((double) AudioTrack.getMaxVolume());
        this.mCurrentVolumeTarget = 1.0f;
        this.mNativeWrapper = nativeWrapper;
        this.mLooper = looper;
    }

    public static void addListener(SoundDriverListener soundDriverListener) {
        sSoundDriverListeners.add(soundDriverListener);
    }

    private void cancelDucking(int i) {
        this.mHandler.removeMessages(1);
        sendVolumeUpdateDelayed(AudioTrack.getMaxVolume(), i);
    }

    public static void cancelDuckingAudioSession(int i) {
        cancelDuckingAudioSession(i, 0);
    }

    public static void cancelDuckingAudioSession(int i, int i2) {
        AudioDriver audioDriver = (AudioDriver) sSessionToSoundDriverMap.get(i);
        if (audioDriver != null) {
            audioDriver.cancelDucking(i2);
        }
    }

    public static void clearListeners() {
        sSoundDriverListeners.clear();
    }

    private AudioAttributes constructAudioAttributes() {
        Builder contentType = new Builder().setAllowedCapturePolicy(2).setContentType(this.mAudioContentType);
        int i = 4;
        if (this.mAudioStreamType != 4) {
            i = 1;
        }
        return contentType.setUsage(i).build();
    }

    private AudioAttributes constructAudioAttributesLollipop() {
        Builder contentType = new Builder().setContentType(this.mAudioContentType);
        int i = 4;
        int i2 = 5 >> 4;
        if (this.mAudioStreamType != 4) {
            i = 1;
        }
        return contentType.setUsage(i).build();
    }

    private AudioTrack constructAudioTrack() {
        AudioAttributes constructAudioAttributes = VERSION.SDK_INT >= 29 ? constructAudioAttributes() : constructAudioAttributesLollipop();
        AudioAttributes audioAttributes = constructAudioAttributes;
        AudioTrack audioTrack = r1;
        AudioTrack audioTrack2 = new AudioTrack(constructAudioAttributes, new AudioFormat.Builder().setSampleRate(this.mSampleRate).setChannelMask(this.mChannelConfig).setEncoding(2).build(), this.mBufferSizeInBytes, 1, 0);
        return audioTrack2;
    }

    private AudioTrack constructAudioTrackLegacy() {
        boolean z = true | true;
        AudioTrack audioTrack = new AudioTrack(this.mAudioStreamType, this.mSampleRate, this.mChannelConfig, 2, this.mBufferSizeInBytes, 1);
        return audioTrack;
    }

    private void createAudioTrack() {
        AudioTrack constructAudioTrack = VERSION.SDK_INT >= 21 ? constructAudioTrack() : constructAudioTrackLegacy();
        if (constructAudioTrack.getState() == 0) {
            boolean z = !true;
            this.mCreateFailed = true;
            return;
        }
        this.mCreateFailed = false;
        this.mAudioTrack = constructAudioTrack;
        this.mAudioTrack.setPlaybackPositionUpdateListener(this, this.mHandler);
        synchronized (this.mPositionMutex) {
            try {
                this.mMarkerFallbackPosition = 0;
            } finally {
                while (true) {
                }
            }
        }
        setAudioTrackVolume(AudioTrack.getMaxVolume() * this.mCurrentVolumeGain.floatValue(), this.mAudioTrack);
        sSessionToSoundDriverMap.put(this.mAudioTrack.getAudioSessionId(), this);
        dispatchOnAudioTrackCreated(this.mAudioTrack.getAudioSessionId());
        this.mEqualizerEnableCountdown.set(32);
    }

    private void destroyAudioTrack() {
        if (this.mAudioTrack != null) {
            synchronized (this.mDestructionMutex) {
                try {
                    dispatchOnAudioTrackDestroyed(this.mAudioTrack.getAudioSessionId());
                    sSessionToSoundDriverMap.delete(this.mAudioTrack.getAudioSessionId());
                    this.mPlaying = false;
                    this.mAudioTrack.setPlaybackPositionUpdateListener(null, this.mHandler);
                    this.mAudioTrack.flush();
                    this.mAudioTrack.stop();
                    this.mAudioTrack.release();
                    this.mAudioTrack = null;
                    this.mHandler.removeMessages(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void dispatchOnAudioTrackCreated(int i) {
        for (SoundDriverListener onAudioTrackCreated : sSoundDriverListeners) {
            onAudioTrackCreated.onAudioTrackCreated(i);
        }
    }

    public static void dispatchOnAudioTrackDestroyed(int i) {
        for (SoundDriverListener onAudioTrackDestroyed : sSoundDriverListeners) {
            onAudioTrackDestroyed.onAudioTrackDestroyed(i);
        }
    }

    private static int mapCoreAudioContentTypeToAndroidAudioContentType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        Object[] objArr = {Integer.valueOf(i)};
        String str = "ArstadnriCl bocvpnut o.tudee dyFf  oaociTatcnUo do.nnieen kdipnlltw%a gek ";
        Logger.d("Unknown core AudioContentType %d provided. Falling back to default action.", objArr);
        return 2;
    }

    private static int mapCoreStreamTypeToAndroidStreamType(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        Object[] objArr = {Integer.valueOf(i)};
        String str = "deFmA%p.dgeiU  at bnp ivkotrionad krocy e.matnwi olca SnlctfToanddore lue";
        Logger.d("Unknown core AudioStreamType %d provided. Falling back to default action.", objArr);
        return 3;
    }

    /* JADX INFO: finally extract failed */
    private void maybeStartPlayback() {
        if (!this.mPaused && this.mPlaying) {
            synchronized (this.mPositionMutex) {
                try {
                    if (this.mFramesBufferedBeforePlay >= MINIMUM_WRITTEN_BEFORE_PLAY) {
                        this.mAudioTrack.play();
                        this.mFramesBufferedBeforePlay = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void notifyEqualizerEnable() {
        if (this.mAudioTrack != null) {
            for (SoundDriverListener onEqualizerShouldBeEnabled : sSoundDriverListeners) {
                onEqualizerShouldBeEnabled.onEqualizerShouldBeEnabled(this.mAudioTrack.getAudioSessionId());
            }
        }
    }

    /* access modifiers changed from: private */
    public native void onBufferUnderrun();

    /* access modifiers changed from: private */
    public native void onDestroy();

    /* access modifiers changed from: private */
    public native void onFlush();

    public static void removeListener(SoundDriverListener soundDriverListener) {
        sSoundDriverListeners.remove(soundDriverListener);
    }

    private void sendVolumeUpdateDelayed(float f, int i) {
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, Float.valueOf(f)), (long) i);
    }

    /* access modifiers changed from: private */
    public static void setAudioTrackVolume(float f, AudioTrack audioTrack) {
        if (VERSION.SDK_INT >= 21) {
            audioTrack.setVolume(f);
        } else {
            audioTrack.setStereoVolume(f, f);
        }
    }

    public static void setSoundDriverVolumeController(SoundDriverVolumeController soundDriverVolumeController) {
        sSoundDriverVolumeController = soundDriverVolumeController;
    }

    private static int snapRampTimeToDelta(int i) {
        int i2 = i % 50;
        if (i2 != 0) {
            i = (i + 50) - i2;
        }
        return i;
    }

    private void startDucking(int i, float f) {
        this.mHandler.removeMessages(1);
        if (f >= 0.0f) {
            if (f <= 1.0f) {
                float floatValue = this.mCurrentVolumeGain.floatValue() - f;
                int snapRampTimeToDelta = snapRampTimeToDelta((int) ((floatValue / (AudioTrack.getMaxVolume() - f)) * ((float) i)));
                if (snapRampTimeToDelta >= 0) {
                    this.mCurrentVolumeTarget = f;
                    if (snapRampTimeToDelta == 0) {
                        sendVolumeUpdateDelayed(f, 0);
                        return;
                    }
                    for (int i2 = 0; i2 <= snapRampTimeToDelta; i2 += 50) {
                        sendVolumeUpdateDelayed(((((float) (snapRampTimeToDelta - i2)) / ((float) snapRampTimeToDelta)) * floatValue) + f, i2);
                    }
                    return;
                }
                return;
            }
        }
        Assertion.b("Requested volume must be between 0.0 and 1.0");
    }

    public static void startDuckingAudioSession(int i) {
        startDuckingAudioSession(i, 200, DUCKING_LOWEST_VOLUME);
    }

    public static void startDuckingAudioSession(int i, int i2, float f) {
        AudioDriver audioDriver = (AudioDriver) sSessionToSoundDriverMap.get(i);
        if (audioDriver != null) {
            audioDriver.startDucking(i2, f);
        }
    }

    private void stopDucking(int i) {
        this.mHandler.removeMessages(1);
        float maxVolume = AudioTrack.getMaxVolume();
        float floatValue = this.mCurrentVolumeGain.floatValue();
        float f = this.mCurrentVolumeTarget;
        int snapRampTimeToDelta = snapRampTimeToDelta((int) ((1.0f - ((floatValue - f) / (maxVolume - f))) * ((float) i)));
        if (snapRampTimeToDelta >= 0) {
            this.mCurrentVolumeTarget = 1.0f;
            if (snapRampTimeToDelta == 0) {
                sendVolumeUpdateDelayed(AudioTrack.getMaxVolume(), 0);
                return;
            }
            for (int i2 = 0; i2 <= snapRampTimeToDelta; i2 += 50) {
                sendVolumeUpdateDelayed(((((float) i2) / ((float) snapRampTimeToDelta)) * (maxVolume - floatValue)) + floatValue, i2);
            }
        }
    }

    public static void stopDuckingAudioSession(int i) {
        stopDuckingAudioSession(i, DUCKING_RAMPUP_TIME_MS);
    }

    public static void stopDuckingAudioSession(int i, int i2) {
        AudioDriver audioDriver = (AudioDriver) sSessionToSoundDriverMap.get(i);
        if (audioDriver != null) {
            audioDriver.stopDucking(i2);
        }
    }

    public void destroy() {
        this.mPlaying = false;
        this.mPaused = true;
        this.mOpen = false;
        for (SoundDriverListener onPaused : sSoundDriverListeners) {
            onPaused.onPaused(true);
        }
        if (this.mAudioTrack != null) {
            destroyAudioTrack();
            this.mNativeWrapper.onDestroy();
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                try {
                    handlerThread.quit();
                    handlerThread.join(1000);
                } catch (InterruptedException e) {
                    String str = "reInonoir ugnpon awtftott ej iai dtn othtiairicdirweholef";
                    Logger.d(e, "Interrupted while waiting for notification thread to join", new Object[0]);
                }
            }
            this.mHandlerThread = null;
            this.mHandler = null;
        }
    }

    public void flush() {
        if (this.mOpen) {
            this.mPlaying = false;
            this.mFramesBufferedBeforePlay = 0;
            if (this.mCreateFailed) {
                createAudioTrack();
            } else {
                AudioTrack audioTrack = this.mAudioTrack;
                if (audioTrack != null) {
                    audioTrack.pause();
                    destroyAudioTrack();
                    createAudioTrack();
                } else {
                    return;
                }
            }
            this.mNativeWrapper.onFlush();
            return;
        }
        throw new IllegalStateException("cannot call flush() on destroyed object");
    }

    /* access modifiers changed from: 0000 */
    public AudioTrack getAudioTrack() {
        return this.mAudioTrack;
    }

    public int getFreeSize() {
        if (this.mAudioTrack == null) {
            return 0;
        }
        return this.mBufferSizeInBytes - (this.mBytesPerFrame * getQueuedSize());
    }

    public int getPosition() {
        int max;
        if (this.mAudioTrack == null) {
            return 0;
        }
        synchronized (this.mPositionMutex) {
            try {
                max = Math.max(0, this.mAudioTrack.getPlaybackHeadPosition());
            } catch (Throwable th) {
                throw th;
            }
        }
        return max;
    }

    public int getQueuedSize() {
        if (this.mAudioTrack == null) {
            return 0;
        }
        synchronized (this.mPositionMutex) {
            try {
                if (this.mPlaying) {
                    int notificationMarkerPosition = this.mAudioTrack.getNotificationMarkerPosition();
                    if (notificationMarkerPosition == 0) {
                        notificationMarkerPosition = this.mMarkerFallbackPosition;
                    }
                    int max = Math.max(0, notificationMarkerPosition - this.mAudioTrack.getPlaybackHeadPosition());
                    return max;
                }
                int i = this.mFramesBufferedBeforePlay;
                return i;
            } finally {
            }
        }
    }

    public int getVolume() {
        SoundDriverVolumeController soundDriverVolumeController = sSoundDriverVolumeController;
        return soundDriverVolumeController != null ? soundDriverVolumeController.onGetVolume() : SPOTIFY_MAX_VOLUME;
    }

    public VolumeHandler getVolumeHandler() {
        return this.mHandler;
    }

    public boolean isPlaying() {
        if (this.mAudioTrack == null) {
            return false;
        }
        return this.mPlaying && getQueuedSize() > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0042, code lost:
        r5 = sSoundDriverListeners.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004f, code lost:
        if (r5.hasNext() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0051, code lost:
        ((com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverListener) r5.next()).onPaused(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0062, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMarkerReached(android.media.AudioTrack r5) {
        /*
            r4 = this;
            boolean r0 = r4.mOpen
            r3 = 6
            if (r0 != 0) goto L_0x0007
            r3 = 1
            return
        L_0x0007:
            r3 = 7
            java.lang.Object r0 = r4.mPositionMutex
            monitor-enter(r0)
            r3 = 1
            boolean r1 = r4.mOpen     // Catch:{ all -> 0x0067 }
            r3 = 4
            if (r1 != 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            r3 = 1
            return
        L_0x0014:
            r3 = 1
            java.lang.Object r1 = r4.mDestructionMutex     // Catch:{ all -> 0x0067 }
            r3 = 5
            monitor-enter(r1)     // Catch:{ all -> 0x0067 }
            r3 = 5
            android.media.AudioTrack r2 = r4.mAudioTrack     // Catch:{ all -> 0x0062 }
            boolean r2 = defpackage.jvi.b(r5, r2)     // Catch:{ all -> 0x0062 }
            r3 = 3
            if (r2 != 0) goto L_0x0027
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            r3 = 7
            return
        L_0x0027:
            r3 = 3
            int r2 = r5.getNotificationMarkerPosition()     // Catch:{ all -> 0x0062 }
            r3 = 6
            if (r2 != 0) goto L_0x0032
            r3 = 7
            int r2 = r4.mMarkerFallbackPosition     // Catch:{ all -> 0x0062 }
        L_0x0032:
            int r5 = r5.getPlaybackHeadPosition()     // Catch:{ all -> 0x0062 }
            r3 = 1
            if (r5 < r2) goto L_0x003f
            com.spotify.mobile.android.core.internal.AudioDriver$NativeWrapper r5 = r4.mNativeWrapper     // Catch:{ all -> 0x0062 }
            r3 = 7
            r5.onBufferUnderrun()     // Catch:{ all -> 0x0062 }
        L_0x003f:
            r3 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            r3 = 6
            java.util.List<com.spotify.mobile.android.core.internal.AudioDriver$SoundDriverListener> r5 = sSoundDriverListeners
            java.util.Iterator r5 = r5.iterator()
        L_0x0049:
            r3 = 4
            boolean r0 = r5.hasNext()
            r3 = 2
            if (r0 == 0) goto L_0x0060
            r3 = 7
            java.lang.Object r0 = r5.next()
            com.spotify.mobile.android.core.internal.AudioDriver$SoundDriverListener r0 = (com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverListener) r0
            r3 = 3
            r1 = 1
            r3 = 2
            r0.onPaused(r1)
            r3 = 7
            goto L_0x0049
        L_0x0060:
            r3 = 4
            return
        L_0x0062:
            r5 = move-exception
            r3 = 4
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            r3 = 7
            throw r5     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            r3 = 6
            goto L_0x006c
        L_0x006b:
            throw r5
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.core.internal.AudioDriver.onMarkerReached(android.media.AudioTrack):void");
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public void open(int i, int i2) {
        open(i, i2, 0);
    }

    public void open(int i, int i2, int i3) {
        open(i, i2, i3, 0);
    }

    public void open(int i, int i2, int i3, int i4) {
        Process.setThreadPriority(-16);
        this.mSampleRate = i;
        this.mChannelConfig = i2 == 1 ? 4 : 12;
        this.mAudioStreamType = mapCoreStreamTypeToAndroidStreamType(i3);
        if (VERSION.SDK_INT >= 21) {
            this.mAudioContentType = mapCoreAudioContentTypeToAndroidAudioContentType(i4);
        }
        this.mBytesPerFrame = i2 * 2;
        this.mBufferSizeInBytes = this.mBytesPerFrame * i;
        this.mBufferSizeInBytes = Math.max(this.mBufferSizeInBytes, AudioTrack.getMinBufferSize(i, this.mChannelConfig, 2));
        if (this.mLooper == null) {
            HandlerThread handlerThread = new HandlerThread("SoundDriverHandlerThread");
            handlerThread.start();
            this.mLooper = handlerThread.getLooper();
            this.mHandlerThread = handlerThread;
        }
        this.mHandler = new VolumeHandler(this.mLooper, this);
        this.mOpen = true;
        createAudioTrack();
        if (this.mAudioTrack != null) {
            synchronized (this.mPositionMutex) {
                try {
                    this.mAudioTrack.setNotificationMarkerPosition(0);
                    this.mMarkerFallbackPosition = 0;
                } finally {
                }
            }
        }
    }

    public void setPaused(boolean z) {
        this.mPaused = z;
        for (SoundDriverListener onPaused : sSoundDriverListeners) {
            onPaused.onPaused(z);
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            if (this.mPaused) {
                audioTrack.pause();
            } else {
                maybeStartPlayback();
            }
        }
    }

    public void setVolume(int i) {
        SoundDriverVolumeController soundDriverVolumeController = sSoundDriverVolumeController;
        if (soundDriverVolumeController != null) {
            soundDriverVolumeController.onSetVolume(i);
        }
    }

    public void startPlayback() {
        this.mPlaying = true;
        maybeStartPlayback();
        for (SoundDriverListener onPaused : sSoundDriverListeners) {
            onPaused.onPaused(false);
        }
    }

    public void stopPlayback() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.pause();
        }
    }

    /* JADX INFO: finally extract failed */
    public int write(byte[] bArr, int i) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null) {
            return 0;
        }
        int write = audioTrack.write(bArr, 0, i);
        if (write <= 0) {
            return 0;
        }
        if (this.mEqualizerEnableCountdown.get() > 0 && this.mEqualizerEnableCountdown.decrementAndGet() == 0) {
            notifyEqualizerEnable();
        }
        synchronized (this.mPositionMutex) {
            try {
                this.mAudioTrack.setNotificationMarkerPosition(this.mAudioTrack.getNotificationMarkerPosition() + (write / this.mBytesPerFrame));
                this.mMarkerFallbackPosition += write / this.mBytesPerFrame;
                if (this.mAudioTrack.getPlayState() != 3) {
                    this.mFramesBufferedBeforePlay += write / this.mBytesPerFrame;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        maybeStartPlayback();
        return write;
    }
}
