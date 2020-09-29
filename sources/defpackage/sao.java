package defpackage;

import java.util.regex.Pattern;

/* renamed from: sao reason: default package */
public final class sao {
    private static final Pattern a = Pattern.compile("\\+");

    public static String a(String str) {
        return a.matcher(gbm.a(str, far.c)).replaceAll("%20");
    }
}
