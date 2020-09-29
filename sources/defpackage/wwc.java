package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: wwc reason: default package */
public final class wwc<T, U, R> implements defpackage.wud.b<wud<? extends R>, T> {
    private wut<? super T, ? extends wud<? extends U>> a;
    private wuu<? super T, ? super U, ? extends R> b;

    /* renamed from: wwc$a */
    static final class a<T, U, R> extends wuj<T> {
        private wuj<? super wud<? extends R>> a;
        private wut<? super T, ? extends wud<? extends U>> b;
        private wuu<? super T, ? super U, ? extends R> c;
        private boolean d;

        public a(wuj<? super wud<? extends R>> wuj, wut<? super T, ? extends wud<? extends U>> wut, wuu<? super T, ? super U, ? extends R> wuu) {
            this.a = wuj;
            this.b = wut;
            this.c = wuu;
        }

        public final void onNext(T t) {
            try {
                this.a.onNext(((wud) this.b.call(t)).f(new b(t, this.c)));
            } catch (Throwable th) {
                wul.b(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, t));
            }
        }

        public final void onError(Throwable th) {
            if (this.d) {
                wzs.a(th);
                return;
            }
            this.d = true;
            this.a.onError(th);
        }

        public final void onCompleted() {
            if (!this.d) {
                this.a.onCompleted();
            }
        }

        public final void setProducer(wuf wuf) {
            this.a.setProducer(wuf);
        }
    }

    /* renamed from: wwc$b */
    static final class b<T, U, R> implements wut<U, R> {
        private T a;
        private wuu<? super T, ? super U, ? extends R> b;

        public b(T t, wuu<? super T, ? super U, ? extends R> wuu) {
            this.a = t;
            this.b = wuu;
        }

        public final R call(U u) {
            return this.b.call(this.a, u);
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        a aVar = new a(wuj, this.a, this.b);
        wuj.add(aVar);
        return aVar;
    }

    public wwc(wut<? super T, ? extends wud<? extends U>> wut, wuu<? super T, ? super U, ? extends R> wuu) {
        this.a = wut;
        this.b = wuu;
    }
}
