package defpackage;

/* renamed from: dhb reason: default package */
public final class dhb extends dgr<dhb> {
    public String a;

    public dhb() {
        this.a = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        return str != null ? a2 + dgq.b(1, str) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dgo.d();
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        String str = this.a;
        if (str != null) {
            dgq.a(1, str);
        }
        super.a(dgq);
    }
}
