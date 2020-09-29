package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: fez reason: default package */
public abstract class fez<V> extends ffb<V> {

    /* renamed from: fez$a */
    static abstract class a<V> extends fez<V> implements h<V> {
        a() {
        }

        public final void addListener(Runnable runnable, Executor executor) {
            fez.super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return fez.super.cancel(z);
        }

        public final V get() {
            return fez.super.get();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return fez.super.get(j, timeUnit);
        }

        public final boolean isCancelled() {
            return fez.super.isCancelled();
        }

        public final boolean isDone() {
            return fez.super.isDone();
        }
    }

    fez() {
    }
}
