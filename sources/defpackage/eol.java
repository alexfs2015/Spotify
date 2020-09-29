package defpackage;

/* renamed from: eol reason: default package */
final class eol {
    private static final eoj a = c();
    private static final eoj b = new eok();

    static eoj a() {
        return a;
    }

    static eoj b() {
        return b;
    }

    private static eoj c() {
        try {
            return (eoj) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
