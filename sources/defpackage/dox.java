package defpackage;

/* renamed from: dox reason: default package */
public final class dox extends dgr<dox> {
    private static volatile dox[] a;
    private Integer b;
    private Integer c;

    public dox() {
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    public static dox[] b() {
        if (a == null) {
            synchronized (dgv.b) {
                if (a == null) {
                    a = new dox[0];
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
            a2 += dgq.b(1, num.intValue());
        }
        Integer num2 = this.c;
        return num2 != null ? a2 + dgq.b(2, num2.intValue()) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.b = Integer.valueOf(dgo.f());
            } else if (a2 == 16) {
                this.c = Integer.valueOf(dgo.f());
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        Integer num = this.b;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        Integer num2 = this.c;
        if (num2 != null) {
            dgq.a(2, num2.intValue());
        }
        super.a(dgq);
    }
}
