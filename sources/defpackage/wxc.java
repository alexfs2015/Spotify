package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: wxc reason: default package */
public final class wxc implements Executor {
    private final ThreadFactory a;

    public wxc(ThreadFactory threadFactory) {
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
