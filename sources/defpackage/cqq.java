package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cqq reason: default package */
final class cqq implements Executor {
    cqq() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
