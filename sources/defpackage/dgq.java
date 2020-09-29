package defpackage;

/* renamed from: dgq reason: default package */
public final class dgq extends dga<dgq> {
    public Integer a;
    public String b;
    public byte[] c;

    public dgq() {
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
        String str = this.b;
        if (str != null) {
            a2 += dfz.b(2, str);
        }
        byte[] bArr = this.c;
        return bArr != null ? a2 + dfz.b(3, bArr) : a2;
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            dfz.a(2, str);
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            dfz.a(3, bArr);
        }
        super.a(dfz);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dgq a(dfx dfx) {
        int f;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    f = dfx.f();
                    if (f < 0 || f > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(f);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.a = Integer.valueOf(f);
                    }
                } catch (IllegalArgumentException unused) {
                    dfx.e(dfx.i());
                    a(dfx, a2);
                }
            } else if (a2 == 18) {
                this.b = dfx.d();
            } else if (a2 == 26) {
                this.c = dfx.e();
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(f);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }
}
