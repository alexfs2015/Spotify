package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@cfp
/* renamed from: cms reason: default package */
public final class cms {
    public static final cqn a;
    private static final cqn b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), a("Default"));
        a = cqo.a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        b = cqo.a(threadPoolExecutor2);
    }

    public static cqi<?> a(Runnable runnable) {
        return a.a(runnable);
    }

    public static <T> cqi<T> a(Callable<T> callable) {
        return a.a(callable);
    }

    private static ThreadFactory a(String str) {
        return new cmt(str);
    }

    public static cqi<?> b(Runnable runnable) {
        return b.a(runnable);
    }
}
