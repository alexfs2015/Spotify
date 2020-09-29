package defpackage;

/* renamed from: vkc reason: default package */
public abstract class vkc {

    /* renamed from: vkc$a */
    public static final class a extends vkc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Cancelled{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3, gcs<d> gcs4) {
            gcs2.accept(this);
        }
    }

    /* renamed from: vkc$b */
    public static final class b extends vkc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoggedIn{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3, gcs<d> gcs4) {
            gcs.accept(this);
        }
    }

    /* renamed from: vkc$c */
    public static final class c extends vkc {
        public final String a;

        c(String str) {
            this.a = (String) gcr.a(str);
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

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3, gcs<d> gcs4) {
            gcs3.accept(this);
        }
    }

    /* renamed from: vkc$d */
    public static final class d extends vkc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unhandled{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3, gcs<d> gcs4) {
            gcs4.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3, gcs<d> gcs4);

    vkc() {
    }

    public static vkc a(String str) {
        return new c(str);
    }
}
