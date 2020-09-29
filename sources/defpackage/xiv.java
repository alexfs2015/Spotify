package defpackage;

/* renamed from: xiv reason: default package */
public final class xiv {
    private static final b a = new b();

    /* renamed from: xiv$a */
    static final class a<T> implements xis<T> {
        private xir a;

        public a(xir xir) {
            this.a = xir;
        }

        public final void call(T t) {
            this.a.call();
        }
    }

    /* renamed from: xiv$b */
    public static final class b<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements xir, xis<T0>, xit<T0, T1>, xiu<T0, T1, T2> {
        b() {
        }

        public final void call() {
        }

        public final void call(T0 t0) {
        }

        public final void call(T0 t0, T1 t1) {
        }

        public final void call(T0 t0, T1 t1, T2 t2) {
        }
    }

    public static <T> xis<T> a(xir xir) {
        return new a(xir);
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> b<T0, T1, T2, T3, T4, T5, T6, T7, T8> a() {
        return a;
    }
}
