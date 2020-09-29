package com.google.android.gms.common.api;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final bsn zzar;

    public UnsupportedApiCallException(bsn bsn) {
        this.zzar = bsn;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.zzar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
