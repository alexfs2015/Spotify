package defpackage;

import android.content.SharedPreferences;

/* renamed from: ccb reason: default package */
public final class ccb extends cbw<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) ekd.a(new ccc(sharedPreferences, str, l));
        } catch (Exception e) {
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return l;
        }
    }
}
