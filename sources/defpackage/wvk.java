package defpackage;

/* renamed from: wvk reason: default package */
public interface wvk<T> {
    public static final wvk a = new wvk() {
        public final int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final boolean a(Object obj, Object obj2) {
            return obj == obj2 || (obj != null && obj.equals(obj2));
        }
    };

    int a(T t);

    boolean a(T t, T t2);
}
