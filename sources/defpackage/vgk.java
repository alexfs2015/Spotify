package defpackage;

/* renamed from: vgk reason: default package */
public final class vgk {
    private static boolean a = true;

    public static <T> void a(Class<T> cls, T t) {
        if (a && t.getClass() != cls) {
            StringBuilder sb = new StringBuilder("You are not allowed to subclass ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}
