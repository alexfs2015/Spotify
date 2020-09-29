package defpackage;

/* renamed from: vxi reason: default package */
public abstract class vxi {

    /* renamed from: vxi$a */
    public static final class a extends vxi {
        a() {
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3, ged<d> ged4) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Cancelled{}";
        }
    }

    /* renamed from: vxi$b */
    public static final class b extends vxi {
        b() {
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3, ged<d> ged4) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoggedIn{}";
        }
    }

    /* renamed from: vxi$c */
    public static final class c extends vxi {
        public final String a;

        c(String str) {
            this.a = (String) gec.a(str);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3, ged<d> ged4) {
            ged3.accept(this);
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
            sb.append("Redirect{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vxi$d */
    public static final class d extends vxi {
        d() {
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3, ged<d> ged4) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unhandled{}";
        }
    }

    vxi() {
    }

    public static vxi a(String str) {
        return new c(str);
    }

    public abstract void a(ged<b> ged, ged<a> ged2, ged<c> ged3, ged<d> ged4);
}
