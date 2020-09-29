package defpackage;

/* renamed from: dnu reason: default package */
public final class dnu extends dga<dnu> {
    public String a;
    public doh b;
    private dog c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;

    public dnu() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dnu a(dfx dfx) {
        dgf dgf;
        int i;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 != 10) {
                if (a2 == 18) {
                    if (this.c == null) {
                        this.c = new dog();
                    }
                    dgf = this.c;
                } else if (a2 == 24) {
                    this.d = Integer.valueOf(dfx.f());
                } else if (a2 == 34) {
                    if (this.b == null) {
                        this.b = new doh();
                    }
                    dgf = this.b;
                } else if (a2 == 40) {
                    this.e = Integer.valueOf(dfx.f());
                } else if (a2 == 48) {
                    i = dfx.i();
                    this.f = Integer.valueOf(dno.a(dfx.f()));
                } else if (a2 == 56) {
                    i = dfx.i();
                    this.g = Integer.valueOf(dno.a(dfx.f()));
                } else if (a2 == 64) {
                    i = dfx.i();
                    try {
                        this.h = Integer.valueOf(dno.a(dfx.f()));
                    } catch (IllegalArgumentException unused) {
                        dfx.e(i);
                        a(dfx, a2);
                    }
                } else if (!super.a(dfx, a2)) {
                    return this;
                }
                dfx.a(dgf);
            } else {
                this.a = dfx.d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dfz.b(1, str);
        }
        dog dog = this.c;
        if (dog != null) {
            a2 += dfz.b(2, (dgf) dog);
        }
        Integer num = this.d;
        if (num != null) {
            a2 += dfz.b(3, num.intValue());
        }
        doh doh = this.b;
        if (doh != null) {
            a2 += dfz.b(4, (dgf) doh);
        }
        Integer num2 = this.e;
        if (num2 != null) {
            a2 += dfz.b(5, num2.intValue());
        }
        Integer num3 = this.f;
        if (num3 != null) {
            a2 += dfz.b(6, num3.intValue());
        }
        Integer num4 = this.g;
        if (num4 != null) {
            a2 += dfz.b(7, num4.intValue());
        }
        Integer num5 = this.h;
        return num5 != null ? a2 + dfz.b(8, num5.intValue()) : a2;
    }

    public final void a(dfz dfz) {
        String str = this.a;
        if (str != null) {
            dfz.a(1, str);
        }
        dog dog = this.c;
        if (dog != null) {
            dfz.a(2, (dgf) dog);
        }
        Integer num = this.d;
        if (num != null) {
            dfz.a(3, num.intValue());
        }
        doh doh = this.b;
        if (doh != null) {
            dfz.a(4, (dgf) doh);
        }
        Integer num2 = this.e;
        if (num2 != null) {
            dfz.a(5, num2.intValue());
        }
        Integer num3 = this.f;
        if (num3 != null) {
            dfz.a(6, num3.intValue());
        }
        Integer num4 = this.g;
        if (num4 != null) {
            dfz.a(7, num4.intValue());
        }
        Integer num5 = this.h;
        if (num5 != null) {
            dfz.a(8, num5.intValue());
        }
        super.a(dfz);
    }
}
