package defpackage;

/* renamed from: gov reason: default package */
public abstract class gov {

    /* renamed from: gov$a */
    public static final class a extends gov {
        public final String a;
        public final long b;
        public final String c;
        public final long d;

        public a(String str, long j, String str2, long j2) {
            this.a = (String) gec.a(str);
            this.b = j;
            this.c = (String) gec.a(str2);
            this.d = j2;
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.b == this.b && aVar.d == this.d && aVar.a.equals(this.a) && aVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + Long.valueOf(this.b).hashCode()) * 31) + this.c.hashCode()) * 31) + Long.valueOf(this.d).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CodeRequired{challengeId=");
            sb.append(this.a);
            sb.append(", codeLength=");
            sb.append(this.b);
            sb.append(", canonicalPhoneNumber=");
            sb.append(this.c);
            sb.append(", expiresIn=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gov$b */
    public static final class b extends gov {
        public final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee3.apply(this);
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
            sb.append("CodeSuccess{identifierToken=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gov$c */
    public static final class c extends gov {
        public final int a;
        public final String b;

        public c(int i, String str) {
            this.a = i;
            this.b = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a == this.a && cVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((Integer.valueOf(this.a).hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure{status=");
            sb.append(this.a);
            sb.append(", error=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gov$d */
    public static final class d extends gov {
        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Success{}";
        }
    }

    gov() {
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4);
}
