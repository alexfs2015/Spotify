package defpackage;

/* renamed from: sfd reason: default package */
public abstract class sfd {

    /* renamed from: sfd$a */
    public static final class a extends sfd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs.accept(this);
        }
    }

    /* renamed from: sfd$b */
    public static final class b extends sfd {
        final String a;

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
            sb.append("Suggesting{requestId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<a> gcs, gcs<b> gcs2);

    sfd() {
    }
}
