package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: whp reason: default package */
public abstract class whp<V> implements wic<V> {
    public V get() {
        c();
        Throwable f = f();
        if (f == null) {
            return d();
        }
        if (f instanceof CancellationException) {
            throw ((CancellationException) f);
        }
        throw new ExecutionException(f);
    }

    public V get(long j, TimeUnit timeUnit) {
        if (a(j, timeUnit)) {
            Throwable f = f();
            if (f == null) {
                return d();
            }
            if (f instanceof CancellationException) {
                throw ((CancellationException) f);
            }
            throw new ExecutionException(f);
        }
        throw new TimeoutException();
    }
}
