package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;
import java.util.List;

/* renamed from: slx reason: default package */
public abstract class slx {

    /* renamed from: slx$a */
    public static final class a extends slx {
        public final SearchHistoryItem a;

        a(SearchHistoryItem searchHistoryItem) {
            this.a = (SearchHistoryItem) gec.a(searchHistoryItem);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AddToHistory{item=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slx$b */
    public static final class b extends slx {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ClearHistory{}";
        }
    }

    /* renamed from: slx$c */
    public static final class c extends slx {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadHistory{}";
        }
    }

    /* renamed from: slx$d */
    public static final class d extends slx {
        public final List<slx> a;

        d(List<slx> list) {
            this.a = (List) gec.a(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MergedSearchEffect{effects=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slx$e */
    public static final class e extends slx {
        public final String a;

        e(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Navigate{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slx$f */
    public static final class f extends slx {
        public final String a;
        public final String b;

        f(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a.equals(this.a) && fVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PerformAutocompleteSearch{query=");
            sb.append(this.a);
            sb.append(", sessionId=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slx$g */
    public static final class g extends slx {
        private final String a;

        g(String str) {
            this.a = (String) gec.a(str);
        }

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PerformOfflineSearch{query=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slx$h */
    public static final class h extends slx {
        public final String a;
        public final smg b;

        h(String str, smg smg) {
            this.a = (String) gec.a(str);
            this.b = (smg) gec.a(smg);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a.equals(this.a) && hVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PerformOnlineSearch{query=");
            sb.append(this.a);
            sb.append(", userSession=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slx$i */
    public static final class i extends slx {
        public final String a;

        i(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            return ((i) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Play{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slx$j */
    public static final class j extends slx {
        public final String a;

        j(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RemoveFromHistory{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    slx() {
    }

    public static slx a(String str) {
        return new g(str);
    }

    public static slx a(String str, String str2) {
        return new f(str, str2);
    }

    public static slx a(String str, smg smg) {
        return new h(str, smg);
    }

    public static slx b(String str) {
        return new e(str);
    }
}
