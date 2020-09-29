package defpackage;

/* renamed from: moc reason: default package */
public abstract class moc {

    /* renamed from: moc$a */
    public static final class a extends moc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Close{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: moc$b */
    public static final class b extends moc {
        private final String a;
        private final String b;

        b(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Save{username=");
            sb.append(this.a);
            sb.append(", displayName=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    moc() {
    }
}
