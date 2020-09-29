package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: whn reason: default package */
public abstract class whn extends AbstractExecutorService implements whw {
    private static final wjw a = wjx.a(whn.class);
    private final why b;
    private final Collection<whw> c;

    public whw b() {
        return this;
    }

    @Deprecated
    public abstract void shutdown();

    protected whn() {
        this(null);
    }

    protected whn(why why) {
        this.c = Collections.singleton(this);
        this.b = why;
    }

    public final boolean j() {
        return a(Thread.currentThread());
    }

    public Iterator<whw> iterator() {
        return this.c.iterator();
    }

    public final wic<?> k() {
        return a(2, 15, TimeUnit.SECONDS);
    }

    @Deprecated
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    public final <V> wim<V> l() {
        return new whu(this);
    }

    public final <V> wic<V> a(V v) {
        return new wiv(this, v);
    }

    public final <V> wic<V> a(Throwable th) {
        return new whz(this, th);
    }

    /* renamed from: b */
    public final wic<?> submit(Runnable runnable) {
        return (wic) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> wic<T> submit(Runnable runnable, T t) {
        return (wic) super.submit(runnable, t);
    }

    /* renamed from: a */
    public final <T> wic<T> submit(Callable<T> callable) {
        return (wic) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new wip(this, runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new wip(this, callable);
    }

    /* renamed from: a */
    public wis<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <V> wis<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public wis<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public wis<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    protected static void c(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            a.c("A task raised an exception. Task: {}", runnable, th);
        }
    }
}
