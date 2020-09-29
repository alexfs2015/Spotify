package defpackage;

/* renamed from: evs reason: default package */
abstract class evs extends evr {
    private boolean a;

    evs(evt evt) {
        super(evt);
        this.b.d++;
    }

    /* access modifiers changed from: protected */
    public abstract boolean d();

    /* access modifiers changed from: 0000 */
    public final boolean i() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (!this.a) {
            d();
            this.b.e++;
            this.a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
