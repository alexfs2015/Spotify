package com.spotify.music.libs.stationspromo;

import com.spotify.android.flags.Overridable;

public final class StationsPromoFlags extends hmm {
    public static final fql<StationsPromoVariants> a = hmh.a("ab-5tabs-navigation-stations-android-1", StationsPromoVariants.class, StationsPromoVariants.CONTROL, Overridable.ALWAYS);

    public enum StationsPromoVariants {
        CONTROL,
        STATIONS
    }
}
