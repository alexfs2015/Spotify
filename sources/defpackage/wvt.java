package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: wvt reason: default package */
public abstract class wvt extends AbstractExecutorService implements wwc {
    private static final wyc a = wyd.a(wvt.class);
    private final wwe b;
    private final Collection<wwc> c;

    protected wvt() {
        this(null);
    }

    protected wvt(wwe wwe) {
        this.c = Collections.singleton(this);
        this.b = wwe;
    }

    protected static void c(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            a.c("A task raised an exception. Task: {}", runnable, th);
        }
    }

    public final <V> wwi<V> a(V v) {
        return new wxb(this, v);
    }

    /* renamed from: a */
    public final <T> wwi<T> submit(Runnable runnable, T t) {
        return (wwi) super.submit(runnable, t);
    }

    public final <V> wwi<V> a(Throwable th) {
        return new wwf(this, th);
    }

    /* renamed from: a */
    public final <T> wwi<T> submit(Callable<T> callable) {
        return (wwi) super.submit(callable);
    }

    /* renamed from: a */
    public wwy<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public wwy<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <V> wwy<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public wwc b() {
        return this;
    }

    /* renamed from: b */
    public final wwi<?> submit(Runnable runnable) {
        return (wwi) super.submit(runnable);
    }

    /* renamed from: b */
    public wwy<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public Iterator<wwc> iterator() {
        return this.c.iterator();
    }

    public final boolean j() {
        return a(Thread.currentThread());
    }

    public final wwi<?> k() {
        return a(2, 15, TimeUnit.SECONDS);
    }

    public final <V> wws<V> l() {
        return new wwa(this);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new wwv(this, runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new wwv(this, callable);
    }

    @Deprecated
    public abstract void shutdown();

    @Deprecated
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
