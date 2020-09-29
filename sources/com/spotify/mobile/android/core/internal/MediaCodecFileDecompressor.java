package com.spotify.mobile.android.core.internal;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.nio.ByteBuffer;

public class MediaCodecFileDecompressor {
    private MediaCodec mCodec;
    private boolean mEndOfInputStream;
    private ByteBuffer[] mInputBuffers;
    private MediaFormat mInputFormat;
    private final MediaCodecFactory mMediaCodecFactory;
    private MediaExtractor mMediaExtractor;
    private final MediaExtractorFactory mMediaExtractorFactory;
    private final NativeWrapper mNativeWrapper;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputFormat;
    private long nThis;

    static class DefaultMediaCodecFactory implements MediaCodecFactory {
        private DefaultMediaCodecFactory() {
        }

        public MediaCodec createDecoderByType(String str) {
            return MediaCodec.createDecoderByType(str);
        }
    }

    static class DefaultMediaExtractorFactory implements MediaExtractorFactory {
        private DefaultMediaExtractorFactory() {
        }

        public MediaExtractor createExtractor() {
            return new MediaExtractor();
        }
    }

    class DefaultNativeWrapper implements NativeWrapper {
        private DefaultNativeWrapper() {
        }

        public void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z) {
            MediaCodecFileDecompressor.this.onOutputBuffer(byteBuffer, i, i2, z);
        }
    }

    public interface MediaCodecFactory {
        MediaCodec createDecoderByType(String str);
    }

    public interface MediaExtractorFactory {
        MediaExtractor createExtractor();
    }

    public interface NativeWrapper {
        void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);
    }

    /* access modifiers changed from: private */
    public native void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);

    public MediaCodecFileDecompressor() {
        this.mNativeWrapper = new DefaultNativeWrapper();
        this.mMediaCodecFactory = new DefaultMediaCodecFactory();
        this.mMediaExtractorFactory = new DefaultMediaExtractorFactory();
    }

    MediaCodecFileDecompressor(NativeWrapper nativeWrapper, MediaCodecFactory mediaCodecFactory, MediaExtractorFactory mediaExtractorFactory) {
        this.mNativeWrapper = nativeWrapper;
        this.mMediaCodecFactory = mediaCodecFactory;
        this.mMediaExtractorFactory = mediaExtractorFactory;
    }

    public boolean open(String str) {
        try {
            this.mMediaExtractor = this.mMediaExtractorFactory.createExtractor();
            this.mMediaExtractor.setDataSource(str);
            int trackCount = this.mMediaExtractor.getTrackCount();
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    break;
                }
                this.mInputFormat = this.mMediaExtractor.getTrackFormat(i);
                String string = this.mInputFormat.getString("mime");
                if (string.startsWith("audio/")) {
                    this.mMediaExtractor.selectTrack(i);
                    this.mCodec = this.mMediaCodecFactory.createDecoderByType(string);
                    this.mCodec.configure(this.mInputFormat, null, null, 0);
                    break;
                }
                i++;
            }
            MediaCodec mediaCodec = this.mCodec;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.start();
            this.mInputBuffers = this.mCodec.getInputBuffers();
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
            int i2 = 0;
            while (this.mOutputFormat == null) {
                decodeInternal(false);
                i2++;
                if (i2 > 100) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void destroy() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mCodec.release();
        }
        MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }

    public void seekToUs(long j) {
        this.mMediaExtractor.seekTo(j, 1);
        this.mCodec.flush();
        this.mEndOfInputStream = false;
    }

    public int getSampleRate() {
        String str = "sample-rate";
        if (this.mOutputFormat.containsKey(str)) {
            return this.mOutputFormat.getInteger(str);
        }
        return -1;
    }

    public int getChannelCount() {
        String str = "channel-count";
        if (this.mOutputFormat.containsKey(str)) {
            return this.mOutputFormat.getInteger(str);
        }
        return -1;
    }

    public long getDurationUs() {
        String str = "durationUs";
        if (this.mInputFormat.containsKey(str)) {
            return this.mInputFormat.getLong(str);
        }
        return -1;
    }

    public String getMimeType() {
        String str = "mime";
        return this.mInputFormat.containsKey(str) ? this.mInputFormat.getString(str) : "";
    }

    public void decode() {
        decodeInternal(true);
    }

    private void decodeInternal(boolean z) {
        boolean z2 = false;
        if (!this.mEndOfInputStream) {
            int dequeueInputBuffer = this.mCodec.dequeueInputBuffer(0);
            if (dequeueInputBuffer >= 0) {
                int readSampleData = this.mMediaExtractor.readSampleData(this.mInputBuffers[dequeueInputBuffer], 0);
                if (readSampleData < 0) {
                    this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                    this.mEndOfInputStream = true;
                } else {
                    this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mMediaExtractor.getSampleTime(), 0);
                    this.mMediaExtractor.advance();
                }
            }
        }
        BufferInfo bufferInfo = new BufferInfo();
        int dequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, 0);
        if (dequeueOutputBuffer >= 0) {
            if (z) {
                if ((bufferInfo.flags & 4) == 4) {
                    z2 = true;
                }
                this.mNativeWrapper.onOutputBuffer(this.mOutputBuffers[dequeueOutputBuffer], bufferInfo.offset, bufferInfo.size, z2);
            } else {
                Logger.e("Got data before output format, that shouldn't happen!", new Object[0]);
            }
            this.mCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
        } else if (dequeueOutputBuffer == -3) {
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
        } else {
            if (dequeueOutputBuffer == -2) {
                this.mOutputFormat = this.mCodec.getOutputFormat();
            }
        }
    }
}
