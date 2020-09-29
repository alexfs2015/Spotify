package defpackage;

/* renamed from: eox reason: default package */
final class eox {
    private static final eov a = c();
    private static final eov b = new eow();

    static eov a() {
        return a;
    }

    static eov b() {
        return b;
    }

    private static eov c() {
        try {
            return (eov) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
