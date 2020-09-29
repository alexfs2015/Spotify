package defpackage;

/* renamed from: ted reason: default package */
public abstract class ted {

    /* renamed from: ted$a */
    public static final class a extends ted {
        final Throwable a;

        a(Throwable th) {
            this.a = (Throwable) gcr.a(th);
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<c> gcs3, gcs<a> gcs4) {
            gcs4.accept(this);
        }
    }

    /* renamed from: ted$b */
    public static final class b extends ted {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InProgress{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<c> gcs3, gcs<a> gcs4) {
            gcs.accept(this);
        }
    }

    /* renamed from: ted$c */
    public static final class c extends ted {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Offline{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<c> gcs3, gcs<a> gcs4) {
            gcs3.accept(this);
        }
    }

    /* renamed from: ted$d */
    public static final class d extends ted {
        final tfi a;

        d(tfi tfi) {
            this.a = (tfi) gcr.a(tfi);
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<c> gcs3, gcs<a> gcs4) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<d> gcs2, gcs<c> gcs3, gcs<a> gcs4);

    ted() {
    }

    public static ted a(tfi tfi) {
        return new d(tfi);
    }

    public static ted a(Throwable th) {
        return new a(th);
    }
}
