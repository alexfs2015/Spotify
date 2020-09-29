package defpackage;

/* renamed from: wuq reason: default package */
public final class wuq {
    private static final b a = new b();

    /* renamed from: wuq$a */
    static final class a<T> implements wun<T> {
        private wum a;

        public a(wum wum) {
            this.a = wum;
        }

        public final void call(T t) {
            this.a.call();
        }
    }

    /* renamed from: wuq$b */
    public static final class b<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements wum, wun<T0>, wuo<T0, T1>, wup<T0, T1, T2> {
        public final void call() {
        }

        public final void call(T0 t0) {
        }

        public final void call(T0 t0, T1 t1) {
        }

        public final void call(T0 t0, T1 t1, T2 t2) {
        }

        b() {
        }
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> b<T0, T1, T2, T3, T4, T5, T6, T7, T8> a() {
        return a;
    }

    public static <T> wun<T> a(wum wum) {
        return new a(wum);
    }
}
