package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.internal.producers.SingleProducer;

public final class ScalarSynchronousObservable<T> extends xii<T> {
    private static boolean b = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    public final T a;

    static final class ScalarAsyncProducer<T> extends AtomicBoolean implements xik, xir {
        private static final long serialVersionUID = -2466317989629281651L;
        final xio<? super T> actual;
        final xiy<xir, xip> onSchedule;
        final T value;

        public ScalarAsyncProducer(xio<? super T> xio, T t, xiy<xir, xip> xiy) {
            this.actual = xio;
            this.value = t;
            this.onSchedule = xiy;
        }

        public final void a(long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j != 0 && compareAndSet(false, true)) {
                this.actual.add((xip) this.onSchedule.call(this));
            }
        }

        public final void call() {
            xio<? super T> xio = this.actual;
            if (!xio.isUnsubscribed()) {
                T t = this.value;
                try {
                    xio.onNext(t);
                    if (!xio.isUnsubscribed()) {
                        xio.onCompleted();
                    }
                } catch (Throwable th) {
                    xiq.a(th, xio, t);
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScalarAsyncProducer[");
            sb.append(this.value);
            sb.append(", ");
            sb.append(get());
            sb.append("]");
            return sb.toString();
        }
    }

    static final class a<T> implements defpackage.xii.a<T> {
        private T a;

        a(T t) {
            this.a = t;
        }

        public final /* synthetic */ void call(Object obj) {
            xio xio = (xio) obj;
            xio.setProducer(ScalarSynchronousObservable.a(xio, this.a));
        }
    }

    static final class b<T> implements defpackage.xii.a<T> {
        private T a;
        private xiy<xir, xip> b;

        b(T t, xiy<xir, xip> xiy) {
            this.a = t;
            this.b = xiy;
        }

        public final /* synthetic */ void call(Object obj) {
            xio xio = (xio) obj;
            xio.setProducer(new ScalarAsyncProducer(xio, this.a, this.b));
        }
    }

    static final class c<T> implements xik {
        private xio<? super T> a;
        private T b;
        private boolean c;

        public c(xio<? super T> xio, T t) {
            this.a = xio;
            this.b = t;
        }

        public final void a(long j) {
            if (!this.c) {
                if (j < 0) {
                    StringBuilder sb = new StringBuilder("n >= required but it was ");
                    sb.append(j);
                    throw new IllegalStateException(sb.toString());
                } else if (j != 0) {
                    this.c = true;
                    xio<? super T> xio = this.a;
                    if (!xio.isUnsubscribed()) {
                        T t = this.b;
                        try {
                            xio.onNext(t);
                            if (!xio.isUnsubscribed()) {
                                xio.onCompleted();
                            }
                        } catch (Throwable th) {
                            xiq.a(th, xio, t);
                        }
                    }
                }
            }
        }
    }

    private ScalarSynchronousObservable(T t) {
        super(xnx.a((defpackage.xii.a<T>) new a<T>(t)));
        this.a = t;
    }

    static <T> xik a(xio<? super T> xio, T t) {
        return b ? new SingleProducer(xio, t) : new c(xio, t);
    }

    public static <T> ScalarSynchronousObservable<T> d(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    public final xii<T> c(final xil xil) {
        xiy xiy;
        if (xil instanceof xli) {
            final xli xli = (xli) xil;
            xiy = new xiy<xir, xip>() {
                public final /* synthetic */ Object call(Object obj) {
                    return xli.a((xir) obj);
                }
            };
        } else {
            xiy = new xiy<xir, xip>() {
                public final /* synthetic */ Object call(Object obj) {
                    final xir xir = (xir) obj;
                    final defpackage.xil.a c = xil.c();
                    c.a(new xir() {
                        public final void call() {
                            try {
                                xir.call();
                            } finally {
                                c.unsubscribe();
                            }
                        }
                    });
                    return c;
                }
            };
        }
        return b((defpackage.xii.a<T>) new b<T>(this.a, xiy));
    }

    public final <R> xii<R> k(final xiy<? super T, ? extends xii<? extends R>> xiy) {
        return b((defpackage.xii.a<T>) new defpackage.xii.a<R>() {
            public final /* synthetic */ void call(Object obj) {
                xio xio = (xio) obj;
                xii xii = (xii) xiy.call(ScalarSynchronousObservable.this.a);
                if (xii instanceof ScalarSynchronousObservable) {
                    xio.setProducer(ScalarSynchronousObservable.a(xio, ((ScalarSynchronousObservable) xii).a));
                } else {
                    xii.a(xnu.a(xio));
                }
            }
        });
    }
}
