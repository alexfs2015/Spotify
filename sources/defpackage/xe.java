package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: xe reason: default package */
public final class xe implements xi {
    final List<Runnable> a = new ArrayList();
    boolean b = false;
    private boolean c = false;
    private ThreadPoolExecutor d;

    public xe(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new xh(str), new RejectedExecutionHandler() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                vv.a().d("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
        this.d = threadPoolExecutor;
    }

    static /* synthetic */ void a(xe xeVar, Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            vv.a().d("Execution failed: %s", th.getMessage());
        }
    }

    public final void a(final Runnable runnable) {
        synchronized (this.a) {
            if (!this.b) {
                this.b = true;
                this.d.submit(new Runnable() {
                    public final void run() {
                        Runnable runnable;
                        xe.a(xe.this, runnable);
                        while (true) {
                            synchronized (xe.this.a) {
                                xe xeVar = xe.this;
                                if (xe.this.a.isEmpty()) {
                                    xe.this.b = false;
                                    return;
                                } else {
                                    runnable = (Runnable) xe.this.a.get(0);
                                    xe.this.a.remove(0);
                                }
                            }
                            xe.a(xe.this, runnable);
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
                        vv.a().d("Sleep delay exception: %s", e.getMessage());
                    }
                    xe.this.a(runnable);
                }
            });
        }
    }
}
