package defpackage;

/* renamed from: xoh reason: default package */
public class xoh<T, R> extends xoi<T, R> {
    private final xns<T> a;
    private final xoi<T, R> b;

    public xoh(final xoi<T, R> xoi) {
        super(new a<R>() {
            public final /* synthetic */ void call(Object obj) {
                xoi.this.a((xio) obj);
            }
        });
        this.b = xoi;
        this.a = new xns<>(xoi);
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
