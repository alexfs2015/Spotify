package defpackage;

import android.content.SharedPreferences;

/* renamed from: cbx reason: default package */
public final class cbx extends cbw<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) ekd.a(new cby(sharedPreferences, str, bool));
        } catch (Exception e) {
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return bool;
        }
    }
}
