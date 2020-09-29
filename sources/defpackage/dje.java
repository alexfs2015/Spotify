package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: dje reason: default package */
final class dje implements ThreadFactory {
    private final ThreadFactory a = Executors.defaultThreadFactory();

    dje() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName(String.valueOf(newThread.getName()).concat(":"));
        return newThread;
    }
}
