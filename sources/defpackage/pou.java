package defpackage;

/* renamed from: pou reason: default package */
public abstract class pou {

    /* renamed from: pou$a */
    public static final class a extends pou {
        private final prk a;
        private final ppb b;

        a(prk prk, ppb ppb) {
            this.a = (prk) gcr.a(prk);
            this.b = (ppb) gcr.a(ppb);
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

    /* renamed from: pou$b */
    public static final class b extends pou {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotDisplaying{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: pou$c */
    public static final class c extends pou {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "UnavailableForDisplay{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    pou() {
    }

    public static pou a(prk prk, ppb ppb) {
        return new a(prk, ppb);
    }
}
