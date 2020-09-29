package defpackage;

/* renamed from: phw reason: default package */
public abstract class phw {

    /* renamed from: phw$a */
    public static final class a extends phw {
        private final String a;

        a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee2.apply(this);
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
            sb.append("Failure{message=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: phw$b */
    public static final class b extends phw {
        b() {
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: phw$c */
    public static final class c extends phw {
        final hcs a;

        c(hcs hcs) {
            this.a = (hcs) gec.a(hcs);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee3.apply(this);
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
            sb.append("Success{hubsViewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    phw() {
    }

    public static phw a(hcs hcs) {
        return new c(hcs);
    }

    public static phw a(String str) {
        return new a(str);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3);
}
