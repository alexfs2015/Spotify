package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.regex.Pattern;

/* renamed from: wjo reason: default package */
public final class wjo {
    private static final wjw a = wjx.a(wjo.class);
    private static final Pattern b = Pattern.compile("-?[0-9]+");

    public static String b(String str) {
        return a(str, (String) null);
    }

    public static String a(final String str, String str2) {
        if (str == null) {
            throw new NullPointerException("key");
        } else if (!str.isEmpty()) {
            String str3 = null;
            try {
                if (System.getSecurityManager() == null) {
                    str3 = System.getProperty(str);
                } else {
                    str3 = (String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                        public final /* synthetic */ Object run() {
                            return System.getProperty(str);
                        }
                    });
                }
            } catch (Exception e) {
                a.c("Unable to retrieve a system property '{}'; default values will be used.", str, e);
            }
            return str3 == null ? str2 : str3;
        } else {
            throw new IllegalArgumentException("key must not be empty.");
        }
    }

    private wjo() {
    }

    public static boolean a(String str) {
        return a(str, (String) null) != null;
    }

    public static boolean a(String str, boolean z) {
        String a2 = a(str, (String) null);
        if (a2 == null) {
            return z;
        }
        String lowerCase = a2.trim().toLowerCase();
        if (lowerCase.isEmpty() || "true".equals(lowerCase) || "yes".equals(lowerCase) || "1".equals(lowerCase)) {
            return true;
        }
        if ("false".equals(lowerCase) || "no".equals(lowerCase) || Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(lowerCase)) {
            return false;
        }
        a.b("Unable to parse the boolean system property '{}':{} - using the default value: {}", str, lowerCase, Boolean.valueOf(z));
        return z;
    }

    public static int a(String str, int i) {
        String a2 = a(str, (String) null);
        if (a2 == null) {
            return i;
        }
        String lowerCase = a2.trim().toLowerCase();
        if (b.matcher(lowerCase).matches()) {
            try {
                return Integer.parseInt(lowerCase);
            } catch (Exception unused) {
            }
        }
        a.b("Unable to parse the integer system property '{}':{} - using the default value: {}", str, lowerCase, Integer.valueOf(i));
        return i;
    }

    public static long a(String str, long j) {
        String a2 = a(str, (String) null);
        if (a2 == null) {
            return j;
        }
        String lowerCase = a2.trim().toLowerCase();
        if (b.matcher(lowerCase).matches()) {
            try {
                return Long.parseLong(lowerCase);
            } catch (Exception unused) {
            }
        }
        a.b("Unable to parse the long integer system property '{}':{} - using the default value: {}", str, lowerCase, Long.valueOf(j));
        return j;
    }
}
