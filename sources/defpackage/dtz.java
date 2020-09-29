package defpackage;

/* renamed from: dtz reason: default package */
final class dtz implements Runnable {
    private final /* synthetic */ dty a;

    dtz(dty dty) {
        this.a = dty;
    }

    public final void run() {
        if (this.a.q != null) {
            this.a.q.i();
            this.a.q.h();
            this.a.q.k();
        }
        this.a.q = null;
    }
}
