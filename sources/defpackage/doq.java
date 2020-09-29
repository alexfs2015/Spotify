package defpackage;

/* renamed from: doq reason: default package */
public final class doq extends dgr<doq> {
    private doo a;
    private dow[] b;
    private Integer c;
    private dox d;

    public doq() {
        this.a = null;
        this.b = dow.b();
        this.c = null;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final doq a(dgo dgo) {
        dgw dgw;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                if (this.a == null) {
                    this.a = new doo();
                }
                dgw = this.a;
            } else if (a2 == 18) {
                int a3 = dgz.a(dgo, 18);
                dow[] dowArr = this.b;
                int length = dowArr == null ? 0 : dowArr.length;
                dow[] dowArr2 = new dow[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, dowArr2, 0, length);
                }
                while (length < dowArr2.length - 1) {
                    dowArr2[length] = new dow();
                    dgo.a((dgw) dowArr2[length]);
                    dgo.a();
                    length++;
                }
                dowArr2[length] = new dow();
                dgo.a((dgw) dowArr2[length]);
                this.b = dowArr2;
            } else if (a2 == 24) {
                int i = dgo.i();
                try {
                    this.c = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            } else if (a2 == 34) {
                if (this.d == null) {
                    this.d = new dox();
                }
                dgw = this.d;
            } else if (!super.a(dgo, a2)) {
                return this;
            }
            dgo.a(dgw);
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        doo doo = this.a;
        if (doo != null) {
            a2 += dgq.b(1, (dgw) doo);
        }
        dow[] dowArr = this.b;
        if (dowArr != null && dowArr.length > 0) {
            int i = 0;
            while (true) {
                dow[] dowArr2 = this.b;
                if (i >= dowArr2.length) {
                    break;
                }
                dow dow = dowArr2[i];
                if (dow != null) {
                    a2 += dgq.b(2, (dgw) dow);
                }
                i++;
            }
        }
        Integer num = this.c;
        if (num != null) {
            a2 += dgq.b(3, num.intValue());
        }
        dox dox = this.d;
        return dox != null ? a2 + dgq.b(4, (dgw) dox) : a2;
    }

    public final void a(dgq dgq) {
        doo doo = this.a;
        if (doo != null) {
            dgq.a(1, (dgw) doo);
        }
        dow[] dowArr = this.b;
        if (dowArr != null && dowArr.length > 0) {
            int i = 0;
            while (true) {
                dow[] dowArr2 = this.b;
                if (i >= dowArr2.length) {
                    break;
                }
                dow dow = dowArr2[i];
                if (dow != null) {
                    dgq.a(2, (dgw) dow);
                }
                i++;
            }
        }
        Integer num = this.c;
        if (num != null) {
            dgq.a(3, num.intValue());
        }
        dox dox = this.d;
        if (dox != null) {
            dgq.a(4, (dgw) dox);
        }
        super.a(dgq);
    }
}
