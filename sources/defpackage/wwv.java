package defpackage;

import rx.internal.producers.SingleProducer;

/* renamed from: wwv reason: default package */
public final class wwv<T, R> implements defpackage.wuh.a<R> {
    private defpackage.wuh.a<T> a;
    private b<? extends R, ? super T> b;

    /* renamed from: wwv$a */
    static final class a<T> extends wui<T> {
        private wuj<? super T> a;

        a(wuj<? super T> wuj) {
            this.a = wuj;
        }

        public final void a(T t) {
            wuj<? super T> wuj = this.a;
            wuj.setProducer(new SingleProducer(wuj, t));
        }

        public final void a(Throwable th) {
            this.a.onError(th);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        a aVar = new a(wui);
        wui.a((wuk) aVar);
        try {
            wuj wuj = (wuj) wzs.b(this.b).call(aVar);
            a aVar2 = new a(wuj);
            wuj.add(aVar2);
            wuj.onStart();
            this.a.call(aVar2);
        } catch (Throwable th) {
            wul.b(th);
            wui.a(th);
        }
    }
}
