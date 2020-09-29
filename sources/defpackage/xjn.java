package defpackage;

/* renamed from: xjn reason: default package */
public final class xjn<T, R> implements a<R> {
    private a<T> a;
    private b<? extends R, ? super T> b;

    public xjn(a<T> aVar, b<? extends R, ? super T> bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio;
        xio xio2 = (xio) obj;
        try {
            xio = (xio) xnx.a(this.b).call(xio2);
            xio.onStart();
            this.a.call(xio);
        } catch (Throwable th) {
            xiq.b(th);
            xio2.onError(th);
        }
    }
}
