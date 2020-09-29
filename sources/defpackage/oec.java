package defpackage;

/* renamed from: oec reason: default package */
public abstract class oec {

    /* renamed from: oec$a */
    public static final class a extends oec {
        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoTrack{}";
        }
    }

    /* renamed from: oec$b */
    public static final class b extends oec {
        public final String a;
        public final oef b;
        public final oeb c;
        public final oed d;

        public b(String str, oef oef, oeb oeb, oed oed) {
            this.a = (String) gec.a(str);
            this.b = (oef) gec.a(oef);
            this.c = (oeb) gec.a(oeb);
            this.d = (oed) gec.a(oed);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b) && bVar.c.equals(this.c) && bVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("WithTracks{contextUri=");
            sb.append(this.a);
            sb.append(", tracks=");
            sb.append(this.b);
            sb.append(", playbackState=");
            sb.append(this.c);
            sb.append(", restrictions=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    oec() {
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2);
}
