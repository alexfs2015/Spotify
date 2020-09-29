package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ffq reason: default package */
final /* synthetic */ class ffq implements Executor {
    static final Executor a = new ffq();

    private ffq() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
