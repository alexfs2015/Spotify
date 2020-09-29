package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* renamed from: wiu reason: default package */
final class wiu extends xil implements xln {
    private Scheduler a;

    /* renamed from: wiu$a */
    static final class a implements Runnable {
        private xir a;

        a(xir xir) {
            ObjectHelper.a(xir, "Source 1.x Action0 is null");
            this.a = xir;
        }

        public final void run() {
            this.a.call();
        }
    }

    /* renamed from: wiu$b */
    static final class b extends defpackage.xil.a {
        private Worker a;

        b(Worker worker) {
            this.a = worker;
        }

        public final long a() {
            return Worker.a(TimeUnit.MILLISECONDS);
        }

        public final xip a(xir xir) {
            return wit.a(this.a.a((Runnable) new a(xir)));
        }

        public final xip a(xir xir, long j, long j2, TimeUnit timeUnit) {
            return wit.a(this.a.a(new a(xir), j, j2, timeUnit));
        }

        public final xip a(xir xir, long j, TimeUnit timeUnit) {
            return wit.a(this.a.a(new a(xir), j, timeUnit));
        }

        public final boolean isUnsubscribed() {
            return this.a.b();
        }

        public final void unsubscribe() {
            this.a.bd_();
        }
    }

    wiu(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final long a() {
        return Scheduler.a(TimeUnit.MILLISECONDS);
    }

    public final void b() {
        this.a.c();
    }

    public final defpackage.xil.a c() {
        return new b(this.a.a());
    }
}
