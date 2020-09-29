package defpackage;

/* renamed from: dgl reason: default package */
public final class dgl extends dga<dgl> {
    private static volatile dgl[] c;
    public byte[] a;
    public byte[] b;

    public dgl() {
        this.a = null;
        this.b = null;
        this.Y = null;
        this.Z = -1;
    }

    public static dgl[] b() {
        if (c == null) {
            synchronized (dge.b) {
                if (c == null) {
                    c = new dgl[0];
                }
            }
        }
        return c;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a() + dfz.b(1, this.a);
        byte[] bArr = this.b;
        return bArr != null ? a2 + dfz.b(2, bArr) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dfx.e();
            } else if (a2 == 18) {
                this.b = dfx.e();
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public final void a(dfz dfz) {
        dfz.a(1, this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            dfz.a(2, bArr);
        }
        super.a(dfz);
    }
}
