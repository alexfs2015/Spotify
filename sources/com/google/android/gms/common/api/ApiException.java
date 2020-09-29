package com.google.android.gms.common.api;

public class ApiException extends Exception {
    protected final Status mStatus;

    public ApiException(Status status) {
        int i = status.f;
        String str = status.g != null ? status.g : "";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.mStatus = status;
    }

    public final int a() {
        return this.mStatus.f;
    }
}
