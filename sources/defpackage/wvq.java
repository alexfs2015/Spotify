package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: wvq reason: default package */
public final class wvq<T> implements defpackage.wud.a<T> {
    private wud<T> a;
    private long b;
    private TimeUnit c;
    private wug d;
    private wud<? extends T> e;

    /* renamed from: wvq$a */
    static final class a<T> extends wuj<T> {
        private wuj<? super T> a;
        private wxb b;

        a(wuj<? super T> wuj, wxb wxb) {
            this.a = wuj;
            this.b = wxb;
        }

        public final void onNext(T t) {
            this.a.onNext(t);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onCompleted() {
            this.a.onCompleted();
        }

        public final void setProducer(wuf wuf) {
            this.b.a(wuf);
        }
    }

    /* renamed from: wvq$b */
    static final class b<T> extends wuj<T> {
        final wuj<? super T> a;
        final wud<? extends T> b;
        final wxb c = new wxb();
        final AtomicLong d = new AtomicLong();
        final SequentialSubscription e = new SequentialSubscription(this);
        long f;
        private long g;
        private TimeUnit h;
        private defpackage.wug.a i;
        private SequentialSubscription j = new SequentialSubscription();

        /* renamed from: wvq$b$a */
        final class a implements wum {
            private long a;

            a(long j) {
                this.a = j;
            }

            public final void call() {
                b bVar = b.this;
                if (bVar.d.compareAndSet(this.a, Long.MAX_VALUE)) {
                    bVar.unsubscribe();
                    if (bVar.b == null) {
                        bVar.a.onError(new TimeoutException());
                        return;
                    }
                    long j = bVar.f;
                    if (j != 0) {
                        bVar.c.b(j);
                    }
                    a aVar = new a(bVar.a, bVar.c);
                    if (bVar.e.b(aVar)) {
                        wud.a((wuj<? super T>) aVar, bVar.b);
                    }
                }
            }
        }

        b(wuj<? super T> wuj, long j2, TimeUnit timeUnit, defpackage.wug.a aVar, wud<? extends T> wud) {
            this.a = wuj;
            this.g = j2;
            this.h = timeUnit;
            this.i = aVar;
            this.b = wud;
            add(aVar);
            add(this.j);
        }

        public final void onNext(T t) {
            long j2 = this.d.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 + 1;
                if (this.d.compareAndSet(j2, j3)) {
                    wuk wuk = (wuk) this.j.get();
                    if (wuk != null) {
                        wuk.unsubscribe();
                    }
                    this.f++;
                    this.a.onNext(t);
                    a(j3);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j2) {
            this.j.b(this.i.a(new a(j2), this.g, this.h));
        }

        public final void onError(Throwable th) {
            if (this.d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.j.unsubscribe();
                this.a.onError(th);
                this.i.unsubscribe();
                return;
            }
            wzs.a(th);
        }

        public final void onCompleted() {
            if (this.d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.j.unsubscribe();
                this.a.onCompleted();
                this.i.unsubscribe();
            }
        }

        public final void setProducer(wuf wuf) {
            this.c.a(wuf);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        b bVar = new b(wuj, this.b, this.c, this.d.c(), this.e);
        wuj.add(bVar.e);
        wuj.setProducer(bVar.c);
        bVar.a(0);
        wud.a((wuj<? super T>) bVar, this.a);
    }

    public wvq(wud<T> wud, long j, TimeUnit timeUnit, wug wug, wud<? extends T> wud2) {
        this.a = wud;
        this.b = j;
        this.c = timeUnit;
        this.d = wug;
        this.e = wud2;
    }
}
