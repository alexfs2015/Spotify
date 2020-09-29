package defpackage;

/* renamed from: qde reason: default package */
public abstract class qde {

    /* renamed from: qde$a */
    public static final class a extends qde {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ConnectionRegained{}";
        }
    }

    /* renamed from: qde$b */
    public static final class b extends qde {
        final hcs a;

        b(hcs hcs) {
            this.a = (hcs) gec.a(hcs);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
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
            sb.append("HubsFetchError{hubsViewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qde$c */
    public static final class c extends qde {
        final hcs a;

        c(hcs hcs) {
            this.a = (hcs) gec.a(hcs);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
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
            sb.append("HubsFetchSuccess{hubsViewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    qde() {
    }

    public static qde a(hcs hcs) {
        return new c(hcs);
    }

    public static qde b(hcs hcs) {
        return new b(hcs);
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3);
}
