package defpackage;

/* renamed from: mkt reason: default package */
public abstract class mkt {

    /* renamed from: mkt$a */
    public static final class a extends mkt {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ConnectionRegained{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: mkt$b */
    public static final class b extends mkt {
        final gzz a;

        b(gzz gzz) {
            this.a = (gzz) gcr.a(gzz);
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
            sb.append("HubsFetchError{hubsViewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: mkt$c */
    public static final class c extends mkt {
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
            sb.append("HubsFetchSuccess{hubsViewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3);

    mkt() {
    }

    public static mkt a(gzz gzz) {
        return new c(gzz);
    }

    public static mkt b(gzz gzz) {
        return new b(gzz);
    }
}
