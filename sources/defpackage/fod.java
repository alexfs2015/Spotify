package defpackage;

import android.os.Build;

/* renamed from: fod reason: default package */
public final class fod {
    private static String a = Build.BRAND;
    private static String b = Build.MANUFACTURER;

    public static boolean a() {
        String str = a;
        if (str == null || b == null) {
            return false;
        }
        String str2 = "Samsung";
        if (str.compareToIgnoreCase(str2) == 0 || b.compareToIgnoreCase(str2) == 0) {
            return true;
        }
        return false;
    }
}
