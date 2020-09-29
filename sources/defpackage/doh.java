package defpackage;

/* renamed from: doh reason: default package */
public final class doh extends dgr<doh> {
    private static volatile doh[] a;
    private Integer b;
    private dov c;

    public doh() {
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final doh a(dgo dgo) {
        int f;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    f = dgo.f();
                    if (f < 0 || f > 10) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append(f);
                        sb.append(" is not a valid enum AdFormatType");
                    } else {
                        this.b = Integer.valueOf(f);
                    }
                } catch (IllegalArgumentException unused) {
                    dgo.e(dgo.i());
                    a(dgo, a2);
                }
            } else if (a2 == 18) {
                if (this.c == null) {
                    this.c = new dov();
                }
                dgo.a((dgw) this.c);
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(f);
        sb2.append(" is not a valid enum AdFormatType");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static doh[] b() {
        if (a == null) {
            synchronized (dgv.b) {
                if (a == null) {
                    a = new doh[0];
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.b;
        if (num != null) {
            a2 += dgq.b(1, num.intValue());
        }
        dov dov = this.c;
        return dov != null ? a2 + dgq.b(2, (dgw) dov) : a2;
    }

    public final void a(dgq dgq) {
        Integer num = this.b;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        dov dov = this.c;
        if (dov != null) {
            dgq.a(2, (dgw) dov);
        }
        super.a(dgq);
    }
}
