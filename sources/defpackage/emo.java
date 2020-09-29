package defpackage;

/* renamed from: emo reason: default package */
final class emo {
    private static final emm<?> a = new emn();
    private static final emm<?> b = c();

    private static emm<?> c() {
        try {
            return (emm) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static emm<?> a() {
        return a;
    }

    static emm<?> b() {
        emm<?> emm = b;
        if (emm != null) {
            return emm;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
