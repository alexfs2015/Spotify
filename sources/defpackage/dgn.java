package defpackage;

/* renamed from: dgn reason: default package */
public final class dgn extends dga<dgn> {
    private byte[] a;
    private byte[] b;
    private byte[] c;

    public dgn() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Y = null;
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
        return bArr3 != null ? a2 + dfz.b(3, bArr3) : a2;
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
        super.a(dfz);
    }
}
