package defpackage;

/* renamed from: dpc reason: default package */
public final class dpc extends dgr<dpc> {
    private doy a;
    private Integer b;
    private dpb c;
    private dox d;

    public dpc() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dpc a(dgo dgo) {
        dgw dgw;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                if (this.a == null) {
                    this.a = new doy();
                }
                dgw = this.a;
            } else if (a2 == 16) {
                int i = dgo.i();
                try {
                    this.b = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            } else if (a2 == 26) {
                if (this.c == null) {
                    this.c = new dpb();
                }
                dgw = this.c;
            } else if (a2 == 34) {
                if (this.d == null) {
                    this.d = new dox();
                }
                dgw = this.d;
            } else if (!super.a(dgo, a2)) {
                return this;
            }
            dgo.a(dgw);
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        doy doy = this.a;
        if (doy != null) {
            a2 += dgq.b(1, (dgw) doy);
        }
        Integer num = this.b;
        if (num != null) {
            a2 += dgq.b(2, num.intValue());
        }
        dpb dpb = this.c;
        if (dpb != null) {
            a2 += dgq.b(3, (dgw) dpb);
        }
        dox dox = this.d;
        return dox != null ? a2 + dgq.b(4, (dgw) dox) : a2;
    }

    public final void a(dgq dgq) {
        doy doy = this.a;
        if (doy != null) {
            dgq.a(1, (dgw) doy);
        }
        Integer num = this.b;
        if (num != null) {
            dgq.a(2, num.intValue());
        }
        dpb dpb = this.c;
        if (dpb != null) {
            dgq.a(3, (dgw) dpb);
        }
        dox dox = this.d;
        if (dox != null) {
            dgq.a(4, (dgw) dox);
        }
        super.a(dgq);
    }
}
