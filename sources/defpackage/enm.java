package defpackage;

/* renamed from: enm reason: default package */
final class enm implements eon {
    private static final enm a = new enm();

    private enm() {
    }

    public static enm a() {
        return a;
    }

    public final boolean a(Class<?> cls) {
        return enn.class.isAssignableFrom(cls);
    }

    public final eom b(Class<?> cls) {
        if (!enn.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (eom) enn.a(cls.asSubclass(enn.class)).a(e.c);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
