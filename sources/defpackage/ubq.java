package defpackage;

import com.spotify.android.flags.Overridable;

/* renamed from: ubq reason: default package */
public final class ubq extends hju {
    public static final fqa a;
    public static final fqa b;
    public static final fqa c;
    public static final fqa d;
    public static final fqa e;
    public static final fqa f;

    static {
        String str = "Enabled";
        a = hjp.a("ab_social_listening_android", Overridable.ALWAYS, str);
        b = hjp.a("ab_social_listening_android_1", Overridable.ALWAYS, str);
        c = hjp.a("ab_social_listening_android_2", Overridable.ALWAYS, str);
        d = hjp.a("ab_social_listening_android_3", Overridable.ALWAYS, str);
        e = hjp.a("ab_social_listening_android_employees", Overridable.ALWAYS, str);
        f = hjp.a("ab_social_listening_share_link", Overridable.ALWAYS, str);
    }
}
