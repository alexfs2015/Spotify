package defpackage;

/* renamed from: qyo reason: default package */
public abstract class qyo {

    /* renamed from: qyo$a */
    public static final class a extends qyo {
        public final String a;

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
            sb.append("LoadPrefsModel{username=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qyo$b */
    public static final class b extends qyo {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadUsername{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    qyo() {
    }

    public static qyo a(String str) {
        return new a(str);
    }
}
