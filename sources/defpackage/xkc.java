package defpackage;

import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: xkc reason: default package */
public final class xkc<T, U> implements b<T, T>, xiz<U, U, Boolean> {
    final xiy<? super T, ? extends U> a;
    final xiz<? super U, ? super U, Boolean> b = this;

    /* renamed from: xkc$a */
    static final class a {
        static final xkc<?, ?> a = new xkc<>(Identity.INSTANCE);
    }

    public xkc(xiy<? super T, ? extends U> xiy) {
        this.a = xiy;
    }

    public static <T> xkc<T, T> a() {
        return a.a;
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        return new xio<T>(xio) {
            private U a;
            private boolean b;

            public final void onCompleted() {
                xio.onCompleted();
            }

            public final void onError(Throwable th) {
                xio.onError(th);
            }

            public final void onNext(T t) {
                try {
                    U call = xkc.this.a.call(t);
                    U u = this.a;
                    this.a = call;
                    if (this.b) {
                        try {
                            if (!((Boolean) xkc.this.b.call(u, call)).booleanValue()) {
                                xio.onNext(t);
                            } else {
                                request(1);
                            }
                        } catch (Throwable th) {
                            xiq.a(th, xio, call);
                        }
                    } else {
                        this.b = true;
                        xio.onNext(t);
                    }
                } catch (Throwable th2) {
                    xiq.a(th2, xio, t);
                }
            }
        };
    }

    public final /* synthetic */ Object call(Object obj, Object obj2) {
        return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
    }
}
