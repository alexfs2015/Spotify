package defpackage;

import android.content.SharedPreferences;

/* renamed from: cbz reason: default package */
public final class cbz extends cbw<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) ekd.a(new cca(sharedPreferences, str, num));
        } catch (Exception e) {
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return num;
        }
    }
}
