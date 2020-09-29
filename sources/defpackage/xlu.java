package defpackage;

/* renamed from: xlu reason: default package */
public final class xlu<T> extends xio<T> {
    private xij<? super T> a;

    public xlu(xij<? super T> xij) {
        this.a = xij;
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
