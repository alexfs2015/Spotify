package defpackage;

/* renamed from: dhh reason: default package */
public final class dhh extends dgr<dhh> {
    public Integer a;
    public String b;
    public byte[] c;

    public dhh() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dhh a(dgo dgo) {
        int f;
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    f = dgo.f();
                    if (f < 0 || f > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(f);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.a = Integer.valueOf(f);
                    }
                } catch (IllegalArgumentException unused) {
                    dgo.e(dgo.i());
                    a(dgo, a2);
                }
            } else if (a2 == 18) {
                this.b = dgo.d();
            } else if (a2 == 26) {
                this.c = dgo.e();
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(f);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dgq.b(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            a2 += dgq.b(2, str);
        }
        byte[] bArr = this.c;
        return bArr != null ? a2 + dgq.b(3, bArr) : a2;
    }

    public final void a(dgq dgq) {
        Integer num = this.a;
        if (num != null) {
            dgq.a(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            dgq.a(2, str);
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            dgq.a(3, bArr);
        }
        super.a(dgq);
    }
}
