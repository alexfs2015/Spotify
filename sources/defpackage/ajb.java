package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ajb reason: default package */
final class ajb {
    private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    public static aja a(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            aja aja = new aja(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
            return aja;
        } catch (Exception unused) {
            vvc a2 = vuu.a();
            StringBuilder sb = new StringBuilder("Could not parse map entry: ");
            sb.append(str);
            a2.a("CrashlyticsCore", sb.toString());
            return null;
        }
    }
}
