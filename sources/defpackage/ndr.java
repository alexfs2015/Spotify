package defpackage;

import java.util.regex.Pattern;

/* renamed from: ndr reason: default package */
public final class ndr {
    private static final Pattern a = Pattern.compile("(?<=\\s)\\.(?=\\w+)");

    public static String a(String str) {
        return str == null ? "" : a.matcher(str).replaceAll("​.");
    }
}
