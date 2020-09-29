package defpackage;

/* renamed from: vlb reason: default package */
public abstract class vlb {

    /* renamed from: vlb$a */
    public static final class a extends vlb {
        public final vla a;

        a(vla vla) {
            this.a = (vla) gcr.a(vla);
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
            sb.append("Fallback{signupConfiguration=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs.accept(this);
        }
    }

    /* renamed from: vlb$b */
    public static final class b extends vlb {
        public final vla a;

        b(vla vla) {
            this.a = (vla) gcr.a(vla);
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
            sb.append("Loaded{signupConfiguration=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<a> gcs, gcs<b> gcs2);

    vlb() {
    }

    public static vlb a(vla vla) {
        return new a(vla);
    }

    public static vlb b(vla vla) {
        return new b(vla);
    }
}
