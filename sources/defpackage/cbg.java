package defpackage;

import android.content.SharedPreferences;

/* renamed from: cbg reason: default package */
public final class cbg extends cbf<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) ejm.a(new cbh(sharedPreferences, str, bool));
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
