package defpackage;

/* renamed from: dpa reason: default package */
public final class dpa extends dgr<dpa> {
    private Integer a;
    private dpb b;
    private dox c;

    public dpa() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dpa a(dgo dgo) {
        dgw dgw;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 != 8) {
                if (a2 == 18) {
                    if (this.b == null) {
                        this.b = new dpb();
                    }
                    dgw = this.b;
                } else if (a2 == 26) {
                    if (this.c == null) {
                        this.c = new dox();
                    }
                    dgw = this.c;
                } else if (!super.a(dgo, a2)) {
                    return this;
                }
                dgo.a(dgw);
            } else {
                int i = dgo.i();
                try {
                    this.a = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dgq.b(1, num.intValue());
        }
        dpb dpb = this.b;
        if (dpb != null) {
            a2 += dgq.b(2, (dgw) dpb);
        }
        dox dox = this.c;
        return dox != null ? a2 + dgq.b(3, (dgw) dox) : a2;
    }

    public final void a(dgq dgq) {
        Integer num = this.a;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        dpb dpb = this.b;
        if (dpb != null) {
            dgq.a(2, (dgw) dpb);
        }
        dox dox = this.c;
        if (dox != null) {
            dgq.a(3, (dgw) dox);
        }
        super.a(dgq);
    }
}
