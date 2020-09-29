package defpackage;

/* renamed from: gor reason: default package */
public abstract class gor {

    /* renamed from: gor$a */
    public static final class a extends gor {
        public final String a;

        public a(String str) {
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
            sb.append("Recoverable{errorMessage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: gor$b */
    public static final class b extends gor {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TokenExpired{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: gor$c */
    public static final class c extends gor {
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
            sb.append("Unknown{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<a, R_> gct2, gct<b, R_> gct3);

    public abstract void a(gcs<c> gcs, gcs<a> gcs2, gcs<b> gcs3);

    gor() {
    }

    public static gor a(String str) {
        return new c(str);
    }
}
