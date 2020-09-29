package defpackage;

/* renamed from: dgs reason: default package */
public final class dgs extends dga<dgs> {
    public String a;
    public Long b;
    public Boolean c;

    public dgs() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    public final void a(dfz dfz) {
        String str = this.a;
        if (str != null) {
            dfz.a(1, str);
        }
        Long l = this.b;
        if (l != null) {
            dfz.b(2, l.longValue());
        }
        Boolean bool = this.c;
        if (bool != null) {
            dfz.a(3, bool.booleanValue());
        }
        super.a(dfz);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dfz.b(1, str);
        }
        Long l = this.b;
        if (l != null) {
            a2 += dfz.d(2, l.longValue());
        }
        Boolean bool = this.c;
        if (bool == null) {
            return a2;
        }
        bool.booleanValue();
        return a2 + dfz.c(24) + 1;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dfx.d();
            } else if (a2 == 16) {
                this.b = Long.valueOf(dfx.g());
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(dfx.c());
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }
}
