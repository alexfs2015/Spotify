package defpackage;

/* renamed from: vyt reason: default package */
public abstract class vyt {

    /* renamed from: vyt$a */
    public static final class a extends vyt {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee.apply(this);
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<c> ged3, ged<e> ged4, ged<d> ged5) {
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

    /* renamed from: vyt$b */
    public static final class b extends vyt {
        public final int a;
        private final String b;

        b(String str, int i) {
            this.b = (String) gec.a(str);
            this.a = i;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee2.apply(this);
        }

        public final String a() {
            return this.b;
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<c> ged3, ged<e> ged4, ged<d> ged5) {
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

    /* renamed from: vyt$c */
    public static final class c extends vyt {
        private final String a;

        c(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee3.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<c> ged3, ged<e> ged4, ged<d> ged5) {
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
            sb.append("ValidUnverified{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vyt$d */
    public static final class d extends vyt {
        private final String a;

        d(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee5.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<c> ged3, ged<e> ged4, ged<d> ged5) {
            ged5.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ValidVerified{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vyt$e */
    public static final class e extends vyt {
        private final String a;

        e(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5) {
            return gee4.apply(this);
        }

        public final String a() {
            return this.a;
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<c> ged3, ged<e> ged4, ged<d> ged5) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Verifying{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vyt() {
    }

    public static vyt a(String str) {
        return new c(str);
    }

    public static vyt a(String str, int i) {
        return new b(str, i);
    }

    public static vyt b(String str) {
        return new e(str);
    }

    public static vyt c(String str) {
        return new d(str);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<c, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5);

    public abstract void a(ged<a> ged, ged<b> ged2, ged<c> ged3, ged<e> ged4, ged<d> ged5);
}
