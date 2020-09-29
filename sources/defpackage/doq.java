package defpackage;

/* renamed from: doq reason: default package */
public final class doq extends dga<doq> {
    private Integer a;
    private dok b;
    private dog c;

    public doq() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final doq a(dfx dfx) {
        dgf dgf;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 != 8) {
                if (a2 == 18) {
                    if (this.b == null) {
                        this.b = new dok();
                    }
                    dgf = this.b;
                } else if (a2 == 26) {
                    if (this.c == null) {
                        this.c = new dog();
                    }
                    dgf = this.c;
                } else if (!super.a(dfx, a2)) {
                    return this;
                }
                dfx.a(dgf);
            } else {
                int i = dfx.i();
                try {
                    this.a = Integer.valueOf(dno.a(dfx.f()));
                } catch (IllegalArgumentException unused) {
                    dfx.e(i);
                    a(dfx, a2);
                }
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
        dog dog = this.c;
        return dog != null ? a2 + dfz.b(3, (dgf) dog) : a2;
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
        dog dog = this.c;
        if (dog != null) {
            dfz.a(3, (dgf) dog);
        }
        super.a(dfz);
    }
}
