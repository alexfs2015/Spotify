package com.spotify.mobile.android.sso;

public enum ErrorType {
    RECOVERABLE(1),
    UNRECOVERABLE(2),
    INVALID_REQUEST(3);
    
    public final int mType;

    private ErrorType(int i) {
        this.mType = i;
    }
}
