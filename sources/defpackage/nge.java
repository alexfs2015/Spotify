package defpackage;

import com.spotify.android.flags.Overridable;

/* renamed from: nge reason: default package */
public final class nge extends hju {
    public static final fqa a;
    public static final fqa b;
    public static final fqa c;
    public static final fqa d = hjp.b("ab_home_loading_flow", Overridable.INTERNAL);

    static {
        hjp.b("ab_home_recently_played_consolidated_android", Overridable.INTERNAL);
        String str = "Enabled";
        a = hjp.a("home_free_protobuf_test", Overridable.INTERNAL, str);
        b = hjp.a("home_premium_protobuf_test", Overridable.INTERNAL, str);
        c = hjp.a("home_android_mobius_rollout", Overridable.INTERNAL, str);
    }
}
