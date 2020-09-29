package defpackage;

/* renamed from: dbf reason: default package */
final class dbf {
    public static boolean a() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
