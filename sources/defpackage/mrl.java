package defpackage;

/* renamed from: mrl reason: default package */
public abstract class mrl {

    /* renamed from: mrl$a */
    public static final class a extends mrl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Pause{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: mrl$b */
    public static final class b extends mrl {
        private final String a;

        b(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("Play{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    mrl() {
    }
}
