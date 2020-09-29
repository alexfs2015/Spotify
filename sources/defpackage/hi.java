package defpackage;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: hi reason: default package */
public final class hi {
    private static final Locale a;

    static {
        String str = "";
        a = new Locale(str, str);
    }

    public static int a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(a)) {
            String a2 = hf.a(locale);
            if (a2 == null) {
                byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
                if (directionality == 1 || directionality == 2) {
                    return 1;
                }
                return 0;
            } else if (a2.equalsIgnoreCase("Arab") || a2.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
