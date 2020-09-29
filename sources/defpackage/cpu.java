package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cpu reason: default package */
final /* synthetic */ class cpu implements Runnable {
    private final Executor a;
    private final Runnable b;

    cpu(Executor executor, Runnable runnable) {
        this.a = executor;
        this.b = runnable;
    }

    public final void run() {
        this.a.execute(this.b);
    }
}
