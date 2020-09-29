package defpackage;

/* renamed from: doh reason: default package */
public final class doh extends dga<doh> {
    public Integer a;
    public Integer b;
    public Integer c;

    public doh() {
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
        Integer num2 = this.b;
        if (num2 != null) {
            a2 += dfz.b(2, num2.intValue());
        }
        Integer num3 = this.c;
        return num3 != null ? a2 + dfz.b(3, num3.intValue()) : a2;
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
            } else if (a2 == 24) {
                this.c = Integer.valueOf(dfx.f());
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
        Integer num3 = this.c;
        if (num3 != null) {
            dfz.a(3, num3.intValue());
        }
        super.a(dfz);
    }
}
