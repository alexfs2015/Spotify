package defpackage;

/* renamed from: vne reason: default package */
public abstract class vne {

    /* renamed from: vne$a */
    public static final class a extends vne {
        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BackButtonTapped{}";
        }
    }

    /* renamed from: vne$b */
    public static final class b extends vne {
        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TopicsSent{}";
        }
    }

    vne() {
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2);
}
