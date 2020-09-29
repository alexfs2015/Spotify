package defpackage;

/* renamed from: cga reason: default package */
final class cga implements Runnable {
    private final /* synthetic */ cfs a;

    cga(cfs cfs) {
        this.a = cfs;
    }

    public final void run() {
        synchronized (this.a.b) {
            if (this.a.e != null) {
                this.a.s_();
                this.a.a(2, "Timed out waiting for ad response.");
            }
        }
    }
}
