package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: wvp reason: default package */
public final class wvp<T, U, V> implements defpackage.wud.a<T> {
    private wud<T> a;
    private wud<U> b;
    private wut<? super T, ? extends wud<V>> c;
    private wud<? extends T> d;

    /* renamed from: wvp$a */
    static final class a<T> extends wuj<T> {
        final wuj<? super T> a;
        final wxb b = new wxb();
        final AtomicLong c = new AtomicLong();
        final SequentialSubscription d = new SequentialSubscription();
        final SequentialSubscription e = new SequentialSubscription(this);
        private wut<? super T, ? extends wud<?>> f;
        private wud<? extends T> g;
        private long h;

        /* renamed from: wvp$a$a reason: collision with other inner class name */
        final class C0088a extends wuj<Object> {
            private long a;
            private boolean b;

            C0088a(long j) {
                this.a = j;
            }

            public final void onNext(Object obj) {
                if (!this.b) {
                    this.b = true;
                    unsubscribe();
                    a.this.a(this.a);
                }
            }

            public final void onError(Throwable th) {
                if (!this.b) {
                    this.b = true;
                    a aVar = a.this;
                    if (aVar.c.compareAndSet(this.a, Long.MAX_VALUE)) {
                        aVar.unsubscribe();
                        aVar.a.onError(th);
                    } else {
                        wzs.a(th);
                    }
                } else {
                    wzs.a(th);
                }
            }

            public final void onCompleted() {
                if (!this.b) {
                    this.b = true;
                    a.this.a(this.a);
                }
            }
        }

        a(wuj<? super T> wuj, wut<? super T, ? extends wud<?>> wut, wud<? extends T> wud) {
            this.a = wuj;
            this.f = wut;
            this.g = wud;
            add(this.d);
        }

        public final void onNext(T t) {
            long j = this.c.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.c.compareAndSet(j, j2)) {
                    wuk wuk = (wuk) this.d.get();
                    if (wuk != null) {
                        wuk.unsubscribe();
                    }
                    this.a.onNext(t);
                    this.h++;
                    try {
                        wud wud = (wud) this.f.call(t);
                        if (wud != null) {
                            C0088a aVar = new C0088a(j2);
                            if (this.d.b(aVar)) {
                                wud.a((wuj<? super T>) aVar, wud);
                            }
                            return;
                        }
                        throw new NullPointerException("The itemTimeoutIndicator returned a null Observable");
                    } catch (Throwable th) {
                        wul.b(th);
                        unsubscribe();
                        this.c.getAndSet(Long.MAX_VALUE);
                        this.a.onError(th);
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.c.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.d.unsubscribe();
                this.a.onError(th);
                return;
            }
            wzs.a(th);
        }

        public final void onCompleted() {
            if (this.c.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.d.unsubscribe();
                this.a.onCompleted();
            }
        }

        public final void setProducer(wuf wuf) {
            this.b.a(wuf);
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j) {
            if (this.c.compareAndSet(j, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.g == null) {
                    this.a.onError(new TimeoutException());
                    return;
                }
                long j2 = this.h;
                if (j2 != 0) {
                    this.b.b(j2);
                }
                a aVar = new a(this.a, this.b);
                if (this.e.b(aVar)) {
                    wud.a((wuj<? super T>) aVar, this.g);
                }
            }
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        a aVar = new a(wuj, this.c, this.d);
        wuj.add(aVar.e);
        wuj.setProducer(aVar.b);
        wud<U> wud = this.b;
        if (wud != null) {
            C0088a aVar2 = new C0088a(0);
            if (aVar.d.b(aVar2)) {
                wud.a((wuj<? super T>) aVar2, wud);
            }
        }
        wud.a((wuj<? super T>) aVar, this.a);
    }

    public wvp(wud<T> wud, wud<U> wud2, wut<? super T, ? extends wud<V>> wut, wud<? extends T> wud3) {
        this.a = wud;
        this.b = wud2;
        this.c = wut;
        this.d = wud3;
    }
}
