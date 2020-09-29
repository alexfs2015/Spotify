package defpackage;

import rx.exceptions.CompositeException;
import rx.exceptions.OnErrorThrowable;

/* renamed from: xkw reason: default package */
public final class xkw<T> implements defpackage.xim.a<T> {
    private xim<T> a;
    private xis<? super T> b;
    private xis<Throwable> c;

    /* renamed from: xkw$a */
    static final class a<T> extends xin<T> {
        private xin<? super T> a;
        private xis<? super T> b;
        private xis<Throwable> c;

        a(xin<? super T> xin, xis<? super T> xis, xis<Throwable> xis2) {
            this.a = xin;
            this.b = xis;
            this.c = xis2;
        }

        public final void a(T t) {
            try {
                this.b.call(t);
                this.a.a(t);
            } catch (Throwable th) {
                xiq.b(th);
                a(OnErrorThrowable.a(th, t));
            }
        }

        public final void a(Throwable th) {
            try {
                this.c.call(th);
                this.a.a(th);
            } catch (Throwable th2) {
                xiq.b(th2);
                this.a.a((Throwable) new CompositeException(th, th2));
            }
        }
    }

    public xkw(xim<T> xim, xis<? super T> xis, xis<Throwable> xis2) {
        this.a = xim;
        this.b = xis;
        this.c = xis2;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        a aVar = new a(xin, this.b, this.c);
        xin.a((xip) aVar);
        this.a.a((xin<? super T>) aVar);
    }
}
