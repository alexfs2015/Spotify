package defpackage;

/* renamed from: vzv reason: default package */
public abstract class vzv {

    /* renamed from: vzv$a */
    public static final class a extends vzv {
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
            sb.append("LocalVerifyPassword{password=***");
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzv$b */
    public static final class b extends vzv {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToNext{}";
        }
    }

    /* renamed from: vzv$c */
    public static final class c extends vzv {
        public final String a;

        c(String str) {
            this.a = (String) gec.a(str);
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

    vzv() {
    }
}
