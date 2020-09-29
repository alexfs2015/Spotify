package defpackage;

/* renamed from: xad reason: default package */
public class xad<T, R> extends xae<T, R> {
    private final wzn<T> a;
    private final xae<T, R> b;

    public xad(final xae<T, R> xae) {
        super(new a<R>() {
            public final /* synthetic */ void call(Object obj) {
                xae.this.a((wuj) obj);
            }
        });
        this.b = xae;
        this.a = new wzn<>(xae);
    }

    public void onCompleted() {
        this.a.onCompleted();
    }

    public void onError(Throwable th) {
        this.a.onError(th);
    }

    public void onNext(T t) {
        this.a.onNext(t);
    }
}
