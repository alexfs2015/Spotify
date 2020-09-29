package com.spotify.mobile.android.video.exception;

public abstract class BetamaxException extends Exception {
    private static final long serialVersionUID = 5344939152774269431L;
    public final ErrorType mErrorType;

    public BetamaxException(String str, ErrorType errorType) {
        this(str, errorType, null);
    }

    public BetamaxException(String str, ErrorType errorType, Throwable th) {
        super(str, th);
        this.mErrorType = errorType;
    }
}
