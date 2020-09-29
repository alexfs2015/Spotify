package defpackage;

/* renamed from: cdp reason: default package */
final class cdp implements Runnable {
    private final /* synthetic */ cdo a;

    cdp(cdo cdo) {
        this.a = cdo;
    }

    public final void run() {
        if (this.a.d.get()) {
            cml.a("Timed out waiting for WebView to finish loading.");
            this.a.b();
        }
    }
}
