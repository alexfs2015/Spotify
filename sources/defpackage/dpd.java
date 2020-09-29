package defpackage;

/* renamed from: dpd reason: default package */
public final class dpd extends dgr<dpd> {
    private Integer a;
    private dpb b;
    private Integer c;
    private Integer d;
    private Integer e;

    public dpd() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dpd a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                int i = dgo.i();
                try {
                    this.a = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            } else if (a2 == 18) {
                if (this.b == null) {
                    this.b = new dpb();
                }
                dgo.a((dgw) this.b);
            } else if (a2 == 24) {
                this.c = Integer.valueOf(dgo.f());
            } else if (a2 == 32) {
                this.d = Integer.valueOf(dgo.f());
            } else if (a2 == 40) {
                this.e = Integer.valueOf(dgo.f());
            } else if (!super.a(dgo, a2)) {
                return this;
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
        Integer num2 = this.c;
        if (num2 != null) {
            a2 += dgq.b(3, num2.intValue());
        }
        Integer num3 = this.d;
        if (num3 != null) {
            a2 += dgq.b(4, num3.intValue());
        }
        Integer num4 = this.e;
        return num4 != null ? a2 + dgq.b(5, num4.intValue()) : a2;
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
        Integer num2 = this.c;
        if (num2 != null) {
            dgq.a(3, num2.intValue());
        }
        Integer num3 = this.d;
        if (num3 != null) {
            dgq.a(4, num3.intValue());
        }
        Integer num4 = this.e;
        if (num4 != null) {
            dgq.a(5, num4.intValue());
        }
        super.a(dgq);
    }
}
