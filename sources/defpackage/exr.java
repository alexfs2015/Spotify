package defpackage;

/* renamed from: exr reason: default package */
final class exr implements Runnable {
    private final /* synthetic */ exq a;

    exr(exq exq) {
        this.a = exq;
    }

    public final void run() {
        synchronized (this.a.a) {
            if (this.a.b != null) {
                this.a.b.a();
            }
        }
    }
}
