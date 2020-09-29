package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: kxu reason: default package */
public final class kxu extends hmm {
    public static final fql<RolloutFlag> a;
    public static final fqk b = hmh.a("ab-canvas-android-new-free-users", Overridable.INTERNAL);

    static {
        String str = "ab-canvas-rollout";
        a = hmh.a(str, RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    }
}
