package defpackage;

/* renamed from: pan reason: default package */
public abstract class pan {

    /* renamed from: pan$a */
    public static final class a extends pan {
        private final String a;

        a(String str) {
            this.a = (String) gcr.a(str);
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

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: pan$b */
    public static final class b extends pan {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: pan$c */
    public static final class c extends pan {
        final gzz a;

        c(gzz gzz) {
            this.a = (gzz) gcr.a(gzz);
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

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3);

    pan() {
    }

    public static pan a(String str) {
        return new a(str);
    }

    public static pan a(gzz gzz) {
        return new c(gzz);
    }
}
