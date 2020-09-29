package defpackage;

/* renamed from: dom reason: default package */
public final class dom extends dga<dom> {
    private Integer a;
    private dok b;
    private Integer c;
    private Integer d;
    private Integer e;

    public dom() {
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
    public final dom a(dfx dfx) {
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
            } else if (a2 == 24) {
                this.c = Integer.valueOf(dfx.f());
            } else if (a2 == 32) {
                this.d = Integer.valueOf(dfx.f());
            } else if (a2 == 40) {
                this.e = Integer.valueOf(dfx.f());
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
        if (dok != null) {
            a2 += dfz.b(2, (dgf) dok);
        }
        Integer num2 = this.c;
        if (num2 != null) {
            a2 += dfz.b(3, num2.intValue());
        }
        Integer num3 = this.d;
        if (num3 != null) {
            a2 += dfz.b(4, num3.intValue());
        }
        Integer num4 = this.e;
        return num4 != null ? a2 + dfz.b(5, num4.intValue()) : a2;
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
        Integer num2 = this.c;
        if (num2 != null) {
            dfz.a(3, num2.intValue());
        }
        Integer num3 = this.d;
        if (num3 != null) {
            dfz.a(4, num3.intValue());
        }
        Integer num4 = this.e;
        if (num4 != null) {
            dfz.a(5, num4.intValue());
        }
        super.a(dfz);
    }
}
