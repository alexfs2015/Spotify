package defpackage;

import rx.exceptions.OnErrorNotImplementedException;

/* renamed from: xnp reason: default package */
public final class xnp {
    private static final xij<Object> a = new xij<Object>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        public final void onNext(Object obj) {
        }
    };

    public static <T> xij<T> a() {
        return a;
    }
}
