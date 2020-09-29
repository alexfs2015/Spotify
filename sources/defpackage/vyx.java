package defpackage;

/* renamed from: vyx reason: default package */
public abstract class vyx {

    /* renamed from: vyx$a */
    public static final class a extends vyx {
        private final String a;

        public a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged3.accept(this);
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
            sb.append("Error{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vyx$b */
    public static final class b extends vyx {
        public final int a;
        private final String b;

        b(String str, int i) {
            this.b = (String) gec.a(str);
            this.a = i;
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee2.apply(this);
        }

        public final String a() {
            return this.b;
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.b.hashCode() + 0) * 31) + Integer.valueOf(this.a).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid{email=");
            sb.append(this.b);
            sb.append(", status=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vyx$c */
    public static final class c extends vyx {
        public final String a;
        private final String b;

        c(String str, String str2) {
            this.b = (String) gec.a(str);
            this.a = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
        }

        public final String a() {
            return this.b;
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b.equals(this.b) && cVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.b.hashCode() + 0) * 31) + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Valid{email=");
            sb.append(this.b);
            sb.append(", nameSuggestion=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vyx() {
    }

    public static vyx a(String str, int i) {
        return new b(str, i);
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3);

    public abstract void a(ged<c> ged, ged<b> ged2, ged<a> ged3);
}
