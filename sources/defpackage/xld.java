package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: xld reason: default package */
public final class xld<T, R> implements defpackage.xim.a<R> {
    private xim<T> a;
    private xiy<? super T, ? extends R> b;

    /* renamed from: xld$a */
    static final class a<T, R> extends xin<T> {
        private xin<? super R> a;
        private xiy<? super T, ? extends R> b;
        private boolean c;

        public a(xin<? super R> xin, xiy<? super T, ? extends R> xiy) {
            this.a = xin;
            this.b = xiy;
        }

        public final void a(T t) {
            try {
                this.a.a(this.b.call(t));
            } catch (Throwable th) {
                xiq.b(th);
                unsubscribe();
                a(OnErrorThrowable.a(th, t));
            }
        }

        public final void a(Throwable th) {
            if (this.c) {
                xnx.a(th);
                return;
            }
            this.c = true;
            this.a.a(th);
        }
    }

    public xld(xim<T> xim, xiy<? super T, ? extends R> xiy) {
        this.a = xim;
        this.b = xiy;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        a aVar = new a(xin, this.b);
        xin.a((xip) aVar);
        this.a.a((xin<? super T>) aVar);
    }
}
