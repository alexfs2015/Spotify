package defpackage;

/* renamed from: wvi reason: default package */
public final class wvi<T, R> implements a<R> {
    private a<T> a;
    private b<? extends R, ? super T> b;

    public final /* synthetic */ void call(Object obj) {
        wuj wuj;
        wuj wuj2 = (wuj) obj;
        try {
            wuj = (wuj) wzs.a(this.b).call(wuj2);
            wuj.onStart();
            this.a.call(wuj);
        } catch (Throwable th) {
            wul.b(th);
            wuj2.onError(th);
        }
    }

    public wvi(a<T> aVar, b<? extends R, ? super T> bVar) {
        this.a = aVar;
        this.b = bVar;
    }
}
