package defpackage;

/* renamed from: evu reason: default package */
final class evu implements Runnable {
    private final /* synthetic */ evy a;
    private final /* synthetic */ evt b;

    evu(evt evt, evy evy) {
        this.b = evt;
        this.a = evy;
    }

    public final void run() {
        evt.a(this.b, this.a);
        this.b.a();
    }
}
