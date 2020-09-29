package defpackage;

/* renamed from: dfy reason: default package */
public final class dfy extends dga<dfy> {
    public Long a;
    private String b;
    private byte[] c;

    public dfy() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Long l = this.a;
        if (l != null) {
            a2 += dfz.d(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            a2 += dfz.b(3, str);
        }
        byte[] bArr = this.c;
        return bArr != null ? a2 + dfz.b(4, bArr) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Long.valueOf(dfx.g());
            } else if (a2 == 26) {
                this.b = dfx.d();
            } else if (a2 == 34) {
                this.c = dfx.e();
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public final void a(dfz dfz) {
        Long l = this.a;
        if (l != null) {
            dfz.b(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            dfz.a(3, str);
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            dfz.a(4, bArr);
        }
        super.a(dfz);
    }
}
