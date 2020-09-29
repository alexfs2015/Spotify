package defpackage;

/* renamed from: dhn reason: default package */
public final class dhn extends dgr<dhn> {
    public byte[][] a;
    public byte[] b;
    public Integer c;
    private Integer d;

    public dhn() {
        this.a = dgz.d;
        this.b = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dhn a(dgo dgo) {
        int i;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                int a3 = dgz.a(dgo, 10);
                byte[][] bArr = this.a;
                int length = bArr == null ? 0 : bArr.length;
                byte[][] bArr2 = new byte[(a3 + length)][];
                if (length != 0) {
                    System.arraycopy(this.a, 0, bArr2, 0, length);
                }
                while (length < bArr2.length - 1) {
                    bArr2[length] = dgo.e();
                    dgo.a();
                    length++;
                }
                bArr2[length] = dgo.e();
                this.a = bArr2;
            } else if (a2 == 18) {
                this.b = dgo.e();
            } else if (a2 == 24) {
                i = dgo.i();
                this.d = Integer.valueOf(dbg.b(dgo.f()));
            } else if (a2 == 32) {
                i = dgo.i();
                try {
                    this.c = Integer.valueOf(dbg.c(dgo.f()));
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
                    i2 += dgq.a(bArr3);
                }
                i++;
            }
            a2 = a2 + i2 + (i3 * 1);
        }
        byte[] bArr4 = this.b;
        if (bArr4 != null) {
            a2 += dgq.b(2, bArr4);
        }
        Integer num = this.d;
        if (num != null) {
            a2 += dgq.b(3, num.intValue());
        }
        Integer num2 = this.c;
        return num2 != null ? a2 + dgq.b(4, num2.intValue()) : a2;
    }

    public final void a(dgq dgq) {
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
                    dgq.a(1, bArr3);
                }
                i++;
            }
        }
        byte[] bArr4 = this.b;
        if (bArr4 != null) {
            dgq.a(2, bArr4);
        }
        Integer num = this.d;
        if (num != null) {
            dgq.a(3, num.intValue());
        }
        Integer num2 = this.c;
        if (num2 != null) {
            dgq.a(4, num2.intValue());
        }
        super.a(dgq);
    }
}
