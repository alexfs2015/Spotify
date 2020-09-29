package defpackage;

/* renamed from: doj reason: default package */
public final class doj extends dgr<doj> {
    private String a;
    private doh[] b;
    private Integer c;
    private Integer d;
    private Integer e;

    public doj() {
        this.a = null;
        this.b = doh.b();
        this.c = null;
        this.d = null;
        this.e = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final doj a(dgo dgo) {
        int i;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dgo.d();
            } else if (a2 == 18) {
                int a3 = dgz.a(dgo, 18);
                doh[] dohArr = this.b;
                int length = dohArr == null ? 0 : dohArr.length;
                doh[] dohArr2 = new doh[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, dohArr2, 0, length);
                }
                while (length < dohArr2.length - 1) {
                    dohArr2[length] = new doh();
                    dgo.a((dgw) dohArr2[length]);
                    dgo.a();
                    length++;
                }
                dohArr2[length] = new doh();
                dgo.a((dgw) dohArr2[length]);
                this.b = dohArr2;
            } else if (a2 == 24) {
                i = dgo.i();
                this.c = Integer.valueOf(dof.a(dgo.f()));
            } else if (a2 == 32) {
                i = dgo.i();
                this.d = Integer.valueOf(dof.a(dgo.f()));
            } else if (a2 == 40) {
                i = dgo.i();
                try {
                    this.e = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            } else if (!super.a(dgo, a2)) {
                return this;
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
        doh[] dohArr = this.b;
        if (dohArr != null && dohArr.length > 0) {
            int i = 0;
            while (true) {
                doh[] dohArr2 = this.b;
                if (i >= dohArr2.length) {
                    break;
                }
                doh doh = dohArr2[i];
                if (doh != null) {
                    a2 += dgq.b(2, (dgw) doh);
                }
                i++;
            }
        }
        Integer num = this.c;
        if (num != null) {
            a2 += dgq.b(3, num.intValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            a2 += dgq.b(4, num2.intValue());
        }
        Integer num3 = this.e;
        return num3 != null ? a2 + dgq.b(5, num3.intValue()) : a2;
    }

    public final void a(dgq dgq) {
        String str = this.a;
        if (str != null) {
            dgq.a(1, str);
        }
        doh[] dohArr = this.b;
        if (dohArr != null && dohArr.length > 0) {
            int i = 0;
            while (true) {
                doh[] dohArr2 = this.b;
                if (i >= dohArr2.length) {
                    break;
                }
                doh doh = dohArr2[i];
                if (doh != null) {
                    dgq.a(2, (dgw) doh);
                }
                i++;
            }
        }
        Integer num = this.c;
        if (num != null) {
            dgq.a(3, num.intValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            dgq.a(4, num2.intValue());
        }
        Integer num3 = this.e;
        if (num3 != null) {
            dgq.a(5, num3.intValue());
        }
        super.a(dgq);
    }
}
