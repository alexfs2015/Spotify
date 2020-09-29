package defpackage;

/* renamed from: tag reason: default package */
public final class tag {
    public static <T> gli<T> a(final gli<? super T> gli, final gli<? super T> gli2) {
        fbp.a(gli);
        fbp.a(gli2);
        return new gli<T>() {
            public final String a() {
                StringBuilder sb = new StringBuilder();
                sb.append(gli.a());
                sb.append(" AND ");
                sb.append(gli2.a());
                return sb.toString();
            }

            public final boolean a(T t) {
                return gli.a(t) && gli2.a(t);
            }
        };
    }
}
