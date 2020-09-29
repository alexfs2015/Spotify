package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: xjk reason: default package */
public final class xjk<T> implements defpackage.xii.a<T> {
    private xii<T> a;
    private xiy<? super T, Boolean> b;

    /* renamed from: xjk$a */
    static final class a<T> extends xio<T> {
        private xio<? super T> a;
        private xiy<? super T, Boolean> b;
        private boolean c;

        public a(xio<? super T> xio, xiy<? super T, Boolean> xiy) {
            this.a = xio;
            this.b = xiy;
            request(0);
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
                if (((Boolean) this.b.call(t)).booleanValue()) {
                    this.a.onNext(t);
                } else {
                    request(1);
                }
            } catch (Throwable th) {
                xiq.b(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, t));
            }
        }

        public final void setProducer(xik xik) {
            super.setProducer(xik);
            this.a.setProducer(xik);
        }
    }

    public xjk(xii<T> xii, xiy<? super T, Boolean> xiy) {
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
