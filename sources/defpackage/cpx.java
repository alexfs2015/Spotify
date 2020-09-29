package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@cfp
/* renamed from: cpx reason: default package */
public final class cpx {
    public static <T> cqh<T> a(T t) {
        return new cqh<>(t);
    }

    public static <V> cqi<V> a(cqi<V> cqi, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        cqt cqt = new cqt();
        a((cqi<A>) cqt, (Future<B>) cqi);
        ScheduledFuture schedule = scheduledExecutorService.schedule(new cqb(cqt), j, timeUnit);
        a(cqi, cqt);
        cqt.a(new cqc(schedule), cqo.b);
        return cqt;
    }

    public static <A, B> cqi<B> a(cqi<A> cqi, cps<? super A, ? extends B> cps, Executor executor) {
        cqt cqt = new cqt();
        cqi.a(new cqa(cqt, cps, cqi), executor);
        a((cqi<A>) cqt, (Future<B>) cqi);
        return cqt;
    }

    public static <A, B> cqi<B> a(cqi<A> cqi, cpt<A, B> cpt, Executor executor) {
        cqt cqt = new cqt();
        cqi.a(new cpz(cqt, cpt, cqi), executor);
        a((cqi<A>) cqt, (Future<B>) cqi);
        return cqt;
    }

    public static <V, X extends Throwable> cqi<V> a(cqi<? extends V> cqi, Class<X> cls, cps<? super X, ? extends V> cps, Executor executor) {
        cqt cqt = new cqt();
        a((cqi<A>) cqt, (Future<B>) cqi);
        cqd cqd = new cqd(cqt, cqi, cls, cps, executor);
        cqi.a(cqd, cqo.b);
        return cqt;
    }

    public static <T> T a(Future<T> future, T t) {
        String str = "Futures.resolveFuture";
        try {
            return future.get(((Long) dqe.f().a(dtg.bx)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            cpn.a(5);
            Thread.currentThread().interrupt();
            bkc.i().b(e, str);
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            cml.a("Error waiting for future.", e);
            bkc.i().b(e, str);
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
            cpn.a(5);
            Thread.currentThread().interrupt();
            bkc.i().a(e, str);
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            cml.a("Error waiting for future.", e);
            bkc.i().a(e, str);
            return t;
        }
    }

    public static <V> void a(cqi<V> cqi, cpu<V> cpu, Executor executor) {
        cqi.a(new cpy(cpu, cqi), executor);
    }

    static <V> void a(cqi<? extends V> cqi, cqt<V> cqt) {
        a((cqi<A>) cqt, (Future<B>) cqi);
        cqi.a(new cqe(cqt, cqi), cqo.b);
    }

    private static <A, B> void a(cqi<A> cqi, Future<B> future) {
        cqi.a(new cqf(cqi, future), cqo.b);
    }
}
