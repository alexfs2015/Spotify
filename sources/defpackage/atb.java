package defpackage;

/* renamed from: atb reason: default package */
public interface atb {

    /* renamed from: atb$a */
    public static final class a {
        public final atc a;
        public final atc b;

        public a(atc atc) {
            this(atc, atc);
        }

        public a(atc atc, atc atc2) {
            this.a = (atc) bcu.a(atc);
            this.b = (atc) bcu.a(atc2);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder(", ");
                sb2.append(this.b);
                str = sb2.toString();
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b);
            }
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* renamed from: atb$b */
    public static final class b implements atb {
        private final long a;
        private final a b;

        public final boolean l_() {
            return false;
        }

        public b(long j) {
            this(j, 0);
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? atc.a : new atc(0, j2));
        }

        public final long b() {
            return this.a;
        }

        public final a a(long j) {
            return this.b;
        }
    }

    a a(long j);

    long b();

    boolean l_();
}
