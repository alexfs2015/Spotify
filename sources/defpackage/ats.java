package defpackage;

/* renamed from: ats reason: default package */
public interface ats {

    /* renamed from: ats$a */
    public static final class a {
        public final att a;
        public final att b;

        public a(att att) {
            this(att, att);
        }

        public a(att att, att att2) {
            this.a = (att) bdl.a(att);
            this.b = (att) bdl.a(att2);
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
    }

    /* renamed from: ats$b */
    public static final class b implements ats {
        private final long a;
        private final a b;

        public b(long j) {
            this(j, 0);
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? att.a : new att(0, j2));
        }

        public final a a(long j) {
            return this.b;
        }

        public final long b() {
            return this.a;
        }

        public final boolean l_() {
            return false;
        }
    }

    a a(long j);

    long b();

    boolean l_();
}
