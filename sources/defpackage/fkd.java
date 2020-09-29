package defpackage;

/* renamed from: fkd reason: default package */
final class fkd {
    private static Class<?> a = b();

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static fke a() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (fke) cls.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return fke.a;
    }
}
