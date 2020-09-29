package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: xkh reason: default package */
public final class xkh<T, U, R> implements defpackage.xii.b<xii<? extends R>, T> {
    private xiy<? super T, ? extends xii<? extends U>> a;
    private xiz<? super T, ? super U, ? extends R> b;

    /* renamed from: xkh$a */
    static final class a<T, U, R> extends xio<T> {
        private xio<? super xii<? extends R>> a;
        private xiy<? super T, ? extends xii<? extends U>> b;
        private xiz<? super T, ? super U, ? extends R> c;
        private boolean d;

        public a(xio<? super xii<? extends R>> xio, xiy<? super T, ? extends xii<? extends U>> xiy, xiz<? super T, ? super U, ? extends R> xiz) {
            this.a = xio;
            this.b = xiy;
            this.c = xiz;
        }

        public final void onCompleted() {
            if (!this.d) {
                this.a.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            if (this.d) {
                xnx.a(th);
                return;
            }
            this.d = true;
            this.a.onError(th);
        }

        public final void onNext(T t) {
            try {
                this.a.onNext(((xii) this.b.call(t)).e((xiy<? super T, ? extends R>) new b<Object,Object>(t, this.c)));
            } catch (Throwable th) {
                xiq.b(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, t));
            }
        }

        public final void setProducer(xik xik) {
            this.a.setProducer(xik);
        }
    }

    /* renamed from: xkh$b */
    static final class b<T, U, R> implements xiy<U, R> {
        private T a;
        private xiz<? super T, ? super U, ? extends R> b;

        public b(T t, xiz<? super T, ? super U, ? extends R> xiz) {
            this.a = t;
            this.b = xiz;
        }

        public final R call(U u) {
            return this.b.call(this.a, u);
        }
    }

    public xkh(xiy<? super T, ? extends xii<? extends U>> xiy, xiz<? super T, ? super U, ? extends R> xiz) {
        this.a = xiy;
        this.b = xiz;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        a aVar = new a(xio, this.a, this.b);
        xio.add(aVar);
        return aVar;
    }
}
