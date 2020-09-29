package defpackage;

import com.google.android.gms.common.api.Scope;

/* renamed from: exq reason: default package */
public final class exq {
    public static final a<exe, exd> a = new exr();
    public static final bst<exd> b = new bst<>("SignIn.API", a, c);
    private static final g<exe> c = new g<>();
    private static final g<exe> d = new g<>();
    private static final a<exe, Object> e = new exs();

    static {
        new Scope("profile");
        new Scope("email");
        new bst("SignIn.INTERNAL_API", e, d);
    }
}
