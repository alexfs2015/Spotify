package defpackage;

/* renamed from: dov reason: default package */
public final class dov extends dgr<dov> {
    private Integer a;
    private Integer b;

    public dov() {
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
            a2 += dgq.b(1, num.intValue());
        }
        Integer num2 = this.b;
        return num2 != null ? a2 + dgq.b(2, num2.intValue()) : a2;
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
        super.a(dgq);
    }
}
