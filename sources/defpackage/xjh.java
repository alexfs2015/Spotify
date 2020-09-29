package defpackage;

/* renamed from: xjh reason: default package */
public final class xjh<T> implements a<T> {
    private xix<? extends xii<? extends T>> a;

    public xjh(xix<? extends xii<? extends T>> xix) {
        this.a = xix;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        try {
            ((xii) this.a.call()).a(xnu.a(xio));
        } catch (Throwable th) {
            xiq.a(th, (xij<?>) xio);
        }
    }
}
