package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cpz reason: default package */
final class cpz implements Executor {
    cpz() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
