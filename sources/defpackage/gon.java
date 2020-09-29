package defpackage;

/* renamed from: gon reason: default package */
public abstract class gon {

    /* renamed from: gon$a */
    public static final class a extends gon {
        public final gor a;

        a(gor gor) {
            this.a = (gor) gcr.a(gor);
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

    /* renamed from: gon$b */
    public static final class b extends gon {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "None{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    gon() {
    }

    public static gon a(gor gor) {
        return new a(gor);
    }
}
