package defpackage;

/* renamed from: dek reason: default package */
final class dek {
    private static final dei a = c();
    private static final dei b = new dej();

    static dei a() {
        return a;
    }

    static dei b() {
        return b;
    }

    private static dei c() {
        try {
            return (dei) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
