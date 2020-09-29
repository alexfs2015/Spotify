package defpackage;

/* renamed from: dfb reason: default package */
final class dfb {
    private static final dez a = c();
    private static final dez b = new dfa();

    static dez a() {
        return a;
    }

    static dez b() {
        return b;
    }

    private static dez c() {
        try {
            return (dez) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
