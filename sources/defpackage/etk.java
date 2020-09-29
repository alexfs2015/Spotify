package defpackage;

/* renamed from: etk reason: default package */
final class etk implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ etc b;

    etk(etc etc, boolean z) {
        this.b = etc;
        this.a = z;
    }

    public final void run() {
        boolean o = this.b.r.o();
        boolean n = this.b.r.n();
        this.b.r.a(this.a);
        if (n == this.a) {
            this.b.r.q().k.a("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.r.o() == o || this.b.r.o() != this.b.r.n()) {
            this.b.r.q().h.a("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(o));
        }
        etc.a(this.b);
    }
}
