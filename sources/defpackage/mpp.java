package defpackage;

/* renamed from: mpp reason: default package */
public abstract class mpp {

    /* renamed from: mpp$a */
    public static final class a extends mpp {
        public final hcs a;

        a(hcs hcs) {
            this.a = (hcs) gec.a(hcs);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
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
            sb.append("Error{hubsViewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: mpp$b */
    public static final class b extends mpp {
        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: mpp$c */
    public static final class c extends mpp {
        public final hcs a;

        c(hcs hcs) {
            this.a = (hcs) gec.a(hcs);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
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
            sb.append("WithData{hubsViewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    mpp() {
    }

    public abstract void a(ged<b> ged, ged<a> ged2, ged<c> ged3);
}
