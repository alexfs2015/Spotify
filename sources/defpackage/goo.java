package defpackage;

/* renamed from: goo reason: default package */
public abstract class goo {

    /* renamed from: goo$a */
    public static final class a extends goo {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7) {
            return gct.apply(this);
        }
    }

    /* renamed from: goo$b */
    public static final class b extends goo {
        private final String a;

        b(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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
            sb.append("Invalid{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7) {
            return gct3.apply(this);
        }
    }

    /* renamed from: goo$c */
    public static final class c extends goo {
        private final String a;

        c(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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
            sb.append("Saving{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7) {
            return gct5.apply(this);
        }
    }

    /* renamed from: goo$d */
    public static final class d extends goo {
        private final String a;

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
            sb.append("Stored{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7) {
            return gct7.apply(this);
        }
    }

    /* renamed from: goo$e */
    public static final class e extends goo {
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
            sb.append("Storing{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7) {
            return gct6.apply(this);
        }
    }

    /* renamed from: goo$f */
    public static final class f extends goo {
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
            sb.append("Unverified{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7) {
            return gct2.apply(this);
        }
    }

    /* renamed from: goo$g */
    public static final class g extends goo {
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
            sb.append("Valid{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<f, R_> gct2, gct<b, R_> gct3, gct<g, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7);

    goo() {
    }

    public static goo a(String str) {
        return new b(str);
    }

    public static goo b(String str) {
        return new g(str);
    }
}
