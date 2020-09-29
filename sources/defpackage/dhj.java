package defpackage;

/* renamed from: dhj reason: default package */
public final class dhj extends dgr<dhj> {
    public String a;
    public Long b;
    public Boolean c;

    public dhj() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dgq.b(1, str);
        }
        Long l = this.b;
        if (l != null) {
            a2 += dgq.d(2, l.longValue());
        }
        Boolean bool = this.c;
        if (bool == null) {
            return a2;
        }
        bool.booleanValue();
        return a2 + dgq.c(24) + 1;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dgo.d();
            } else if (a2 == 16) {
                this.b = Long.valueOf(dgo.g());
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(dgo.c());
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
        Long l = this.b;
        if (l != null) {
            dgq.b(2, l.longValue());
        }
        Boolean bool = this.c;
        if (bool != null) {
            dgq.a(3, bool.booleanValue());
        }
        super.a(dgq);
    }
}
