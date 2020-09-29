package defpackage;

/* renamed from: gcp reason: default package */
public abstract class gcp {

    /* renamed from: gcp$a */
    public static final class a extends gcp {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Facebook{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: gcp$b */
    public static final class b extends gcp {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotFound{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: gcp$c */
    public static final class c extends gcp {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UserPassword{username=");
            sb.append(this.a);
            sb.append(", password=***");
            sb.append('}');
            return sb.toString();
        }
    }

    gcp() {
    }
}
