package defpackage;

/* renamed from: exx reason: default package */
final class exx implements Runnable {
    private final /* synthetic */ exi a;
    private final /* synthetic */ exw b;

    exx(exw exw, exi exi) {
        this.b = exw;
        this.a = exi;
    }

    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.a(this.a.d());
            }
        }
    }
}
