package defpackage;

import java.util.regex.Pattern;

/* renamed from: caj reason: default package */
public final class caj {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
