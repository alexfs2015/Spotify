package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: xjq reason: default package */
public final class xjq<T> implements a<T> {
    volatile xok a = new xok();
    final AtomicInteger b = new AtomicInteger(0);
    final ReentrantLock c = new ReentrantLock();
    /* access modifiers changed from: private */
    public final xno<? extends T> d;

    public xjq(xno<? extends T> xno) {
        this.d = xno;
    }

    private xip a(final xok xok) {
        return xon.a((xir) new xir() {
            public final void call() {
                xjq.this.c.lock();
                try {
                    if (xjq.this.a == xok && xjq.this.b.decrementAndGet() == 0) {
                        if (xjq.this.d instanceof xip) {
                            ((xip) xjq.this.d).unsubscribe();
                        }
                        xjq.this.a.unsubscribe();
                        xjq.this.a = new xok();
                    }
                } finally {
                    xjq.this.c.unlock();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public final void a(final xio<? super T> xio, final xok xok) {
        xio.add(a(xok));
        this.d.a((xio<? super T>) new xio<T>(xio) {
            private void a() {
                xjq.this.c.lock();
                try {
                    if (xjq.this.a == xok) {
                        if (xjq.this.d instanceof xip) {
                            ((xip) xjq.this.d).unsubscribe();
                        }
                        xjq.this.a.unsubscribe();
                        xjq.this.a = new xok();
                        xjq.this.b.set(0);
                    }
                } finally {
                    xjq.this.c.unlock();
                }
            }

            public final void onCompleted() {
                a();
                xio.onCompleted();
            }

            public final void onError(Throwable th) {
                a();
                xio.onError(th);
            }

            public final void onNext(T t) {
                xio.onNext(t);
            }
        });
    }

    public final /* synthetic */ void call(Object obj) {
        final xio xio = (xio) obj;
        this.c.lock();
        if (this.b.incrementAndGet() == 1) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.d.d(new xis<xip>() {
                    public final /* synthetic */ void call(Object obj) {
                        try {
                            xjq.this.a.a((xip) obj);
                            xjq.this.a(xio, xjq.this.a);
                        } finally {
                            xjq.this.c.unlock();
                            atomicBoolean.set(false);
                        }
                    }
                });
            } finally {
                if (atomicBoolean.get()) {
                    this.c.unlock();
                }
            }
        } else {
            try {
                a(xio, this.a);
            } finally {
                this.c.unlock();
            }
        }
    }
}
