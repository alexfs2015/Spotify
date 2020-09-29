package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: wwv reason: default package */
class wwv<V> extends wwa<V> implements RunnableFuture<V> {
    protected final Callable<V> a;

    /* renamed from: wwv$a */
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

    wwv(wwc wwc, Runnable runnable, V v) {
        this(wwc, a(runnable, v));
    }

    wwv(wwc wwc, Callable<V> callable) {
        super(wwc);
        this.a = callable;
    }

    static <T> Callable<T> a(Runnable runnable, T t) {
        return new a(runnable, t);
    }

    public final wws<V> a(V v) {
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public final wws<V> a(Throwable th) {
        super.c(th);
        return this;
    }

    public final boolean aW_() {
        throw new IllegalStateException();
    }

    public final boolean b(V v) {
        return false;
    }

    public final boolean b(Throwable th) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final wws<V> c(V v) {
        super.a(v);
        return this;
    }

    public final wws<V> c(Throwable th) {
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return super.aW_();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
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
            if (super.aW_()) {
                super.a(this.a.call());
            }
        } catch (Throwable th) {
            super.c(th);
        }
    }
}
