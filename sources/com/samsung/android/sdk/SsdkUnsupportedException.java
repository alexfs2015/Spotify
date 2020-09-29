package com.samsung.android.sdk;

public class SsdkUnsupportedException extends Exception {
    private int mErrorType = 0;

    public SsdkUnsupportedException(String str, int i) {
        super(str);
        this.mErrorType = i;
    }
}
