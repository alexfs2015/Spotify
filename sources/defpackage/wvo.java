package defpackage;

/* renamed from: wvo reason: default package */
public final class wvo<T> implements a<T> {
    private final Throwable a;

    public final /* synthetic */ void call(Object obj) {
        ((wuj) obj).onError(this.a);
    }

    public wvo(Throwable th) {
        this.a = th;
    }
}
