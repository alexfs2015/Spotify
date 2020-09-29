package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cmt reason: default package */
final class cmt implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    private final /* synthetic */ String b;

    cmt(String str) {
        this.b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.b;
        int andIncrement = this.a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
