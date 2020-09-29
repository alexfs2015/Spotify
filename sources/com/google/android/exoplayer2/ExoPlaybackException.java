package com.google.android.exoplayer2;

import java.io.IOException;

public final class ExoPlaybackException extends Exception {
    private final Throwable cause;
    public final int rendererIndex;
    public final int type;

    private ExoPlaybackException(int i, Throwable th, int i2) {
        super(th);
        this.type = i;
        this.cause = th;
        this.rendererIndex = i2;
    }

    public static ExoPlaybackException a(IOException iOException) {
        return new ExoPlaybackException(0, iOException, -1);
    }

    public static ExoPlaybackException a(Exception exc, int i) {
        return new ExoPlaybackException(1, exc, i);
    }

    public static ExoPlaybackException a(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException, -1);
    }
}
