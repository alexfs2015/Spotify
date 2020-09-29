package defpackage;

/* renamed from: qhk reason: default package */
public abstract class qhk {

    /* renamed from: qhk$a */
    public static final class a extends qhk {
        public final qhf a;
        private final int b;

        public a(qhf qhf, int i) {
            this.a = (qhf) gcr.a(qhf);
            this.b = i;
        }

        public final int a() {
            return this.b;
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

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: qhk$b */
    public static final class b extends qhk {
        public final qhf a;
        private final int b;

        public b(qhf qhf, int i) {
            this.a = (qhf) gcr.a(qhf);
            this.b = i;
        }

        public final int a() {
            return this.b;
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

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: qhk$c */
    public static final class c extends qhk {
        final int a;
        private final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
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

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3);

    public abstract void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3);

    qhk() {
    }
}
