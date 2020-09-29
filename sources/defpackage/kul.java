package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: kul reason: default package */
public final class kul extends hju {
    public static final fpr<RolloutFlag> a;
    public static final fpq b = hjp.a("ab_canvas_disabled_new_users", Overridable.INTERNAL);

    static {
        String str = "ab-canvas-rollout";
        a = hjp.a(str, RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    }
}
