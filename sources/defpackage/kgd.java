package defpackage;

/* renamed from: kgd reason: default package */
public abstract class kgd {

    /* renamed from: kgd$a */
    public static final class a extends kgd {
        a() {
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AutoForward{}";
        }
    }

    /* renamed from: kgd$b */
    public static final class b extends kgd {
        b() {
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Backwards{}";
        }
    }

    /* renamed from: kgd$c */
    public static final class c extends kgd {
        c() {
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Forward{}";
        }
    }

    kgd() {
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3);
}
