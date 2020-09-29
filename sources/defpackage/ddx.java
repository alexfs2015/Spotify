package defpackage;

/* renamed from: ddx reason: default package */
public final class ddx extends dgr<ddx> {
    public Long a;
    public Long b;
    public Long c;
    private Long d;
    private Long e;

    public ddx() {
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
            a2 += dgq.d(1, l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            a2 += dgq.d(2, l2.longValue());
        }
        Long l3 = this.a;
        if (l3 != null) {
            a2 += dgq.d(3, l3.longValue());
        }
        Long l4 = this.b;
        if (l4 != null) {
            a2 += dgq.d(4, l4.longValue());
        }
        Long l5 = this.c;
        return l5 != null ? a2 + dgq.d(5, l5.longValue()) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.d = Long.valueOf(dgo.g());
            } else if (a2 == 16) {
                this.e = Long.valueOf(dgo.g());
            } else if (a2 == 24) {
                this.a = Long.valueOf(dgo.g());
            } else if (a2 == 32) {
                this.b = Long.valueOf(dgo.g());
            } else if (a2 == 40) {
                this.c = Long.valueOf(dgo.g());
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        Long l = this.d;
        if (l != null) {
            dgq.b(1, l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            dgq.b(2, l2.longValue());
        }
        Long l3 = this.a;
        if (l3 != null) {
            dgq.b(3, l3.longValue());
        }
        Long l4 = this.b;
        if (l4 != null) {
            dgq.b(4, l4.longValue());
        }
        Long l5 = this.c;
        if (l5 != null) {
            dgq.b(5, l5.longValue());
        }
        super.a(dgq);
    }
}
