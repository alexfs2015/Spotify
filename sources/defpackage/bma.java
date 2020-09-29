package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: bma reason: default package */
public final class bma {
    public static final bst<a> a = new bst<>("Auth.CREDENTIALS_API", g, e);
    public static final bst<GoogleSignInOptions> b = new bst<>("Auth.GOOGLE_SIGN_IN_API", h, f);
    public static final bmg c = new efw();
    public static final bmp d = new bmw();
    private static g<ege> e = new g<>();
    private static g<bmx> f = new g<>();
    private static final defpackage.bst.a<ege, a> g = new bnr();
    private static final defpackage.bst.a<bmx, GoogleSignInOptions> h = new bns();

    @Deprecated
    /* renamed from: bma$a */
    public static class a implements bsv {
        public final boolean a;
        private final String b = null;

        @Deprecated
        /* renamed from: bma$a$a reason: collision with other inner class name */
        public static class C0017a {
            protected Boolean a = Boolean.FALSE;

            public a a() {
                return new a(this);
            }
        }

        static {
            new C0017a().a();
        }

        public a(C0017a aVar) {
            this.a = aVar.a.booleanValue();
        }
    }

    static {
        bst<bmc> bst = bmb.a;
        bmo bmo = bmb.b;
    }
}
