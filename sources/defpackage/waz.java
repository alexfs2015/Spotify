package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;

/* renamed from: waz reason: default package */
public final class waz {
    private static final ImmutableSet<String> a = ImmutableSet.a("addTime", "publishDate", "number", "rowId", "frecencyScore");

    private static String a(String str) {
        String[] split = TextUtils.split(str, "_");
        for (int i = 1; i < split.length; i++) {
            String str2 = split[i];
            StringBuilder sb = new StringBuilder();
            sb.append(str2.substring(0, 1).toUpperCase(Locale.getDefault()));
            sb.append(str2.substring(1));
            split[i] = sb.toString();
        }
        return TextUtils.join("", split);
    }

    public static String a(way way) {
        StringBuilder sb = new StringBuilder(50);
        a(sb, way, 0);
        return sb.toString();
    }

    private static void a(StringBuilder sb, way way, int i) {
        while (true) {
            way c = way.c();
            boolean b = way.b();
            if (a.contains(way.a())) {
                b = !b;
            }
            sb.append(a(way.a()));
            if (b) {
                sb.append(" DESC");
            }
            if (5 > i && c != null) {
                sb.append(',');
                i++;
                way = c;
            } else {
                return;
            }
        }
    }
}
