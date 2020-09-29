package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cql reason: default package */
final /* synthetic */ class cql implements Runnable {
    private final Executor a;
    private final Runnable b;

    cql(Executor executor, Runnable runnable) {
        this.a = executor;
        this.b = runnable;
    }

    public final void run() {
        this.a.execute(this.b);
    }
}
