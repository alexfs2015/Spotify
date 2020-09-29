package defpackage;

/* renamed from: sly reason: default package */
public abstract class sly {

    /* renamed from: sly$a */
    public static final class a extends sly {
        a() {
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Autocomplete{}";
        }
    }

    /* renamed from: sly$b */
    public static final class b extends sly {
        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "History{}";
        }
    }

    /* renamed from: sly$c */
    public static final class c extends sly {
        c() {
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Offline{}";
        }
    }

    /* renamed from: sly$d */
    public static final class d extends sly {
        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Online{}";
        }
    }

    sly() {
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4);
}
