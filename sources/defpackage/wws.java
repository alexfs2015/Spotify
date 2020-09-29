package defpackage;

/* renamed from: wws reason: default package */
public final class wws<T> implements a<T> {
    private a<T> a;
    private wum b;

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        try {
            this.b.call();
            this.a.call(wui);
        } catch (Throwable th) {
            wul.b(th);
            wui.a(th);
        }
    }

    public wws(a<T> aVar, wum wum) {
        this.a = aVar;
        this.b = wum;
    }
}
