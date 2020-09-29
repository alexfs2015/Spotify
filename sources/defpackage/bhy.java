package defpackage;

/* renamed from: bhy reason: default package */
final class bhy implements Runnable {
    private final /* synthetic */ doy a;
    private final /* synthetic */ int b;
    private final /* synthetic */ bhw c;

    bhy(bhw bhw, doy doy, int i) {
        this.c = bhw;
        this.a = doy;
        this.b = i;
    }

    public final void run() {
        synchronized (this.c.s) {
            bhw.a(this.c, this.a, this.b);
        }
    }
}
