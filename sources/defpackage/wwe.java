package defpackage;

import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: wwe reason: default package */
public final class wwe<T> implements b<T, T> {
    final wut<? super Throwable, ? extends wud<? extends T>> a;

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        final wxb wxb = new wxb();
        final xai xai = new xai();
        AnonymousClass3 r2 = new wuj<T>() {
            private boolean c;
            private long d;

            public final void onCompleted() {
                if (!this.c) {
                    this.c = true;
                    wuj.onCompleted();
                }
            }

            public final void onError(Throwable th) {
                if (this.c) {
                    wul.b(th);
                    wzs.a(th);
                    return;
                }
                this.c = true;
                try {
                    unsubscribe();
                    AnonymousClass1 r0 = new wuj<T>() {
                        public final void onNext(T t) {
                            wuj.onNext(t);
                        }

                        public final void onError(Throwable th) {
                            wuj.onError(th);
                        }

                        public final void onCompleted() {
                            wuj.onCompleted();
                        }

                        public final void setProducer(wuf wuf) {
                            wxb.a(wuf);
                        }
                    };
                    xai.a(r0);
                    long j = this.d;
                    if (j != 0) {
                        wxb.b(j);
                    }
                    ((wud) wwe.this.a.call(th)).a((wuj<? super T>) r0);
                } catch (Throwable th2) {
                    wul.a(th2, (wue<?>) wuj);
                }
            }

            public final void onNext(T t) {
                if (!this.c) {
                    this.d++;
                    wuj.onNext(t);
                }
            }

            public final void setProducer(wuf wuf) {
                wxb.a(wuf);
            }
        };
        xai.a(r2);
        wuj.add(xai);
        wuj.setProducer(wxb);
        return r2;
    }

    public static <T> wwe<T> a(final wut<? super Throwable, ? extends T> wut) {
        return new wwe<>(new wut<Throwable, wud<? extends T>>() {
            public final /* synthetic */ Object call(Object obj) {
                return ScalarSynchronousObservable.d(wut.call((Throwable) obj));
            }
        });
    }

    public static <T> wwe<T> a(final wud<? extends T> wud) {
        return new wwe<>(new wut<Throwable, wud<? extends T>>() {
            public final /* bridge */ /* synthetic */ Object call(Object obj) {
                return wud;
            }
        });
    }

    public wwe(wut<? super Throwable, ? extends wud<? extends T>> wut) {
        this.a = wut;
    }
}
