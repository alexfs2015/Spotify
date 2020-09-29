package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import rx.exceptions.CompositeException;

/* renamed from: xig reason: default package */
public final class xig {
    private static xig b = new xig(new a() {
        public final /* synthetic */ void call(Object obj) {
            xih xih = (xih) obj;
            xih.a(xon.b());
            xih.a();
        }
    }, false);
    private final a a;

    /* renamed from: xig$a */
    public interface a extends xis<xih> {
    }

    /* renamed from: xig$b */
    public interface b extends xiy<xih, xih> {
    }

    static {
        new xig(new a() {
            public final /* synthetic */ void call(Object obj) {
                ((xih) obj).a(xon.b());
            }
        }, false);
    }

    private xig(a aVar) {
        this.a = xnx.a(aVar);
    }

    private xig(a aVar, boolean z) {
        this.a = aVar;
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static xig a() {
        a a2 = xnx.a(b.a);
        xig xig = b;
        return a2 == xig.a ? xig : new xig(a2, false);
    }

    private xig a(long j, TimeUnit timeUnit, xil xil, xig xig) {
        a((T) timeUnit);
        a((T) xil);
        xjf xjf = new xjf(this, j, timeUnit, xil, xig);
        return a((a) xjf);
    }

    public static xig a(final Throwable th) {
        a((T) th);
        return a((a) new a() {
            public final /* synthetic */ void call(Object obj) {
                xih xih = (xih) obj;
                xih.a(xon.b());
                xih.a(th);
            }
        });
    }

    public static xig a(a aVar) {
        a((T) aVar);
        try {
            return new xig(aVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            xnx.a(th);
            throw b(th);
        }
    }

    public static xig a(final xii<?> xii) {
        a((T) xii);
        return a((a) new a() {
            public final /* synthetic */ void call(Object obj) {
                final xih xih = (xih) obj;
                AnonymousClass1 r0 = new xio<Object>() {
                    public final void onCompleted() {
                        xih.a();
                    }

                    public final void onError(Throwable th) {
                        xih.a(th);
                    }

                    public final void onNext(Object obj) {
                    }
                };
                xih.a((xip) r0);
                xii.a((xio<? super T>) r0);
            }
        });
    }

    public static xig a(final xir xir) {
        a((T) xir);
        return a((a) new a() {
            public final /* synthetic */ void call(Object obj) {
                xih xih = (xih) obj;
                xoj xoj = new xoj();
                xih.a((xip) xoj);
                try {
                    xir.call();
                    if (!xoj.isUnsubscribed()) {
                        xih.a();
                    }
                } catch (Throwable th) {
                    if (!xoj.isUnsubscribed()) {
                        xih.a(th);
                    }
                }
            }
        });
    }

    static NullPointerException b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    static void c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public final xig a(long j, TimeUnit timeUnit, xig xig) {
        a((T) xig);
        return a(5000, timeUnit, xoe.b(), xig);
    }

    public final xig a(final xil xil) {
        a((T) xil);
        return a((a) new a() {
            public final /* synthetic */ void call(Object obj) {
                final xih xih = (xih) obj;
                final xlz xlz = new xlz();
                final defpackage.xil.a c = xil.c();
                xlz.a(c);
                xih.a((xip) xlz);
                xig.this.a((xih) new xih() {
                    public final void a() {
                        c.a(new xir() {
                            public final void call() {
                                try {
                                    xih.a();
                                } finally {
                                    xlz.unsubscribe();
                                }
                            }
                        });
                    }

                    public final void a(final Throwable th) {
                        c.a(new xir() {
                            public final void call() {
                                try {
                                    xih.a(th);
                                } finally {
                                    xlz.unsubscribe();
                                }
                            }
                        });
                    }

                    public final void a(xip xip) {
                        xlz.a(xip);
                    }
                });
            }
        });
    }

    public final xig a(xis<? super Throwable> xis) {
        final defpackage.xiv.b a2 = xiv.a();
        final defpackage.xiv.b a3 = xiv.a();
        final defpackage.xiv.b a4 = xiv.a();
        final defpackage.xiv.b a5 = xiv.a();
        a((T) a2);
        a((T) xis);
        a((T) a3);
        a((T) a4);
        a((T) a5);
        final xis<? super Throwable> xis2 = xis;
        AnonymousClass3 r0 = new a() {
            public final /* synthetic */ void call(Object obj) {
                final xih xih = (xih) obj;
                xig.this.a((xih) new xih() {
                    public final void a() {
                        try {
                            a3.call();
                            xih.a();
                            try {
                                a4.call();
                            } catch (Throwable th) {
                                xnx.a(th);
                            }
                        } catch (Throwable th2) {
                            xih.a(th2);
                        }
                    }

                    public final void a(Throwable th) {
                        try {
                            xis2.call(th);
                        } catch (Throwable th2) {
                            th = new CompositeException(Arrays.asList(new Throwable[]{th, th2}), 0);
                        }
                        xih.a(th);
                        try {
                            a4.call();
                        } catch (Throwable th3) {
                            xnx.a(th3);
                        }
                    }

                    public final void a(final xip xip) {
                        try {
                            a2.call(xip);
                            xih.a(xon.a((xir) new xir() {
                                public final void call() {
                                    try {
                                        a5.call();
                                    } catch (Throwable th) {
                                        xnx.a(th);
                                    }
                                    xip.unsubscribe();
                                }
                            }));
                        } catch (Throwable th) {
                            xip.unsubscribe();
                            xih.a(xon.b());
                            xih.a(th);
                        }
                    }
                });
            }
        };
        return a((a) r0);
    }

    public final xip a(final xir xir, final xis<? super Throwable> xis) {
        a((T) xir);
        a((T) xis);
        final xol xol = new xol();
        a((xih) new xih() {
            private boolean a;

            private void b(Throwable th) {
                try {
                    xis.call(th);
                } catch (Throwable th2) {
                    xol.unsubscribe();
                    throw th2;
                }
                xol.unsubscribe();
            }

            public final void a() {
                if (!this.a) {
                    this.a = true;
                    try {
                        xir.call();
                        xol.unsubscribe();
                    } catch (Throwable th) {
                        b(th);
                    }
                }
            }

            public final void a(Throwable th) {
                if (!this.a) {
                    this.a = true;
                    b(th);
                    return;
                }
                xnx.a(th);
                xig.c(th);
            }

            public final void a(xip xip) {
                xol xol = xol;
                if (xip != null) {
                    xol.a.b(xip);
                    return;
                }
                throw new IllegalArgumentException("Subscription can not be null");
            }
        });
        return xol;
    }

    public final void a(xih xih) {
        a((T) xih);
        try {
            xnx.a(this, this.a).call(xih);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            xiq.b(th);
            Throwable d = xnx.d(th);
            xnx.a(d);
            throw b(d);
        }
    }

    public final <T> xii<T> b() {
        return xii.b((defpackage.xii.a<T>) new defpackage.xii.a<T>() {
            public final /* synthetic */ void call(Object obj) {
                xio xio = (xio) obj;
                xig xig = xig.this;
                xig.a(xio);
                try {
                    xio.onStart();
                    xig.a((xih) new xih(xio) {
                        private /* synthetic */ xio a;

                        {
                            this.a = r2;
                        }

                        public final void a() {
                            this.a.onCompleted();
                        }

                        public final void a(Throwable th) {
                            this.a.onError(th);
                        }

                        public final void a(xip xip) {
                            this.a.add(xip);
                        }
                    });
                    xnx.a((xip) xio);
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    xiq.b(th);
                    Throwable b = xnx.b(th);
                    xnx.a(b);
                    throw xig.b(b);
                }
            }
        });
    }

    public final <T> xii<T> b(xii<T> xii) {
        a((T) xii);
        return xii.b(b());
    }

    public final void b(xih xih) {
        if (!(xih instanceof xnq)) {
            xih = new xnq(xih);
        }
        a(xih);
    }
}
