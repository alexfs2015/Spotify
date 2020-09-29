package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: why reason: default package */
public interface why extends Iterable<whw>, ScheduledExecutorService {
    wic<?> a(long j, long j2, TimeUnit timeUnit);

    <T> wic<T> a(Runnable runnable, T t);

    <T> wic<T> a(Callable<T> callable);

    wis<?> a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    wis<?> a(Runnable runnable, long j, TimeUnit timeUnit);

    <V> wis<V> a(Callable<V> callable, long j, TimeUnit timeUnit);

    whw b();

    wic<?> b(Runnable runnable);

    wis<?> b(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    wic<?> k();

    boolean q();

    wic<?> r();

    @Deprecated
    void shutdown();
}
