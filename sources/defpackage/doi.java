package defpackage;

/* renamed from: doi reason: default package */
public final class doi extends dgr<doi> {
    private String a;
    private doh[] b;
    private Integer c;

    public doi() {
        this.a = null;
        this.b = doh.b();
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final doi a(dgo dgo) {
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
                int i = dgo.i();
                try {
                    this.c = Integer.valueOf(dof.a(dgo.f()));
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
        return num != null ? a2 + dgq.b(3, num.intValue()) : a2;
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
        super.a(dgq);
    }
}
