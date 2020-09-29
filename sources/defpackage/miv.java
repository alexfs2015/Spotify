package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.music.features.dailymix.DailyMixRefreshUiFlag;

/* renamed from: miv reason: default package */
public final class miv extends hju {
    private static fpq a = hjp.a("pzn-playlist-entity-daily-mix-android", Overridable.ALWAYS);
    private static fpr<DailyMixRefreshUiFlag> b = hjp.a("pzn-daily-mix-refresh-ui-android", DailyMixRefreshUiFlag.class, DailyMixRefreshUiFlag.CONTROL, Overridable.ALWAYS);

    public static boolean a(fpt fpt) {
        return ((Boolean) fpt.a(a)).booleanValue() && (DailyMixRefreshUiFlag.TRACK_ROW == fpt.a(b) || DailyMixRefreshUiFlag.TRACK_ROW_BOTTOM == fpt.a(b));
    }

    public static boolean b(fpt fpt) {
        return ((Boolean) fpt.a(a)).booleanValue() && fpt.a(b) == DailyMixRefreshUiFlag.TRACK_ROW;
    }

    public static boolean c(fpt fpt) {
        return ((Boolean) fpt.a(a)).booleanValue() && fpt.a(b) == DailyMixRefreshUiFlag.TRACK_ROW_BOTTOM;
    }

    public static boolean d(fpt fpt) {
        return ((Boolean) fpt.a(a)).booleanValue() && fpt.a(b) == DailyMixRefreshUiFlag.TOOLBAR;
    }
}
