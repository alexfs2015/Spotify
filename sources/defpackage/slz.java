package defpackage;

/* renamed from: slz reason: default package */
public abstract class slz {

    /* renamed from: slz$a */
    public static final class a extends slz {
        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ClearHistoryClicked{}";
        }
    }

    /* renamed from: slz$b */
    public static final class b extends slz {
        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee8.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "HistoryChanged{}";
        }
    }

    /* renamed from: slz$c */
    public static final class c extends slz {
        public final String a;
        public final int b;

        public c(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b == this.b && cVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HistoryItemClicked{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slz$d */
    public static final class d extends slz {
        final lbg a;

        d(lbg lbg) {
            this.a = (lbg) gec.a(lbg);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee9.apply(this);
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
            sb.append("NetworkStateChanged{connectionState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slz$e */
    public static final class e extends slz {
        final String a;

        public e(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee.apply(this);
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
            sb.append("QueryChanged{query=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slz$f */
    public static final class f extends slz {
        public final String a;
        public final int b;

        public f(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.b == this.b && fVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RemoveHistoryItemClicked{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slz$g */
    public static final class g extends slz {
        public final smf a;

        g(smf smf) {
            this.a = (smf) gec.a(smf);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee4.apply(this);
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
            sb.append("ResultItemClicked{item=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slz$h */
    public static final class h extends slz {
        final smd a;

        h(smd smd) {
            this.a = (smd) gec.a(smd);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ResultLoaded{searchResult=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slz$i */
    public static final class i extends slz {
        final sly a;

        i(sly sly) {
            this.a = (sly) gec.a(sly);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee3.apply(this);
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
            sb.append("ResultLoadingFailed{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: slz$j */
    public static final class j extends slz {
        final smg a;

        j(smg smg) {
            this.a = (smg) gec.a(smg);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10) {
            return gee10.apply(this);
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
            sb.append("UserSessionChanged{userSession=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    slz() {
    }

    public static slz a(lbg lbg) {
        return new d(lbg);
    }

    public static slz a(sly sly) {
        return new i(sly);
    }

    public static slz a(smd smd) {
        return new h(smd);
    }

    public static slz a(smf smf) {
        return new g(smf);
    }

    public static slz a(smg smg) {
        return new j(smg);
    }

    public abstract <R_> R_ a(gee<e, R_> gee, gee<h, R_> gee2, gee<i, R_> gee3, gee<g, R_> gee4, gee<c, R_> gee5, gee<f, R_> gee6, gee<a, R_> gee7, gee<b, R_> gee8, gee<d, R_> gee9, gee<j, R_> gee10);
}
