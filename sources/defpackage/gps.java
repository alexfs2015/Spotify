package defpackage;

/* renamed from: gps reason: default package */
public abstract class gps {

    /* renamed from: gps$a */
    public static final class a extends gps {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorConnection{}";
        }
    }

    /* renamed from: gps$b */
    public static final class b extends gps {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorCouldNotLogin{}";
        }
    }

    /* renamed from: gps$c */
    public static final class c extends gps {
        c() {
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorExpired{}";
        }
    }

    /* renamed from: gps$d */
    public static final class d extends gps {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorGeneric{}";
        }
    }

    /* renamed from: gps$e */
    public static final class e extends gps {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorLimited{}";
        }
    }

    /* renamed from: gps$f */
    public static final class f extends gps {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorTokenExpired{}";
        }
    }

    gps() {
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6);
}
