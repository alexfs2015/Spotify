package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: bzu reason: default package */
public final class bzu implements ThreadFactory {
    private final String a;
    private final int b;
    private final ThreadFactory c;

    public bzu(String str) {
        this(str, 0);
    }

    private bzu(String str, byte b2) {
        this.c = Executors.defaultThreadFactory();
        this.a = (String) bwx.a(str, (Object) "Name must not be null");
        this.b = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new bzw(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
