package defpackage;

/* renamed from: enf reason: default package */
final class enf {
    private static final end<?> a = new ene();
    private static final end<?> b = c();

    static end<?> a() {
        return a;
    }

    static end<?> b() {
        end<?> end = b;
        if (end != null) {
            return end;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static end<?> c() {
        try {
            return (end) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
