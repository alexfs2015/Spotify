package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: wvl reason: default package */
public final class wvl<T> implements a<T> {
    volatile xag a = new xag();
    final AtomicInteger b = new AtomicInteger(0);
    final ReentrantLock c = new ReentrantLock();
    /* access modifiers changed from: private */
    public final wzj<? extends T> d;

    public final /* synthetic */ void call(Object obj) {
        final wuj wuj = (wuj) obj;
        this.c.lock();
        if (this.b.incrementAndGet() == 1) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.d.c(new wun<wuk>() {
                    public final /* synthetic */ void call(Object obj) {
                        try {
                            wvl.this.a.a((wuk) obj);
                            wvl.this.a(wuj, wvl.this.a);
                        } finally {
                            wvl.this.c.unlock();
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
                a(wuj, this.a);
            } finally {
                this.c.unlock();
            }
        }
    }

    public wvl(wzj<? extends T> wzj) {
        this.d = wzj;
    }

    /* access modifiers changed from: 0000 */
    public final void a(final wuj<? super T> wuj, final xag xag) {
        wuj.add(a(xag));
        this.d.a((wuj<? super T>) new wuj<T>(wuj) {
            public final void onError(Throwable th) {
                a();
                wuj.onError(th);
            }

            public final void onNext(T t) {
                wuj.onNext(t);
            }

            public final void onCompleted() {
                a();
                wuj.onCompleted();
            }

            private void a() {
                wvl.this.c.lock();
                try {
                    if (wvl.this.a == xag) {
                        if (wvl.this.d instanceof wuk) {
                            ((wuk) wvl.this.d).unsubscribe();
                        }
                        wvl.this.a.unsubscribe();
                        wvl.this.a = new xag();
                        wvl.this.b.set(0);
                    }
                } finally {
                    wvl.this.c.unlock();
                }
            }
        });
    }

    private wuk a(final xag xag) {
        return xaj.a((wum) new wum() {
            public final void call() {
                wvl.this.c.lock();
                try {
                    if (wvl.this.a == xag && wvl.this.b.decrementAndGet() == 0) {
                        if (wvl.this.d instanceof wuk) {
                            ((wuk) wvl.this.d).unsubscribe();
                        }
                        wvl.this.a.unsubscribe();
                        wvl.this.a = new xag();
                    }
                } finally {
                    wvl.this.c.unlock();
                }
            }
        });
    }
}
