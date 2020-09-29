package defpackage;

/* renamed from: dol reason: default package */
public final class dol extends dgr<dol> {
    public String a;
    public doy b;
    private dox c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;

    public dol() {
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
    public final dol a(dgo dgo) {
        dgw dgw;
        int i;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 != 10) {
                if (a2 == 18) {
                    if (this.c == null) {
                        this.c = new dox();
                    }
                    dgw = this.c;
                } else if (a2 == 24) {
                    this.d = Integer.valueOf(dgo.f());
                } else if (a2 == 34) {
                    if (this.b == null) {
                        this.b = new doy();
                    }
                    dgw = this.b;
                } else if (a2 == 40) {
                    this.e = Integer.valueOf(dgo.f());
                } else if (a2 == 48) {
                    i = dgo.i();
                    this.f = Integer.valueOf(dof.a(dgo.f()));
                } else if (a2 == 56) {
                    i = dgo.i();
                    this.g = Integer.valueOf(dof.a(dgo.f()));
                } else if (a2 == 64) {
                    i = dgo.i();
                    try {
                        this.h = Integer.valueOf(dof.a(dgo.f()));
                    } catch (IllegalArgumentException unused) {
                        dgo.e(i);
                        a(dgo, a2);
                    }
                } else if (!super.a(dgo, a2)) {
                    return this;
                }
                dgo.a(dgw);
            } else {
                this.a = dgo.d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dgq.b(1, str);
        }
        dox dox = this.c;
        if (dox != null) {
            a2 += dgq.b(2, (dgw) dox);
        }
        Integer num = this.d;
        if (num != null) {
            a2 += dgq.b(3, num.intValue());
        }
        doy doy = this.b;
        if (doy != null) {
            a2 += dgq.b(4, (dgw) doy);
        }
        Integer num2 = this.e;
        if (num2 != null) {
            a2 += dgq.b(5, num2.intValue());
        }
        Integer num3 = this.f;
        if (num3 != null) {
            a2 += dgq.b(6, num3.intValue());
        }
        Integer num4 = this.g;
        if (num4 != null) {
            a2 += dgq.b(7, num4.intValue());
        }
        Integer num5 = this.h;
        return num5 != null ? a2 + dgq.b(8, num5.intValue()) : a2;
    }

    public final void a(dgq dgq) {
        String str = this.a;
        if (str != null) {
            dgq.a(1, str);
        }
        dox dox = this.c;
        if (dox != null) {
            dgq.a(2, (dgw) dox);
        }
        Integer num = this.d;
        if (num != null) {
            dgq.a(3, num.intValue());
        }
        doy doy = this.b;
        if (doy != null) {
            dgq.a(4, (dgw) doy);
        }
        Integer num2 = this.e;
        if (num2 != null) {
            dgq.a(5, num2.intValue());
        }
        Integer num3 = this.f;
        if (num3 != null) {
            dgq.a(6, num3.intValue());
        }
        Integer num4 = this.g;
        if (num4 != null) {
            dgq.a(7, num4.intValue());
        }
        Integer num5 = this.h;
        if (num5 != null) {
            dgq.a(8, num5.intValue());
        }
        super.a(dgq);
    }
}
