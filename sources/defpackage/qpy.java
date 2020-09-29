package defpackage;

/* renamed from: qpy reason: default package */
public abstract class qpy {

    /* renamed from: qpy$a */
    public static final class a extends qpy {
        public final qpt a;
        private final int b;

        public a(qpt qpt, int i) {
            this.a = (qpt) gec.a(qpt);
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
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
            a aVar = (a) obj;
            return aVar.b == this.b && aVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EntityHeader{item=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qpy$b */
    public static final class b extends qpy {
        public final qpt a;
        private final int b;

        public b(qpt qpt, int i) {
            this.a = (qpt) gec.a(qpt);
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee2.apply(this);
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
            return bVar.b == this.b && bVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ResultItem{item=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qpy$c */
    public static final class c extends qpy {
        final int a;
        private final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
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
            return cVar.a == this.a && cVar.b == this.b;
        }

        public final int hashCode() {
            return ((Integer.valueOf(this.a).hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ResultsHeader{titleRes=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    qpy() {
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3);

    public abstract void a(ged<c> ged, ged<b> ged2, ged<a> ged3);
}
