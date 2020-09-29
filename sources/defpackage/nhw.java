package defpackage;

/* renamed from: nhw reason: default package */
public abstract class nhw {

    /* renamed from: nhw$a */
    public static final class a extends nhw {
        public final nhz a;

        a(nhz nhz) {
            this.a = (nhz) gcr.a(nhz);
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
            sb.append("FetchBackendHome{homeModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nhw$b */
    public static final class b extends nhw {
        public final nhz a;

        b(nhz nhz) {
            this.a = (nhz) gcr.a(nhz);
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
            sb.append("FetchCachedHome{homeModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nhw$c */
    public static final class c extends nhw {
        public final nhz a;

        c(nhz nhz) {
            this.a = (nhz) gcr.a(nhz);
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
            sb.append("FetchOfflineHome{homeModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    nhw() {
    }

    public static nhw a(nhz nhz) {
        return new a(nhz);
    }

    public static nhw b(nhz nhz) {
        return new c(nhz);
    }
}
