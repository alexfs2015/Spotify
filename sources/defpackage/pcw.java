package defpackage;

/* renamed from: pcw reason: default package */
public abstract class pcw {

    /* renamed from: pcw$a */
    public static final class a extends pcw {
        private final String a;

        a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return gcr.a(((a) obj).a, this.a);
        }

        public final int hashCode() {
            String str = this.a;
            return (str != null ? str.hashCode() : 0) + 0;
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

    /* renamed from: pcw$b */
    public static final class b extends pcw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: pcw$c */
    public static final class c extends pcw {
        public final gzz a;

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

    pcw() {
    }

    public static pcw a(String str) {
        return new a(str);
    }
}
