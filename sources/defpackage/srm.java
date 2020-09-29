package defpackage;

import java.util.regex.Pattern;

/* renamed from: srm reason: default package */
public final class srm {
    private static final Pattern a = Pattern.compile("^\\s+");

    public static String a(String str) {
        return (str.isEmpty() || !Character.isWhitespace(str.charAt(0))) ? str : a.matcher(str).replaceAll("");
    }
}
