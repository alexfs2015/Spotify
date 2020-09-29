package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: wuh reason: default package */
public class wuh<T> {
    public final a<T> a;

    /* renamed from: wuh$a */
    public interface a<T> extends wun<wui<? super T>> {
    }

    protected wuh(a<T> aVar) {
        this.a = wzs.a(aVar);
    }

    public static <T> wuh<T> a(a<T> aVar) {
        return new wuh<>(aVar);
    }

    public static <T> wud<T> a(wuh<T> wuh) {
        return wud.b((defpackage.wud.a<T>) new wxa<T>(wuh.a));
    }

    public static <T> wuh<T> a(final Throwable th) {
        return a((a<T>) new a<T>() {
            public final /* synthetic */ void call(Object obj) {
                ((wui) obj).a(th);
            }
        });
    }

    public static <T> wuh<T> a(Callable<? extends T> callable) {
        return a((a<T>) new wwt<T>(callable));
    }

    private static <T> wuh<T> b(wuh<? extends wuh<? extends T>> wuh) {
        if (wuh instanceof wxt) {
            return ((wxt) wuh).e(Identity.INSTANCE);
        }
        return a((a<T>) new a<T>(wuh) {
            private /* synthetic */ wuh a;

            {
                this.a = r1;
            }

            public final /* synthetic */ void call(Object obj) {
                final wui wui = (wui) obj;
                AnonymousClass1 r0 = new wui<wuh<? extends T>>() {
                    public final /* bridge */ /* synthetic */ void a(Object obj) {
                        ((wuh) obj).a(wui);
                    }

                    public final void a(Throwable th) {
                        wui.a(th);
                    }
                };
                wui.a((wuk) r0);
                this.a.a((wui<? super T>) r0);
            }
        });
    }

    public final <R> wuh<R> a(wut<? super T, ? extends wuh<? extends R>> wut) {
        if (this instanceof wxt) {
            return ((wxt) this).e(wut);
        }
        return b(c(wut));
    }

    public final <R> wud<R> b(wut<? super T, ? extends wud<? extends R>> wut) {
        return wud.a(a(c(wut)));
    }

    public final <R> wuh<R> c(wut<? super T, ? extends R> wut) {
        return a((a<T>) new wwy<T>(this, wut));
    }

    public final wuh<T> a(wug wug) {
        if (this instanceof wxt) {
            return ((wxt) this).b(wug);
        }
        if (wug != null) {
            return a((a<T>) new www<T>(this.a, wug));
        }
        throw new NullPointerException("scheduler is null");
    }

    public final wuh<T> d(wut<Throwable, ? extends T> wut) {
        return a((a<T>) new wwx<T>(this.a, wut));
    }

    public final wuk a(final wun<? super T> wun, final wun<Throwable> wun2) {
        if (wun == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        } else if (wun2 != null) {
            return a((wui<? super T>) new wui<T>() {
                public final void a(Throwable th) {
                    try {
                        wun2.call(th);
                    } finally {
                        unsubscribe();
                    }
                }

                public final void a(T t) {
                    try {
                        wun.call(t);
                    } finally {
                        unsubscribe();
                    }
                }
            });
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    public final wuk a(wui<? super T> wui) {
        if (wui != null) {
            try {
                wzs.a(this, this.a).call(wui);
                return wzs.b((wuk) wui);
            } catch (Throwable th) {
                wul.b(th);
                StringBuilder sb = new StringBuilder("Error occurred attempting to subscribe [");
                sb.append(th.getMessage());
                sb.append("] and then again while trying to pass to onError.");
                RuntimeException runtimeException = new RuntimeException(sb.toString(), th);
                wzs.c(runtimeException);
                throw runtimeException;
            }
        } else {
            throw new IllegalArgumentException("te is null");
        }
    }

    public final wuh<T> a(long j, TimeUnit timeUnit) {
        return a(10, timeUnit, null, wzz.b());
    }

    public final wuh<T> a(long j, TimeUnit timeUnit, wuh<? extends T> wuh) {
        return a(500, timeUnit, wuh, wzz.b());
    }

    private wuh<T> a(long j, TimeUnit timeUnit, wuh<? extends T> wuh, wug wug) {
        if (wuh == null) {
            wuh = b((Callable<wuh<T>>) new wus<wuh<T>>() {
                public final /* synthetic */ Object call() {
                    return wuh.a((Throwable) new TimeoutException());
                }
            });
        }
        wwz wwz = new wwz(this.a, j, timeUnit, wug, wuh.a);
        return a((a<T>) wwz);
    }

    public final wuh<T> a(wun<? super T> wun) {
        if (wun != null) {
            return a((a<T>) new wwr<T>(this, wun, wuq.a()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    private static <T> wuh<T> b(final Callable<wuh<T>> callable) {
        return a((a<T>) new a<T>() {
            public final /* synthetic */ void call(Object obj) {
                wui wui = (wui) obj;
                try {
                    ((wuh) callable.call()).a(wui);
                } catch (Throwable th) {
                    wul.b(th);
                    wui.a(th);
                }
            }
        });
    }
}
