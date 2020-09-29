package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: gct reason: default package */
public final class gct implements gcv {
    private static final Pattern a = Pattern.compile("spotify:user:([^:|\" ]+)");
    private static final Pattern b = Pattern.compile("spotify%3Auser%3A([^\\%]+)");
    private static final Pattern c = Pattern.compile("searchview/.*username=([^&]+)");

    private static String a(String str, String str2, Pattern pattern, String str3) {
        if (str.contains(str2)) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                try {
                    str = str.replaceAll(matcher.group(1), str3);
                } catch (PatternSyntaxException unused) {
                }
            }
        }
        return str;
    }

    public final String a(String str, Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            String valueOf = String.valueOf(String.valueOf(obj));
            String str2 = "AnonymizedMarvin";
            String str3 = "spotify%3Auser%3A";
            String str4 = "username=";
            String a2 = a(a(a(valueOf, "spotify:user:", a, str2), str3, b, str2), str4, c, str2);
            if (a2.equals(valueOf)) {
                objArr[i] = obj;
            } else {
                objArr[i] = a2;
            }
        }
        return String.format(Locale.US, str, objArr);
    }
}
