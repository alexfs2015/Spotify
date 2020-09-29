package defpackage;

/* renamed from: gnf reason: default package */
public abstract class gnf {

    /* renamed from: gnf$a */
    public static final class a extends gnf {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure{errorCode=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2) {
            return gct2.apply(this);
        }
    }

    /* renamed from: gnf$b */
    public static final class b extends gnf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Success{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2);

    public abstract void a(gcs<b> gcs, gcs<a> gcs2);

    gnf() {
    }
}
