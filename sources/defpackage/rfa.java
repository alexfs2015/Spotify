package defpackage;

/* renamed from: rfa reason: default package */
public abstract class rfa {

    /* renamed from: rfa$a */
    public static final class a extends rfa {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotPlaying{}";
        }
    }

    /* renamed from: rfa$b */
    public static final class b extends rfa {
        public final String a;
        private final String b;
        private final String c;

        public b(String str, String str2, String str3) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4) {
            return gee2.apply(this);
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
    }

    /* renamed from: rfa$c */
    public static final class c extends rfa {
        public final String a;
        private final String b;
        private final String c;

        public c(String str, String str2, String str3) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4) {
            return gee.apply(this);
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
    }

    /* renamed from: rfa$d */
    public static final class d extends rfa {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unknown{}";
        }
    }

    rfa() {
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4);
}
