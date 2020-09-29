package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

public enum DirectExecutor implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
