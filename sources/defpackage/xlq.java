package defpackage;

/* renamed from: xlq reason: default package */
public final class xlq<T> implements xij<T> {
    private xis<? super T> a;
    private xis<? super Throwable> b;
    private xir c;

    public xlq(xis<? super T> xis, xis<? super Throwable> xis2, xir xir) {
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
