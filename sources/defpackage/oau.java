package defpackage;

/* renamed from: oau reason: default package */
public abstract class oau {

    /* renamed from: oau$a */
    public static final class a extends oau {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoggedIn{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs.accept(this);
        }
    }

    /* renamed from: oau$b */
    public static final class b extends oau {
        public final String a;

        public b(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Validated{identifierToken=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<a> gcs, gcs<b> gcs2);

    oau() {
    }
}
