package defpackage;

/* renamed from: ccy reason: default package */
final class ccy implements Runnable {
    private final /* synthetic */ ccx a;

    ccy(ccx ccx) {
        this.a = ccx;
    }

    public final void run() {
        if (this.a.d.get()) {
            clu.a("Timed out waiting for WebView to finish loading.");
            this.a.b();
        }
    }
}
