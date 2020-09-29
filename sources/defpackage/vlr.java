package defpackage;

/* renamed from: vlr reason: default package */
public abstract class vlr {

    /* renamed from: vlr$a */
    public static final class a extends vlr {
        private final String a;

        public a(String str) {
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
            sb.append("Error{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: vlr$b */
    public static final class b extends vlr {
        public final int a;
        private final String b;

        b(String str, int i) {
            this.b = (String) gcr.a(str);
            this.a = i;
        }

        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.b.hashCode() + 0) * 31) + Integer.valueOf(this.a).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid{email=");
            sb.append(this.b);
            sb.append(", status=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vlr$c */
    public static final class c extends vlr {
        public final String a;
        private final String b;

        c(String str, String str2) {
            this.b = (String) gcr.a(str);
            this.a = (String) gcr.a(str2);
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
            return cVar.b.equals(this.b) && cVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.b.hashCode() + 0) * 31) + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Valid{email=");
            sb.append(this.b);
            sb.append(", nameSuggestion=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3);

    public abstract void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3);

    vlr() {
    }

    public static vlr a(String str, int i) {
        return new b(str, i);
    }
}
