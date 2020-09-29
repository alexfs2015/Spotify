package defpackage;

/* renamed from: vmp reason: default package */
public abstract class vmp {

    /* renamed from: vmp$a */
    public static final class a extends vmp {
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
            sb.append("LocalVerifyPassword{password=***");
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vmp$b */
    public static final class b extends vmp {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToNext{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: vmp$c */
    public static final class c extends vmp {
        public final String a;

        c(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RemoteVerifyPassword{password=***");
            sb.append('}');
            return sb.toString();
        }
    }

    vmp() {
    }
}
