package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.Notification.Kind;

/* renamed from: xjp reason: default package */
public final class xjp<T> implements a<T> {
    final xii<T> a;
    final boolean b;
    final boolean c;
    private final xiy<? super xii<? extends Notification<?>>, ? extends xii<?>> d;
    private final xil e;

    static {
        new xiy<xii<? extends Notification<?>>, xii<?>>() {
            public final /* synthetic */ Object call(Object obj) {
                return ((xii) obj).e((xiy<? super T, ? extends R>) new xiy<Notification<?>, Notification<?>>() {
                    public final /* synthetic */ Object call(Object obj) {
                        return Notification.a(null);
                    }
                });
            }
        };
    }

    private xjp(xii<T> xii, xiy<? super xii<? extends Notification<?>>, ? extends xii<?>> xiy, boolean z, boolean z2, xil xil) {
        this.a = xii;
        this.d = xiy;
        this.b = z;
        this.c = z2;
        this.e = xil;
    }

    public static <T> xii<T> a(xii<T> xii, xiy<? super xii<? extends Notification<?>>, ? extends xii<?>> xiy) {
        xjp xjp = new xjp(xii, xiy, true, false, xoe.a());
        return xii.b((a<T>) xjp);
    }

    public static <T> xii<T> b(xii<T> xii, xiy<? super xii<? extends Notification<?>>, ? extends xii<?>> xiy) {
        xjp xjp = new xjp(xii, xiy, false, true, xoe.a());
        return xii.b((a<T>) xjp);
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        a c2 = this.e.c();
        xio.add(c2);
        final xom xom = new xom();
        xio.add(xom);
        xog e2 = xog.e();
        xoi xoh = e2.getClass() == xoh.class ? (xoh) e2 : new xoh(e2);
        xii.a(xnu.a(xnp.a()), (xii<T>) xoh);
        xlg xlg = new xlg();
        final xio xio2 = xio;
        final xoi xoi = xoh;
        final xlg xlg2 = xlg;
        final AtomicLong atomicLong2 = atomicLong;
        AnonymousClass2 r0 = new xir() {
            public final void call() {
                if (!xio2.isUnsubscribed()) {
                    AnonymousClass1 r0 = new xio<T>() {
                        private boolean a;

                        public final void onCompleted() {
                            if (!this.a) {
                                this.a = true;
                                unsubscribe();
                                xoi.onNext(Notification.a());
                            }
                        }

                        public final void onError(Throwable th) {
                            if (!this.a) {
                                this.a = true;
                                unsubscribe();
                                xoi.onNext(Notification.a(th));
                            }
                        }

                        public final void onNext(T t) {
                            long j;
                            if (!this.a) {
                                xio2.onNext(t);
                                do {
                                    j = atomicLong2.get();
                                    if (j == Long.MAX_VALUE) {
                                        break;
                                    }
                                } while (!atomicLong2.compareAndSet(j, j - 1));
                                xlg2.b(1);
                            }
                        }

                        public final void setProducer(xik xik) {
                            xlg2.a(xik);
                        }
                    };
                    xom.a(r0);
                    xjp.this.a.a((xio<? super T>) r0);
                }
            }
        };
        final xii xii = (xii) this.d.call(xoh.a((b<? extends R, ? super T>) new b<Notification<?>, Notification<?>>() {
            public final /* synthetic */ Object call(Object obj) {
                final xio xio = (xio) obj;
                return new xio<Notification<?>>(xio) {
                    public final void onCompleted() {
                        xio.onCompleted();
                    }

                    public final void onError(Throwable th) {
                        xio.onError(th);
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        Notification notification = (Notification) obj;
                        if ((notification.a == Kind.OnCompleted) && xjp.this.b) {
                            xio.onCompleted();
                        } else if (!notification.b() || !xjp.this.c) {
                            xio.onNext(notification);
                        } else {
                            xio.onError(notification.b);
                        }
                    }

                    public final void setProducer(xik xik) {
                        xik.a(Long.MAX_VALUE);
                    }
                };
            }
        }));
        final xio xio3 = xio;
        final AtomicLong atomicLong3 = atomicLong;
        final a aVar = c2;
        final AnonymousClass2 r6 = r0;
        final AtomicBoolean atomicBoolean2 = atomicBoolean;
        AnonymousClass4 r02 = new xir() {
            public final void call() {
                xii.a((xio<? super T>) new xio<Object>(xio3) {
                    public final void onCompleted() {
                        xio3.onCompleted();
                    }

                    public final void onError(Throwable th) {
                        xio3.onError(th);
                    }

                    public final void onNext(Object obj) {
                        if (!xio3.isUnsubscribed()) {
                            if (atomicLong3.get() > 0) {
                                aVar.a(r6);
                                return;
                            }
                            atomicBoolean2.compareAndSet(false, true);
                        }
                    }

                    public final void setProducer(xik xik) {
                        xik.a(Long.MAX_VALUE);
                    }
                });
            }
        };
        c2.a(r02);
        final AtomicLong atomicLong4 = atomicLong;
        final xlg xlg3 = xlg;
        final AtomicBoolean atomicBoolean3 = atomicBoolean;
        AnonymousClass5 r03 = new xik() {
            public final void a(long j) {
                if (j > 0) {
                    xje.a(atomicLong4, j);
                    xlg3.a(j);
                    if (atomicBoolean3.compareAndSet(true, false)) {
                        aVar.a(r6);
                    }
                }
            }
        };
        xio.setProducer(r03);
    }
}
