package defpackage;

import com.spotify.android.flags.Overridable;

/* renamed from: uol reason: default package */
public final class uol extends hmm {
    public static final fqu a;
    public static final fqu b;
    public static final fqu c;
    public static final fqu d;
    public static final fqu e;
    public static final fqu f;

    static {
        String str = "Enabled";
        a = hmh.a("ab_social_listening_android", Overridable.ALWAYS, str);
        b = hmh.a("ab_social_listening_android_1", Overridable.ALWAYS, str);
        c = hmh.a("ab_social_listening_android_2", Overridable.ALWAYS, str);
        d = hmh.a("ab_social_listening_android_3", Overridable.ALWAYS, str);
        e = hmh.a("ab_social_listening_android_employees", Overridable.ALWAYS, str);
        f = hmh.a("ab_social_listening_share_link", Overridable.ALWAYS, str);
    }
}
