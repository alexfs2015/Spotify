package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wq reason: default package */
public final class wq implements wu {
    final List<Runnable> a = new ArrayList();
    boolean b = false;
    private boolean c = false;
    private ThreadPoolExecutor d;

    public wq(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new wt(str), new RejectedExecutionHandler() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                vh.a().d("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
        this.d = threadPoolExecutor;
    }

    public final void a(final Runnable runnable) {
        synchronized (this.a) {
            if (!this.b) {
                this.b = true;
                this.d.submit(new Runnable() {
                    public final void run() {
                        Runnable runnable;
                        wq.a(wq.this, runnable);
                        while (true) {
                            synchronized (wq.this.a) {
                                wq wqVar = wq.this;
                                if (wq.this.a.isEmpty()) {
                                    wq.this.b = false;
                                    return;
                                } else {
                                    runnable = (Runnable) wq.this.a.get(0);
                                    wq.this.a.remove(0);
                                }
                            }
                            wq.a(wq.this, runnable);
                        }
                        while (true) {
                        }
                    }
                });
            } else {
                this.a.add(runnable);
            }
        }
    }

    public final void a(final Runnable runnable, final long j) {
        synchronized (this.a) {
            this.d.submit(new Runnable() {
                public final void run() {
                    try {
                        Thread.sleep(j);
                    } catch (InterruptedException e) {
                        vh.a().d("Sleep delay exception: %s", e.getMessage());
                    }
                    wq.this.a(runnable);
                }
            });
        }
    }

    static /* synthetic */ void a(wq wqVar, Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            vh.a().d("Execution failed: %s", th.getMessage());
        }
    }
}
