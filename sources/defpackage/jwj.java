package defpackage;

import android.content.UriMatcher;
import com.spotify.mobile.android.util.LinkType;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: jwj reason: default package */
public final class jwj implements jwh {
    private static final Map<String, jva> c = gcm.a();
    private UriMatcher a = new UriMatcher(-1);
    private Set<a> b = new TreeSet();

    /* renamed from: jwj$a */
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

    public jwj() {
        a(this.b);
    }

    private void a(Set<a> set) {
        for (a aVar : set) {
            this.a.addURI("*", aVar.a, aVar.b.ordinal());
        }
    }

    public final jva a(String str) {
        jva jva = (jva) c.get(str);
        if (jva != null) {
            return jva;
        }
        jva a2 = jva.a(str);
        c.put(str, a2);
        return a2;
    }
}
