package defpackage;

/* renamed from: cec reason: default package */
final class cec implements Runnable {
    private final /* synthetic */ clq a;
    private final /* synthetic */ ceb b;

    cec(ceb ceb, clq clq) {
        this.b = ceb;
        this.a = clq;
    }

    public final void run() {
        this.b.a.b(this.a);
    }
}
