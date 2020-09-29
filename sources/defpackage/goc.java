package defpackage;

/* renamed from: goc reason: default package */
public abstract class goc {

    /* renamed from: goc$a */
    public static final class a extends goc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DialogRegionMismatch{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: goc$b */
    public static final class b extends goc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DialogTokenExpired{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: goc$c */
    public static final class c extends goc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "None{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<c, R_> gct3);

    goc() {
    }
}
