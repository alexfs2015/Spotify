package defpackage;

import java.util.regex.Pattern;

/* renamed from: vlp reason: default package */
public final class vlp {
    private static final Pattern a = hp.c;

    public static boolean a(String str) {
        return !str.isEmpty() && a.matcher(str).matches();
    }
}
