package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@cey
/* renamed from: cqc reason: default package */
public class cqc<T> implements cpr<T> {
    private final Object a = new Object();
    private T b;
    private Throwable c;
    private boolean d;
    private boolean e;
    private final cpt f = new cpt();

    private final boolean a() {
        return this.c != null || this.d;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.f.a(runnable, executor);
    }

    public final void a(Throwable th) {
        synchronized (this.a) {
            if (!this.e) {
                if (a()) {
                    bjl.i().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.c = th;
                this.a.notifyAll();
                this.f.a();
            }
        }
    }

    public final void b(T t) {
        synchronized (this.a) {
            if (!this.e) {
                if (a()) {
                    bjl.i().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.d = true;
                this.b = t;
                this.a.notifyAll();
                this.f.a();
            }
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.a) {
            if (a()) {
                return false;
            }
            this.e = true;
            this.d = true;
            this.a.notifyAll();
            this.f.a();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.a) {
            if (!a()) {
                try {
                    this.a.wait();
                } catch (InterruptedException e2) {
                    throw e2;
                }
            }
            if (this.c != null) {
                throw new ExecutionException(this.c);
            } else if (!this.e) {
                t = this.b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.a) {
            if (!a()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.a.wait(millis);
                    }
                } catch (InterruptedException e2) {
                    throw e2;
                }
            }
            if (this.c != null) {
                throw new ExecutionException(this.c);
            } else if (!this.d) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (!this.e) {
                t = this.b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a2;
        synchronized (this.a) {
            a2 = a();
        }
        return a2;
    }
}
