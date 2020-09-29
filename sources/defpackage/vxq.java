package defpackage;

/* renamed from: vxq reason: default package */
public abstract class vxq {

    /* renamed from: vxq$a */
    public static final class a extends vxq {
        public final vxs a;

        a(vxs vxs) {
            this.a = (vxs) gec.a(vxs);
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<a> ged3, ged<c> ged4) {
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
            sb.append("Invalid{reason=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vxq$b */
    public static final class b extends vxq {
        public final void a(ged<b> ged, ged<d> ged2, ged<a> ged3, ged<c> ged4) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unverified{}";
        }
    }

    /* renamed from: vxq$c */
    public static final class c extends vxq {
        public final void a(ged<b> ged, ged<d> ged2, ged<a> ged3, ged<c> ged4) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Valid{}";
        }
    }

    /* renamed from: vxq$d */
    public static final class d extends vxq {
        public final void a(ged<b> ged, ged<d> ged2, ged<a> ged3, ged<c> ged4) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Verifying{}";
        }
    }

    vxq() {
    }

    public static vxq a(vxs vxs) {
        return new a(vxs);
    }

    public abstract void a(ged<b> ged, ged<d> ged2, ged<a> ged3, ged<c> ged4);
}
