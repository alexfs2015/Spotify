package defpackage;

/* renamed from: hq reason: default package */
public final class hq {

    /* renamed from: hq$a */
    public interface a<T> {
        T a();

        boolean a(T t);
    }

    /* renamed from: hq$b */
    public static class b<T> implements a<T> {
        private final Object[] a;
        private int b;

        public b(int i) {
            if (i > 0) {
                this.a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        public T a() {
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

        public boolean a(T t) {
            boolean z;
            int i = 0;
            while (true) {
                if (i >= this.b) {
                    z = false;
                    break;
                } else if (this.a[i] == t) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                int i2 = this.b;
                Object[] objArr = this.a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = t;
                this.b = i2 + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }

    /* renamed from: hq$c */
    public static class c<T> extends b<T> {
        private final Object a = new Object();

        public c(int i) {
            super(i);
        }

        public final T a() {
            T a2;
            synchronized (this.a) {
                a2 = super.a();
            }
            return a2;
        }

        public final boolean a(T t) {
            boolean a2;
            synchronized (this.a) {
                a2 = super.a(t);
            }
            return a2;
        }
    }
}
