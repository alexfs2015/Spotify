package defpackage;

import android.util.Log;

@cey
/* renamed from: cow reason: default package */
public class cow {
    public static void a(String str) {
        if (a(6)) {
            Log.e("Ads", str);
        }
    }

    public static void a(String str, Throwable th) {
        if (a(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static boolean a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    private static String b(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void b(String str, Throwable th) {
        if (a(5)) {
            if (th != null) {
                b(str);
                a(5);
                return;
            }
            b(str);
            a(5);
        }
    }
}
