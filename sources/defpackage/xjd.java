package defpackage;

/* renamed from: xjd reason: default package */
public final class xjd {
    public static <T0, T1, R> xjc<R> a(final xiz<? super T0, ? super T1, ? extends R> xiz) {
        return new xjc<R>() {
            public final R a(Object... objArr) {
                if (objArr.length == 2) {
                    return xiz.call(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Func2 expecting 2 arguments.");
            }
        };
    }

    public static <T0, T1, T2, R> xjc<R> a(final xja<? super T0, ? super T1, ? super T2, ? extends R> xja) {
        return new xjc<R>() {
            public final R a(Object... objArr) {
                if (objArr.length == 3) {
                    return xja.call(objArr[0], objArr[1], objArr[2]);
                }
                throw new IllegalArgumentException("Func3 expecting 3 arguments.");
            }
        };
    }
}
