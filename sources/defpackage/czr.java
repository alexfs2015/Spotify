package defpackage;

/* renamed from: czr reason: default package */
public final class czr extends dga<czr> {
    public String a;
    private String b;
    private String c;
    private String d;
    private String e;

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dfz.b(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            a2 += dfz.b(2, str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            a2 += dfz.b(3, str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            a2 += dfz.b(4, str4);
        }
        String str5 = this.e;
        return str5 != null ? a2 + dfz.b(5, str5) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dfx.d();
            } else if (a2 == 18) {
                this.b = dfx.d();
            } else if (a2 == 26) {
                this.c = dfx.d();
            } else if (a2 == 34) {
                this.d = dfx.d();
            } else if (a2 == 42) {
                this.e = dfx.d();
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public final void a(dfz dfz) {
        String str = this.a;
        if (str != null) {
            dfz.a(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            dfz.a(2, str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            dfz.a(3, str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            dfz.a(4, str4);
        }
        String str5 = this.e;
        if (str5 != null) {
            dfz.a(5, str5);
        }
        super.a(dfz);
    }
}
