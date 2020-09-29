package defpackage;

/* renamed from: nxp reason: default package */
public abstract class nxp {

    /* renamed from: nxp$a */
    public static final class a extends nxp {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoTrack{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2) {
            return gct.apply(this);
        }
    }

    /* renamed from: nxp$b */
    public static final class b extends nxp {
        public final String a;
        public final nxs b;
        public final nxo c;
        public final nxq d;

        public b(String str, nxs nxs, nxo nxo, nxq nxq) {
            this.a = (String) gcr.a(str);
            this.b = (nxs) gcr.a(nxs);
            this.c = (nxo) gcr.a(nxo);
            this.d = (nxq) gcr.a(nxq);
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

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2);

    nxp() {
    }
}
