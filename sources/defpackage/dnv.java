package defpackage;

/* renamed from: dnv reason: default package */
public final class dnv extends dga<dnv> {
    private Integer a;
    private doh b;
    private String c;
    private String d;

    public dnv() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dnv a(dfx dfx) {
        int f;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 40) {
                try {
                    f = dfx.f();
                    if (f < 0 || f > 2) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append(f);
                        sb.append(" is not a valid enum Platform");
                    } else {
                        this.a = Integer.valueOf(f);
                    }
                } catch (IllegalArgumentException unused) {
                    dfx.e(dfx.i());
                    a(dfx, a2);
                }
            } else if (a2 == 50) {
                if (this.b == null) {
                    this.b = new doh();
                }
                dfx.a((dgf) this.b);
            } else if (a2 == 58) {
                this.c = dfx.d();
            } else if (a2 == 66) {
                this.d = dfx.d();
            } else if (!super.a(dfx, a2)) {
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
            a2 += dfz.b(5, num.intValue());
        }
        doh doh = this.b;
        if (doh != null) {
            a2 += dfz.b(6, (dgf) doh);
        }
        String str = this.c;
        if (str != null) {
            a2 += dfz.b(7, str);
        }
        String str2 = this.d;
        return str2 != null ? a2 + dfz.b(8, str2) : a2;
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(5, num.intValue());
        }
        doh doh = this.b;
        if (doh != null) {
            dfz.a(6, (dgf) doh);
        }
        String str = this.c;
        if (str != null) {
            dfz.a(7, str);
        }
        String str2 = this.d;
        if (str2 != null) {
            dfz.a(8, str2);
        }
        super.a(dfz);
    }
}
