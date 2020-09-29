package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.LinkedList;
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

public abstract class AsyncTask<Params, Progress, Result> {
    public static final Executor a;
    private static final int d;
    private static final int e;
    private static final int f = ((d << 1) + 1);
    private static final ThreadFactory g = new ThreadFactory() {
        private final AtomicInteger a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("AsyncTask #");
            sb.append(this.a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };
    private static final BlockingQueue<Runnable> h = new LinkedBlockingQueue(128);
    private static Executor i = new c(0);
    private static final b j = new b();
    private static volatile Executor k = i;
    protected volatile Status b = Status.PENDING;
    protected final AtomicBoolean c = new AtomicBoolean();
    private final d<Params, Result> l = new d<Params, Result>() {
        public final Result call() {
            AsyncTask.this.n.set(true);
            Process.setThreadPriority(10);
            AsyncTask asyncTask = AsyncTask.this;
            return asyncTask.d(asyncTask.a((Params[]) this.a));
        }
    };
    private final FutureTask<Result> m = new FutureTask<Result>(this.l) {
        /* access modifiers changed from: protected */
        public final void done() {
            try {
                AsyncTask.b(AsyncTask.this, get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occured while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                AsyncTask.b(AsyncTask.this, null);
            }
        }
    };
    /* access modifiers changed from: private */
    public final AtomicBoolean n = new AtomicBoolean();

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$4 reason: invalid class name */
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
                io.fabric.sdk.android.services.concurrency.AsyncTask$Status[] r0 = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.fabric.sdk.android.services.concurrency.AsyncTask$Status r1 = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.fabric.sdk.android.services.concurrency.AsyncTask$Status r1 = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.AsyncTask.AnonymousClass4.<clinit>():void");
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    static class a<Data> {
        final AsyncTask a;
        final Data[] b;

        a(AsyncTask asyncTask, Data... dataArr) {
            this.a = asyncTask;
            this.b = dataArr;
        }
    }

    static class b extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            if (message.what == 1) {
                AsyncTask.c(aVar.a, aVar.b[0]);
            }
        }
    }

    static class c implements Executor {
        private LinkedList<Runnable> a;
        private Runnable b;

        private c() {
            this.a = new LinkedList<>();
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        /* access modifiers changed from: protected */
        public final synchronized void a() {
            Runnable runnable = (Runnable) this.a.poll();
            this.b = runnable;
            if (runnable != null) {
                AsyncTask.a.execute(this.b);
            }
        }

        public final synchronized void execute(final Runnable runnable) {
            this.a.offer(new Runnable() {
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        c.this.a();
                    }
                }
            });
            if (this.b == null) {
                a();
            }
        }
    }

    static abstract class d<Params, Result> implements Callable<Result> {
        Params[] a;

        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        d = availableProcessors;
        e = availableProcessors + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(e, f, 1, TimeUnit.SECONDS, h, g);
        a = threadPoolExecutor;
    }

    static /* synthetic */ void b(AsyncTask asyncTask, Object obj) {
        if (!asyncTask.n.get()) {
            asyncTask.d(obj);
        }
    }

    static /* synthetic */ void c(AsyncTask asyncTask, Object obj) {
        if (asyncTask.c.get()) {
            asyncTask.b(obj);
        } else {
            asyncTask.a((Result) obj);
        }
        asyncTask.b = Status.FINISHED;
    }

    /* access modifiers changed from: private */
    public Result d(Result result) {
        j.obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    public final AsyncTask<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.b != Status.PENDING) {
            int i2 = AnonymousClass4.a[this.b.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i2 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.b = Status.RUNNING;
        b();
        this.l.a = paramsArr;
        executor.execute(this.m);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract Result a(Params... paramsArr);

    /* access modifiers changed from: protected */
    public void a(Result result) {
    }

    public final boolean a(boolean z) {
        this.c.set(true);
        return this.m.cancel(true);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
    }
}
