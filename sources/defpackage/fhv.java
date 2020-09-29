package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: fhv reason: default package */
public final class fhv {
    private static final Executor a = fhx.a;

    static final /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    static Executor a() {
        return a;
    }

    public static Executor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), fhw.a);
        return threadPoolExecutor;
    }
}
