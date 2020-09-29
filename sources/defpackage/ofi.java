package defpackage;

/* renamed from: ofi reason: default package */
public abstract class ofi {

    /* renamed from: ofi$a */
    public static final class a extends ofi {
        public final void a(ged<a> ged, ged<b> ged2) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Hidden{}";
        }
    }

    /* renamed from: ofi$b */
    public static final class b extends ofi {
        public final ofn a;
        public final oez b;
        public final ofj c;
        public final ofl d;
        public final ofg e;
        public final ofk f;
        public final oeo g;

        public b(ofn ofn, oez oez, ofj ofj, ofl ofl, ofg ofg, ofk ofk, oeo oeo) {
            this.a = (ofn) gec.a(ofn);
            this.b = (oez) gec.a(oez);
            this.c = (ofj) gec.a(ofj);
            this.d = (ofl) gec.a(ofl);
            this.e = (ofg) gec.a(ofg);
            this.f = (ofk) gec.a(ofk);
            this.g = (oeo) gec.a(oeo);
        }

        public final void a(ged<a> ged, ged<b> ged2) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b) && bVar.c.equals(this.c) && bVar.d.equals(this.d) && bVar.e.equals(this.e) && bVar.f.equals(this.f) && bVar.g.equals(this.g);
        }

        public final int hashCode() {
            return ((((((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Visible{tracksCarouselViewData=");
            sb.append(this.a);
            sb.append(", accessoryViewData=");
            sb.append(this.b);
            sb.append(", playPauseViewData=");
            sb.append(this.c);
            sb.append(", skipNextViewData=");
            sb.append(this.d);
            sb.append(", connectViewData=");
            sb.append(this.e);
            sb.append(", progressBarViewData=");
            sb.append(this.f);
            sb.append(", loggingData=");
            sb.append(this.g);
            sb.append('}');
            return sb.toString();
        }
    }

    ofi() {
    }

    public abstract void a(ged<a> ged, ged<b> ged2);
}
