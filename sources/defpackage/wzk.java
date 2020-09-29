package defpackage;

import rx.exceptions.OnErrorNotImplementedException;

/* renamed from: wzk reason: default package */
public final class wzk {
    private static final wue<Object> a = new wue<Object>() {
        public final void onCompleted() {
        }

        public final void onNext(Object obj) {
        }

        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };

    public static <T> wue<T> a() {
        return a;
    }
}
