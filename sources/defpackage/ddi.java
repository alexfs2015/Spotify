package defpackage;

/* renamed from: ddi reason: default package */
final class ddi {
    private static final ddg<?> a = new ddh();
    private static final ddg<?> b = c();

    static ddg<?> a() {
        return a;
    }

    static ddg<?> b() {
        ddg<?> ddg = b;
        if (ddg != null) {
            return ddg;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static ddg<?> c() {
        try {
            return (ddg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
