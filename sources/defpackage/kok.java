package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: kok reason: default package */
public final class kok extends hju {
    private static fpq a = hjp.a("home_podcast_creator_test_android_br", Overridable.ALWAYS);
    private static fpq b = hjp.a("home_podcast_creator_test_android_in", Overridable.ALWAYS);
    private static fpr<RolloutFlag> c = hjp.a("home_podcast_creator_test_android_br_phase_2", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    private static fpr<RolloutFlag> d = hjp.a("home_podcast_creator_test_android_in_phase_2", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);

    public static boolean a(fpt fpt) {
        return fpt != null && (((Boolean) fpt.a(a)).booleanValue() || fpt.a(c) == RolloutFlag.ENABLED);
    }

    public static boolean b(fpt fpt) {
        return fpt != null && (((Boolean) fpt.a(b)).booleanValue() || fpt.a(d) == RolloutFlag.ENABLED);
    }
}
