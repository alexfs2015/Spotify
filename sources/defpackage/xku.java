package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xku reason: default package */
public final class xku<T, U, R> implements b<R, T> {
    static final Object b = new Object();
    final xiz<? super T, ? super U, ? extends R> a;
    private xii<? extends U> c;

    public xku(xii<? extends U> xii, xiz<? super T, ? super U, ? extends R> xiz) {
        this.c = xii;
        this.a = xiz;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        final xnt xnt = new xnt(xio, false);
        xio.add(xnt);
        final AtomicReference atomicReference = new AtomicReference(b);
        AnonymousClass1 r0 = new xio<T>(xnt, true, atomicReference, xnt) {
            private /* synthetic */ AtomicReference a;
            private /* synthetic */ xnt b;

            {
                this.a = r4;
                this.b = r5;
            }

            public final void onCompleted() {
                this.b.onCompleted();
                this.b.unsubscribe();
            }

            public final void onError(Throwable th) {
                this.b.onError(th);
                this.b.unsubscribe();
            }

            public final void onNext(T t) {
                Object obj = this.a.get();
                if (obj != xku.b) {
                    try {
                        this.b.onNext(xku.this.a.call(t, obj));
                    } catch (Throwable th) {
                        xiq.a(th, (xij<?>) this);
                    }
                }
            }
        };
        AnonymousClass2 r02 = new xio<U>() {
            public final void onCompleted() {
                if (atomicReference.get() == xku.b) {
                    xnt.onCompleted();
                    xnt.unsubscribe();
                }
            }

            public final void onError(Throwable th) {
                xnt.onError(th);
                xnt.unsubscribe();
            }

            public final void onNext(U u) {
                atomicReference.set(u);
            }
        };
        xnt.add(r0);
        xnt.add(r02);
        this.c.a((xio<? super T>) r02);
        return r0;
    }
}
