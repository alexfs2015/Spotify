package defpackage;

import io.fabric.sdk.android.services.concurrency.AsyncTask;
import io.fabric.sdk.android.services.concurrency.AsyncTask.Status;
import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: vwe reason: default package */
public abstract class vwe<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> implements vwc<vwk>, vwh, vwk {
    private final vwi d = new vwi();

    /* renamed from: vwe$a */
    static class a<Result> implements Executor {
        private final Executor a;
        /* access modifiers changed from: private */
        public final vwe b;

        public a(Executor executor, vwe vwe) {
            this.a = executor;
            this.b = vwe;
        }

        public final void execute(Runnable runnable) {
            this.a.execute(new vwg<Result>(runnable, null) {
                public final <T extends vwc<vwk> & vwh & vwk> T b() {
                    return a.this.b;
                }
            });
        }
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a((Executor) new a(executorService, this), paramsArr);
    }

    public int compareTo(Object obj) {
        return Priority.a(this, obj);
    }

    /* renamed from: a */
    public final void c(vwk vwk) {
        if (this.b == Status.PENDING) {
            this.d.c(vwk);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public final Collection<vwk> c() {
        return this.d.c();
    }

    public final boolean d() {
        return this.d.d();
    }

    public Priority a() {
        return this.d.a();
    }

    public final void b(boolean z) {
        this.d.b(z);
    }

    public final boolean e() {
        return this.d.e();
    }

    public final void a(Throwable th) {
        this.d.a(th);
    }
}
