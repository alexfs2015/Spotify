package defpackage;

/* renamed from: xkg reason: default package */
public final class xkg<T> implements b<T, T> {

    /* renamed from: xkg$a */
    static final class a {
        static final xkg<?> a = new xkg<>();
    }

    xkg() {
    }

    public static <T> xkg<T> a() {
        return a.a;
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        AnonymousClass1 r0 = new xio<T>() {
            public final void onCompleted() {
                xio.onCompleted();
            }

            public final void onError(Throwable th) {
                xio.onError(th);
            }

            public final void onNext(T t) {
            }
        };
        xio.add(r0);
        return r0;
    }
}
