package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: krt reason: default package */
public final class krt extends hmm {
    private static fqk a = hmh.a("home_podcast_creator_test_android_br", Overridable.ALWAYS);
    private static fqk b = hmh.a("home_podcast_creator_test_android_in", Overridable.ALWAYS);
    private static fql<RolloutFlag> c = hmh.a("home_podcast_creator_test_android_br_phase_2", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    private static fql<RolloutFlag> d = hmh.a("home_podcast_creator_test_android_in_phase_2", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);

    public static boolean a(fqn fqn) {
        return fqn != null && (((Boolean) fqn.a(a)).booleanValue() || fqn.a(c) == RolloutFlag.ENABLED);
    }

    public static boolean b(fqn fqn) {
        return fqn != null && (((Boolean) fqn.a(b)).booleanValue() || fqn.a(d) == RolloutFlag.ENABLED);
    }
}
