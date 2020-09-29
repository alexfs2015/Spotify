package defpackage;

/* renamed from: ceg reason: default package */
final class ceg implements Runnable {
    private final /* synthetic */ cqt a;
    private final /* synthetic */ String b;
    private final /* synthetic */ ced c;

    ceg(ced ced, cqt cqt, String str) {
        this.c = ced;
        this.a = cqt;
        this.b = str;
    }

    public final void run() {
        this.a.b((dxb) this.c.b.M().get(this.b));
    }
}
