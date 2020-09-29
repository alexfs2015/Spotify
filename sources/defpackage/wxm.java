package defpackage;

/* renamed from: wxm reason: default package */
public final class wxm<T> extends wuj<T> {
    private wun<? super T> a;
    private wun<Throwable> b;
    private wum c;

    public wxm(wun<? super T> wun, wun<Throwable> wun2, wum wum) {
        this.a = wun;
        this.b = wun2;
        this.c = wum;
    }

    public final void onNext(T t) {
        this.a.call(t);
    }

    public final void onError(Throwable th) {
        this.b.call(th);
    }

    public final void onCompleted() {
        this.c.call();
    }
}
