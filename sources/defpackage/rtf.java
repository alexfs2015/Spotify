package defpackage;

/* renamed from: rtf reason: default package */
public abstract class rtf {

    /* renamed from: rtf$a */
    public static final class a extends rtf {
        public final String a;

        a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee2.apply(this);
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
            sb.append("MessageAborted{pattern=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rtf$b */
    public static final class b extends rtf {
        public final String a;

        b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee.apply(this);
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
            sb.append("MessageRequested{pattern=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    rtf() {
    }

    public static rtf a(String str) {
        return new b(str);
    }

    public static rtf b(String str) {
        return new a(str);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2);
}
