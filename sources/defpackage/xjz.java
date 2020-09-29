package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: xjz reason: default package */
public final class xjz<T, R> implements b<R, T> {
    private Class<R> a;

    /* renamed from: xjz$a */
    static final class a<T, R> extends xio<T> {
        private xio<? super R> a;
        private Class<R> b;
        private boolean c;

        public a(xio<? super R> xio, Class<R> cls) {
            this.a = xio;
            this.b = cls;
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
                this.a.onNext(this.b.cast(t));
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

    public xjz(Class<R> cls) {
        this.a = cls;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        a aVar = new a(xio, this.a);
        xio.add(aVar);
        return aVar;
    }
}
