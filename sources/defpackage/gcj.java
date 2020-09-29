package defpackage;

/* renamed from: gcj reason: default package */
public final class gcj implements Runnable {
    private boolean a;
    private final Runnable b;

    private gcj(Runnable runnable) {
        fbp.a(runnable);
        this.b = runnable;
    }

    public static gcj a(Runnable runnable) {
        return new gcj(runnable);
    }

    public final synchronized void run() {
        if (!this.a) {
            this.a = true;
            this.b.run();
        }
    }
}
