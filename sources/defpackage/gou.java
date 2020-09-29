package defpackage;

/* renamed from: gou reason: default package */
public abstract class gou {

    /* renamed from: gou$a */
    public static final class a extends gou {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee2.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure{errorCode=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gou$b */
    public static final class b extends gou {
        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Success{}";
        }
    }

    gou() {
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2);

    public abstract void a(ged<b> ged, ged<a> ged2);
}
