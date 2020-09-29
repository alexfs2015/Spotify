package defpackage;

/* renamed from: eqq reason: default package */
public abstract class eqq {
    protected volatile int M = -1;

    public abstract eqq a(eqj eqj);

    public void a(eqk eqk) {
    }

    /* access modifiers changed from: protected */
    public int b() {
        return 0;
    }

    /* renamed from: c */
    public eqq clone() {
        return (eqq) super.clone();
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
        return eqr.a(this);
    }
}
