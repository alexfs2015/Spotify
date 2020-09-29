package defpackage;

/* renamed from: whe reason: default package */
public interface whe<T> {
    public static final whe a = new whe() {
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
