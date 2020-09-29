package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.internal.producers.SingleProducer;

public final class ScalarSynchronousObservable<T> extends wud<T> {
    private static boolean b = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    public final T a;

    static final class ScalarAsyncProducer<T> extends AtomicBoolean implements wuf, wum {
        private static final long serialVersionUID = -2466317989629281651L;
        final wuj<? super T> actual;
        final wut<wum, wuk> onSchedule;
        final T value;

        public ScalarAsyncProducer(wuj<? super T> wuj, T t, wut<wum, wuk> wut) {
            this.actual = wuj;
            this.value = t;
            this.onSchedule = wut;
        }

        public final void a(long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j != 0 && compareAndSet(false, true)) {
                this.actual.add((wuk) this.onSchedule.call(this));
            }
        }

        public final void call() {
            wuj<? super T> wuj = this.actual;
            if (!wuj.isUnsubscribed()) {
                T t = this.value;
                try {
                    wuj.onNext(t);
                    if (!wuj.isUnsubscribed()) {
                        wuj.onCompleted();
                    }
                } catch (Throwable th) {
                    wul.a(th, wuj, t);
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

    static final class a<T> implements defpackage.wud.a<T> {
        private T a;

        public final /* synthetic */ void call(Object obj) {
            wuj wuj = (wuj) obj;
            wuj.setProducer(ScalarSynchronousObservable.a(wuj, this.a));
        }

        a(T t) {
            this.a = t;
        }
    }

    static final class b<T> implements defpackage.wud.a<T> {
        private T a;
        private wut<wum, wuk> b;

        public final /* synthetic */ void call(Object obj) {
            wuj wuj = (wuj) obj;
            wuj.setProducer(new ScalarAsyncProducer(wuj, this.a, this.b));
        }

        b(T t, wut<wum, wuk> wut) {
            this.a = t;
            this.b = wut;
        }
    }

    static final class c<T> implements wuf {
        private wuj<? super T> a;
        private T b;
        private boolean c;

        public c(wuj<? super T> wuj, T t) {
            this.a = wuj;
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
                    wuj<? super T> wuj = this.a;
                    if (!wuj.isUnsubscribed()) {
                        T t = this.b;
                        try {
                            wuj.onNext(t);
                            if (!wuj.isUnsubscribed()) {
                                wuj.onCompleted();
                            }
                        } catch (Throwable th) {
                            wul.a(th, wuj, t);
                        }
                    }
                }
            }
        }
    }

    static <T> wuf a(wuj<? super T> wuj, T t) {
        if (b) {
            return new SingleProducer(wuj, t);
        }
        return new c(wuj, t);
    }

    public static <T> ScalarSynchronousObservable<T> d(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    private ScalarSynchronousObservable(T t) {
        super(wzs.a((defpackage.wud.a<T>) new a<T>(t)));
        this.a = t;
    }

    public final wud<T> c(final wug wug) {
        wut wut;
        if (wug instanceof wxd) {
            final wxd wxd = (wxd) wug;
            wut = new wut<wum, wuk>() {
                public final /* synthetic */ Object call(Object obj) {
                    return wxd.a((wum) obj);
                }
            };
        } else {
            wut = new wut<wum, wuk>() {
                public final /* synthetic */ Object call(Object obj) {
                    final wum wum = (wum) obj;
                    final defpackage.wug.a c = wug.c();
                    c.a(new wum() {
                        public final void call() {
                            try {
                                wum.call();
                            } finally {
                                c.unsubscribe();
                            }
                        }
                    });
                    return c;
                }
            };
        }
        return b((defpackage.wud.a<T>) new b<T>(this.a, wut));
    }

    public final <R> wud<R> m(final wut<? super T, ? extends wud<? extends R>> wut) {
        return b((defpackage.wud.a<T>) new defpackage.wud.a<R>() {
            public final /* synthetic */ void call(Object obj) {
                wuj wuj = (wuj) obj;
                wud wud = (wud) wut.call(ScalarSynchronousObservable.this.a);
                if (wud instanceof ScalarSynchronousObservable) {
                    wuj.setProducer(ScalarSynchronousObservable.a(wuj, ((ScalarSynchronousObservable) wud).a));
                } else {
                    wud.a(wzp.a(wuj));
                }
            }
        });
    }
}
