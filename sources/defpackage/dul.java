package defpackage;

/* renamed from: dul reason: default package */
final class dul implements Runnable {
    private final /* synthetic */ duk a;

    dul(duk duk) {
        this.a = duk;
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
