package defpackage;

/* renamed from: ext reason: default package */
final class ext implements Runnable {
    private final /* synthetic */ exi a;
    private final /* synthetic */ exs b;

    ext(exs exs, exi exi) {
        this.b = exs;
        this.a = exi;
    }

    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.onComplete(this.a);
            }
        }
    }
}
