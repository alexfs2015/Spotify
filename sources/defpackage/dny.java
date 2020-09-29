package defpackage;

/* renamed from: dny reason: default package */
public final class dny extends dga<dny> {
    private Integer a;
    private int[] b;

    public dny() {
        this.a = null;
        this.b = dgi.a;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dny a(dfx dfx) {
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
            } else if (a2 == 16) {
                int a3 = dgi.a(dfx, 16);
                int[] iArr = this.b;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = dfx.f();
                    dfx.a();
                    length++;
                }
                iArr2[length] = dfx.f();
                this.b = iArr2;
            } else if (a2 == 18) {
                int c = dfx.c(dfx.f());
                int i2 = dfx.i();
                int i3 = 0;
                while (dfx.h() > 0) {
                    dfx.f();
                    i3++;
                }
                dfx.e(i2);
                int[] iArr3 = this.b;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.b, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = dfx.f();
                    length2++;
                }
                this.b = iArr4;
                dfx.d(c);
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
            i2 += dfz.a(iArr2[i]);
            i++;
        }
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        int[] iArr = this.b;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i >= iArr2.length) {
                    break;
                }
                dfz.a(2, iArr2[i]);
                i++;
            }
        }
        super.a(dfz);
    }
}
