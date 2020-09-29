package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: fef reason: default package */
public abstract class fef<V> extends feh<V> {

    /* renamed from: fef$a */
    static abstract class a<V> extends fef<V> implements h<V> {
        a() {
        }

        public final V get() {
            return fef.super.get();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return fef.super.get(j, timeUnit);
        }

        public final boolean isDone() {
            return fef.super.isDone();
        }

        public final boolean isCancelled() {
            return fef.super.isCancelled();
        }

        public final void addListener(Runnable runnable, Executor executor) {
            fef.super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return fef.super.cancel(z);
        }
    }

    fef() {
    }
}
