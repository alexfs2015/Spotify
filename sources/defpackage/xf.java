package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: xf reason: default package */
public final class xf implements xc {
    private ScheduledThreadPoolExecutor a;

    public xf(final String str, boolean z) {
        this.a = new ScheduledThreadPoolExecutor(1, new xh(str), new RejectedExecutionHandler() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                vv.a().d("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
    }

    public final ScheduledFuture<?> a(Runnable runnable, long j) {
        return this.a.schedule(new xd(runnable), j, TimeUnit.MILLISECONDS);
    }

    public final ScheduledFuture<?> a(Runnable runnable, long j, long j2) {
        return this.a.scheduleWithFixedDelay(new xd(runnable), j, j2, TimeUnit.MILLISECONDS);
    }
}
