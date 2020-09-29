package defpackage;

/* renamed from: qwl reason: default package */
public abstract class qwl {

    /* renamed from: qwl$a */
    public static final class a extends qwl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotPlaying{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4) {
            return gct3.apply(this);
        }
    }

    /* renamed from: qwl$b */
    public static final class b extends qwl {
        public final String a;
        private final String b;
        private final String c;

        public b(String str, String str2, String str3) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
        }

        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b) && bVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Paused{trackUri=");
            sb.append(this.a);
            sb.append(", trackUid=");
            sb.append(this.b);
            sb.append(", contextUri=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: qwl$c */
    public static final class c extends qwl {
        public final String a;
        private final String b;
        private final String c;

        public c(String str, String str2, String str3) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
        }

        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Playing{trackUri=");
            sb.append(this.a);
            sb.append(", trackUid=");
            sb.append(this.b);
            sb.append(", contextUri=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4) {
            return gct.apply(this);
        }
    }

    /* renamed from: qwl$d */
    public static final class d extends qwl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unknown{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4);

    qwl() {
    }
}
