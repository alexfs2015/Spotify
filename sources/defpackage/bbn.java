package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bbn reason: default package */
public final class bbn {
    private static final Pattern a = Pattern.compile("^NOTE(( |\t).*)?$");

    public static long a(String str) {
        String[] b = ben.b(str, "\\.");
        long j = 0;
        for (String parseLong : ben.a(b[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (b.length == 2) {
            j2 += Long.parseLong(b[1]);
        }
        return j2 * 1000;
    }

    public static void a(bea bea) {
        int i = bea.b;
        if (!b(bea)) {
            bea.c(i);
            StringBuilder sb = new StringBuilder("Expected WEBVTT. Got ");
            sb.append(bea.r());
            throw new ParserException(sb.toString());
        }
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static boolean b(bea bea) {
        String r = bea.r();
        return r != null && r.startsWith("WEBVTT");
    }

    public static Matcher c(bea bea) {
        String r;
        while (true) {
            String r2 = bea.r();
            if (r2 == null) {
                return null;
            }
            if (a.matcher(r2).matches()) {
                do {
                    r = bea.r();
                    if (r == null) {
                        break;
                    }
                } while (!r.isEmpty());
            } else {
                Matcher matcher = bbl.a.matcher(r2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
