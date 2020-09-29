package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: bzz reason: default package */
public final class bzz {
    static {
        String[] strArr = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    }

    public static boolean a(Context context, Throwable th) {
        return b(context, th);
    }

    private static boolean b(Context context, Throwable th) {
        try {
            bxo.a(context);
            bxo.a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
