package defpackage;

/* renamed from: wwb reason: default package */
public final class wwb<T> implements b<T, T> {

    /* renamed from: wwb$a */
    static final class a {
        static final wwb<?> a = new wwb<>();
    }

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        AnonymousClass1 r0 = new wuj<T>() {
            public final void onNext(T t) {
            }

            public final void onCompleted() {
                wuj.onCompleted();
            }

            public final void onError(Throwable th) {
                wuj.onError(th);
            }
        };
        wuj.add(r0);
        return r0;
    }

    public static <T> wwb<T> a() {
        return a.a;
    }

    wwb() {
    }
}
