package defpackage;

/* renamed from: dhf reason: default package */
public final class dhf extends dgr<dhf> {
    private dhg a;
    private dhc[] b;
    private byte[] c;
    private byte[] d;
    private Integer e;
    private byte[] f;

    public dhf() {
        this.a = null;
        this.b = dhc.b();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        dhg dhg = this.a;
        if (dhg != null) {
            a2 += dgq.b(1, (dgw) dhg);
        }
        dhc[] dhcArr = this.b;
        if (dhcArr != null && dhcArr.length > 0) {
            int i = 0;
            while (true) {
                dhc[] dhcArr2 = this.b;
                if (i >= dhcArr2.length) {
                    break;
                }
                dhc dhc = dhcArr2[i];
                if (dhc != null) {
                    a2 += dgq.b(2, (dgw) dhc);
                }
                i++;
            }
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            a2 += dgq.b(3, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            a2 += dgq.b(4, bArr2);
        }
        Integer num = this.e;
        if (num != null) {
            a2 += dgq.b(5, num.intValue());
        }
        byte[] bArr3 = this.f;
        return bArr3 != null ? a2 + dgq.b(6, bArr3) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                if (this.a == null) {
                    this.a = new dhg();
                }
                dgo.a((dgw) this.a);
            } else if (a2 == 18) {
                int a3 = dgz.a(dgo, 18);
                dhc[] dhcArr = this.b;
                int length = dhcArr == null ? 0 : dhcArr.length;
                dhc[] dhcArr2 = new dhc[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, dhcArr2, 0, length);
                }
                while (length < dhcArr2.length - 1) {
                    dhcArr2[length] = new dhc();
                    dgo.a((dgw) dhcArr2[length]);
                    dgo.a();
                    length++;
                }
                dhcArr2[length] = new dhc();
                dgo.a((dgw) dhcArr2[length]);
                this.b = dhcArr2;
            } else if (a2 == 26) {
                this.c = dgo.e();
            } else if (a2 == 34) {
                this.d = dgo.e();
            } else if (a2 == 40) {
                this.e = Integer.valueOf(dgo.f());
            } else if (a2 == 50) {
                this.f = dgo.e();
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        dhg dhg = this.a;
        if (dhg != null) {
            dgq.a(1, (dgw) dhg);
        }
        dhc[] dhcArr = this.b;
        if (dhcArr != null && dhcArr.length > 0) {
            int i = 0;
            while (true) {
                dhc[] dhcArr2 = this.b;
                if (i >= dhcArr2.length) {
                    break;
                }
                dhc dhc = dhcArr2[i];
                if (dhc != null) {
                    dgq.a(2, (dgw) dhc);
                }
                i++;
            }
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            dgq.a(3, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            dgq.a(4, bArr2);
        }
        Integer num = this.e;
        if (num != null) {
            dgq.a(5, num.intValue());
        }
        byte[] bArr3 = this.f;
        if (bArr3 != null) {
            dgq.a(6, bArr3);
        }
        super.a(dgq);
    }
}
