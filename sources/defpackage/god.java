package defpackage;

/* renamed from: god reason: default package */
public abstract class god {

    /* renamed from: god$a */
    public static final class a extends god {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorConnection{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct4.apply(this);
        }
    }

    /* renamed from: god$b */
    public static final class b extends god {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorCouldNotLogin{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct2.apply(this);
        }
    }

    /* renamed from: god$c */
    public static final class c extends god {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorExpired{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct.apply(this);
        }
    }

    /* renamed from: god$d */
    public static final class d extends god {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorGeneric{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct3.apply(this);
        }
    }

    /* renamed from: god$e */
    public static final class e extends god {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorLimited{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct5.apply(this);
        }
    }

    /* renamed from: god$f */
    public static final class f extends god {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorTokenExpired{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct6.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6);

    god() {
    }
}
