package defpackage;

/* renamed from: ed reason: default package */
final class ed {

    /* renamed from: ed$a */
    interface a<T> {
        T a();

        void a(T[] tArr, int i);

        boolean a(T t);
    }

    /* renamed from: ed$b */
    static class b<T> implements a<T> {
        private final Object[] a = new Object[256];
        private int b;

        b(int i) {
        }

        public final T a() {
            int i = this.b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.b = i - 1;
            return t;
        }

        public final void a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.b;
                Object[] objArr = this.a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.b = i3 + 1;
                }
            }
        }

        public final boolean a(T t) {
            int i = this.b;
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
    }
}
