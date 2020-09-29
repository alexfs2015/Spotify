package defpackage;

/* renamed from: pkj reason: default package */
public abstract class pkj {

    /* renamed from: pkj$a */
    public static final class a extends pkj {
        final String a;

        a(String str) {
            this.a = str;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return gec.a(((a) obj).a, this.a);
        }

        public final int hashCode() {
            String str = this.a;
            return (str != null ? str.hashCode() : 0) + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure{message=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pkj$b */
    public static final class b extends pkj {
        final hcs a;

        b(hcs hcs) {
            this.a = (hcs) gec.a(hcs);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee2.apply(this);
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
            sb.append("Success{hubsViewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    pkj() {
    }

    public static pkj a(hcs hcs) {
        return new b(hcs);
    }

    public static pkj a(String str) {
        return new a(str);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2);
}
