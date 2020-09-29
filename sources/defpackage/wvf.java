package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: wvf reason: default package */
public final class wvf<T> implements defpackage.wud.a<T> {
    private wud<T> a;
    private wut<? super T, Boolean> b;

    /* renamed from: wvf$a */
    static final class a<T> extends wuj<T> {
        private wuj<? super T> a;
        private wut<? super T, Boolean> b;
        private boolean c;

        public a(wuj<? super T> wuj, wut<? super T, Boolean> wut) {
            this.a = wuj;
            this.b = wut;
            request(0);
        }

        public final void onNext(T t) {
            try {
                if (((Boolean) this.b.call(t)).booleanValue()) {
                    this.a.onNext(t);
                } else {
                    request(1);
                }
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
            super.setProducer(wuf);
            this.a.setProducer(wuf);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        a aVar = new a(wuj, this.b);
        wuj.add(aVar);
        this.a.a((wuj<? super T>) aVar);
    }

    public wvf(wud<T> wud, wut<? super T, Boolean> wut) {
        this.a = wud;
        this.b = wut;
    }
}
