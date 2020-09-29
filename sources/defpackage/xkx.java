package defpackage;

/* renamed from: xkx reason: default package */
public final class xkx<T> implements a<T> {
    private a<T> a;
    private xir b;

    public xkx(a<T> aVar, xir xir) {
        this.a = aVar;
        this.b = xir;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        try {
            this.b.call();
            this.a.call(xin);
        } catch (Throwable th) {
            xiq.b(th);
            xin.a(th);
        }
    }
}
