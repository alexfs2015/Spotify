package com.spotify.mobile.android.core.internal;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;

public class MediaCodecDecompressor {
    private MediaCodec mCodec;
    private ByteBuffer[] mInputBuffers;
    private final MediaCodecFactory mMediaCodecFactory;
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

    class DefaultNativeWrapper implements NativeWrapper {
        private DefaultNativeWrapper() {
        }

        public int onInputBuffer(ByteBuffer byteBuffer) {
            return MediaCodecDecompressor.this.onInputBuffer(byteBuffer);
        }

        public void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z) {
            MediaCodecDecompressor.this.onOutputBuffer(byteBuffer, i, i2, z);
        }
    }

    public interface MediaCodecFactory {
        MediaCodec createDecoderByType(String str);
    }

    public interface NativeWrapper {
        int onInputBuffer(ByteBuffer byteBuffer);

        void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);
    }

    /* access modifiers changed from: private */
    public native int onInputBuffer(ByteBuffer byteBuffer);

    /* access modifiers changed from: private */
    public native void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);

    public MediaCodecDecompressor() {
        this.mNativeWrapper = new DefaultNativeWrapper();
        this.mMediaCodecFactory = new DefaultMediaCodecFactory();
    }

    MediaCodecDecompressor(NativeWrapper nativeWrapper, MediaCodecFactory mediaCodecFactory) {
        this.mNativeWrapper = nativeWrapper;
        this.mMediaCodecFactory = mediaCodecFactory;
    }

    public boolean open(String str, int i, int i2, ByteBuffer byteBuffer) {
        try {
            this.mCodec = this.mMediaCodecFactory.createDecoderByType(str);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
            if (byteBuffer != null) {
                createAudioFormat.setByteBuffer("csd-0", byteBuffer);
            }
            this.mCodec.configure(createAudioFormat, null, null, 0);
            this.mOutputFormat = this.mCodec.getOutputFormat();
            this.mCodec.start();
            this.mInputBuffers = this.mCodec.getInputBuffers();
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void destroy() {
        this.mCodec.stop();
        this.mCodec.release();
    }

    public void flush() {
        this.mCodec.flush();
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

    public void processInput() {
        int dequeueInputBuffer = this.mCodec.dequeueInputBuffer(0);
        if (dequeueInputBuffer >= 0) {
            int onInputBuffer = this.mNativeWrapper.onInputBuffer(this.mInputBuffers[dequeueInputBuffer]);
            this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, onInputBuffer, 0, onInputBuffer == 0 ? 4 : 0);
        }
    }

    public void processOutput() {
        BufferInfo bufferInfo = new BufferInfo();
        int dequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, 0);
        if (dequeueOutputBuffer >= 0) {
            this.mNativeWrapper.onOutputBuffer(this.mOutputBuffers[dequeueOutputBuffer], bufferInfo.offset, bufferInfo.size, (bufferInfo.flags & 4) == 4);
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
