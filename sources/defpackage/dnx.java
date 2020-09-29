package defpackage;

/* renamed from: dnx reason: default package */
public final class dnx extends dga<dnx> {
    private String a;
    private Integer b;
    private int[] c;
    private dog d;

    public dnx() {
        this.a = null;
        this.b = null;
        this.c = dgi.a;
        this.d = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dnx a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dfx.d();
            } else if (a2 == 16) {
                int i = dfx.i();
                try {
                    this.b = Integer.valueOf(dno.a(dfx.f()));
                } catch (IllegalArgumentException unused) {
                    dfx.e(i);
                    a(dfx, a2);
                }
            } else if (a2 == 24) {
                int a3 = dgi.a(dfx, 24);
                int[] iArr = this.c;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = dfx.f();
                    dfx.a();
                    length++;
                }
                iArr2[length] = dfx.f();
                this.c = iArr2;
            } else if (a2 == 26) {
                int c2 = dfx.c(dfx.f());
                int i2 = dfx.i();
                int i3 = 0;
                while (dfx.h() > 0) {
                    dfx.f();
                    i3++;
                }
                dfx.e(i2);
                int[] iArr3 = this.c;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.c, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = dfx.f();
                    length2++;
                }
                this.c = iArr4;
                dfx.d(c2);
            } else if (a2 == 34) {
                if (this.d == null) {
                    this.d = new dog();
                }
                dfx.a((dgf) this.d);
            } else if (!super.a(dfx, a2)) {
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
            a2 += dfz.b(1, str);
        }
        Integer num = this.b;
        if (num != null) {
            a2 += dfz.b(2, num.intValue());
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
                i2 += dfz.a(iArr[i]);
                i++;
            }
            a2 = a2 + i2 + (iArr.length * 1);
        }
        dog dog = this.d;
        return dog != null ? a2 + dfz.b(4, (dgf) dog) : a2;
    }

    public final void a(dfz dfz) {
        String str = this.a;
        if (str != null) {
            dfz.a(1, str);
        }
        Integer num = this.b;
        if (num != null) {
            dfz.a(2, num.intValue());
        }
        int[] iArr = this.c;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i >= iArr2.length) {
                    break;
                }
                dfz.a(3, iArr2[i]);
                i++;
            }
        }
        dog dog = this.d;
        if (dog != null) {
            dfz.a(4, (dgf) dog);
        }
        super.a(dfz);
    }
}
