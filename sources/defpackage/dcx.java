package defpackage;

/* renamed from: dcx reason: default package */
final class dcx implements ddy {
    private static final dcx a = new dcx();

    private dcx() {
    }

    public static dcx a() {
        return a;
    }

    public final boolean a(Class<?> cls) {
        return dcy.class.isAssignableFrom(cls);
    }

    public final ddx b(Class<?> cls) {
        if (!dcy.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (ddx) dcy.a(cls.asSubclass(dcy.class)).a(e.c);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
