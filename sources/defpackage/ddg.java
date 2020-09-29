package defpackage;

/* renamed from: ddg reason: default package */
public final class ddg extends dga<ddg> {
    public Long a;
    public Long b;
    public Long c;
    private Long d;
    private Long e;

    public ddg() {
        this.d = null;
        this.e = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Long l = this.d;
        if (l != null) {
            a2 += dfz.d(1, l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            a2 += dfz.d(2, l2.longValue());
        }
        Long l3 = this.a;
        if (l3 != null) {
            a2 += dfz.d(3, l3.longValue());
        }
        Long l4 = this.b;
        if (l4 != null) {
            a2 += dfz.d(4, l4.longValue());
        }
        Long l5 = this.c;
        return l5 != null ? a2 + dfz.d(5, l5.longValue()) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.d = Long.valueOf(dfx.g());
            } else if (a2 == 16) {
                this.e = Long.valueOf(dfx.g());
            } else if (a2 == 24) {
                this.a = Long.valueOf(dfx.g());
            } else if (a2 == 32) {
                this.b = Long.valueOf(dfx.g());
            } else if (a2 == 40) {
                this.c = Long.valueOf(dfx.g());
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public final void a(dfz dfz) {
        Long l = this.d;
        if (l != null) {
            dfz.b(1, l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            dfz.b(2, l2.longValue());
        }
        Long l3 = this.a;
        if (l3 != null) {
            dfz.b(3, l3.longValue());
        }
        Long l4 = this.b;
        if (l4 != null) {
            dfz.b(4, l4.longValue());
        }
        Long l5 = this.c;
        if (l5 != null) {
            dfz.b(5, l5.longValue());
        }
        super.a(dfz);
    }
}
