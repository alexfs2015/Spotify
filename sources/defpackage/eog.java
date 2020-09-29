package defpackage;

/* renamed from: eog reason: default package */
final class eog {
    private static final eoe a = c();
    private static final eoe b = new eof();

    static eoe a() {
        return a;
    }

    static eoe b() {
        return b;
    }

    private static eoe c() {
        try {
            return (eoe) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
