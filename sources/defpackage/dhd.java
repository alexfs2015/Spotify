package defpackage;

/* renamed from: dhd reason: default package */
public final class dhd extends dgr<dhd> {
    public dhc[] a;
    private dhe b;
    private byte[] c;
    private byte[] d;
    private Integer e;

    public dhd() {
        this.b = null;
        this.a = dhc.b();
        this.c = null;
        this.d = null;
        this.e = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        dhe dhe = this.b;
        if (dhe != null) {
            a2 += dgq.b(1, (dgw) dhe);
        }
        dhc[] dhcArr = this.a;
        if (dhcArr != null && dhcArr.length > 0) {
            int i = 0;
            while (true) {
                dhc[] dhcArr2 = this.a;
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
        return num != null ? a2 + dgq.b(5, num.intValue()) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                if (this.b == null) {
                    this.b = new dhe();
                }
                dgo.a((dgw) this.b);
            } else if (a2 == 18) {
                int a3 = dgz.a(dgo, 18);
                dhc[] dhcArr = this.a;
                int length = dhcArr == null ? 0 : dhcArr.length;
                dhc[] dhcArr2 = new dhc[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, dhcArr2, 0, length);
                }
                while (length < dhcArr2.length - 1) {
                    dhcArr2[length] = new dhc();
                    dgo.a((dgw) dhcArr2[length]);
                    dgo.a();
                    length++;
                }
                dhcArr2[length] = new dhc();
                dgo.a((dgw) dhcArr2[length]);
                this.a = dhcArr2;
            } else if (a2 == 26) {
                this.c = dgo.e();
            } else if (a2 == 34) {
                this.d = dgo.e();
            } else if (a2 == 40) {
                this.e = Integer.valueOf(dgo.f());
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        dhe dhe = this.b;
        if (dhe != null) {
            dgq.a(1, (dgw) dhe);
        }
        dhc[] dhcArr = this.a;
        if (dhcArr != null && dhcArr.length > 0) {
            int i = 0;
            while (true) {
                dhc[] dhcArr2 = this.a;
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
        super.a(dgq);
    }
}
