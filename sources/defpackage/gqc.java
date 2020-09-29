package defpackage;

/* renamed from: gqc reason: default package */
public abstract class gqc {

    /* renamed from: gqc$a */
    public static final class a extends gqc {
        public final gqg a;

        a(gqg gqg) {
            this.a = (gqg) gec.a(gqg);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gqc$b */
    public static final class b extends gqc {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "None{}";
        }
    }

    gqc() {
    }

    public static gqc a(gqg gqg) {
        return new a(gqg);
    }
}
