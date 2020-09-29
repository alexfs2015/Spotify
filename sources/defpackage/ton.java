package defpackage;

/* renamed from: ton reason: default package */
public abstract class ton {

    /* renamed from: ton$a */
    public static final class a extends ton {
        final Throwable a;

        a(Throwable th) {
            this.a = (Throwable) gec.a(th);
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<c> ged3, ged<a> ged4) {
            ged4.accept(this);
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
            sb.append("Error{throwable=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ton$b */
    public static final class b extends ton {
        b() {
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<c> ged3, ged<a> ged4) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InProgress{}";
        }
    }

    /* renamed from: ton$c */
    public static final class c extends ton {
        c() {
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<c> ged3, ged<a> ged4) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Offline{}";
        }
    }

    /* renamed from: ton$d */
    public static final class d extends ton {
        final tps a;

        d(tps tps) {
            this.a = (tps) gec.a(tps);
        }

        public final void a(ged<b> ged, ged<d> ged2, ged<c> ged3, ged<a> ged4) {
            ged2.accept(this);
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
            sb.append("Successful{pivotItemList=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    ton() {
    }

    public static ton a(Throwable th) {
        return new a(th);
    }

    public static ton a(tps tps) {
        return new d(tps);
    }

    public abstract void a(ged<b> ged, ged<d> ged2, ged<c> ged3, ged<a> ged4);
}
