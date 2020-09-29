package defpackage;

/* renamed from: ddw reason: default package */
final class ddw {
    private static final ddu a = c();
    private static final ddu b = new ddv();

    static ddu a() {
        return a;
    }

    static ddu b() {
        return b;
    }

    private static ddu c() {
        try {
            return (ddu) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
