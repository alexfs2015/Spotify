package defpackage;

/* renamed from: uwi reason: default package */
public abstract class uwi {

    /* renamed from: uwi$a */
    public static final class a extends uwi {
        private final String a;

        a(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("Failure{reasons=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: uwi$b */
    public static final class b extends uwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Success{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    uwi() {
    }

    public static uwi a(String str) {
        return new a(str);
    }
}
