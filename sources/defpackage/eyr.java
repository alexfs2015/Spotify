package defpackage;

import java.util.concurrent.Executor;

/* renamed from: eyr reason: default package */
final class eyr implements Executor {
    eyr() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
