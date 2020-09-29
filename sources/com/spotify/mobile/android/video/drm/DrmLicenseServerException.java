package com.spotify.mobile.android.video.drm;

public class DrmLicenseServerException extends Exception {
    private static final long serialVersionUID = 98547385991L;
    public final int mHttpStatusCode;
    public final String mMessage;

    public DrmLicenseServerException(int i, String str) {
        StringBuilder sb = new StringBuilder("HTTP status: ");
        sb.append(i);
        sb.append(", ");
        sb.append((String) jvi.a(str, "<null>"));
        super(sb.toString());
        this.mHttpStatusCode = i;
        this.mMessage = str;
    }
}
