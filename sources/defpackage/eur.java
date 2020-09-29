package defpackage;

/* renamed from: eur reason: default package */
abstract class eur extends ett {
    private boolean a;

    eur(ery ery) {
        super(ery);
        this.r.k++;
    }

    /* access modifiers changed from: protected */
    public abstract boolean t();

    /* access modifiers changed from: protected */
    public void u() {
    }

    /* access modifiers changed from: 0000 */
    public final boolean C() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void D() {
        if (!C()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void E() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!t()) {
            this.r.s();
            this.a = true;
        }
    }

    public final void F() {
        if (!this.a) {
            u();
            this.r.s();
            this.a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
