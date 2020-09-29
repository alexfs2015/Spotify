package defpackage;

/* renamed from: dow reason: default package */
public final class dow extends dgr<dow> {
    private static volatile dow[] a;
    private String b;
    private Integer c;
    private dox d;

    public dow() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dow a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.b = dgo.d();
            } else if (a2 == 16) {
                int i = dgo.i();
                try {
                    this.c = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            } else if (a2 == 26) {
                if (this.d == null) {
                    this.d = new dox();
                }
                dgo.a((dgw) this.d);
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public static dow[] b() {
        if (a == null) {
            synchronized (dgv.b) {
                if (a == null) {
                    a = new dow[0];
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.b;
        if (str != null) {
            a2 += dgq.b(1, str);
        }
        Integer num = this.c;
        if (num != null) {
            a2 += dgq.b(2, num.intValue());
        }
        dox dox = this.d;
        return dox != null ? a2 + dgq.b(3, (dgw) dox) : a2;
    }

    public final void a(dgq dgq) {
        String str = this.b;
        if (str != null) {
            dgq.a(1, str);
        }
        Integer num = this.c;
        if (num != null) {
            dgq.a(2, num.intValue());
        }
        dox dox = this.d;
        if (dox != null) {
            dgq.a(3, (dgw) dox);
        }
        super.a(dgq);
    }
}
