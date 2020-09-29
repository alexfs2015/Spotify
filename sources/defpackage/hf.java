package defpackage;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: hf reason: default package */
public final class hf {
    private static Method a;
    private static Method b;

    static {
        String str = "addLikelySubtags";
        String str2 = "libcore.icu.ICU";
        if (VERSION.SDK_INT < 21) {
            try {
                Class cls = Class.forName(str2);
                if (cls != null) {
                    a = cls.getMethod("getScript", new Class[]{String.class});
                    b = cls.getMethod(str, new Class[]{String.class});
                }
            } catch (Exception unused) {
                a = null;
                b = null;
            }
        } else if (VERSION.SDK_INT < 24) {
            try {
                b = Class.forName(str2).getMethod(str, new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private static String a(String str) {
        try {
            if (a != null) {
                return (String) a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    public static String a(Locale locale) {
        if (VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) b.invoke(null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String b2 = b(locale);
            if (b2 != null) {
                return a(b2);
            }
            return null;
        }
    }

    private static String b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (b != null) {
                return (String) b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }
}
