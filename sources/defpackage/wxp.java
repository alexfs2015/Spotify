package defpackage;

/* renamed from: wxp reason: default package */
public final class wxp<T> extends wuj<T> {
    private wue<? super T> a;

    public wxp(wue<? super T> wue) {
        this.a = wue;
    }

    public final void onNext(T t) {
        this.a.onNext(t);
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    public final void onCompleted() {
        this.a.onCompleted();
    }
}
