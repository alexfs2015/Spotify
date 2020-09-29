package defpackage;

/* renamed from: dts reason: default package */
final class dts implements Runnable {
    private final /* synthetic */ dtr a;

    dts(dtr dtr) {
        this.a = dtr;
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
