package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ffd reason: default package */
abstract class ffd<V> implements ffe<V> {
    private static final Logger a = Logger.getLogger(ffd.class.getName());

    /* renamed from: ffd$a */
    public static final class a<V> extends i<V> {
        public a(Throwable th) {
            setException(th);
        }
    }

    /* renamed from: ffd$b */
    static class b<V> extends ffd<V> {
        static final b<Object> a = new b<>(null);
        private final V b;

        b(V v) {
            this.b = v;
        }

        public final V get() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            sb.append(this.b);
            sb.append("]]");
            return sb.toString();
        }
    }

    ffd() {
    }

    public void addListener(Runnable runnable, Executor executor) {
        fbp.a(runnable, (Object) "Runnable was null.");
        fbp.a(executor, (Object) "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get();

    public V get(long j, TimeUnit timeUnit) {
        fbp.a(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
