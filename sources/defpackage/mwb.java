package defpackage;

/* renamed from: mwb reason: default package */
public abstract class mwb {

    /* renamed from: mwb$a */
    public static final class a extends mwb {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Pause{}";
        }
    }

    /* renamed from: mwb$b */
    public static final class b extends mwb {
        private final String a;

        b(String str) {
            this.a = (String) gec.a(str);
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

    mwb() {
    }
}
