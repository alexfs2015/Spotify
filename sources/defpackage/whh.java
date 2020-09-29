package defpackage;

/* renamed from: whh reason: default package */
public final class whh {
    private static final wjw a = wjx.a(whh.class);

    public static <T> T a(T t, Object obj) {
        return t instanceof whi ? ((whi) t).b(obj) : t;
    }

    public static boolean a(Object obj) {
        if (obj instanceof whi) {
            return ((whi) obj).B();
        }
        return false;
    }

    public static void b(Object obj) {
        try {
            a(obj);
        } catch (Throwable th) {
            a.c("Failed to release a message: {}", obj, th);
        }
    }

    private whh() {
    }
}
