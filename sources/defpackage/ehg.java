package defpackage;

/* renamed from: ehg reason: default package */
final class ehg implements Runnable {
    private final /* synthetic */ ehb a;
    private final /* synthetic */ int b;

    ehg(ehb ehb, int i) {
        this.a = ehb;
        this.b = i;
    }

    public final void run() {
        this.a.p.a(this.b);
    }
}
