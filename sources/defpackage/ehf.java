package defpackage;

/* renamed from: ehf reason: default package */
final class ehf implements Runnable {
    private final /* synthetic */ ehb a;
    private final /* synthetic */ ehk b;

    ehf(ehb ehb, ehk ehk) {
        this.a = ehb;
        this.b = ehk;
    }

    public final void run() {
        ehb.a(this.a, this.b);
    }
}
