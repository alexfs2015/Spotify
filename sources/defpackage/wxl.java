package defpackage;

/* renamed from: wxl reason: default package */
public final class wxl<T> implements wue<T> {
    private wun<? super T> a;
    private wun<? super Throwable> b;
    private wum c;

    public wxl(wun<? super T> wun, wun<? super Throwable> wun2, wum wum) {
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
