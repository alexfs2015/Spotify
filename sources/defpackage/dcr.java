package defpackage;

/* renamed from: dcr reason: default package */
final class dcr {
    private static final dcp<?> a = new dcq();
    private static final dcp<?> b = c();

    static dcp<?> a() {
        return a;
    }

    static dcp<?> b() {
        dcp<?> dcp = b;
        if (dcp != null) {
            return dcp;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static dcp<?> c() {
        try {
            return (dcp) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
