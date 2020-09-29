package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: wt reason: default package */
public final class wt implements ThreadFactory {
    private String a;

    public wt(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setPriority(9);
        StringBuilder sb = new StringBuilder("Adjust-");
        sb.append(newThread.getName());
        sb.append("-");
        sb.append(this.a);
        newThread.setName(sb.toString());
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                vh.a().f("Thread [%s] with error [%s]", thread.getName(), th.getMessage());
            }
        });
        return newThread;
    }
}
