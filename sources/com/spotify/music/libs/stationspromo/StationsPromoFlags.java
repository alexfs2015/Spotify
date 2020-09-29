package com.spotify.music.libs.stationspromo;

import com.spotify.android.flags.Overridable;

public final class StationsPromoFlags extends hju {
    public static final fpr<StationsPromoVariants> a = hjp.a("ab-5tabs-navigation-stations-android-1", StationsPromoVariants.class, StationsPromoVariants.CONTROL, Overridable.ALWAYS);

    public enum StationsPromoVariants {
        CONTROL,
        STATIONS
    }
}
