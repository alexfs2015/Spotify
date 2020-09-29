package defpackage;

/* renamed from: emv reason: default package */
final class emv implements enw {
    private static final emv a = new emv();

    private emv() {
    }

    public static emv a() {
        return a;
    }

    public final boolean a(Class<?> cls) {
        return emw.class.isAssignableFrom(cls);
    }

    public final env b(Class<?> cls) {
        if (!emw.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (env) emw.a(cls.asSubclass(emw.class)).a(e.c);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
