package defpackage;

/* renamed from: dbw reason: default package */
final class dbw {
    public static boolean a() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
