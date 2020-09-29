package defpackage;

/* renamed from: gbl reason: default package */
public final class gbl implements Runnable {
    private boolean a;
    private final Runnable b;

    private gbl(Runnable runnable) {
        fay.a(runnable);
        this.b = runnable;
    }

    public static gbl a(Runnable runnable) {
        return new gbl(runnable);
    }

    public final synchronized void run() {
        if (!this.a) {
            this.a = true;
            this.b.run();
        }
    }
}
