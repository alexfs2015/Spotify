package defpackage;

/* renamed from: doe reason: default package */
public final class doe extends dga<doe> {
    private Integer a;
    private Integer b;

    public doe() {
        this.a = null;
        this.b = null;
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
        Integer num2 = this.b;
        return num2 != null ? a2 + dfz.b(2, num2.intValue()) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(dfx.f());
            } else if (a2 == 16) {
                this.b = Integer.valueOf(dfx.f());
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            dfz.a(2, num2.intValue());
        }
        super.a(dfz);
    }
}
