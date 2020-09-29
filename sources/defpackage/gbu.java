package defpackage;

/* renamed from: gbu reason: default package */
public abstract class gbu {

    /* renamed from: gbu$a */
    public static final class a extends gbu {
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
            return "LoginEmail{}";
        }
    }

    /* renamed from: gbu$b */
    public static final class b extends gbu {
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
            return "LoginFacebook{}";
        }
    }

    /* renamed from: gbu$c */
    public static final class c extends gbu {
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
            return "LoginSpotifyToken{}";
        }
    }

    gbu() {
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3);
}
