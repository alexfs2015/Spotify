package defpackage;

/* renamed from: rqo reason: default package */
public abstract class rqo {

    /* renamed from: rqo$a */
    public static final class a extends rqo {
        final String a;
        final String b;

        a(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MissingPermissions{requestPermissionsUrl=");
            sb.append(this.a);
            sb.append(", authSuccessUrl=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<c> gcs2, gcs<b> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: rqo$b */
    public static final class b extends rqo {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Nothing{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<a> gcs, gcs<c> gcs2, gcs<b> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: rqo$c */
    public static final class c extends rqo {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowToast{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<a> gcs, gcs<c> gcs2, gcs<b> gcs3) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<a> gcs, gcs<c> gcs2, gcs<b> gcs3);

    rqo() {
    }
}
