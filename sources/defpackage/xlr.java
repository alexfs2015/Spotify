package defpackage;

/* renamed from: xlr reason: default package */
public final class xlr<T> extends xio<T> {
    private xis<? super T> a;
    private xis<Throwable> b;
    private xir c;

    public xlr(xis<? super T> xis, xis<Throwable> xis2, xir xir) {
        this.a = xis;
        this.b = xis2;
        this.c = xir;
    }

    public final void onCompleted() {
        this.c.call();
    }

    public final void onError(Throwable th) {
        this.b.call(th);
    }

    public final void onNext(T t) {
        this.a.call(t);
    }
}
