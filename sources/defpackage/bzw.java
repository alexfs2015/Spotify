package defpackage;

import android.os.Process;

/* renamed from: bzw reason: default package */
final class bzw implements Runnable {
    private final Runnable a;
    private final int b = 0;

    public bzw(Runnable runnable, int i) {
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
