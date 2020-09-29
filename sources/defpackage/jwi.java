package defpackage;

/* renamed from: jwi reason: default package */
public final class jwi {
    private static jwh a;

    public static synchronized jwh a() {
        jwh jwh;
        synchronized (jwi.class) {
            if (a == null) {
                a = new jwj();
            }
            jwh = a;
        }
        return jwh;
    }
}
