package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: xjo reason: default package */
public final class xjo<T, R> implements defpackage.xii.a<R> {
    private xii<T> a;
    private xiy<? super T, ? extends R> b;

    /* renamed from: xjo$a */
    static final class a<T, R> extends xio<T> {
        private xio<? super R> a;
        private xiy<? super T, ? extends R> b;
        private boolean c;

        public a(xio<? super R> xio, xiy<? super T, ? extends R> xiy) {
            this.a = xio;
            this.b = xiy;
        }

        public final void onCompleted() {
            if (!this.c) {
                this.a.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            if (this.c) {
                xnx.a(th);
                return;
            }
            this.c = true;
            this.a.onError(th);
        }

        public final void onNext(T t) {
            try {
                this.a.onNext(this.b.call(t));
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

    public xjo(xii<T> xii, xiy<? super T, ? extends R> xiy) {
        this.a = xii;
        this.b = xiy;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        a aVar = new a(xio, this.b);
        xio.add(aVar);
        this.a.a((xio<? super T>) aVar);
    }
}
