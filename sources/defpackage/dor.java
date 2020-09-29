package defpackage;

/* renamed from: dor reason: default package */
public final class dor extends dga<dor> {
    private Integer a;
    private dok b;

    public dor() {
        this.a = null;
        this.b = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dor a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                int i = dfx.i();
                try {
                    this.a = Integer.valueOf(dno.a(dfx.f()));
                } catch (IllegalArgumentException unused) {
                    dfx.e(i);
                    a(dfx, a2);
                }
            } else if (a2 == 18) {
                if (this.b == null) {
                    this.b = new dok();
                }
                dfx.a((dgf) this.b);
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dfz.b(1, num.intValue());
        }
        dok dok = this.b;
        return dok != null ? a2 + dfz.b(2, (dgf) dok) : a2;
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        dok dok = this.b;
        if (dok != null) {
            dfz.a(2, (dgf) dok);
        }
        super.a(dfz);
    }
}
