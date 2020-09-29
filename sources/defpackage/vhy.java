package defpackage;

/* renamed from: vhy reason: default package */
public abstract class vhy {

    /* renamed from: vhy$a */
    public static final class a extends vhy {
        private final String a;

        a(String str) {
            this.a = (String) gec.a(str);
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

    /* renamed from: vhy$b */
    public static final class b extends vhy {
        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Success{}";
        }
    }

    vhy() {
    }

    public static vhy a(String str) {
        return new a(str);
    }
}
