package defpackage;

import android.os.Build;

/* renamed from: fox reason: default package */
public final class fox {
    private static String a = Build.BRAND;
    private static String b = Build.MANUFACTURER;

    public static boolean a() {
        String str = a;
        if (str == null || b == null) {
            return false;
        }
        String str2 = "Samsung";
        return str.compareToIgnoreCase(str2) == 0 || b.compareToIgnoreCase(str2) == 0;
    }
}
