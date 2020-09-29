package defpackage;

/* renamed from: bvr reason: default package */
final class bvr implements Runnable {
    private final /* synthetic */ exo a;
    private final /* synthetic */ bvp b;

    bvr(bvp bvp, exo exo) {
        this.b = bvp;
        this.a = exo;
    }

    public final void run() {
        bvp.a(this.b, this.a);
    }
}
