package com.spotify.music.features.navigation;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

public enum BottomTab {
    START_PAGE("spotify:startpage", ViewUris.t),
    FREE_TIER_HOME("spotify:home", ViewUris.f),
    FIND("spotify:find", ViewUris.af),
    LIBRARY("spotify:collection", ViewUris.bb),
    FREE_TIER_YOUR_PLAYLISTS("spotify:playlists", ViewUris.G),
    FREE_TIER_PREMIUM("spotify:upsell:premium_in_app_destination", ViewUris.aR),
    STATIONS_PROMO("spotify:stations-promo", ViewUris.cd),
    UNKNOWN("", null);
    
    public final String mRootUri;
    public final sih mViewUri;

    private BottomTab(String str, sih sih) {
        this.mRootUri = str;
        this.mViewUri = sih;
    }

    public static BottomTab a(int i2) {
        return values()[i2];
    }

    public static BottomTab a(udr udr) {
        if (udr.equals(udt.n)) {
            return FIND;
        }
        if (udr.equals(udt.aW)) {
            return START_PAGE;
        }
        if (udr.equals(udt.aa)) {
            return FREE_TIER_HOME;
        }
        if (udr.equals(udt.aN)) {
            return FIND;
        }
        if (udr.equals(udt.aI)) {
            return FIND;
        }
        if (udr.equals(udt.s) || udr.equals(udt.u) || udr.equals(udt.t) || udr.equals(udt.v) || udr.equals(udt.w) || udr.equals(udt.y) || udr.equals(udt.z) || udr.equals(udt.B) || udr.equals(udt.C) || udr.equals(udt.D) || udr.equals(udt.E) || udr.equals(udt.A) || udr.equals(udt.aZ)) {
            return LIBRARY;
        }
        if (udr.equals(udt.Z)) {
            return FREE_TIER_YOUR_PLAYLISTS;
        }
        if (udr.equals(udt.U)) {
            return FIND;
        }
        if (udr.equals(udt.aG)) {
            return FREE_TIER_PREMIUM;
        }
        if (udr.equals(udt.aV)) {
            return STATIONS_PROMO;
        }
        return UNKNOWN;
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
}
