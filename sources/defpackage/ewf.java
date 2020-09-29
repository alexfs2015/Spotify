package defpackage;

/* renamed from: ewf reason: default package */
final class ewf implements Runnable {
    private final /* synthetic */ esw a;
    private final /* synthetic */ ewe b;

    ewf(ewe ewe, esw esw) {
        this.b = ewe;
        this.a = esw;
    }

    public final void run() {
        if (evt.a()) {
            this.a.p().a((Runnable) this);
            return;
        }
        boolean b2 = this.b.b();
        this.b.d = 0;
        if (b2) {
            this.b.a();
        }
    }
}
