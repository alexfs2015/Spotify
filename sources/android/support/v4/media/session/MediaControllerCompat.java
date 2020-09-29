package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaController.TransportControls;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class MediaControllerCompat {
    public final b a;
    private final Token b;
    private final ConcurrentHashMap<a, Boolean> c = new ConcurrentHashMap<>();

    static class MediaControllerImplApi21 implements b {
        final Object a = new Object();
        final List<a> b = new ArrayList();
        HashMap<a, a> c = new HashMap<>();
        final Token d;
        private MediaController e;

        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.a) {
                        mediaControllerImplApi21.d.b = defpackage.g.a.a(fd.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        mediaControllerImplApi21.d.c = sb.a(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
                        if (mediaControllerImplApi21.d.b != null) {
                            for (a aVar : mediaControllerImplApi21.b) {
                                a aVar2 = new a(aVar);
                                mediaControllerImplApi21.c.put(aVar, aVar2);
                                aVar.b = aVar2;
                                try {
                                    mediaControllerImplApi21.d.b.a((defpackage.f) aVar2);
                                    aVar.a(13, null, null);
                                } catch (RemoteException e) {
                                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                                }
                            }
                            mediaControllerImplApi21.b.clear();
                        }
                    }
                }
            }
        }

        static class a extends c {
            a(a aVar) {
                super(aVar);
            }

            public final void a() {
                throw new AssertionError();
            }

            public final void a(Bundle bundle) {
                throw new AssertionError();
            }

            public final void a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public final void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            public final void a(CharSequence charSequence) {
                throw new AssertionError();
            }

            public final void a(List<QueueItem> list) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) {
            this.d = token;
            this.e = new MediaController(context, (MediaSession.Token) this.d.a);
            if (this.d.b == null) {
                this.e.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        public final e a() {
            return new f(this.e.getTransportControls());
        }

        public final void a(a aVar) {
            this.e.unregisterCallback(aVar.a);
            synchronized (this.a) {
                if (this.d.b != null) {
                    try {
                        a aVar2 = (a) this.c.remove(aVar);
                        if (aVar2 != null) {
                            aVar.b = null;
                            this.d.b.b((defpackage.f) aVar2);
                        }
                    } catch (RemoteException e2) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e2);
                    }
                } else {
                    this.b.remove(aVar);
                }
            }
        }

        public final void a(a aVar, Handler handler) {
            this.e.registerCallback(aVar.a, handler);
            synchronized (this.a) {
                if (this.d.b != null) {
                    a aVar2 = new a(aVar);
                    this.c.put(aVar, aVar2);
                    aVar.b = aVar2;
                    try {
                        this.d.b.a((defpackage.f) aVar2);
                        aVar.a(13, null, null);
                    } catch (RemoteException e2) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                    }
                } else {
                    aVar.b = null;
                    this.b.add(aVar);
                }
            }
        }

        public final boolean a(KeyEvent keyEvent) {
            return this.e.dispatchMediaButtonEvent(keyEvent);
        }

        public final PlaybackStateCompat b() {
            if (this.d.b != null) {
                try {
                    return this.d.b.h();
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e2);
                }
            }
            PlaybackState playbackState = this.e.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.a(playbackState);
            }
            return null;
        }

        public final MediaMetadataCompat c() {
            MediaMetadata metadata = this.e.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.a((Object) metadata);
            }
            return null;
        }

        public final PendingIntent d() {
            return this.e.getSessionActivity();
        }
    }

    public static abstract class a implements DeathRecipient {
        final Callback a;
        defpackage.f b;
        private b c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a reason: collision with other inner class name */
        static class C0001a extends Callback {
            private final WeakReference<a> a;

            C0001a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public final void onAudioInfoChanged(PlaybackInfo playbackInfo) {
                if (((a) this.a.get()) != null) {
                    new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.a((Object) playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
                }
            }

            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.b(bundle);
                this.a.get();
            }

            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(MediaMetadataCompat.a((Object) mediaMetadata));
                }
            }

            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = (a) this.a.get();
                if (aVar != null && aVar.b == null) {
                    aVar.a(PlaybackStateCompat.a(playbackState));
                }
            }

            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                if (((a) this.a.get()) != null) {
                    QueueItem.a(list);
                }
            }

            public final void onQueueTitleChanged(CharSequence charSequence) {
                this.a.get();
            }

            public final void onSessionDestroyed() {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a();
                }
            }

            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a aVar = (a) this.a.get();
                if (aVar != null && aVar.b != null) {
                    int i = VERSION.SDK_INT;
                }
            }
        }

        class b extends Handler {
            boolean a = false;

            b(Looper looper) {
                super(looper);
            }

            public final void handleMessage(Message message) {
                if (this.a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.b(message.getData());
                            Object obj = message.obj;
                            break;
                        case 2:
                            a.this.a((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            a.this.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            Object obj2 = message.obj;
                            return;
                        case 5:
                            Object obj3 = message.obj;
                            return;
                        case 6:
                            Object obj4 = message.obj;
                            return;
                        case 7:
                            MediaSessionCompat.b((Bundle) message.obj);
                            return;
                        case 8:
                            a.this.a();
                            break;
                        case 9:
                            ((Integer) message.obj).intValue();
                            return;
                        case 11:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case 12:
                            ((Integer) message.obj).intValue();
                            return;
                    }
                }
            }
        }

        static class c extends defpackage.f.a {
            private final WeakReference<a> a;

            c(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public void a() {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(8, null, null);
                }
            }

            public final void a(int i) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(9, Integer.valueOf(i), null);
                }
            }

            public void a(Bundle bundle) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(7, bundle, null);
                }
            }

            public void a(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(3, mediaMetadataCompat, null);
                }
            }

            public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.a, parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.d, parcelableVolumeInfo.e) : null, null);
                }
            }

            public final void a(PlaybackStateCompat playbackStateCompat) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(2, playbackStateCompat, null);
                }
            }

            public void a(CharSequence charSequence) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(6, charSequence, null);
                }
            }

            public final void a(String str, Bundle bundle) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(1, str, bundle);
                }
            }

            public void a(List<QueueItem> list) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(5, list, null);
                }
            }

            public final void a(boolean z) {
            }

            public final void b() {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(13, null, null);
                }
            }

            public final void b(int i) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(12, Integer.valueOf(i), null);
                }
            }

            public final void b(boolean z) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(11, Boolean.valueOf(z), null);
                }
            }
        }

        public a() {
            if (VERSION.SDK_INT >= 21) {
                this.a = new C0001a(this);
                return;
            }
            this.a = null;
            this.b = new c(this);
        }

        public void a() {
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, Object obj, Bundle bundle) {
            b bVar = this.c;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(Handler handler) {
            if (handler == null) {
                b bVar = this.c;
                if (bVar != null) {
                    bVar.a = false;
                    bVar.removeCallbacksAndMessages(null);
                    this.c = null;
                }
            } else {
                this.c = new b(handler.getLooper());
                this.c.a = true;
            }
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void a(PlaybackStateCompat playbackStateCompat) {
        }

        public void binderDied() {
            a(8, null, null);
        }
    }

    public interface b {
        e a();

        void a(a aVar);

        void a(a aVar, Handler handler);

        boolean a(KeyEvent keyEvent);

        PlaybackStateCompat b();

        MediaMetadataCompat c();

        PendingIntent d();
    }

    static class c implements b {
        private defpackage.g a;
        private e b;

        public c(Token token) {
            this.a = defpackage.g.a.a((IBinder) token.a);
        }

        public final e a() {
            if (this.b == null) {
                this.b = new g(this.a);
            }
            return this.b;
        }

        public final void a(a aVar) {
            if (aVar != null) {
                try {
                    this.a.b(aVar.b);
                    this.a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public final void a(a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.a.asBinder().linkToDeath(aVar, 0);
                    this.a.a(aVar.b);
                    aVar.a(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    aVar.a(8, null, null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public final boolean a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.a.a(keyEvent);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                }
                return false;
            }
            throw new IllegalArgumentException("event may not be null.");
        }

        public final PlaybackStateCompat b() {
            try {
                return this.a.h();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                return null;
            }
        }

        public final MediaMetadataCompat c() {
            try {
                return this.a.g();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata.", e);
                return null;
            }
        }

        public final PendingIntent d() {
            try {
                return this.a.d();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e);
                return null;
            }
        }
    }

    public static final class d {
        private final int a;
        private final AudioAttributesCompat b;
        private final int c;
        private final int d;
        private final int e;

        d(int i, int i2, int i3, int i4, int i5) {
            androidx.media.AudioAttributesCompat.a aVar = new androidx.media.AudioAttributesCompat.a();
            aVar.a.a(i2);
            this(i, new AudioAttributesCompat(aVar.a.a()), i3, i4, i5);
        }

        d(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.a = i;
            this.b = audioAttributesCompat;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static abstract class e {
        e() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    static class f extends e {
        private TransportControls a;

        f(TransportControls transportControls) {
            this.a = transportControls;
        }

        public final void a() {
            this.a.play();
        }

        public final void b() {
            this.a.pause();
        }

        public final void c() {
            this.a.stop();
        }
    }

    static class g extends e {
        private defpackage.g a;

        public g(defpackage.g gVar) {
            this.a = gVar;
        }

        public final void a() {
            try {
                this.a.s();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in play.", e);
            }
        }

        public final void b() {
            try {
                this.a.t();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in pause.", e);
            }
        }

        public final void c() {
            try {
                this.a.u();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in stop.", e);
            }
        }
    }

    public MediaControllerCompat(Context context, Token token) {
        if (token != null) {
            this.b = token;
            if (VERSION.SDK_INT >= 21) {
                this.a = new MediaControllerImplApi21(context, token);
            } else {
                this.a = new c(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        b bVar;
        this.b = mediaSessionCompat.c();
        try {
            bVar = VERSION.SDK_INT >= 21 ? new MediaControllerImplApi21(context, this.b) : new c(this.b);
        } catch (RemoteException unused) {
            bVar = null;
        }
        this.a = bVar;
    }

    public final e a() {
        return this.a.a();
    }

    public final void a(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.c.putIfAbsent(aVar, Boolean.TRUE) == null) {
            Handler handler = new Handler();
            aVar.a(handler);
            this.a.a(aVar, handler);
        }
    }

    public final PlaybackStateCompat b() {
        return this.a.b();
    }

    public final void b(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.c.remove(aVar) != null) {
            try {
                this.a.a(aVar);
            } finally {
                aVar.a((Handler) null);
            }
        }
    }

    public final MediaMetadataCompat c() {
        return this.a.c();
    }
}
