package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.Notification.Kind;

/* renamed from: wvk reason: default package */
public final class wvk<T> implements a<T> {
    final wud<T> a;
    final boolean b;
    final boolean c;
    private final wut<? super wud<? extends Notification<?>>, ? extends wud<?>> d;
    private final wug e;

    public final /* synthetic */ void call(Object obj) {
        xae xae;
        wuj wuj = (wuj) obj;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        a c2 = this.e.c();
        wuj.add(c2);
        final xai xai = new xai();
        wuj.add(xai);
        xac e2 = xac.e();
        if (e2.getClass() == xad.class) {
            xae = (xad) e2;
        } else {
            xae = new xad(e2);
        }
        wud.a(wzp.a(wzk.a()), (wud<T>) xae);
        wxb wxb = new wxb();
        final wuj wuj2 = wuj;
        final xae xae2 = xae;
        final wxb wxb2 = wxb;
        final AtomicLong atomicLong2 = atomicLong;
        AnonymousClass2 r0 = new wum() {
            public final void call() {
                if (!wuj2.isUnsubscribed()) {
                    AnonymousClass1 r0 = new wuj<T>() {
                        private boolean a;

                        public final void onCompleted() {
                            if (!this.a) {
                                this.a = true;
                                unsubscribe();
                                xae2.onNext(Notification.a());
                            }
                        }

                        public final void onError(Throwable th) {
                            if (!this.a) {
                                this.a = true;
                                unsubscribe();
                                xae2.onNext(Notification.a(th));
                            }
                        }

                        public final void onNext(T t) {
                            long j;
                            if (!this.a) {
                                wuj2.onNext(t);
                                do {
                                    j = atomicLong2.get();
                                    if (j == Long.MAX_VALUE) {
                                        break;
                                    }
                                } while (!atomicLong2.compareAndSet(j, j - 1));
                                wxb2.b(1);
                            }
                        }

                        public final void setProducer(wuf wuf) {
                            wxb2.a(wuf);
                        }
                    };
                    xai.a(r0);
                    wvk.this.a.a((wuj<? super T>) r0);
                }
            }
        };
        final wud wud = (wud) this.d.call(xae.a((b<? extends R, ? super T>) new b<Notification<?>, Notification<?>>() {
            public final /* synthetic */ Object call(Object obj) {
                final wuj wuj = (wuj) obj;
                return new wuj<Notification<?>>(wuj) {
                    public final /* synthetic */ void onNext(Object obj) {
                        Notification notification = (Notification) obj;
                        if ((notification.a == Kind.OnCompleted) && wvk.this.b) {
                            wuj.onCompleted();
                        } else if (!notification.b() || !wvk.this.c) {
                            wuj.onNext(notification);
                        } else {
                            wuj.onError(notification.b);
                        }
                    }

                    public final void onCompleted() {
                        wuj.onCompleted();
                    }

                    public final void onError(Throwable th) {
                        wuj.onError(th);
                    }

                    public final void setProducer(wuf wuf) {
                        wuf.a(Long.MAX_VALUE);
                    }
                };
            }
        }));
        final wuj wuj3 = wuj;
        final AtomicLong atomicLong3 = atomicLong;
        final a aVar = c2;
        final AnonymousClass2 r6 = r0;
        final AtomicBoolean atomicBoolean2 = atomicBoolean;
        AnonymousClass4 r02 = new wum() {
            public final void call() {
                wud.a((wuj<? super T>) new wuj<Object>(wuj3) {
                    public final void onCompleted() {
                        wuj3.onCompleted();
                    }

                    public final void onError(Throwable th) {
                        wuj3.onError(th);
                    }

                    public final void onNext(Object obj) {
                        if (!wuj3.isUnsubscribed()) {
                            if (atomicLong3.get() > 0) {
                                aVar.a(r6);
                                return;
                            }
                            atomicBoolean2.compareAndSet(false, true);
                        }
                    }

                    public final void setProducer(wuf wuf) {
                        wuf.a(Long.MAX_VALUE);
                    }
                });
            }
        };
        c2.a(r02);
        final AtomicLong atomicLong4 = atomicLong;
        final wxb wxb3 = wxb;
        final AtomicBoolean atomicBoolean3 = atomicBoolean;
        AnonymousClass5 r03 = new wuf() {
            public final void a(long j) {
                if (j > 0) {
                    wuz.a(atomicLong4, j);
                    wxb3.a(j);
                    if (atomicBoolean3.compareAndSet(true, false)) {
                        aVar.a(r6);
                    }
                }
            }
        };
        wuj.setProducer(r03);
    }

    static {
        new wut<wud<? extends Notification<?>>, wud<?>>() {
            public final /* synthetic */ Object call(Object obj) {
                return ((wud) obj).f(new wut<Notification<?>, Notification<?>>() {
                    public final /* synthetic */ Object call(Object obj) {
                        return Notification.a(null);
                    }
                });
            }
        };
    }

    public static <T> wud<T> a(wud<T> wud, wut<? super wud<? extends Notification<?>>, ? extends wud<?>> wut) {
        wvk wvk = new wvk(wud, wut, true, false, wzz.a());
        return wud.b((a<T>) wvk);
    }

    public static <T> wud<T> b(wud<T> wud, wut<? super wud<? extends Notification<?>>, ? extends wud<?>> wut) {
        wvk wvk = new wvk(wud, wut, false, true, wzz.a());
        return wud.b((a<T>) wvk);
    }

    private wvk(wud<T> wud, wut<? super wud<? extends Notification<?>>, ? extends wud<?>> wut, boolean z, boolean z2, wug wug) {
        this.a = wud;
        this.d = wut;
        this.b = z;
        this.c = z2;
        this.e = wug;
    }
}
