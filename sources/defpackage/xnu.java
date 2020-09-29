package defpackage;

/* renamed from: xnu reason: default package */
public final class xnu {
    public static <T> xio<T> a(final xij<? super T> xij) {
        return new xio<T>() {
            public final void onCompleted() {
                xij.onCompleted();
            }

            public final void onError(Throwable th) {
                xij.onError(th);
            }

            public final void onNext(T t) {
                xij.onNext(t);
            }
        };
    }

    public static <T> xio<T> a(final xio<? super T> xio) {
        return new xio<T>(xio) {
            public final void onCompleted() {
                xio.onCompleted();
            }

            public final void onError(Throwable th) {
                xio.onError(th);
            }

            public final void onNext(T t) {
                xio.onNext(t);
            }
        };
    }
}
