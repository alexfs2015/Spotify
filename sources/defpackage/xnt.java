package defpackage;

/* renamed from: xnt reason: default package */
public final class xnt<T> extends xio<T> {
    private final xij<T> a;

    public xnt(xio<? super T> xio) {
        this(xio, true);
    }

    public xnt(xio<? super T> xio, boolean z) {
        super(xio, z);
        this.a = new xns(xio);
    }

    public final void onCompleted() {
        this.a.onCompleted();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    public final void onNext(T t) {
        this.a.onNext(t);
    }
}
