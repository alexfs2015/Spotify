package defpackage;

/* renamed from: gqg reason: default package */
public abstract class gqg {

    /* renamed from: gqg$a */
    public static final class a extends gqg {
        public final String a;

        public a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3) {
            return gee2.apply(this);
        }

        public final void a(ged<c> ged, ged<a> ged2, ged<b> ged3) {
            ged2.accept(this);
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
            sb.append("Recoverable{errorMessage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gqg$b */
    public static final class b extends gqg {
        public final <R_> R_ a(gee<c, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3) {
            return gee3.apply(this);
        }

        public final void a(ged<c> ged, ged<a> ged2, ged<b> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TokenExpired{}";
        }
    }

    /* renamed from: gqg$c */
    public static final class c extends gqg {
        public final String a;

        c(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3) {
            return gee.apply(this);
        }

        public final void a(ged<c> ged, ged<a> ged2, ged<b> ged3) {
            ged.accept(this);
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
            sb.append("Unknown{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    gqg() {
    }

    public static gqg a(String str) {
        return new c(str);
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<a, R_> gee2, gee<b, R_> gee3);

    public abstract void a(ged<c> ged, ged<a> ged2, ged<b> ged3);
}
