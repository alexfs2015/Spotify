package defpackage;

/* renamed from: gpr reason: default package */
public abstract class gpr {

    /* renamed from: gpr$a */
    public static final class a extends gpr {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DialogRegionMismatch{}";
        }
    }

    /* renamed from: gpr$b */
    public static final class b extends gpr {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DialogTokenExpired{}";
        }
    }

    /* renamed from: gpr$c */
    public static final class c extends gpr {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "None{}";
        }
    }

    gpr() {
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3);
}
