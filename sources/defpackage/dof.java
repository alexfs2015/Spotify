package defpackage;

/* renamed from: dof reason: default package */
public final class dof extends dga<dof> {
    private static volatile dof[] a;
    private String b;
    private Integer c;
    private dog d;

    public dof() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dof a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.b = dfx.d();
            } else if (a2 == 16) {
                int i = dfx.i();
                try {
                    this.c = Integer.valueOf(dno.a(dfx.f()));
                } catch (IllegalArgumentException unused) {
                    dfx.e(i);
                    a(dfx, a2);
                }
            } else if (a2 == 26) {
                if (this.d == null) {
                    this.d = new dog();
                }
                dfx.a((dgf) this.d);
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public static dof[] b() {
        if (a == null) {
            synchronized (dge.b) {
                if (a == null) {
                    a = new dof[0];
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
            a2 += dfz.b(1, str);
        }
        Integer num = this.c;
        if (num != null) {
            a2 += dfz.b(2, num.intValue());
        }
        dog dog = this.d;
        return dog != null ? a2 + dfz.b(3, (dgf) dog) : a2;
    }

    public final void a(dfz dfz) {
        String str = this.b;
        if (str != null) {
            dfz.a(1, str);
        }
        Integer num = this.c;
        if (num != null) {
            dfz.a(2, num.intValue());
        }
        dog dog = this.d;
        if (dog != null) {
            dfz.a(3, (dgf) dog);
        }
        super.a(dfz);
    }
}
