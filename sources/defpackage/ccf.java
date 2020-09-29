package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ccf reason: default package */
public final class ccf {
    private static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) ekd.a(new ccg(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
