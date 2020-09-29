package defpackage;

/* renamed from: vzz reason: default package */
public abstract class vzz {

    /* renamed from: vzz$a */
    public static final class a extends vzz {
        private final String a;

        a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee9.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged9.accept(this);
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
            sb.append("ConnectionError{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzz$b */
    public static final class b extends vzz {
        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee.apply(this);
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }
    }

    /* renamed from: vzz$c */
    public static final class c extends vzz {
        public final String a;
        private final String b;

        c(String str, String str2) {
            this.b = (String) gec.a(str);
            this.a = str2;
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee8.apply(this);
        }

        public final String a() {
            return this.b;
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged8.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b.equals(this.b) && gec.a(cVar.a, this.a);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (this.b.hashCode() + 0) * 31;
            String str = this.a;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ErrorFromRemote{password=");
            sb.append(this.b);
            sb.append(", errorMessage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzz$d */
    public static final class d extends vzz {
        private final String a;

        d(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee2.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged2.accept(this);
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
            sb.append("LocalUnverified{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzz$e */
    public static final class e extends vzz {
        private final String a;

        e(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee4.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged4.accept(this);
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
            sb.append("LocalValid{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzz$f */
    public static final class f extends vzz {
        private final String a;

        f(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee3.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged3.accept(this);
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
            sb.append("RemoteUnverified{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzz$g */
    public static final class g extends vzz {
        private final String a;

        g(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee5.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged5.accept(this);
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
            sb.append("RemoteValid{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzz$h */
    public static final class h extends vzz {
        private final String a;

        h(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee7.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged7.accept(this);
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
            sb.append("TooShort{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzz$i */
    public static final class i extends vzz {
        private final String a;

        i(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9) {
            return gee6.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9) {
            ged6.accept(this);
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
            sb.append("TooWeak{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vzz() {
    }

    public static vzz a(String str) {
        return new d(str);
    }

    public static vzz a(String str, String str2) {
        return new c(str, str2);
    }

    public static vzz b(String str) {
        return new f(str);
    }

    public static vzz c(String str) {
        return new e(str);
    }

    public static vzz d(String str) {
        return new g(str);
    }

    public static vzz e(String str) {
        return new i(str);
    }

    public static vzz f(String str) {
        return new h(str);
    }

    public static vzz g(String str) {
        return new a(str);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<d, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<g, R_> gee5, gee<i, R_> gee6, gee<h, R_> gee7, gee<c, R_> gee8, gee<a, R_> gee9);

    public abstract void a(ged<b> ged, ged<d> ged2, ged<f> ged3, ged<e> ged4, ged<g> ged5, ged<i> ged6, ged<h> ged7, ged<c> ged8, ged<a> ged9);
}
