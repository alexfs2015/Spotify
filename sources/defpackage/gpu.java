package defpackage;

/* renamed from: gpu reason: default package */
public abstract class gpu {

    /* renamed from: gpu$a */
    public static final class a extends gpu {
        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InputEmail{}";
        }
    }

    /* renamed from: gpu$b */
    public static final class b extends gpu {
        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InputNone{}";
        }
    }

    /* renamed from: gpu$c */
    public static final class c extends gpu {
        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InputPassword{}";
        }
    }

    gpu() {
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3);
}
