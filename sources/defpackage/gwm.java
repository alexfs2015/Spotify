package defpackage;

/* renamed from: gwm reason: default package */
public final class gwm {
    public final gxa a;
    public final hce b;
    public final gwz c;
    public final gwk d;
    public final gwl e;
    public final gwl f;
    public final gwo g;
    public final gwl h;
    public final gwi<?> i;
    public final gww j;

    /* renamed from: gwm$a */
    public static class a {
        private gxa a = gxa.a;
        private hce b = hce.a;
        private gwo c = defpackage.gwo.a.a();
        private gwl d = defpackage.gwl.a.a();
        private gwk e = defpackage.gwk.a.a();
        private gwl f = defpackage.gwl.a.a();
        private gwi<?> g;
        private gww h = gww.a;

        public final a a(int i, gwi<?> gwi) {
            return a(defpackage.gwk.a.a(i, gwi), this.e);
        }

        public final a a(int i, String str, gwi<?> gwi) {
            b(defpackage.gwk.a.a(i, gwi));
            c(defpackage.gwl.a.a(str, i));
            return this;
        }

        public final a a(gwi<?> gwi) {
            this.g = (gwi) fbp.a(gwi);
            return this;
        }

        public final a a(gwl gwl) {
            this.f = (gwl) fbp.a(gwl);
            return this;
        }

        public final a a(gwo gwo) {
            this.c = (gwo) fbp.a(gwo);
            return this;
        }

        public final a a(gww gww) {
            this.h = (gww) fbp.a(gww);
            return this;
        }

        public final a a(gxa gxa) {
            this.a = (gxa) fbp.a(gxa);
            return this;
        }

        @Deprecated
        public final a a(hce hce) {
            this.b = (hce) fbp.a(hce);
            return this;
        }

        public final a a(gwk... gwkArr) {
            this.e = defpackage.gwk.a.a(gwkArr);
            return this;
        }

        public final gwm a() {
            gwi<?> gwi = this.g;
            if (gwi != null) {
                gwm gwm = new gwm(this.a, this.b, this.e, this.d, this.f, this.c, gwi, this.h, 0);
                return gwm;
            }
            throw new IllegalStateException("No fallback binder set!");
        }

        public final a b(gwl gwl) {
            this.d = (gwl) fbp.a(gwl);
            return this;
        }

        public final a b(gwo gwo) {
            return a(defpackage.gwo.a.a(this.c, gwo));
        }

        public final a b(gwk... gwkArr) {
            return a(this.e, defpackage.gwk.a.a(gwkArr));
        }

        public final a c(gwl gwl) {
            return b(defpackage.gwl.a.a((gwl) fbp.a(gwl), this.d));
        }
    }

    private gwm(gxa gxa, hce hce, gwk gwk, gwl gwl, gwl gwl2, gwo gwo, gwi<?> gwi, gww gww) {
        this.a = (gxa) fbp.a(gxa);
        this.c = new gwz(gxa);
        this.b = (hce) fbp.a(hce);
        this.d = (gwk) fbp.a(gwk);
        this.f = (gwl) fbp.a(gwl2);
        this.e = (gwl) fbp.a(gwl);
        this.g = (gwo) fbp.a(gwo);
        this.i = (gwi) fbp.a(gwi);
        this.h = defpackage.gwl.a.a(this.e, this.f);
        this.j = (gww) fbp.a(gww);
    }

    /* synthetic */ gwm(gxa gxa, hce hce, gwk gwk, gwl gwl, gwl gwl2, gwo gwo, gwi gwi, gww gww, byte b2) {
        this(gxa, hce, gwk, gwl, gwl2, gwo, gwi, gww);
    }
}
