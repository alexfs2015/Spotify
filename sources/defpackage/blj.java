package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: blj reason: default package */
public final class blj {
    public static final bsc<a> a = new bsc<>("Auth.CREDENTIALS_API", g, e);
    public static final bsc<GoogleSignInOptions> b = new bsc<>("Auth.GOOGLE_SIGN_IN_API", h, f);
    public static final blp c = new eff();
    public static final bly d = new bmf();
    private static g<efn> e = new g<>();
    private static g<bmg> f = new g<>();
    private static final defpackage.bsc.a<efn, a> g = new bna();
    private static final defpackage.bsc.a<bmg, GoogleSignInOptions> h = new bnb();

    @Deprecated
    /* renamed from: blj$a */
    public static class a implements bse {
        public final boolean a;
        private final String b = null;

        @Deprecated
        /* renamed from: blj$a$a reason: collision with other inner class name */
        public static class C0017a {
            protected Boolean a = Boolean.FALSE;

            public a a() {
                return new a(this);
            }
        }

        public a(C0017a aVar) {
            this.a = aVar.a.booleanValue();
        }

        static {
            new C0017a().a();
        }
    }

    static {
        bsc<bll> bsc = blk.a;
        blx blx = blk.b;
    }
}
