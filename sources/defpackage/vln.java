package defpackage;

/* renamed from: vln reason: default package */
public abstract class vln {

    /* renamed from: vln$a */
    public static final class a extends vln {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<d> gcs5) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct.apply(this);
        }
    }

    /* renamed from: vln$b */
    public static final class b extends vln {
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

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<d> gcs5) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vln$c */
    public static final class c extends vln {
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
            sb.append("ValidUnverified{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<d> gcs5) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct3.apply(this);
        }
    }

    /* renamed from: vln$d */
    public static final class d extends vln {
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
            sb.append("ValidVerified{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<d> gcs5) {
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct5.apply(this);
        }
    }

    /* renamed from: vln$e */
    public static final class e extends vln {
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
            sb.append("Verifying{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<d> gcs5) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5);

    public abstract void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<d> gcs5);

    vln() {
    }

    public static vln a(String str, int i) {
        return new b(str, i);
    }

    public static vln a(String str) {
        return new c(str);
    }

    public static vln b(String str) {
        return new e(str);
    }

    public static vln c(String str) {
        return new d(str);
    }
}
