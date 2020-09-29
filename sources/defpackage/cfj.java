package defpackage;

/* renamed from: cfj reason: default package */
final class cfj implements Runnable {
    private final /* synthetic */ cfb a;

    cfj(cfb cfb) {
        this.a = cfb;
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
