package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: wip reason: default package */
class wip<V> extends whu<V> implements RunnableFuture<V> {
    protected final Callable<V> a;

    /* renamed from: wip$a */
    static final class a<T> implements Callable<T> {
        private Runnable a;
        private T b;

        a(Runnable runnable, T t) {
            this.a = runnable;
            this.b = t;
        }

        public final T call() {
            this.a.run();
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Callable(task: ");
            sb.append(this.a);
            sb.append(", result: ");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }

    public final boolean b(V v) {
        return false;
    }

    public final boolean b(Throwable th) {
        return false;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    static <T> Callable<T> a(Runnable runnable, T t) {
        return new a(runnable, t);
    }

    wip(whw whw, Runnable runnable, V v) {
        this(whw, a(runnable, v));
    }

    wip(whw whw, Callable<V> callable) {
        super(whw);
        this.a = callable;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final wim<V> c(Throwable th) {
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public final wim<V> a(Throwable th) {
        super.c(th);
        return this;
    }

    public final wim<V> a(V v) {
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public final wim<V> c(V v) {
        super.a(v);
        return this;
    }

    public final boolean aY_() {
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return super.aY_();
    }

    /* access modifiers changed from: protected */
    public StringBuilder j() {
        StringBuilder j = super.j();
        j.setCharAt(j.length() - 1, ',');
        j.append(" task: ");
        j.append(this.a);
        j.append(')');
        return j;
    }

    public void run() {
        try {
            if (super.aY_()) {
                super.a(this.a.call());
            }
        } catch (Throwable th) {
            super.c(th);
        }
    }
}
