package defpackage;

/* renamed from: gmj reason: default package */
public abstract class gmj<R> {

    /* renamed from: gmj$a */
    public static final class a extends gmj<Object> {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Mismatch{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: gmj$b */
    public static final class b<R> extends gmj<R> {
        final R a;

        b(R r) {
            this.a = gcr.a(r);
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

    gmj() {
    }

    public static <R> gmj<R> a(R r) {
        return new b(r);
    }
}
