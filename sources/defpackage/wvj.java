package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: wvj reason: default package */
public final class wvj<T, R> implements defpackage.wud.a<R> {
    private wud<T> a;
    private wut<? super T, ? extends R> b;

    /* renamed from: wvj$a */
    static final class a<T, R> extends wuj<T> {
        private wuj<? super R> a;
        private wut<? super T, ? extends R> b;
        private boolean c;

        public a(wuj<? super R> wuj, wut<? super T, ? extends R> wut) {
            this.a = wuj;
            this.b = wut;
        }

        public final void onNext(T t) {
            try {
                this.a.onNext(this.b.call(t));
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

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        a aVar = new a(wuj, this.b);
        wuj.add(aVar);
        this.a.a((wuj<? super T>) aVar);
    }

    public wvj(wud<T> wud, wut<? super T, ? extends R> wut) {
        this.a = wud;
        this.b = wut;
    }
}
