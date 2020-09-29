package defpackage;

/* renamed from: dnq reason: default package */
public final class dnq extends dga<dnq> {
    private static volatile dnq[] a;
    private Integer b;
    private doe c;

    public dnq() {
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dnq a(dfx dfx) {
        int f;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    f = dfx.f();
                    if (f < 0 || f > 10) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append(f);
                        sb.append(" is not a valid enum AdFormatType");
                    } else {
                        this.b = Integer.valueOf(f);
                    }
                } catch (IllegalArgumentException unused) {
                    dfx.e(dfx.i());
                    a(dfx, a2);
                }
            } else if (a2 == 18) {
                if (this.c == null) {
                    this.c = new doe();
                }
                dfx.a((dgf) this.c);
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(f);
        sb2.append(" is not a valid enum AdFormatType");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static dnq[] b() {
        if (a == null) {
            synchronized (dge.b) {
                if (a == null) {
                    a = new dnq[0];
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
            a2 += dfz.b(1, num.intValue());
        }
        doe doe = this.c;
        return doe != null ? a2 + dfz.b(2, (dgf) doe) : a2;
    }

    public final void a(dfz dfz) {
        Integer num = this.b;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        doe doe = this.c;
        if (doe != null) {
            dfz.a(2, (dgf) doe);
        }
        super.a(dfz);
    }
}
