package defpackage;

/* renamed from: sbr reason: default package */
public abstract class sbr {

    /* renamed from: sbr$a */
    public static final class a extends sbr {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Autocomplete{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: sbr$b */
    public static final class b extends sbr {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "History{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct3.apply(this);
        }
    }

    /* renamed from: sbr$c */
    public static final class c extends sbr {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Offline{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: sbr$d */
    public static final class d extends sbr {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Online{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4);

    sbr() {
    }
}
