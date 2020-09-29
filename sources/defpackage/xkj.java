package defpackage;

import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: xkj reason: default package */
public final class xkj<T> implements b<T, T> {
    final xiy<? super Throwable, ? extends xii<? extends T>> a;

    public xkj(xiy<? super Throwable, ? extends xii<? extends T>> xiy) {
        this.a = xiy;
    }

    public static <T> xkj<T> a(final xii<? extends T> xii) {
        return new xkj<>(new xiy<Throwable, xii<? extends T>>() {
            public final /* bridge */ /* synthetic */ Object call(Object obj) {
                return xii;
            }
        });
    }

    public static <T> xkj<T> a(final xiy<? super Throwable, ? extends T> xiy) {
        return new xkj<>(new xiy<Throwable, xii<? extends T>>() {
            public final /* synthetic */ Object call(Object obj) {
                return ScalarSynchronousObservable.d(xiy.call((Throwable) obj));
            }
        });
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        final xlg xlg = new xlg();
        final xom xom = new xom();
        AnonymousClass3 r2 = new xio<T>() {
            private boolean c;
            private long d;

            public final void onCompleted() {
                if (!this.c) {
                    this.c = true;
                    xio.onCompleted();
                }
            }

            public final void onError(Throwable th) {
                if (this.c) {
                    xiq.b(th);
                    xnx.a(th);
                    return;
                }
                this.c = true;
                try {
                    unsubscribe();
                    AnonymousClass1 r0 = new xio<T>() {
                        public final void onCompleted() {
                            xio.onCompleted();
                        }

                        public final void onError(Throwable th) {
                            xio.onError(th);
                        }

                        public final void onNext(T t) {
                            xio.onNext(t);
                        }

                        public final void setProducer(xik xik) {
                            xlg.a(xik);
                        }
                    };
                    xom.a(r0);
                    long j = this.d;
                    if (j != 0) {
                        xlg.b(j);
                    }
                    ((xii) xkj.this.a.call(th)).a((xio<? super T>) r0);
                } catch (Throwable th2) {
                    xiq.a(th2, (xij<?>) xio);
                }
            }

            public final void onNext(T t) {
                if (!this.c) {
                    this.d++;
                    xio.onNext(t);
                }
            }

            public final void setProducer(xik xik) {
                xlg.a(xik);
            }
        };
        xom.a(r2);
        xio.add(xom);
        xio.setProducer(xlg);
        return r2;
    }
}
