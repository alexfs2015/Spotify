package defpackage;

/* renamed from: wuy reason: default package */
public final class wuy {
    public static <T0, T1, R> wux<R> a(final wuu<? super T0, ? super T1, ? extends R> wuu) {
        return new wux<R>() {
            public final R a(Object... objArr) {
                if (objArr.length == 2) {
                    return wuu.call(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Func2 expecting 2 arguments.");
            }
        };
    }

    public static <T0, T1, T2, R> wux<R> a(final wuv<? super T0, ? super T1, ? super T2, ? extends R> wuv) {
        return new wux<R>() {
            public final R a(Object... objArr) {
                if (objArr.length == 3) {
                    return wuv.call(objArr[0], objArr[1], objArr[2]);
                }
                throw new IllegalArgumentException("Func3 expecting 3 arguments.");
            }
        };
    }
}
