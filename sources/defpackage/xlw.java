package defpackage;

/* renamed from: xlw reason: default package */
public final class xlw {
    private static final int a;
    private static final boolean b;

    static {
        int c = c();
        a = c;
        b = c != 0;
    }

    public static boolean a() {
        return b;
    }

    public static int b() {
        return a;
    }

    private static int c() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
