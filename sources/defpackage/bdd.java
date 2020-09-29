package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: bdd reason: default package */
public final class bdd {
    private static int a = 0;
    private static boolean b = true;

    public static void a(String str, String str2) {
    }

    public static void b(String str, String str2) {
    }

    public static void c(String str, String str2) {
    }

    public static void a(String str, String str2, Throwable th) {
        if (!b) {
            a(str2, th);
        }
    }

    public static void d(String str, String str2) {
        Log.e(str, str2);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!b) {
            Log.e(str, a(str2, th));
        }
        Log.e(str, str2, th);
    }

    private static String a(String str, Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" - ");
        sb.append(message);
        return sb.toString();
    }
}
