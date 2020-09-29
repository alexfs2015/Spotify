package defpackage;

/* renamed from: ddd reason: default package */
final class ddd {
    private static final Class<?> a = b();

    public static dde a() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (dde) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return dde.a;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
