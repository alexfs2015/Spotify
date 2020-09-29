package com.spotify.music.navigation;

public interface NavigationItem {

    public enum NavigationGroup {
        NONE,
        START_PAGE,
        FREE_TIER_HOME,
        FIND,
        COLLECTION,
        FREE_TIER_COLLECTION,
        PREMIUM,
        ONE_TAP_BROWSE,
        STATIONS_PROMO;

        static {
            values();
        }
    }

    NavigationGroup ah();
}
