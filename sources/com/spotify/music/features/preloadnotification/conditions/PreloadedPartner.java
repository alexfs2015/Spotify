package com.spotify.music.features.preloadnotification.conditions;

public enum PreloadedPartner {
    SAMSUNG("samsung-mobile-preload");
    
    private static final PreloadedPartner[] b = null;
    private final String mPartnerName;

    static {
        b = values();
    }

    private PreloadedPartner(String str) {
        this.mPartnerName = str;
    }

    public static boolean a(String str) {
        for (PreloadedPartner preloadedPartner : b) {
            if (str.equals(preloadedPartner.mPartnerName)) {
                return true;
            }
        }
        return false;
    }
}
