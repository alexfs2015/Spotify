package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cam reason: default package */
public final class cam implements ThreadFactory {
    private final String a;
    private final int b;
    private final AtomicInteger c;
    private final ThreadFactory d;

    public cam(String str) {
        this(str, 0);
    }

    private cam(String str, byte b2) {
        this.c = new AtomicInteger();
        this.d = Executors.defaultThreadFactory();
        this.a = (String) bxo.a(str, (Object) "Name must not be null");
        this.b = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.d.newThread(new can(runnable, 0));
        String str = this.a;
        int andIncrement = this.c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
