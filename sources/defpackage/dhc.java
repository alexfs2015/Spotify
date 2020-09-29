package defpackage;

/* renamed from: dhc reason: default package */
public final class dhc extends dgr<dhc> {
    private static volatile dhc[] c;
    public byte[] a;
    public byte[] b;

    public dhc() {
        this.a = null;
        this.b = null;
        this.Y = null;
        this.Z = -1;
    }

    public static dhc[] b() {
        if (c == null) {
            synchronized (dgv.b) {
                if (c == null) {
                    c = new dhc[0];
                }
            }
        }
        return c;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a() + dgq.b(1, this.a);
        byte[] bArr = this.b;
        return bArr != null ? a2 + dgq.b(2, bArr) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dgo.e();
            } else if (a2 == 18) {
                this.b = dgo.e();
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        dgq.a(1, this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            dgq.a(2, bArr);
        }
        super.a(dgq);
    }
}
