package defpackage;

/* renamed from: keb reason: default package */
public abstract class keb {

    /* renamed from: keb$a */
    public static final class a extends keb {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AutoForward{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: keb$b */
    public static final class b extends keb {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Backwards{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: keb$c */
    public static final class c extends keb {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Forward{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3);

    keb() {
    }
}
