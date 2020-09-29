package defpackage;

/* renamed from: dos reason: default package */
public final class dos extends dgr<dos> {
    private Integer a;
    private dox b;

    public dos() {
        this.a = null;
        this.b = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dos a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                int i = dgo.i();
                try {
                    this.a = Integer.valueOf(dof.a(dgo.f()));
                } catch (IllegalArgumentException unused) {
                    dgo.e(i);
                    a(dgo, a2);
                }
            } else if (a2 == 18) {
                if (this.b == null) {
                    this.b = new dox();
                }
                dgo.a((dgw) this.b);
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dgq.b(1, num.intValue());
        }
        dox dox = this.b;
        return dox != null ? a2 + dgq.b(2, (dgw) dox) : a2;
    }

    public final void a(dgq dgq) {
        Integer num = this.a;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        dox dox = this.b;
        if (dox != null) {
            dgq.a(2, (dgw) dox);
        }
        super.a(dgq);
    }
}
