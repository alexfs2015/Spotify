package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.music.features.dailymix.DailyMixRefreshUiFlag;

/* renamed from: mno reason: default package */
public final class mno extends hmm {
    private static fqk a = hmh.a("pzn-playlist-entity-daily-mix-android", Overridable.ALWAYS);
    private static fql<DailyMixRefreshUiFlag> b = hmh.a("pzn-daily-mix-refresh-ui-android", DailyMixRefreshUiFlag.class, DailyMixRefreshUiFlag.CONTROL, Overridable.ALWAYS);

    public static boolean a(fqn fqn) {
        return ((Boolean) fqn.a(a)).booleanValue() && (DailyMixRefreshUiFlag.TRACK_ROW == fqn.a(b) || DailyMixRefreshUiFlag.TRACK_ROW_BOTTOM == fqn.a(b));
    }

    public static boolean b(fqn fqn) {
        return ((Boolean) fqn.a(a)).booleanValue() && fqn.a(b) == DailyMixRefreshUiFlag.TRACK_ROW;
    }

    public static boolean c(fqn fqn) {
        return ((Boolean) fqn.a(a)).booleanValue() && fqn.a(b) == DailyMixRefreshUiFlag.TRACK_ROW_BOTTOM;
    }

    public static boolean d(fqn fqn) {
        return ((Boolean) fqn.a(a)).booleanValue() && fqn.a(b) == DailyMixRefreshUiFlag.TOOLBAR;
    }
}
