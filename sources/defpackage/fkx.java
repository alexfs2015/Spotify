package defpackage;

/* renamed from: fkx reason: default package */
final class fkx {
    private static Class<?> a = b();

    public static fky a() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (fky) cls.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return fky.a;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
