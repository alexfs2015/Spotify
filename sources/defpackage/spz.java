package defpackage;

/* renamed from: spz reason: default package */
public final class spz {
    public static <T> gjx<T> a(final gjx<? super T> gjx, final gjx<? super T> gjx2) {
        fay.a(gjx);
        fay.a(gjx2);
        return new gjx<T>() {
            public final boolean a(T t) {
                return gjx.a(t) && gjx2.a(t);
            }

            public final String a() {
                StringBuilder sb = new StringBuilder();
                sb.append(gjx.a());
                sb.append(" AND ");
                sb.append(gjx2.a());
                return sb.toString();
            }
        };
    }
}
