package defpackage;

import com.google.android.gms.common.api.Scope;

/* renamed from: ewz reason: default package */
public final class ewz {
    public static final a<ewn, ewm> a = new exa();
    public static final bsc<ewm> b = new bsc<>("SignIn.API", a, c);
    private static final g<ewn> c = new g<>();
    private static final g<ewn> d = new g<>();
    private static final a<ewn, Object> e = new exb();

    static {
        new Scope("profile");
        new Scope("email");
        new bsc("SignIn.INTERNAL_API", e, d);
    }
}
