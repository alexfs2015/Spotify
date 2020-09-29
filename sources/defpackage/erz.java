package defpackage;

/* renamed from: erz reason: default package */
final class erz implements Runnable {
    private final /* synthetic */ etb a;
    private final /* synthetic */ ery b;

    erz(ery ery, etb etb) {
        this.b = ery;
        this.a = etb;
    }

    public final void run() {
        ery.a(this.b, this.a);
        this.b.a();
    }
}
