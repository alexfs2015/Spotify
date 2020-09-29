package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ajp reason: default package */
final class ajp {
    private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    public static ajo a(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            ajo ajo = new ajo(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
            return ajo;
        } catch (Exception unused) {
            wji a2 = wja.a();
            StringBuilder sb = new StringBuilder("Could not parse map entry: ");
            sb.append(str);
            a2.a("CrashlyticsCore", sb.toString());
            return null;
        }
    }
}
