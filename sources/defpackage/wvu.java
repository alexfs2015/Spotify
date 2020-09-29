package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: wvu reason: default package */
public abstract class wvu implements wwe {
    /* renamed from: a */
    public final <T> wwi<T> submit(Runnable runnable, T t) {
        return b().a(runnable, t);
    }

    /* renamed from: a */
    public final <T> wwi<T> submit(Callable<T> callable) {
        return b().a(callable);
    }

    /* renamed from: a */
    public final wwy<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return b().a(runnable, j, j2, timeUnit);
    }

    /* renamed from: a */
    public final wwy<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return b().a(runnable, j, timeUnit);
    }

    /* renamed from: a */
    public final <V> wwy<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return b().a(callable, j, timeUnit);
    }

    /* renamed from: b */
    public final wwi<?> submit(Runnable runnable) {
        return b().b(runnable);
    }

    /* renamed from: b */
    public final wwy<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return b().b(runnable, j, j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        b().execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return b().invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return b().invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return b().invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return b().invokeAny(collection, j, timeUnit);
    }

    public final wwi<?> k() {
        return a(2, 15, TimeUnit.SECONDS);
    }

    @Deprecated
    public abstract void shutdown();

    @Deprecated
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
