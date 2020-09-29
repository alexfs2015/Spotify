package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: cbo reason: default package */
public final class cbo {
    private static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) ejm.a(new cbp(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
