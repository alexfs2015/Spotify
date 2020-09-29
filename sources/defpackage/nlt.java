package defpackage;

import com.spotify.android.flags.Overridable;

/* renamed from: nlt reason: default package */
public final class nlt extends hmm {
    public static final fqu a;
    public static final fqu b;
    public static final fqu c;
    public static final fqu d = hmh.b("ab_home_loading_flow", Overridable.INTERNAL);

    static {
        hmh.b("ab_home_recently_played_consolidated_android", Overridable.INTERNAL);
        String str = "Enabled";
        a = hmh.a("home_free_protobuf_test", Overridable.INTERNAL, str);
        b = hmh.a("home_premium_protobuf_test", Overridable.INTERNAL, str);
        c = hmh.a("home_android_mobius_rollout", Overridable.INTERNAL, str);
    }
}
