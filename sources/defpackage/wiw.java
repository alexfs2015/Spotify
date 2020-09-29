package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: wiw reason: default package */
public final class wiw implements Executor {
    private final ThreadFactory a;

    public wiw(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            this.a = threadFactory;
            return;
        }
        throw new NullPointerException("threadFactory");
    }

    public final void execute(Runnable runnable) {
        this.a.newThread(runnable).start();
    }
}
