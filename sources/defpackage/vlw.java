package defpackage;

/* renamed from: vlw reason: default package */
public abstract class vlw {

    /* renamed from: vlw$a */
    public static final class a extends vlw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Female{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3, gcs<d> gcs4) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4) {
            return gct3.apply(this);
        }
    }

    /* renamed from: vlw$b */
    public static final class b extends vlw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Male{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3, gcs<d> gcs4) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vlw$c */
    public static final class c extends vlw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "None{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3, gcs<d> gcs4) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4) {
            return gct.apply(this);
        }
    }

    /* renamed from: vlw$d */
    public static final class d extends vlw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoneBinary{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3, gcs<d> gcs4) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4);

    public abstract void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3, gcs<d> gcs4);

    vlw() {
    }
}
