package defpackage;

import java.util.regex.Pattern;

/* renamed from: bzs reason: default package */
public final class bzs {
    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }
}
