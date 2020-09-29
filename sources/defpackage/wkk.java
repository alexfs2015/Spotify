package defpackage;

import io.fabric.sdk.android.services.concurrency.AsyncTask;
import io.fabric.sdk.android.services.concurrency.AsyncTask.Status;
import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: wkk reason: default package */
public abstract class wkk<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> implements wki<wkq>, wkn, wkq {
    private final wko d = new wko();

    /* renamed from: wkk$a */
    static class a<Result> implements Executor {
        private final Executor a;
        /* access modifiers changed from: private */
        public final wkk b;

        public a(Executor executor, wkk wkk) {
            this.a = executor;
            this.b = wkk;
        }

        public final void execute(Runnable runnable) {
            this.a.execute(new wkm<Result>(runnable, null) {
                public final <T extends wki<wkq> & wkn & wkq> T b() {
                    return a.this.b;
                }
            });
        }
    }

    public Priority a() {
        return this.d.a();
    }

    public final void a(Throwable th) {
        this.d.a(th);
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a((Executor) new a(executorService, this), paramsArr);
    }

    /* renamed from: a */
    public final void c(wkq wkq) {
        if (this.b == Status.PENDING) {
            this.d.c(wkq);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public final void b(boolean z) {
        this.d.b(z);
    }

    public final Collection<wkq> c() {
        return this.d.c();
    }

    public int compareTo(Object obj) {
        return Priority.a(this, obj);
    }

    public final boolean d() {
        return this.d.d();
    }

    public final boolean e() {
        return this.d.e();
    }
}
