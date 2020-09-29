package defpackage;

import java.util.concurrent.Executor;

/* renamed from: eya reason: default package */
final class eya implements Executor {
    eya() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
