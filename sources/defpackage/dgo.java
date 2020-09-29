package defpackage;

/* renamed from: dgo reason: default package */
public final class dgo extends dga<dgo> {
    private dgp a;
    private dgl[] b;
    private byte[] c;
    private byte[] d;
    private Integer e;
    private byte[] f;

    public dgo() {
        this.a = null;
        this.b = dgl.b();
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
        dgp dgp = this.a;
        if (dgp != null) {
            a2 += dfz.b(1, (dgf) dgp);
        }
        dgl[] dglArr = this.b;
        if (dglArr != null && dglArr.length > 0) {
            int i = 0;
            while (true) {
                dgl[] dglArr2 = this.b;
                if (i >= dglArr2.length) {
                    break;
                }
                dgl dgl = dglArr2[i];
                if (dgl != null) {
                    a2 += dfz.b(2, (dgf) dgl);
                }
                i++;
            }
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            a2 += dfz.b(3, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            a2 += dfz.b(4, bArr2);
        }
        Integer num = this.e;
        if (num != null) {
            a2 += dfz.b(5, num.intValue());
        }
        byte[] bArr3 = this.f;
        return bArr3 != null ? a2 + dfz.b(6, bArr3) : a2;
    }

    public final void a(dfz dfz) {
        dgp dgp = this.a;
        if (dgp != null) {
            dfz.a(1, (dgf) dgp);
        }
        dgl[] dglArr = this.b;
        if (dglArr != null && dglArr.length > 0) {
            int i = 0;
            while (true) {
                dgl[] dglArr2 = this.b;
                if (i >= dglArr2.length) {
                    break;
                }
                dgl dgl = dglArr2[i];
                if (dgl != null) {
                    dfz.a(2, (dgf) dgl);
                }
                i++;
            }
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            dfz.a(3, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            dfz.a(4, bArr2);
        }
        Integer num = this.e;
        if (num != null) {
            dfz.a(5, num.intValue());
        }
        byte[] bArr3 = this.f;
        if (bArr3 != null) {
            dfz.a(6, bArr3);
        }
        super.a(dfz);
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                if (this.a == null) {
                    this.a = new dgp();
                }
                dfx.a((dgf) this.a);
            } else if (a2 == 18) {
                int a3 = dgi.a(dfx, 18);
                dgl[] dglArr = this.b;
                int length = dglArr == null ? 0 : dglArr.length;
                dgl[] dglArr2 = new dgl[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, dglArr2, 0, length);
                }
                while (length < dglArr2.length - 1) {
                    dglArr2[length] = new dgl();
                    dfx.a((dgf) dglArr2[length]);
                    dfx.a();
                    length++;
                }
                dglArr2[length] = new dgl();
                dfx.a((dgf) dglArr2[length]);
                this.b = dglArr2;
            } else if (a2 == 26) {
                this.c = dfx.e();
            } else if (a2 == 34) {
                this.d = dfx.e();
            } else if (a2 == 40) {
                this.e = Integer.valueOf(dfx.f());
            } else if (a2 == 50) {
                this.f = dfx.e();
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }
}
