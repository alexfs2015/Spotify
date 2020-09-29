package defpackage;

/* renamed from: dob reason: default package */
public final class dob extends dga<dob> {
    private Integer a;
    private dog b;

    public dob() {
        this.a = null;
        this.b = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dob a(dfx dfx) {
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
                    this.b = new dog();
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
        dog dog = this.b;
        return dog != null ? a2 + dfz.b(2, (dgf) dog) : a2;
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        dog dog = this.b;
        if (dog != null) {
            dfz.a(2, (dgf) dog);
        }
        super.a(dfz);
    }
}
