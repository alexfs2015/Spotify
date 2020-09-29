package defpackage;

/* renamed from: bhx reason: default package */
final class bhx implements Runnable {
    private final /* synthetic */ doy a;
    private final /* synthetic */ bhw b;

    bhx(bhw bhw, doy doy) {
        this.b = bhw;
        this.a = doy;
    }

    public final void run() {
        synchronized (this.b.s) {
            if (bhw.b(this.b)) {
                bhw.a(this.b, this.a);
            } else {
                bhw.a(this.b, this.a, 1);
            }
        }
    }
}
