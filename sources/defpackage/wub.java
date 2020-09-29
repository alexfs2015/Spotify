package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import rx.exceptions.CompositeException;

/* renamed from: wub reason: default package */
public final class wub {
    private static wub b = new wub(new a() {
        public final /* synthetic */ void call(Object obj) {
            wuc wuc = (wuc) obj;
            wuc.a(xaj.b());
            wuc.a();
        }
    }, false);
    private final a a;

    /* renamed from: wub$a */
    public interface a extends wun<wuc> {
    }

    /* renamed from: wub$b */
    public interface b extends wut<wuc, wuc> {
    }

    static {
        new wub(new a() {
            public final /* synthetic */ void call(Object obj) {
                ((wuc) obj).a(xaj.b());
            }
        }, false);
    }

    public static wub a() {
        a a2 = wzs.a(b.a);
        wub wub = b;
        if (a2 == wub.a) {
            return wub;
        }
        return new wub(a2, false);
    }

    public static wub a(a aVar) {
        a((T) aVar);
        try {
            return new wub(aVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            wzs.a(th);
            throw b(th);
        }
    }

    public static wub a(final Throwable th) {
        a((T) th);
        return a((a) new a() {
            public final /* synthetic */ void call(Object obj) {
                wuc wuc = (wuc) obj;
                wuc.a(xaj.b());
                wuc.a(th);
            }
        });
    }

    public static wub a(final wum wum) {
        a((T) wum);
        return a((a) new a() {
            public final /* synthetic */ void call(Object obj) {
                wuc wuc = (wuc) obj;
                xaf xaf = new xaf();
                wuc.a((wuk) xaf);
                try {
                    wum.call();
                    if (!xaf.isUnsubscribed()) {
                        wuc.a();
                    }
                } catch (Throwable th) {
                    if (!xaf.isUnsubscribed()) {
                        wuc.a(th);
                    }
                }
            }
        });
    }

    public static wub a(final wud<?> wud) {
        a((T) wud);
        return a((a) new a() {
            public final /* synthetic */ void call(Object obj) {
                final wuc wuc = (wuc) obj;
                AnonymousClass1 r0 = new wuj<Object>() {
                    public final void onNext(Object obj) {
                    }

                    public final void onCompleted() {
                        wuc.a();
                    }

                    public final void onError(Throwable th) {
                        wuc.a(th);
                    }
                };
                wuc.a((wuk) r0);
                wud.a((wuj<? super T>) r0);
            }
        });
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static NullPointerException b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    private wub(a aVar) {
        this.a = wzs.a(aVar);
    }

    private wub(a aVar, boolean z) {
        this.a = aVar;
    }

    public final <T> wud<T> b(wud<T> wud) {
        a((T) wud);
        return wud.b(b());
    }

    public final wub a(wun<? super Throwable> wun) {
        final defpackage.wuq.b a2 = wuq.a();
        final defpackage.wuq.b a3 = wuq.a();
        final defpackage.wuq.b a4 = wuq.a();
        final defpackage.wuq.b a5 = wuq.a();
        a((T) a2);
        a((T) wun);
        a((T) a3);
        a((T) a4);
        a((T) a5);
        final wun<? super Throwable> wun2 = wun;
        AnonymousClass3 r0 = new a() {
            public final /* synthetic */ void call(Object obj) {
                final wuc wuc = (wuc) obj;
                wub.this.a((wuc) new wuc() {
                    public final void a() {
                        try {
                            a3.call();
                            wuc.a();
                            try {
                                a4.call();
                            } catch (Throwable th) {
                                wzs.a(th);
                            }
                        } catch (Throwable th2) {
                            wuc.a(th2);
                        }
                    }

                    public final void a(Throwable th) {
                        try {
                            wun2.call(th);
                        } catch (Throwable th2) {
                            th = new CompositeException(Arrays.asList(new Throwable[]{th, th2}), 0);
                        }
                        wuc.a(th);
                        try {
                            a4.call();
                        } catch (Throwable th3) {
                            wzs.a(th3);
                        }
                    }

                    public final void a(final wuk wuk) {
                        try {
                            a2.call(wuk);
                            wuc.a(xaj.a((wum) new wum() {
                                public final void call() {
                                    try {
                                        a5.call();
                                    } catch (Throwable th) {
                                        wzs.a(th);
                                    }
                                    wuk.unsubscribe();
                                }
                            }));
                        } catch (Throwable th) {
                            wuk.unsubscribe();
                            wuc.a(xaj.b());
                            wuc.a(th);
                        }
                    }
                });
            }
        };
        return a((a) r0);
    }

    public final wub a(final wug wug) {
        a((T) wug);
        return a((a) new a() {
            public final /* synthetic */ void call(Object obj) {
                final wuc wuc = (wuc) obj;
                final wxu wxu = new wxu();
                final defpackage.wug.a c = wug.c();
                wxu.a(c);
                wuc.a((wuk) wxu);
                wub.this.a((wuc) new wuc() {
                    public final void a() {
                        c.a(new wum() {
                            public final void call() {
                                try {
                                    wuc.a();
                                } finally {
                                    wxu.unsubscribe();
                                }
                            }
                        });
                    }

                    public final void a(final Throwable th) {
                        c.a(new wum() {
                            public final void call() {
                                try {
                                    wuc.a(th);
                                } finally {
                                    wxu.unsubscribe();
                                }
                            }
                        });
                    }

                    public final void a(wuk wuk) {
                        wxu.a(wuk);
                    }
                });
            }
        });
    }

    public final wuk a(final wum wum, final wun<? super Throwable> wun) {
        a((T) wum);
        a((T) wun);
        final xah xah = new xah();
        a((wuc) new wuc() {
            private boolean a;

            public final void a() {
                if (!this.a) {
                    this.a = true;
                    try {
                        wum.call();
                        xah.unsubscribe();
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
                wzs.a(th);
                wub.c(th);
            }

            private void b(Throwable th) {
                try {
                    wun.call(th);
                } catch (Throwable th2) {
                    xah.unsubscribe();
                    throw th2;
                }
                xah.unsubscribe();
            }

            public final void a(wuk wuk) {
                xah xah = xah;
                if (wuk != null) {
                    xah.a.b(wuk);
                    return;
                }
                throw new IllegalArgumentException("Subscription can not be null");
            }
        });
        return xah;
    }

    static void c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public final void a(wuc wuc) {
        a((T) wuc);
        try {
            wzs.a(this, this.a).call(wuc);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            wul.b(th);
            Throwable d = wzs.d(th);
            wzs.a(d);
            throw b(d);
        }
    }

    public final void b(wuc wuc) {
        if (!(wuc instanceof wzl)) {
            wuc = new wzl(wuc);
        }
        a(wuc);
    }

    public final wub a(long j, TimeUnit timeUnit, wub wub) {
        a((T) wub);
        return a(5000, timeUnit, wzz.b(), wub);
    }

    private wub a(long j, TimeUnit timeUnit, wug wug, wub wub) {
        a((T) timeUnit);
        a((T) wug);
        wva wva = new wva(this, j, timeUnit, wug, wub);
        return a((a) wva);
    }

    public final <T> wud<T> b() {
        return wud.b((defpackage.wud.a<T>) new defpackage.wud.a<T>() {
            public final /* synthetic */ void call(Object obj) {
                wuj wuj = (wuj) obj;
                wub wub = wub.this;
                wub.a(wuj);
                try {
                    wuj.onStart();
                    wub.a((wuc) new wuc(wuj) {
                        private /* synthetic */ wuj a;

                        {
                            this.a = r2;
                        }

                        public final void a() {
                            this.a.onCompleted();
                        }

                        public final void a(Throwable th) {
                            this.a.onError(th);
                        }

                        public final void a(wuk wuk) {
                            this.a.add(wuk);
                        }
                    });
                    wzs.a((wuk) wuj);
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    wul.b(th);
                    Throwable b = wzs.b(th);
                    wzs.a(b);
                    throw wub.b(b);
                }
            }
        });
    }
}
