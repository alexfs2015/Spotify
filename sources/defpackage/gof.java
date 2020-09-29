package defpackage;

/* renamed from: gof reason: default package */
public abstract class gof {

    /* renamed from: gof$a */
    public static final class a extends gof {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InputEmail{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: gof$b */
    public static final class b extends gof {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InputNone{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: gof$c */
    public static final class c extends gof {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InputPassword{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3);

    gof() {
    }
}
