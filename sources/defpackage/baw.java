package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: baw reason: default package */
public final class baw {
    private static final Pattern a = Pattern.compile("^NOTE(( |\t).*)?$");

    public static boolean b(bdj bdj) {
        String r = bdj.r();
        return r != null && r.startsWith("WEBVTT");
    }

    public static long a(String str) {
        String[] b = bdw.b(str, "\\.");
        long j = 0;
        for (String parseLong : bdw.a(b[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (b.length == 2) {
            j2 += Long.parseLong(b[1]);
        }
        return j2 * 1000;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static Matcher c(bdj bdj) {
        String r;
        while (true) {
            String r2 = bdj.r();
            if (r2 == null) {
                return null;
            }
            if (a.matcher(r2).matches()) {
                do {
                    r = bdj.r();
                    if (r == null) {
                        break;
                    }
                } while (!r.isEmpty());
            } else {
                Matcher matcher = bau.a.matcher(r2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static void a(bdj bdj) {
        int i = bdj.b;
        if (!b(bdj)) {
            bdj.c(i);
            StringBuilder sb = new StringBuilder("Expected WEBVTT. Got ");
            sb.append(bdj.r());
            throw new ParserException(sb.toString());
        }
    }
}
