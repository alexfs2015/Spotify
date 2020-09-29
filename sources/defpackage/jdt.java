package defpackage;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: jdt reason: default package */
public final class jdt {
    private static final Pattern a = Pattern.compile("user:([^:]+)");

    public static String a(String str) {
        StringBuilder sb = new StringBuilder("spotify:user:");
        sb.append(Uri.encode(str));
        sb.append(":followers");
        return sb.toString();
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder("spotify:user:");
        sb.append(Uri.encode(str));
        sb.append(":following");
        return sb.toString();
    }

    public static String c(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder("spotify:user:");
        sb.append(Uri.encode(str));
        return e(sb.toString());
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":playlists");
        return sb.toString();
    }

    public static String f(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":artists");
        return sb.toString();
    }
}
