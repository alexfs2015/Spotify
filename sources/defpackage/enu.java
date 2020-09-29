package defpackage;

/* renamed from: enu reason: default package */
final class enu {
    private static final ens a = c();
    private static final ens b = new ent();

    static ens a() {
        return a;
    }

    static ens b() {
        return b;
    }

    private static ens c() {
        try {
            return (ens) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
