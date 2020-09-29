package com.google.android.gms.common.api;

public class ApiException extends Exception {
    protected final Status mStatus;

    public final int a() {
        return this.mStatus.f;
    }

    public ApiException(Status status) {
        String str;
        int i = status.f;
        if (status.g != null) {
            str = status.g;
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.mStatus = status;
    }
}
