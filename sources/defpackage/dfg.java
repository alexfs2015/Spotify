package defpackage;

/* renamed from: dfg reason: default package */
public final class dfg extends dga<dfg> {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;

    public dfg() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        byte[] bArr = this.a;
        if (bArr != null) {
            a2 += dfz.b(1, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            a2 += dfz.b(2, bArr2);
        }
        byte[] bArr3 = this.c;
        if (bArr3 != null) {
            a2 += dfz.b(3, bArr3);
        }
        byte[] bArr4 = this.d;
        return bArr4 != null ? a2 + dfz.b(4, bArr4) : a2;
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
            } else if (a2 == 26) {
                this.c = dfx.e();
            } else if (a2 == 34) {
                this.d = dfx.e();
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public final void a(dfz dfz) {
        byte[] bArr = this.a;
        if (bArr != null) {
            dfz.a(1, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            dfz.a(2, bArr2);
        }
        byte[] bArr3 = this.c;
        if (bArr3 != null) {
            dfz.a(3, bArr3);
        }
        byte[] bArr4 = this.d;
        if (bArr4 != null) {
            dfz.a(4, bArr4);
        }
        super.a(dfz);
    }
}
