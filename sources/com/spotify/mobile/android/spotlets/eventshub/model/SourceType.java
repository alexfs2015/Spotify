package com.spotify.mobile.android.spotlets.eventshub.model;

public enum SourceType {
    POPULAR("popular"),
    RECOMMENDATIONS("recommendation"),
    ALL("all");
    
    public static final SourceType[] d = null;
    final String mSourceName;

    static {
        d = values();
    }

    private SourceType(String str) {
        this.mSourceName = str;
    }
}
