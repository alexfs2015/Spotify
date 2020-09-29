package defpackage;

/* renamed from: dgp reason: default package */
public final class dgp extends dgr<dgp> {
    public Long a;
    private String b;
    private byte[] c;

    public dgp() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Long l = this.a;
        if (l != null) {
            a2 += dgq.d(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            a2 += dgq.b(3, str);
        }
        byte[] bArr = this.c;
        return bArr != null ? a2 + dgq.b(4, bArr) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Long.valueOf(dgo.g());
            } else if (a2 == 26) {
                this.b = dgo.d();
            } else if (a2 == 34) {
                this.c = dgo.e();
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        Long l = this.a;
        if (l != null) {
            dgq.b(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            dgq.a(3, str);
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            dgq.a(4, bArr);
        }
        super.a(dgq);
    }
}
