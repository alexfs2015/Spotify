package defpackage;

/* renamed from: dgp reason: default package */
public final class dgp extends dga<dgp> {
    private Integer a;
    private byte[] b;
    private byte[] c;

    public dgp() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dfz.b(1, num.intValue());
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            a2 += dfz.b(2, bArr);
        }
        byte[] bArr2 = this.c;
        return bArr2 != null ? a2 + dfz.b(3, bArr2) : a2;
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            dfz.a(2, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            dfz.a(3, bArr2);
        }
        super.a(dfz);
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(dfx.f());
            } else if (a2 == 18) {
                this.b = dfx.e();
            } else if (a2 == 26) {
                this.c = dfx.e();
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }
}
