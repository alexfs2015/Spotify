package defpackage;

import com.spotify.cosmos.router.Request;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wsk reason: default package */
public final class wsk implements Comparable<wsk> {
    public static final wsk a = new wsk(Request.GET);
    public static final wsk b = new wsk("HEAD");
    public static final wsk c = new wsk(Request.POST);
    public static final wsk d = new wsk("CONNECT");
    private static wsk f = new wsk("OPTIONS");
    private static wsk g = new wsk(Request.PUT);
    private static wsk h = new wsk("PATCH");
    private static wsk i = new wsk(Request.DELETE);
    private static wsk j = new wsk("TRACE");
    private static final Map<String, wsk> k;
    final wvc e;

    static {
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put(f.toString(), f);
        k.put(a.toString(), a);
        k.put(b.toString(), b);
        k.put(c.toString(), c);
        k.put(g.toString(), g);
        k.put(h.toString(), h);
        k.put(i.toString(), i);
        k.put(j.toString(), j);
        k.put(d.toString(), d);
    }

    private wsk(String str) {
        String trim = ((String) wxq.a(str, "name")).trim();
        if (!trim.isEmpty()) {
            for (int i2 = 0; i2 < trim.length(); i2++) {
                char charAt = trim.charAt(i2);
                if (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) {
                    throw new IllegalArgumentException("invalid character in name");
                }
            }
            this.e = new wvc(trim);
            return;
        }
        throw new IllegalArgumentException("empty name");
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.e.toString().compareTo(((wsk) obj).e.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wsk)) {
            return false;
        }
        return this.e.toString().equals(((wsk) obj).e.toString());
    }

    public final int hashCode() {
        return this.e.toString().hashCode();
    }

    public final String toString() {
        return this.e.toString();
    }
}
