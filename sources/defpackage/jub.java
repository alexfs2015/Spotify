package defpackage;

import android.content.UriMatcher;
import com.spotify.mobile.android.util.LinkType;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: jub reason: default package */
public final class jub implements jtz {
    private static final Map<String, jst> c = gbo.a();
    private UriMatcher a = new UriMatcher(-1);
    private Set<a> b = new TreeSet();

    /* renamed from: jub$a */
    static class a implements Comparable<a> {
        final String a;
        final LinkType b;

        public final /* synthetic */ int compareTo(Object obj) {
            a aVar = (a) obj;
            if (equals(aVar)) {
                return 0;
            }
            String str = "/";
            String[] split = this.a.split(str);
            String[] split2 = aVar.a.split(str);
            int length = split.length < split2.length ? split.length : split2.length;
            for (int i = 0; i < length; i++) {
                if (!split[i].equals(split2[i])) {
                    String str2 = "*";
                    if (split[i].equals(str2)) {
                        if (!split2[i].equals(str2)) {
                            return 1;
                        }
                    } else if (split2[i].equals(str2)) {
                        return -1;
                    } else {
                        return split[i].compareTo(split2[i]);
                    }
                }
            }
            if (this.a.length() == aVar.a.length()) {
                return 0;
            }
            return split.length < split2.length ? split.length : split2.length;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public jub() {
        a(this.b);
    }

    public final jst a(String str) {
        jst jst = (jst) c.get(str);
        if (jst != null) {
            return jst;
        }
        jst a2 = jst.a(str);
        c.put(str, a2);
        return a2;
    }

    private void a(Set<a> set) {
        for (a aVar : set) {
            this.a.addURI("*", aVar.a, aVar.b.ordinal());
        }
    }
}
