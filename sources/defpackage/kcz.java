package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: kcz reason: default package */
public final class kcz {
    private static final Pattern e = Pattern.compile("([\\w-]+\\.[\\w-]+\\.[\\w-]+\\.[\\w-]+$)");
    final jtz a = jtp.a;
    final Map<String, Long> b = new HashMap();
    final Map<String, Integer> c = new HashMap();
    List<String> d = new ArrayList(0);

    public kcz(gcb gcb) {
    }

    static String a(Uri uri) {
        Matcher matcher = e.matcher(uri.getHost());
        return matcher.find() ? matcher.group(1) : uri.getHost();
    }

    private boolean a(String str) {
        int intValue = ((Integer) jvi.a(this.c.get(str), Integer.valueOf(0))).intValue();
        if (intValue < 2) {
            return false;
        }
        long longValue = ((Long) jvi.a(this.b.get(str), Long.valueOf(-1))).longValue();
        return longValue != -1 && ((long) Math.pow(2.0d, (double) Math.min(intValue - 2, 6))) * 30000 > this.a.c() - longValue;
    }

    /* access modifiers changed from: 0000 */
    public ho<String, Boolean> a(List<String> list) {
        Assertion.a((Object) list);
        Assertion.b("No base URLs", list.isEmpty());
        String str = (String) list.get(0);
        int i = Integer.MAX_VALUE;
        for (String str2 : list) {
            String a2 = a(Uri.parse(str2));
            if (!a(a2)) {
                return new ho<>(str2, Boolean.FALSE);
            }
            if (((Integer) jvi.a(this.c.get(a2), Integer.valueOf(Integer.MAX_VALUE))).intValue() < i) {
                i = ((Integer) this.c.get(a2)).intValue();
                str = str2;
            }
        }
        return new ho<>(str, Boolean.TRUE);
    }

    public final Map<String, Integer> a() {
        HashMap hashMap = new HashMap(this.c);
        for (String parse : this.d) {
            String a2 = a(Uri.parse(parse));
            if (!hashMap.containsKey(a2)) {
                hashMap.put(a2, Integer.valueOf(0));
            }
        }
        return hashMap;
    }
}
