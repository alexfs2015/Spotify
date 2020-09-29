package defpackage;

/* renamed from: xjt reason: default package */
public final class xjt<T> implements a<T> {
    private final Throwable a;

    public xjt(Throwable th) {
        this.a = th;
    }

    public final /* synthetic */ void call(Object obj) {
        ((xio) obj).onError(this.a);
    }
}
