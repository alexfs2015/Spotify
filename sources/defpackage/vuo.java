package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* renamed from: vuo reason: default package */
final class vuo extends wug implements wxi {
    private Scheduler a;

    /* renamed from: vuo$a */
    static final class a implements Runnable {
        private wum a;

        a(wum wum) {
            ObjectHelper.a(wum, "Source 1.x Action0 is null");
            this.a = wum;
        }

        public final void run() {
            this.a.call();
        }
    }

    /* renamed from: vuo$b */
    static final class b extends defpackage.wug.a {
        private Worker a;

        b(Worker worker) {
            this.a = worker;
        }

        public final wuk a(wum wum) {
            return vun.a(this.a.a((Runnable) new a(wum)));
        }

        public final wuk a(wum wum, long j, TimeUnit timeUnit) {
            return vun.a(this.a.a(new a(wum), j, timeUnit));
        }

        public final wuk a(wum wum, long j, long j2, TimeUnit timeUnit) {
            return vun.a(this.a.a(new a(wum), j, j2, timeUnit));
        }

        public final long a() {
            return Worker.a(TimeUnit.MILLISECONDS);
        }

        public final void unsubscribe() {
            this.a.bf_();
        }

        public final boolean isUnsubscribed() {
            return this.a.b();
        }
    }

    vuo(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final long a() {
        return Scheduler.a(TimeUnit.MILLISECONDS);
    }

    public final void b() {
        this.a.c();
    }

    public final defpackage.wug.a c() {
        return new b(this.a.a());
    }
}
