package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;
import java.util.List;

/* renamed from: sbq reason: default package */
public abstract class sbq {

    /* renamed from: sbq$a */
    public static final class a extends sbq {
        public final SearchHistoryItem a;

        a(SearchHistoryItem searchHistoryItem) {
            this.a = (SearchHistoryItem) gcr.a(searchHistoryItem);
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

    /* renamed from: sbq$b */
    public static final class b extends sbq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ClearHistory{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: sbq$c */
    public static final class c extends sbq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadHistory{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    /* renamed from: sbq$d */
    public static final class d extends sbq {
        public final List<sbq> a;

        d(List<sbq> list) {
            this.a = (List) gcr.a(list);
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

    /* renamed from: sbq$e */
    public static final class e extends sbq {
        public final String a;

        e(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: sbq$f */
    public static final class f extends sbq {
        public final String a;
        public final String b;

        f(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
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

    /* renamed from: sbq$g */
    public static final class g extends sbq {
        private final String a;

        g(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: sbq$h */
    public static final class h extends sbq {
        public final String a;
        public final sbz b;

        h(String str, sbz sbz) {
            this.a = (String) gcr.a(str);
            this.b = (sbz) gcr.a(sbz);
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

    /* renamed from: sbq$i */
    public static final class i extends sbq {
        public final String a;

        i(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: sbq$j */
    public static final class j extends sbq {
        public final String a;

        j(String str) {
            this.a = (String) gcr.a(str);
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

    sbq() {
    }

    public static sbq a(String str, sbz sbz) {
        return new h(str, sbz);
    }

    public static sbq a(String str) {
        return new g(str);
    }

    public static sbq a(String str, String str2) {
        return new f(str, str2);
    }

    public static sbq b(String str) {
        return new e(str);
    }
}
