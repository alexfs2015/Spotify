package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@cey
/* renamed from: cpg reason: default package */
public final class cpg {
    public static <T> cpq<T> a(T t) {
        return new cpq<>(t);
    }

    public static <V> cpr<V> a(cpr<V> cpr, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        cqc cqc = new cqc();
        a((cpr<A>) cqc, (Future<B>) cpr);
        ScheduledFuture schedule = scheduledExecutorService.schedule(new cpk(cqc), j, timeUnit);
        a(cpr, cqc);
        cqc.a(new cpl(schedule), cpx.b);
        return cqc;
    }

    public static <A, B> cpr<B> a(cpr<A> cpr, cpb<? super A, ? extends B> cpb, Executor executor) {
        cqc cqc = new cqc();
        cpr.a(new cpj(cqc, cpb, cpr), executor);
        a((cpr<A>) cqc, (Future<B>) cpr);
        return cqc;
    }

    public static <A, B> cpr<B> a(cpr<A> cpr, cpc<A, B> cpc, Executor executor) {
        cqc cqc = new cqc();
        cpr.a(new cpi(cqc, cpc, cpr), executor);
        a((cpr<A>) cqc, (Future<B>) cpr);
        return cqc;
    }

    public static <V, X extends Throwable> cpr<V> a(cpr<? extends V> cpr, Class<X> cls, cpb<? super X, ? extends V> cpb, Executor executor) {
        cqc cqc = new cqc();
        a((cpr<A>) cqc, (Future<B>) cpr);
        cpm cpm = new cpm(cqc, cpr, cls, cpb, executor);
        cpr.a(cpm, cpx.b);
        return cqc;
    }

    public static <V> void a(cpr<V> cpr, cpd<V> cpd, Executor executor) {
        cpr.a(new cph(cpd, cpr), executor);
    }

    static <V> void a(cpr<? extends V> cpr, cqc<V> cqc) {
        a((cpr<A>) cqc, (Future<B>) cpr);
        cpr.a(new cpn(cqc, cpr), cpx.b);
    }

    private static <A, B> void a(cpr<A> cpr, Future<B> future) {
        cpr.a(new cpo(cpr, future), cpx.b);
    }

    public static <T> T a(Future<T> future, T t) {
        String str = "Futures.resolveFuture";
        try {
            return future.get(((Long) dpn.f().a(dsp.bx)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            cow.a(5);
            Thread.currentThread().interrupt();
            bjl.i().b(e, str);
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            clu.a("Error waiting for future.", e);
            bjl.i().b(e, str);
            return t;
        }
    }

    public static <T> T a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        String str = "Futures.resolveFuture";
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            cow.a(5);
            Thread.currentThread().interrupt();
            bjl.i().a(e, str);
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            clu.a("Error waiting for future.", e);
            bjl.i().a(e, str);
            return t;
        }
    }
}
