package defpackage;

/* renamed from: dgk reason: default package */
public final class dgk extends dga<dgk> {
    public String a;

    public dgk() {
        this.a = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        return str != null ? a2 + dfz.b(1, str) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dfx.d();
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
        super.a(dfz);
    }
}
