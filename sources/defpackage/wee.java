package defpackage;

import com.spotify.cosmos.router.Request;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wee reason: default package */
public final class wee implements Comparable<wee> {
    public static final wee a = new wee(Request.GET);
    public static final wee b = new wee("HEAD");
    public static final wee c = new wee(Request.POST);
    public static final wee d = new wee("CONNECT");
    private static wee f = new wee("OPTIONS");
    private static wee g = new wee(Request.PUT);
    private static wee h = new wee("PATCH");
    private static wee i = new wee(Request.DELETE);
    private static wee j = new wee("TRACE");
    private static final Map<String, wee> k;
    final wgw e;

    public final /* synthetic */ int compareTo(Object obj) {
        return this.e.toString().compareTo(((wee) obj).e.toString());
    }

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

    private wee(String str) {
        String trim = ((String) wjk.a(str, "name")).trim();
        if (!trim.isEmpty()) {
            for (int i2 = 0; i2 < trim.length(); i2++) {
                char charAt = trim.charAt(i2);
                if (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) {
                    throw new IllegalArgumentException("invalid character in name");
                }
            }
            this.e = new wgw(trim);
            return;
        }
        throw new IllegalArgumentException("empty name");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wee)) {
            return false;
        }
        return this.e.toString().equals(((wee) obj).e.toString());
    }

    public final String toString() {
        return this.e.toString();
    }

    public final int hashCode() {
        return this.e.toString().hashCode();
    }
}
