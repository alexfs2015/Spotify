package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: lvy reason: default package */
public final class lvy {
    private static final Pattern a = Pattern.compile("^spotify:internal:assisted-curation:([^:]+):([\\w:]+)");

    public static boolean a(String str) {
        return a.matcher(str).matches();
    }

    public static String b(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        Assertion.a("Bad uri");
        return null;
    }

    public static String c(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(2);
        }
        Assertion.a("Bad uri");
        return null;
    }
}
