package defpackage;

/* renamed from: gno reason: default package */
public abstract class gno {

    /* renamed from: gno$a */
    public static final class a extends gno {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Failure{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: gno$b */
    public static final class b extends gno {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Success{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    gno() {
    }
}
