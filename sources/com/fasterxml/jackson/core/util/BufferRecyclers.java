package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.JsonStringEncoder;
import java.lang.ref.SoftReference;

public class BufferRecyclers {
    private static final ThreadLocalBufferManager _bufferRecyclerTracker = ("true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? ThreadLocalBufferManager.instance() : null);
    protected static final ThreadLocal<SoftReference<JsonStringEncoder>> _encoderRef = new ThreadLocal<>();
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef = new ThreadLocal<>();

    public static byte[] encodeAsUTF8(String str) {
        return getJsonStringEncoder().encodeAsUTF8(str);
    }

    public static BufferRecycler getBufferRecycler() {
        SoftReference softReference = (SoftReference) _recyclerRef.get();
        BufferRecycler bufferRecycler = softReference == null ? null : (BufferRecycler) softReference.get();
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            ThreadLocalBufferManager threadLocalBufferManager = _bufferRecyclerTracker;
            _recyclerRef.set(threadLocalBufferManager != null ? threadLocalBufferManager.wrapAndTrack(bufferRecycler) : new SoftReference(bufferRecycler));
        }
        return bufferRecycler;
    }

    public static JsonStringEncoder getJsonStringEncoder() {
        SoftReference softReference = (SoftReference) _encoderRef.get();
        JsonStringEncoder jsonStringEncoder = softReference == null ? null : (JsonStringEncoder) softReference.get();
        if (jsonStringEncoder != null) {
            return jsonStringEncoder;
        }
        JsonStringEncoder jsonStringEncoder2 = new JsonStringEncoder();
        _encoderRef.set(new SoftReference(jsonStringEncoder2));
        return jsonStringEncoder2;
    }

    public static char[] quoteAsJsonText(String str) {
        return getJsonStringEncoder().quoteAsString(str);
    }

    public static byte[] quoteAsJsonUTF8(String str) {
        return getJsonStringEncoder().quoteAsUTF8(str);
    }
}
