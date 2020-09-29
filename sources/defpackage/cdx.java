package defpackage;

/* renamed from: cdx reason: default package */
final class cdx implements Runnable {
    private final /* synthetic */ clq a;
    private final /* synthetic */ cdw b;

    cdx(cdw cdw, clq clq) {
        this.b = cdw;
        this.a = clq;
    }

    public final void run() {
        this.b.a.b(this.a);
    }
}
