package defpackage;

import io.reactivex.Flowable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: wir reason: default package */
final class wir<T> extends Flowable<T> {
    private xii<T> b;

    /* renamed from: wir$a */
    static final class a<T> extends xio<T> {
        private xfl<? super T> a;
        private boolean b;

        a(xfl<? super T> xfl) {
            this.a = xfl;
            request(0);
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j) {
            request(j);
        }

        public final void onCompleted() {
            if (!this.b) {
                this.b = true;
                this.a.c();
                unsubscribe();
            }
        }

        public final void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.a(th);
                return;
            }
            this.b = true;
            this.a.onError(th);
            unsubscribe();
        }

        public final void onNext(T t) {
            if (!this.b) {
                if (t == null) {
                    unsubscribe();
                    onError(new NullPointerException("The upstream 1.x Observable signalled a null value which is not supported in 2.x"));
                    return;
                }
                this.a.b_(t);
            }
        }
    }

    /* renamed from: wir$b */
    static final class b implements xfm {
        private a<?> a;

        b(a<?> aVar) {
            this.a = aVar;
        }

        public final void a() {
            this.a.unsubscribe();
        }

        public final void a(long j) {
            this.a.a(j);
        }
    }

    wir(xii<T> xii) {
        this.b = xii;
    }

    public final void a(xfl<? super T> xfl) {
        a aVar = new a(xfl);
        xfl.a(new b(aVar));
        this.b.a((xio<? super T>) aVar);
    }
}
