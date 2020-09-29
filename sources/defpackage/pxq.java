package defpackage;

/* renamed from: pxq reason: default package */
public abstract class pxq {

    /* renamed from: pxq$a */
    public static final class a extends pxq {
        private final qag a;
        private final pxx b;

        a(qag qag, pxx pxx) {
            this.a = (qag) gec.a(qag);
            this.b = (pxx) gec.a(pxx);
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
            sb.append("Displaying{trigger=");
            sb.append(this.a);
            sb.append(", quicksilverMessage=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pxq$b */
    public static final class b extends pxq {
        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotDisplaying{}";
        }
    }

    /* renamed from: pxq$c */
    public static final class c extends pxq {
        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "UnavailableForDisplay{}";
        }
    }

    pxq() {
    }

    public static pxq a(qag qag, pxx pxx) {
        return new a(qag, pxx);
    }
}
