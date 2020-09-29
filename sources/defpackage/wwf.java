package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wwf reason: default package */
public final class wwf<T> implements b<T, T> {
    private long a;
    private TimeUnit b;
    private wug c;

    /* renamed from: wwf$a */
    static final class a<T> extends wuj<T> implements wum {
        private static final Object b = new Object();
        private final wuj<? super T> a;
        private AtomicReference<Object> c = new AtomicReference<>(b);

        public a(wuj<? super T> wuj) {
            this.a = wuj;
        }

        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        public final void onNext(T t) {
            this.c.set(t);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
            unsubscribe();
        }

        public final void onCompleted() {
            a();
            this.a.onCompleted();
            unsubscribe();
        }

        public final void call() {
            a();
        }

        private void a() {
            Object andSet = this.c.getAndSet(b);
            if (andSet != b) {
                try {
                    this.a.onNext(andSet);
                } catch (Throwable th) {
                    wul.a(th, (wue<?>) this);
                }
            }
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        wzo wzo = new wzo(wuj);
        defpackage.wug.a c2 = this.c.c();
        wuj.add(c2);
        a aVar = new a(wzo);
        wuj.add(aVar);
        long j = this.a;
        c2.a(aVar, j, j, this.b);
        return aVar;
    }

    public wwf(long j, TimeUnit timeUnit, wug wug) {
        this.a = j;
        this.b = timeUnit;
        this.c = wug;
    }
}
