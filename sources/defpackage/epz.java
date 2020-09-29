package defpackage;

/* renamed from: epz reason: default package */
public abstract class epz {
    protected volatile int M = -1;

    public abstract epz a(eps eps);

    public void a(ept ept) {
    }

    /* access modifiers changed from: protected */
    public int b() {
        return 0;
    }

    public final int d() {
        if (this.M < 0) {
            e();
        }
        return this.M;
    }

    public final int e() {
        int b = b();
        this.M = b;
        return b;
    }

    public String toString() {
        return eqa.a(this);
    }

    /* renamed from: c */
    public epz clone() {
        return (epz) super.clone();
    }
}
