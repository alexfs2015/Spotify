package defpackage;

/* renamed from: doy reason: default package */
public final class doy extends dgr<doy> {
    public Integer a;
    public Integer b;
    public Integer c;

    public doy() {
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
            a2 += dgq.b(1, num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            a2 += dgq.b(2, num2.intValue());
        }
        Integer num3 = this.c;
        return num3 != null ? a2 + dgq.b(3, num3.intValue()) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(dgo.f());
            } else if (a2 == 16) {
                this.b = Integer.valueOf(dgo.f());
            } else if (a2 == 24) {
                this.c = Integer.valueOf(dgo.f());
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        Integer num = this.a;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            dgq.a(2, num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            dgq.a(3, num3.intValue());
        }
        super.a(dgq);
    }
}
