package defpackage;

import java.util.List;

/* renamed from: mrg reason: default package */
public abstract class mrg {

    /* renamed from: mrg$a */
    public static final class a extends mrg {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchData{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: mrg$b */
    public static final class b extends mrg {
        public final String a;

        b(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FollowArtist{artistUri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: mrg$c */
    public static final class c extends mrg {
        public final String a;

        c(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
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

    /* renamed from: mrg$d */
    public static final class d extends mrg {
        public final mrl a;

        d(mrl mrl) {
            this.a = (mrl) gcr.a(mrl);
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
            sb.append("PerformPlayerCommand{command=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: mrg$e */
    public static final class e extends mrg {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RefreshFeed{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    /* renamed from: mrg$f */
    public static final class f extends mrg {
        private final List<String> a;

        f(List<String> list) {
            this.a = (List) gcr.a(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowArtistContextMenu{artistUris=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: mrg$g */
    public static final class g extends mrg {
        private final String a;

        g(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("ShowContextMenu{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: mrg$h */
    public static final class h extends mrg {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowFailedMessage{}";
        }

        h() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }
    }

    mrg() {
    }

    public static mrg a(String str) {
        return new c(str);
    }
}
