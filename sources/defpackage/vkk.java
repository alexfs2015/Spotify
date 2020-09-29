package defpackage;

/* renamed from: vkk reason: default package */
public abstract class vkk {

    /* renamed from: vkk$a */
    public static final class a extends vkk {
        public final vkm a;

        a(vkm vkm) {
            this.a = (vkm) gcr.a(vkm);
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

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<a> gcs3, gcs<c> gcs4) {
            gcs3.accept(this);
        }
    }

    /* renamed from: vkk$b */
    public static final class b extends vkk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unverified{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<a> gcs3, gcs<c> gcs4) {
            gcs.accept(this);
        }
    }

    /* renamed from: vkk$c */
    public static final class c extends vkk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Valid{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<a> gcs3, gcs<c> gcs4) {
            gcs4.accept(this);
        }
    }

    /* renamed from: vkk$d */
    public static final class d extends vkk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Verifying{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<b> gcs, gcs<d> gcs2, gcs<a> gcs3, gcs<c> gcs4) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<d> gcs2, gcs<a> gcs3, gcs<c> gcs4);

    vkk() {
    }

    public static vkk a(vkm vkm) {
        return new a(vkm);
    }
}
