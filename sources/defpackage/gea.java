package defpackage;

/* renamed from: gea reason: default package */
public abstract class gea {

    /* renamed from: gea$a */
    public static final class a extends gea {
        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Facebook{}";
        }
    }

    /* renamed from: gea$b */
    public static final class b extends gea {
        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotFound{}";
        }
    }

    /* renamed from: gea$c */
    public static final class c extends gea {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
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

    gea() {
    }
}
