package defpackage;

/* renamed from: pnj reason: default package */
public abstract class pnj {

    /* renamed from: pnj$a */
    public static final class a extends pnj {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchViewModelFromBackend{}";
        }
    }

    /* renamed from: pnj$b */
    public static final class b extends pnj {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchViewModelFromCache{}";
        }
    }

    /* renamed from: pnj$c */
    public static final class c extends pnj {
        public final pnm a;

        c(pnm pnm) {
            this.a = (pnm) gec.a(pnm);
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

    /* renamed from: pnj$d */
    public static final class d extends pnj {
        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHome{}";
        }
    }

    /* renamed from: pnj$e */
    public static final class e extends pnj {
        private final hcs a;
        private final long b;

        e(hcs hcs, long j) {
            this.a = (hcs) gec.a(hcs);
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

    /* renamed from: pnj$f */
    public static final class f extends pnj {
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

    pnj() {
    }

    public static pnj a(hcs hcs, long j) {
        return new e(hcs, j);
    }

    public static pnj a(pnm pnm) {
        return new c(pnm);
    }
}
