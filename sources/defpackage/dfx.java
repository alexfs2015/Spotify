package defpackage;

/* renamed from: dfx reason: default package */
public final class dfx extends dgr<dfx> {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;

    public dfx() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        byte[] bArr = this.a;
        if (bArr != null) {
            a2 += dgq.b(1, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            a2 += dgq.b(2, bArr2);
        }
        byte[] bArr3 = this.c;
        if (bArr3 != null) {
            a2 += dgq.b(3, bArr3);
        }
        byte[] bArr4 = this.d;
        return bArr4 != null ? a2 + dgq.b(4, bArr4) : a2;
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
            } else if (a2 == 26) {
                this.c = dgo.e();
            } else if (a2 == 34) {
                this.d = dgo.e();
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        byte[] bArr = this.a;
        if (bArr != null) {
            dgq.a(1, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            dgq.a(2, bArr2);
        }
        byte[] bArr3 = this.c;
        if (bArr3 != null) {
            dgq.a(3, bArr3);
        }
        byte[] bArr4 = this.d;
        if (bArr4 != null) {
            dgq.a(4, bArr4);
        }
        super.a(dgq);
    }
}
