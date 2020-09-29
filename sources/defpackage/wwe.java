package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: wwe reason: default package */
public interface wwe extends Iterable<wwc>, ScheduledExecutorService {
    wwi<?> a(long j, long j2, TimeUnit timeUnit);

    <T> wwi<T> a(Runnable runnable, T t);

    <T> wwi<T> a(Callable<T> callable);

    wwy<?> a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    wwy<?> a(Runnable runnable, long j, TimeUnit timeUnit);

    <V> wwy<V> a(Callable<V> callable, long j, TimeUnit timeUnit);

    wwc b();

    wwi<?> b(Runnable runnable);

    wwy<?> b(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    wwi<?> k();

    boolean q();

    wwi<?> r();

    @Deprecated
    void shutdown();
}
