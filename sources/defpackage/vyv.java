package defpackage;

import java.util.regex.Pattern;

/* renamed from: vyv reason: default package */
public final class vyv {
    private static final Pattern a = hp.c;

    public static boolean a(String str) {
        return !str.isEmpty() && a.matcher(str).matches();
    }
}
