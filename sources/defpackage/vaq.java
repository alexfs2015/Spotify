package defpackage;

/* renamed from: vaq reason: default package */
public abstract class vaq {

    /* renamed from: vaq$a */
    public static final class a extends vaq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BackButtonTapped{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vaq$b */
    public static final class b extends vaq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TopicsSent{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2);

    vaq() {
    }
}
