package defpackage;

/* renamed from: mkw reason: default package */
public abstract class mkw {

    /* renamed from: mkw$a */
    public static final class a extends mkw {
        public final gzz a;

        a(gzz gzz) {
            this.a = (gzz) gcr.a(gzz);
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

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs2.accept(this);
        }
    }

    /* renamed from: mkw$b */
    public static final class b extends mkw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: mkw$c */
    public static final class c extends mkw {
        public final gzz a;

        c(gzz gzz) {
            this.a = (gzz) gcr.a(gzz);
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

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs3.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3);

    mkw() {
    }
}
