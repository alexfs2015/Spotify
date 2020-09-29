package defpackage;

/* renamed from: rnh reason: default package */
public abstract class rnh {

    /* renamed from: rnh$a */
    public static final class a extends rnh {
        final boolean a;

        a(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectivityChanged{online=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rnh$b */
    public static final class b extends rnh {
        final rmx a;

        b(rmx rmx) {
            this.a = (rmx) gec.a(rmx);
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
            sb.append("DataLoaded{profilePage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    rnh() {
    }

    public static rnh a(rmx rmx) {
        return new b(rmx);
    }

    public static rnh a(boolean z) {
        return new a(z);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2);
}
