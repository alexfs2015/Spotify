package defpackage;

/* renamed from: dpb reason: default package */
public final class dpb extends dgr<dpb> {
    private Integer a;

    public dpb() {
        this.a = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dpb a(dgo dgo) {
        int f;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    f = dgo.f();
                    if (f < 0 || f > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(f);
                        sb.append(" is not a valid enum VideoErrorCode");
                    } else {
                        this.a = Integer.valueOf(f);
                    }
                } catch (IllegalArgumentException unused) {
                    dgo.e(dgo.i());
                    a(dgo, a2);
                }
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(f);
        sb2.append(" is not a valid enum VideoErrorCode");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        return num != null ? a2 + dgq.b(1, num.intValue()) : a2;
    }

    public final void a(dgq dgq) {
        Integer num = this.a;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        super.a(dgq);
    }
}
