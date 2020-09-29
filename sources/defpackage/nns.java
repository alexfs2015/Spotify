package defpackage;

/* renamed from: nns reason: default package */
public abstract class nns {

    /* renamed from: nns$a */
    public static final class a extends nns {
        public final nnv a;

        a(nnv nnv) {
            this.a = (nnv) gec.a(nnv);
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

    /* renamed from: nns$b */
    public static final class b extends nns {
        public final nnv a;

        b(nnv nnv) {
            this.a = (nnv) gec.a(nnv);
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

    /* renamed from: nns$c */
    public static final class c extends nns {
        public final nnv a;

        c(nnv nnv) {
            this.a = (nnv) gec.a(nnv);
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

    nns() {
    }

    public static nns a(nnv nnv) {
        return new a(nnv);
    }

    public static nns b(nnv nnv) {
        return new c(nnv);
    }
}
