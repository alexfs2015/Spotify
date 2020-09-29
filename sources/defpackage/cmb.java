package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@cey
/* renamed from: cmb reason: default package */
public final class cmb {
    public static final cpw a;
    private static final cpw b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), a("Default"));
        a = cpx.a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        b = cpx.a(threadPoolExecutor2);
    }

    public static cpr<?> a(Runnable runnable) {
        return a.a(runnable);
    }

    public static <T> cpr<T> a(Callable<T> callable) {
        return a.a(callable);
    }

    private static ThreadFactory a(String str) {
        return new cmc(str);
    }

    public static cpr<?> b(Runnable runnable) {
        return b.a(runnable);
    }
}
