package defpackage;

/* renamed from: dtu reason: default package */
final class dtu implements Runnable {
    private final /* synthetic */ dtt a;

    dtu(dtt dtt) {
        this.a = dtt;
    }

    public final void run() {
        if (this.a.n != null) {
            this.a.n.i();
            this.a.n.h();
            this.a.n.k();
        }
        this.a.n = null;
    }
}
