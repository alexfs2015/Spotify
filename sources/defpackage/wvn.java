package defpackage;

/* renamed from: wvn reason: default package */
public final class wvn {
    private static final wyc a = wyd.a(wvn.class);

    private wvn() {
    }

    public static <T> T a(T t, Object obj) {
        return t instanceof wvo ? ((wvo) t).b(obj) : t;
    }

    public static boolean a(Object obj) {
        if (obj instanceof wvo) {
            return ((wvo) obj).B();
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
}
