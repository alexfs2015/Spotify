package defpackage;

/* renamed from: jua reason: default package */
public final class jua {
    private static jtz a;

    public static synchronized jtz a() {
        jtz jtz;
        synchronized (jua.class) {
            if (a == null) {
                a = new jub();
            }
            jtz = a;
        }
        return jtz;
    }
}
