package defpackage;

/* renamed from: doo reason: default package */
public final class doo extends dgr<doo> {
    private String a;
    private Integer b;
    private int[] c;
    private dox d;

    public doo() {
        this.a = null;
        this.b = null;
        this.c = dgz.a;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final doo a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dgo.d();
            } else if (a2 == 16) {
                int i = dgo.i();
                try {
                    this.b = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            } else if (a2 == 24) {
                int a3 = dgz.a(dgo, 24);
                int[] iArr = this.c;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = dgo.f();
                    dgo.a();
                    length++;
                }
                iArr2[length] = dgo.f();
                this.c = iArr2;
            } else if (a2 == 26) {
                int c2 = dgo.c(dgo.f());
                int i2 = dgo.i();
                int i3 = 0;
                while (dgo.h() > 0) {
                    dgo.f();
                    i3++;
                }
                dgo.e(i2);
                int[] iArr3 = this.c;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.c, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = dgo.f();
                    length2++;
                }
                this.c = iArr4;
                dgo.d(c2);
            } else if (a2 == 34) {
                if (this.d == null) {
                    this.d = new dox();
                }
                dgo.a((dgw) this.d);
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int[] iArr;
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dgq.b(1, str);
        }
        Integer num = this.b;
        if (num != null) {
            a2 += dgq.b(2, num.intValue());
        }
        int[] iArr2 = this.c;
        if (iArr2 != null && iArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr = this.c;
                if (i >= iArr.length) {
                    break;
                }
                i2 += dgq.a(iArr[i]);
                i++;
            }
            a2 = a2 + i2 + (iArr.length * 1);
        }
        dox dox = this.d;
        return dox != null ? a2 + dgq.b(4, (dgw) dox) : a2;
    }

    public final void a(dgq dgq) {
        String str = this.a;
        if (str != null) {
            dgq.a(1, str);
        }
        Integer num = this.b;
        if (num != null) {
            dgq.a(2, num.intValue());
        }
        int[] iArr = this.c;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i >= iArr2.length) {
                    break;
                }
                dgq.a(3, iArr2[i]);
                i++;
            }
        }
        dox dox = this.d;
        if (dox != null) {
            dgq.a(4, (dgw) dox);
        }
        super.a(dgq);
    }
}
