package defpackage;

/* renamed from: dom reason: default package */
public final class dom extends dgr<dom> {
    private Integer a;
    private doy b;
    private String c;
    private String d;

    public dom() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dom a(dgo dgo) {
        int f;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 40) {
                try {
                    f = dgo.f();
                    if (f < 0 || f > 2) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append(f);
                        sb.append(" is not a valid enum Platform");
                    } else {
                        this.a = Integer.valueOf(f);
                    }
                } catch (IllegalArgumentException unused) {
                    dgo.e(dgo.i());
                    a(dgo, a2);
                }
            } else if (a2 == 50) {
                if (this.b == null) {
                    this.b = new doy();
                }
                dgo.a((dgw) this.b);
            } else if (a2 == 58) {
                this.c = dgo.d();
            } else if (a2 == 66) {
                this.d = dgo.d();
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(f);
        sb2.append(" is not a valid enum Platform");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dgq.b(5, num.intValue());
        }
        doy doy = this.b;
        if (doy != null) {
            a2 += dgq.b(6, (dgw) doy);
        }
        String str = this.c;
        if (str != null) {
            a2 += dgq.b(7, str);
        }
        String str2 = this.d;
        return str2 != null ? a2 + dgq.b(8, str2) : a2;
    }

    public final void a(dgq dgq) {
        Integer num = this.a;
        if (num != null) {
            dgq.a(5, num.intValue());
        }
        doy doy = this.b;
        if (doy != null) {
            dgq.a(6, (dgw) doy);
        }
        String str = this.c;
        if (str != null) {
            dgq.a(7, str);
        }
        String str2 = this.d;
        if (str2 != null) {
            dgq.a(8, str2);
        }
        super.a(dgq);
    }
}
