package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: clj reason: default package */
final class clj implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    clj() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
