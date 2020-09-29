package defpackage;

/* renamed from: eww reason: default package */
final class eww implements Runnable {
    private final /* synthetic */ etn a;
    private final /* synthetic */ ewv b;

    eww(ewv ewv, etn etn) {
        this.b = ewv;
        this.a = etn;
    }

    public final void run() {
        if (ewk.a()) {
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
