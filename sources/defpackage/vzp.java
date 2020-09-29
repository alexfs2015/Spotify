package defpackage;

/* renamed from: vzp reason: default package */
public abstract class vzp {

    /* renamed from: vzp$a */
    public static final class a extends vzp {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee.apply(this);
        }

        public final void a(ged<a> ged, ged<b> ged2) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }
    }

    /* renamed from: vzp$b */
    public static final class b extends vzp {
        private final String a;

        b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee2.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<a> ged, ged<b> ged2) {
            ged2.accept(this);
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
            sb.append("Valid{name=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vzp() {
    }

    public static vzp a(String str) {
        return new b(str);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2);

    public abstract void a(ged<a> ged, ged<b> ged2);
}
