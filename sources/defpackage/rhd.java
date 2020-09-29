package defpackage;

/* renamed from: rhd reason: default package */
public abstract class rhd {

    /* renamed from: rhd$a */
    public static final class a extends rhd {
        public final String a;

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
            sb.append("LoadPrefsModel{username=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rhd$b */
    public static final class b extends rhd {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadUsername{}";
        }
    }

    rhd() {
    }

    public static rhd a(String str) {
        return new a(str);
    }
}
