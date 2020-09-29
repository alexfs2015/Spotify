package defpackage;

import android.content.SharedPreferences;

/* renamed from: cbm reason: default package */
public final class cbm extends cbf<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) ejm.a(new cbn(sharedPreferences, str, str2));
        } catch (Exception e) {
            String str3 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            return str2;
        }
    }
}
