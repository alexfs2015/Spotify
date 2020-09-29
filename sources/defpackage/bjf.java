package defpackage;

/* renamed from: bjf reason: default package */
final /* synthetic */ class bjf implements Runnable {
    private final bje a;
    private final Runnable b;

    bjf(bje bje, Runnable runnable) {
        this.a = bje;
        this.b = runnable;
    }

    public final void run() {
        cqo.a.execute(new bjh(this.a, this.b));
    }
}
