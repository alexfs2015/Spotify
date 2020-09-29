package defpackage;

/* renamed from: wvc reason: default package */
public final class wvc<T> implements a<T> {
    private wus<? extends wud<? extends T>> a;

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        try {
            ((wud) this.a.call()).a(wzp.a(wuj));
        } catch (Throwable th) {
            wul.a(th, (wue<?>) wuj);
        }
    }

    public wvc(wus<? extends wud<? extends T>> wus) {
        this.a = wus;
    }
}
