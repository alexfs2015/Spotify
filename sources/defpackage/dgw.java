package defpackage;

/* renamed from: dgw reason: default package */
public final class dgw extends dga<dgw> {
    public byte[][] a;
    public byte[] b;
    public Integer c;
    private Integer d;

    public dgw() {
        this.a = dgi.d;
        this.b = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dgw a(dfx dfx) {
        int i;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                int a3 = dgi.a(dfx, 10);
                byte[][] bArr = this.a;
                int length = bArr == null ? 0 : bArr.length;
                byte[][] bArr2 = new byte[(a3 + length)][];
                if (length != 0) {
                    System.arraycopy(this.a, 0, bArr2, 0, length);
                }
                while (length < bArr2.length - 1) {
                    bArr2[length] = dfx.e();
                    dfx.a();
                    length++;
                }
                bArr2[length] = dfx.e();
                this.a = bArr2;
            } else if (a2 == 18) {
                this.b = dfx.e();
            } else if (a2 == 24) {
                i = dfx.i();
                this.d = Integer.valueOf(dap.b(dfx.f()));
            } else if (a2 == 32) {
                i = dfx.i();
                try {
                    this.c = Integer.valueOf(dap.c(dfx.f()));
                } catch (IllegalArgumentException unused) {
                    dfx.e(i);
                    a(dfx, a2);
                }
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        byte[][] bArr = this.a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.a;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += dfz.a(bArr3);
                }
                i++;
            }
            a2 = a2 + i2 + (i3 * 1);
        }
        byte[] bArr4 = this.b;
        if (bArr4 != null) {
            a2 += dfz.b(2, bArr4);
        }
        Integer num = this.d;
        if (num != null) {
            a2 += dfz.b(3, num.intValue());
        }
        Integer num2 = this.c;
        return num2 != null ? a2 + dfz.b(4, num2.intValue()) : a2;
    }

    public final void a(dfz dfz) {
        byte[][] bArr = this.a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.a;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    dfz.a(1, bArr3);
                }
                i++;
            }
        }
        byte[] bArr4 = this.b;
        if (bArr4 != null) {
            dfz.a(2, bArr4);
        }
        Integer num = this.d;
        if (num != null) {
            dfz.a(3, num.intValue());
        }
        Integer num2 = this.c;
        if (num2 != null) {
            dfz.a(4, num2.intValue());
        }
        super.a(dfz);
    }
}
