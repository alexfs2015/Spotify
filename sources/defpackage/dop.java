package defpackage;

/* renamed from: dop reason: default package */
public final class dop extends dgr<dop> {
    private Integer a;
    private int[] b;

    public dop() {
        this.a = null;
        this.b = dgz.a;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dop a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                int i = dgo.i();
                try {
                    this.a = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            } else if (a2 == 16) {
                int a3 = dgz.a(dgo, 16);
                int[] iArr = this.b;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = dgo.f();
                    dgo.a();
                    length++;
                }
                iArr2[length] = dgo.f();
                this.b = iArr2;
            } else if (a2 == 18) {
                int c = dgo.c(dgo.f());
                int i2 = dgo.i();
                int i3 = 0;
                while (dgo.h() > 0) {
                    dgo.f();
                    i3++;
                }
                dgo.e(i2);
                int[] iArr3 = this.b;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.b, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = dgo.f();
                    length2++;
                }
                this.b = iArr4;
                dgo.d(c);
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dgq.b(1, num.intValue());
        }
        int[] iArr = this.b;
        if (iArr == null || iArr.length <= 0) {
            return a2;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.b;
            if (i >= iArr2.length) {
                return a2 + i2 + (iArr2.length * 1);
            }
            i2 += dgq.a(iArr2[i]);
            i++;
        }
    }

    public final void a(dgq dgq) {
        Integer num = this.a;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        int[] iArr = this.b;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i >= iArr2.length) {
                    break;
                }
                dgq.a(2, iArr2[i]);
                i++;
            }
        }
        super.a(dgq);
    }
}
