package defpackage;

/* renamed from: exv reason: default package */
final class exv implements Runnable {
    private final /* synthetic */ exi a;
    private final /* synthetic */ exu b;

    exv(exu exu, exi exi) {
        this.b = exu;
        this.a = exi;
    }

    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.a(this.a.e());
            }
        }
    }
}
