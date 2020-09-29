package com.spotify.mobile.android.spotlets.ads.model;

public enum VideoType {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape"),
    UNKNOWN("unknown");
    
    private static final VideoType[] d = null;
    private final String mValue;

    static {
        d = values();
    }

    private VideoType(String str) {
        this.mValue = str;
    }

    static VideoType a(String str) {
        VideoType[] videoTypeArr;
        for (VideoType videoType : d) {
            if (videoType.mValue.equalsIgnoreCase(str)) {
                return videoType;
            }
        }
        return UNKNOWN;
    }
}
