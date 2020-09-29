package defpackage;

/* renamed from: duj reason: default package */
final class duj implements Runnable {
    private final /* synthetic */ dui a;

    duj(dui dui) {
        this.a = dui;
    }

    public final void run() {
        if (this.a.p != null) {
            this.a.p.i();
            this.a.p.h();
            this.a.p.k();
        }
        this.a.p = null;
    }
}
