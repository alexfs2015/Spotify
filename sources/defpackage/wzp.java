package defpackage;

/* renamed from: wzp reason: default package */
public final class wzp {
    public static <T> wuj<T> a(final wue<? super T> wue) {
        return new wuj<T>() {
            public final void onCompleted() {
                wue.onCompleted();
            }

            public final void onError(Throwable th) {
                wue.onError(th);
            }

            public final void onNext(T t) {
                wue.onNext(t);
            }
        };
    }

    public static <T> wuj<T> a(final wuj<? super T> wuj) {
        return new wuj<T>(wuj) {
            public final void onCompleted() {
                wuj.onCompleted();
            }

            public final void onError(Throwable th) {
                wuj.onError(th);
            }

            public final void onNext(T t) {
                wuj.onNext(t);
            }
        };
    }
}
