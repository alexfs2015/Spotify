package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ModernAsyncTask<Params, Progress, Result> {
    private static final ThreadFactory a = new ThreadFactory() {
        private final AtomicInteger a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("ModernAsyncTask #");
            sb.append(this.a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };
    public static final Executor b;
    private static final BlockingQueue<Runnable> f = new LinkedBlockingQueue(10);
    private static b g;
    private static volatile Executor h;
    public final FutureTask<Result> c = new FutureTask<Result>(this.i) {
        /* access modifiers changed from: protected */
        public final void done() {
            String str = "An error occurred while executing doInBackground()";
            try {
                ModernAsyncTask.this.c(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException(str, e.getCause());
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.c(null);
            } catch (Throwable th) {
                throw new RuntimeException(str, th);
            }
        }
    };
    public final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();
    private final c<Params, Result> i = new c<Params, Result>() {
        public final Result call() {
            ModernAsyncTask.this.e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = ModernAsyncTask.this.a((Params[]) this.a);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.d(result);
                return result;
            } catch (Throwable th) {
                ModernAsyncTask.this.d(result);
                throw th;
            }
        }
    };
    private volatile Status j = Status.PENDING;

    /* renamed from: androidx.loader.content.ModernAsyncTask$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.AnonymousClass4.<clinit>():void");
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    static class a<Data> {
        final ModernAsyncTask a;
        final Data[] b;

        a(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.a = modernAsyncTask;
            this.b = dataArr;
        }
    }

    static class b extends Handler {
        b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            if (message.what == 1) {
                aVar.a.e(aVar.b[0]);
            }
        }
    }

    static abstract class c<Params, Result> implements Callable<Result> {
        Params[] a;

        c() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f, a);
        b = threadPoolExecutor;
        h = threadPoolExecutor;
    }

    protected ModernAsyncTask() {
    }

    private static Handler a() {
        b bVar;
        synchronized (ModernAsyncTask.class) {
            if (g == null) {
                g = new b();
            }
            bVar = g;
        }
        return bVar;
    }

    public final ModernAsyncTask<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.j != Status.PENDING) {
            int i2 = AnonymousClass4.a[this.j.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i2 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.j = Status.RUNNING;
            this.i.a = null;
            executor.execute(this.c);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Result a(Params... paramsArr);

    /* access modifiers changed from: protected */
    public void a(Result result) {
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
    }

    /* access modifiers changed from: 0000 */
    public final void c(Result result) {
        if (!this.e.get()) {
            d(result);
        }
    }

    /* access modifiers changed from: 0000 */
    public final Result d(Result result) {
        a().obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: 0000 */
    public final void e(Result result) {
        if (this.d.get()) {
            b(result);
        } else {
            a(result);
        }
        this.j = Status.FINISHED;
    }
}
