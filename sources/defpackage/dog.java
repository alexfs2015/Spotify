package defpackage;

/* renamed from: dog reason: default package */
public final class dog extends dga<dog> {
    private static volatile dog[] a;
    private Integer b;
    private Integer c;

    public dog() {
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    public static dog[] b() {
        if (a == null) {
            synchronized (dge.b) {
                if (a == null) {
                    a = new dog[0];
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.b;
        if (num != null) {
            a2 += dfz.b(1, num.intValue());
        }
        Integer num2 = this.c;
        return num2 != null ? a2 + dfz.b(2, num2.intValue()) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.b = Integer.valueOf(dfx.f());
            } else if (a2 == 16) {
                this.c = Integer.valueOf(dfx.f());
            } else if (!super.a(dfx, a2)) {
                return this;
            }
        }
    }

    public final void a(dfz dfz) {
        Integer num = this.b;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        Integer num2 = this.c;
        if (num2 != null) {
            dfz.a(2, num2.intValue());
        }
        super.a(dfz);
    }
}
