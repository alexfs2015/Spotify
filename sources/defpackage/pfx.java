package defpackage;

/* renamed from: pfx reason: default package */
public abstract class pfx {

    /* renamed from: pfx$a */
    public static final class a extends pfx {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchViewModelFromBackend{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: pfx$b */
    public static final class b extends pfx {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchViewModelFromCache{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: pfx$c */
    public static final class c extends pfx {
        public final pga a;

        c(pga pga) {
            this.a = (pga) gcr.a(pga);
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
            sb.append("LogImpression{model=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pfx$d */
    public static final class d extends pfx {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHome{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }
    }

    /* renamed from: pfx$e */
    public static final class e extends pfx {
        private final gzz a;
        private final long b;

        e(gzz gzz, long j) {
            this.a = (gzz) gcr.a(gzz);
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.b == this.b && eVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Long.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SaveViewModelToCache{viewModel=");
            sb.append(this.a);
            sb.append(", ttl=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pfx$f */
    public static final class f extends pfx {
        public final long a;

        f(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof f) && ((f) obj).a == this.a;
        }

        public final int hashCode() {
            return Long.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("WaitToShowLoading{waitTimeMs=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    pfx() {
    }

    public static pfx a(gzz gzz, long j) {
        return new e(gzz, j);
    }

    public static pfx a(pga pga) {
        return new c(pga);
    }
}
