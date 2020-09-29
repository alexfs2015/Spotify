package defpackage;

/* renamed from: den reason: default package */
final class den {
    private static final del a = c();
    private static final del b = new dem();

    static del a() {
        return a;
    }

    static del b() {
        return b;
    }

    private static del c() {
        try {
            return (del) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
