package defpackage;

/* renamed from: vmt reason: default package */
public abstract class vmt {

    /* renamed from: vmt$a */
    public static final class a extends vmt {
        private final String a;

        a(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs9.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct9.apply(this);
        }
    }

    /* renamed from: vmt$b */
    public static final class b extends vmt {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct.apply(this);
        }
    }

    /* renamed from: vmt$c */
    public static final class c extends vmt {
        public final String a;
        private final String b;

        c(String str, String str2) {
            this.b = (String) gcr.a(str);
            this.a = str2;
        }

        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b.equals(this.b) && gcr.a(cVar.a, this.a);
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs8.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct8.apply(this);
        }
    }

    /* renamed from: vmt$d */
    public static final class d extends vmt {
        private final String a;

        d(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vmt$e */
    public static final class e extends vmt {
        private final String a;

        e(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct4.apply(this);
        }
    }

    /* renamed from: vmt$f */
    public static final class f extends vmt {
        private final String a;

        f(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct3.apply(this);
        }
    }

    /* renamed from: vmt$g */
    public static final class g extends vmt {
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
            sb.append("RemoteValid{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct5.apply(this);
        }
    }

    /* renamed from: vmt$h */
    public static final class h extends vmt {
        private final String a;

        h(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs7.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct7.apply(this);
        }
    }

    /* renamed from: vmt$i */
    public static final class i extends vmt {
        private final String a;

        i(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9) {
            gcs6.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9) {
            return gct6.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<d, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<g, R_> gct5, gct<i, R_> gct6, gct<h, R_> gct7, gct<c, R_> gct8, gct<a, R_> gct9);

    public abstract void a(gcs<b> gcs, gcs<d> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<g> gcs5, gcs<i> gcs6, gcs<h> gcs7, gcs<c> gcs8, gcs<a> gcs9);

    vmt() {
    }

    public static vmt a(String str) {
        return new d(str);
    }

    public static vmt b(String str) {
        return new f(str);
    }

    public static vmt c(String str) {
        return new e(str);
    }

    public static vmt d(String str) {
        return new g(str);
    }

    public static vmt e(String str) {
        return new i(str);
    }

    public static vmt f(String str) {
        return new h(str);
    }

    public static vmt a(String str, String str2) {
        return new c(str, str2);
    }

    public static vmt g(String str) {
        return new a(str);
    }
}
