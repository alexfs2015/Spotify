package defpackage;

/* renamed from: sbs reason: default package */
public abstract class sbs {

    /* renamed from: sbs$a */
    public static final class a extends sbs {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ClearHistoryClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct7.apply(this);
        }
    }

    /* renamed from: sbs$b */
    public static final class b extends sbs {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "HistoryChanged{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct8.apply(this);
        }
    }

    /* renamed from: sbs$c */
    public static final class c extends sbs {
        public final String a;
        public final int b;

        public c(String str, int i) {
            this.a = (String) gcr.a(str);
            this.b = i;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct5.apply(this);
        }
    }

    /* renamed from: sbs$d */
    public static final class d extends sbs {
        final kxx a;

        d(kxx kxx) {
            this.a = (kxx) gcr.a(kxx);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct9.apply(this);
        }
    }

    /* renamed from: sbs$e */
    public static final class e extends sbs {
        final String a;

        public e(String str) {
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
            sb.append("QueryChanged{query=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct.apply(this);
        }
    }

    /* renamed from: sbs$f */
    public static final class f extends sbs {
        public final String a;
        public final int b;

        public f(String str, int i) {
            this.a = (String) gcr.a(str);
            this.b = i;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct6.apply(this);
        }
    }

    /* renamed from: sbs$g */
    public static final class g extends sbs {
        public final sby a;

        g(sby sby) {
            this.a = (sby) gcr.a(sby);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct4.apply(this);
        }
    }

    /* renamed from: sbs$h */
    public static final class h extends sbs {
        final sbw a;

        h(sbw sbw) {
            this.a = (sbw) gcr.a(sbw);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct2.apply(this);
        }
    }

    /* renamed from: sbs$i */
    public static final class i extends sbs {
        final sbr a;

        i(sbr sbr) {
            this.a = (sbr) gcr.a(sbr);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct3.apply(this);
        }
    }

    /* renamed from: sbs$j */
    public static final class j extends sbs {
        final sbz a;

        j(sbz sbz) {
            this.a = (sbz) gcr.a(sbz);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10) {
            return gct10.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<e, R_> gct, gct<h, R_> gct2, gct<i, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<f, R_> gct6, gct<a, R_> gct7, gct<b, R_> gct8, gct<d, R_> gct9, gct<j, R_> gct10);

    sbs() {
    }

    public static sbs a(sbw sbw) {
        return new h(sbw);
    }

    public static sbs a(sbr sbr) {
        return new i(sbr);
    }

    public static sbs a(sby sby) {
        return new g(sby);
    }

    public static sbs a(kxx kxx) {
        return new d(kxx);
    }

    public static sbs a(sbz sbz) {
        return new j(sbz);
    }
}
