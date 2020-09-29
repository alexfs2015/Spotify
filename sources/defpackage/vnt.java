package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;

/* renamed from: vnt reason: default package */
public final class vnt {
    private static final ImmutableSet<String> a = ImmutableSet.a("addTime", "publishDate", "number", "rowId", "frecencyScore");

    public static String a(vns vns) {
        StringBuilder sb = new StringBuilder(50);
        a(sb, vns, 0);
        return sb.toString();
    }

    private static void a(StringBuilder sb, vns vns, int i) {
        while (true) {
            vns c = vns.c();
            boolean b = vns.b();
            if (a.contains(vns.a())) {
                b = !b;
            }
            sb.append(a(vns.a()));
            if (b) {
                sb.append(" DESC");
            }
            if (5 > i && c != null) {
                sb.append(',');
                i++;
                vns = c;
            } else {
                return;
            }
        }
    }

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
}
