package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: xim reason: default package */
public class xim<T> {
    public final a<T> a;

    /* renamed from: xim$a */
    public interface a<T> extends xis<xin<? super T>> {
    }

    protected xim(a<T> aVar) {
        this.a = xnx.a(aVar);
    }

    public static <T> xii<T> a(xim<T> xim) {
        return xii.b((defpackage.xii.a<T>) new xlf<T>(xim.a));
    }

    private xim<T> a(long j, TimeUnit timeUnit, xim<? extends T> xim, xil xil) {
        if (xim == null) {
            xim = b((Callable<xim<T>>) new xix<xim<T>>() {
                public final /* synthetic */ Object call() {
                    return xim.a((Throwable) new TimeoutException());
                }
            });
        }
        xle xle = new xle(this.a, j, timeUnit, xil, xim.a);
        return a((a<T>) xle);
    }

    public static <T> xim<T> a(final Throwable th) {
        return a((a<T>) new a<T>() {
            public final /* synthetic */ void call(Object obj) {
                ((xin) obj).a(th);
            }
        });
    }

    public static <T> xim<T> a(Callable<? extends T> callable) {
        return a((a<T>) new xky<T>(callable));
    }

    public static <T> xim<T> a(a<T> aVar) {
        return new xim<>(aVar);
    }

    private static <T> xim<T> b(final Callable<xim<T>> callable) {
        return a((a<T>) new a<T>() {
            public final /* synthetic */ void call(Object obj) {
                xin xin = (xin) obj;
                try {
                    ((xim) callable.call()).a(xin);
                } catch (Throwable th) {
                    xiq.b(th);
                    xin.a(th);
                }
            }
        });
    }

    private static <T> xim<T> b(xim<? extends xim<? extends T>> xim) {
        return xim instanceof xly ? ((xly) xim).e(Identity.INSTANCE) : a((a<T>) new a<T>(xim) {
            private /* synthetic */ xim a;

            {
                this.a = r1;
            }

            public final /* synthetic */ void call(Object obj) {
                final xin xin = (xin) obj;
                AnonymousClass1 r0 = new xin<xim<? extends T>>() {
                    public final /* bridge */ /* synthetic */ void a(Object obj) {
                        ((xim) obj).a(xin);
                    }

                    public final void a(Throwable th) {
                        xin.a(th);
                    }
                };
                xin.a((xip) r0);
                this.a.a((xin<? super T>) r0);
            }
        });
    }

    public final xim<T> a(long j, TimeUnit timeUnit) {
        return a(10, timeUnit, null, xoe.b());
    }

    public final xim<T> a(long j, TimeUnit timeUnit, xim<? extends T> xim) {
        return a(500, timeUnit, xim, xoe.b());
    }

    public final xim<T> a(xil xil) {
        if (this instanceof xly) {
            return ((xly) this).b(xil);
        }
        if (xil != null) {
            return a((a<T>) new xlb<T>(this.a, xil));
        }
        throw new NullPointerException("scheduler is null");
    }

    public final <R> xim<R> a(xiy<? super T, ? extends xim<? extends R>> xiy) {
        return this instanceof xly ? ((xly) this).e(xiy) : b(c(xiy));
    }

    public final xip a(xin<? super T> xin) {
        if (xin != null) {
            try {
                xnx.a(this, this.a).call(xin);
                return xnx.b((xip) xin);
            } catch (Throwable th) {
                xiq.b(th);
                StringBuilder sb = new StringBuilder("Error occurred attempting to subscribe [");
                sb.append(th.getMessage());
                sb.append("] and then again while trying to pass to onError.");
                RuntimeException runtimeException = new RuntimeException(sb.toString(), th);
                xnx.c(runtimeException);
                throw runtimeException;
            }
        } else {
            throw new IllegalArgumentException("te is null");
        }
    }

    public final xip a(final xis<? super T> xis, final xis<Throwable> xis2) {
        if (xis == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        } else if (xis2 != null) {
            return a((xin<? super T>) new xin<T>() {
                public final void a(T t) {
                    try {
                        xis.call(t);
                    } finally {
                        unsubscribe();
                    }
                }

                public final void a(Throwable th) {
                    try {
                        xis2.call(th);
                    } finally {
                        unsubscribe();
                    }
                }
            });
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    public final <R> xii<R> b(xiy<? super T, ? extends xii<? extends R>> xiy) {
        return xii.a(a(c(xiy)));
    }

    public final <R> xim<R> c(xiy<? super T, ? extends R> xiy) {
        return a((a<T>) new xld<T>(this, xiy));
    }

    public final xim<T> d(xiy<Throwable, ? extends T> xiy) {
        return a((a<T>) new xlc<T>(this.a, xiy));
    }
}
