package defpackage;

/* renamed from: nyw reason: default package */
public abstract class nyw {

    /* renamed from: nyw$a */
    public static final class a extends nyw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Hidden{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs.accept(this);
        }
    }

    /* renamed from: nyw$b */
    public static final class b extends nyw {
        public final nzb a;
        public final nyn b;
        public final nyx c;
        public final nyz d;
        public final nyu e;
        public final nyy f;

        public b(nzb nzb, nyn nyn, nyx nyx, nyz nyz, nyu nyu, nyy nyy) {
            this.a = (nzb) gcr.a(nzb);
            this.b = (nyn) gcr.a(nyn);
            this.c = (nyx) gcr.a(nyx);
            this.d = (nyz) gcr.a(nyz);
            this.e = (nyu) gcr.a(nyu);
            this.f = (nyy) gcr.a(nyy);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b) && bVar.c.equals(this.c) && bVar.d.equals(this.d) && bVar.e.equals(this.e) && bVar.f.equals(this.f);
        }

        public final int hashCode() {
            return ((((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
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
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<a> gcs, gcs<b> gcs2);

    nyw() {
    }
}
