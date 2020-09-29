package defpackage;

/* renamed from: pqp reason: default package */
public abstract class pqp {

    /* renamed from: pqp$a */
    public static final class a extends pqp {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CloseClicked{}";
        }
    }

    /* renamed from: pqp$b */
    public static final class b extends pqp {
        final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4) {
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
            sb.append("SaveClicked{displayName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pqp$c */
    public static final class c extends pqp {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SaveFailed{}";
        }
    }

    /* renamed from: pqp$d */
    public static final class d extends pqp {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SaveSuccessful{}";
        }
    }

    pqp() {
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4);
}
