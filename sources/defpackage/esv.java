package defpackage;

/* renamed from: esv reason: default package */
abstract class esv extends esu {
    private boolean a;

    esv(ery ery) {
        super(ery);
        this.r.k++;
    }

    /* access modifiers changed from: protected */
    public abstract boolean d();

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: 0000 */
    public final boolean v() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void w() {
        if (!v()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!d()) {
            this.r.s();
            this.a = true;
        }
    }

    public final void y() {
        if (!this.a) {
            e();
            this.r.s();
            this.a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
