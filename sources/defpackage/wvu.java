package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: wvu reason: default package */
public final class wvu<T, R> implements b<R, T> {
    private Class<R> a;

    /* renamed from: wvu$a */
    static final class a<T, R> extends wuj<T> {
        private wuj<? super R> a;
        private Class<R> b;
        private boolean c;

        public a(wuj<? super R> wuj, Class<R> cls) {
            this.a = wuj;
            this.b = cls;
        }

        public final void onNext(T t) {
            try {
                this.a.onNext(this.b.cast(t));
            } catch (Throwable th) {
                wul.b(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, t));
            }
        }

        public final void onError(Throwable th) {
            if (this.c) {
                wzs.a(th);
                return;
            }
            this.c = true;
            this.a.onError(th);
        }

        public final void onCompleted() {
            if (!this.c) {
                this.a.onCompleted();
            }
        }

        public final void setProducer(wuf wuf) {
            this.a.setProducer(wuf);
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        a aVar = new a(wuj, this.a);
        wuj.add(aVar);
        return aVar;
    }

    public wvu(Class<R> cls) {
        this.a = cls;
    }
}
