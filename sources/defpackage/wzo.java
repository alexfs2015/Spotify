package defpackage;

/* renamed from: wzo reason: default package */
public final class wzo<T> extends wuj<T> {
    private final wue<T> a;

    public wzo(wuj<? super T> wuj) {
        this(wuj, true);
    }

    public wzo(wuj<? super T> wuj, boolean z) {
        super(wuj, z);
        this.a = new wzn(wuj);
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
