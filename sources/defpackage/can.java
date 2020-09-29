package defpackage;

import android.os.Process;

/* renamed from: can reason: default package */
final class can implements Runnable {
    private final Runnable a;
    private final int b = 0;

    public can(Runnable runnable, int i) {
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
