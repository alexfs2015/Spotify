package defpackage;

/* renamed from: dcm reason: default package */
final class dcm {
    private static final Class<?> a = b();

    public static dcn a() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (dcn) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return dcn.a;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
