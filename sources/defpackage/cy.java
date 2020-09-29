package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cy reason: default package */
public final class cy extends cz {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(4, new ThreadFactory() {
        private final AtomicInteger a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
            return thread;
        }
    });
    private volatile Handler c;

    private static Handler a(Looper looper) {
        if (VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        if (VERSION.SDK_INT >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    public final void b(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = a(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    public final boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
