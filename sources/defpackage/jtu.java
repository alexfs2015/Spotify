package defpackage;

/* renamed from: jtu reason: default package */
public final class jtu {
    private static final String[] a = {"Various", "Various Artists", "Various Artist", "Various Artists.", "Various Artistes"};

    public static boolean a(String str) {
        String[] strArr = a;
        for (int i = 0; i < 5; i++) {
            if (strArr[i].equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
