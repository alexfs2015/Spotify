package defpackage;

import rx.internal.producers.SingleProducer;

/* renamed from: xla reason: default package */
public final class xla<T, R> implements defpackage.xim.a<R> {
    private defpackage.xim.a<T> a;
    private b<? extends R, ? super T> b;

    /* renamed from: xla$a */
    static final class a<T> extends xin<T> {
        private xio<? super T> a;

        a(xio<? super T> xio) {
            this.a = xio;
        }

        public final void a(T t) {
            xio<? super T> xio = this.a;
            xio.setProducer(new SingleProducer(xio, t));
        }

        public final void a(Throwable th) {
            this.a.onError(th);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        a aVar = new a(xin);
        xin.a((xip) aVar);
        try {
            xio xio = (xio) xnx.b(this.b).call(aVar);
            a aVar2 = new a(xio);
            xio.add(aVar2);
            xio.onStart();
            this.a.call(aVar2);
        } catch (Throwable th) {
            xiq.b(th);
            xin.a(th);
        }
    }
}
