package defpackage;

/* renamed from: dhg reason: default package */
public final class dhg extends dgr<dhg> {
    private Integer a;
    private byte[] b;
    private byte[] c;

    public dhg() {
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
        byte[] bArr = this.b;
        if (bArr != null) {
            a2 += dgq.b(2, bArr);
        }
        byte[] bArr2 = this.c;
        return bArr2 != null ? a2 + dgq.b(3, bArr2) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                this.a = Integer.valueOf(dgo.f());
            } else if (a2 == 18) {
                this.b = dgo.e();
            } else if (a2 == 26) {
                this.c = dgo.e();
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
        byte[] bArr = this.b;
        if (bArr != null) {
            dgq.a(2, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            dgq.a(3, bArr2);
        }
        super.a(dgq);
    }
}
