package defpackage;

/* renamed from: gny reason: default package */
public abstract class gny<R> {

    /* renamed from: gny$a */
    public static final class a extends gny<Object> {
        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Mismatch{}";
        }
    }

    /* renamed from: gny$b */
    public static final class b<R> extends gny<R> {
        final R a;

        b(R r) {
            this.a = gec.a(r);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success{response=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    gny() {
    }

    public static <R> gny<R> a(R r) {
        return new b(r);
    }
}
