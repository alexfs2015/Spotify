package com.spotify.music.features.navigation;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

public enum BottomTab {
    START_PAGE("spotify:startpage", ViewUris.s),
    FREE_TIER_HOME("spotify:home", ViewUris.e),
    FIND("spotify:find", ViewUris.ae),
    LIBRARY("spotify:collection", ViewUris.ba),
    FREE_TIER_YOUR_PLAYLISTS("spotify:playlists", ViewUris.F),
    FREE_TIER_PREMIUM("spotify:upsell:premium_in_app_destination", ViewUris.aQ),
    STATIONS_PROMO("spotify:stations-promo", ViewUris.cc),
    UNKNOWN("", null);
    
    public final String mRootUri;
    public final sso mViewUri;

    private BottomTab(String str, sso sso) {
        this.mRootUri = str;
        this.mViewUri = sso;
    }

    public static BottomTab a(int i2) {
        return values()[i2];
    }

    public static BottomTab a(NavigationGroup navigationGroup) {
        switch (navigationGroup) {
            case START_PAGE:
                return START_PAGE;
            case FREE_TIER_HOME:
                return FREE_TIER_HOME;
            case FIND:
                return FIND;
            case COLLECTION:
                return LIBRARY;
            case FREE_TIER_COLLECTION:
                return FREE_TIER_YOUR_PLAYLISTS;
            case PREMIUM:
                return FREE_TIER_PREMIUM;
            case STATIONS_PROMO:
                return STATIONS_PROMO;
            default:
                Logger.d("Couldn't resolve tab item from navigation group. Navigation group: %s", navigationGroup.name());
                return UNKNOWN;
        }
    }

    public static BottomTab a(uqm uqm) {
        return uqm.equals(uqo.n) ? FIND : uqm.equals(uqo.aW) ? START_PAGE : uqm.equals(uqo.aa) ? FREE_TIER_HOME : uqm.equals(uqo.aN) ? FIND : uqm.equals(uqo.aI) ? FIND : (uqm.equals(uqo.s) || uqm.equals(uqo.u) || uqm.equals(uqo.t) || uqm.equals(uqo.v) || uqm.equals(uqo.w) || uqm.equals(uqo.y) || uqm.equals(uqo.z) || uqm.equals(uqo.B) || uqm.equals(uqo.C) || uqm.equals(uqo.D) || uqm.equals(uqo.E) || uqm.equals(uqo.A) || uqm.equals(uqo.aZ)) ? LIBRARY : uqm.equals(uqo.Z) ? FREE_TIER_YOUR_PLAYLISTS : uqm.equals(uqo.U) ? FIND : uqm.equals(uqo.aG) ? FREE_TIER_PREMIUM : uqm.equals(uqo.aV) ? STATIONS_PROMO : UNKNOWN;
    }
}
