package defpackage;

/* renamed from: gaq reason: default package */
public abstract class gaq {

    /* renamed from: gaq$a */
    public static final class a extends gaq {
        public final gaw a;

        a(gaw gaw) {
            this.a = (gaw) gcr.a(gaw);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Authentication{screen=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8) {
            gcs6.accept(this);
        }
    }

    /* renamed from: gaq$b */
    public static final class b extends gaq {
        public final gaw a;
        public final gas b;
        public final gat c;

        b(gaw gaw, gas gas, gat gat) {
            this.a = (gaw) gcr.a(gaw);
            this.b = (gas) gcr.a(gas);
            this.c = (gat) gcr.a(gat);
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
            sb.append("ButtonInteraction{screen=");
            sb.append(this.a);
            sb.append(", button=");
            sb.append(this.b);
            sb.append(", dialog=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8) {
            gcs3.accept(this);
        }
    }

    /* renamed from: gaq$c */
    public static final class c extends gaq {
        public final gaw a;
        public final gat b;

        c(gaw gaw, gat gat) {
            this.a = (gaw) gcr.a(gaw);
            this.b = (gat) gcr.a(gat);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DialogImpression{screen=");
            sb.append(this.a);
            sb.append(", dialog=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8) {
            gcs5.accept(this);
        }
    }

    /* renamed from: gaq$d */
    public static final class d extends gaq {
        public final gaw a;
        public final gau b;
        public final gav c;
        public final String d;

        d(gaw gaw, gau gau, gav gav, String str) {
            this.a = (gaw) gcr.a(gaw);
            this.b = (gau) gcr.a(gau);
            this.c = (gav) gcr.a(gav);
            this.d = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b) && dVar.c.equals(this.c) && dVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{screen=");
            sb.append(this.a);
            sb.append(", errorType=");
            sb.append(this.b);
            sb.append(", input=");
            sb.append(this.c);
            sb.append(", errorCode=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8) {
            gcs4.accept(this);
        }
    }

    /* renamed from: gaq$e */
    public static final class e extends gaq {
        public final gaw a;
        public final gav b;

        e(gaw gaw, gav gav) {
            this.a = (gaw) gcr.a(gaw);
            this.b = (gav) gcr.a(gav);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a.equals(this.a) && eVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InputInteraction{screen=");
            sb.append(this.a);
            sb.append(", input=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8) {
            gcs2.accept(this);
        }
    }

    /* renamed from: gaq$f */
    public static final class f extends gaq {
        public final gar a;

        f(gar gar) {
            this.a = (gar) gcr.a(gar);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PsesEvent{psesEvent=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8) {
            gcs7.accept(this);
        }
    }

    /* renamed from: gaq$g */
    public static final class g extends gaq {
        public final gaw a;

        g(gaw gaw) {
            this.a = (gaw) gcr.a(gaw);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ScreenImpression{screen=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8) {
            gcs.accept(this);
        }
    }

    /* renamed from: gaq$h */
    public static final class h extends gaq {
        public final gaw a;
        public final gax b;

        h(gaw gaw, gax gax) {
            this.a = (gaw) gcr.a(gaw);
            this.b = (gax) gcr.a(gax);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a.equals(this.a) && hVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SmartlockEvent{screen=");
            sb.append(this.a);
            sb.append(", smartlockEvent=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8) {
            gcs8.accept(this);
        }
    }

    public abstract void a(gcs<g> gcs, gcs<e> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<f> gcs7, gcs<h> gcs8);

    gaq() {
    }

    public static gaq a(gaw gaw) {
        return new g(gaw);
    }

    public static gaq a(gaw gaw, gav gav) {
        return new e(gaw, gav);
    }

    public static gaq a(gaw gaw, gas gas, gat gat) {
        return new b(gaw, gas, gat);
    }

    public static gaq a(gaw gaw, gau gau, gav gav, String str) {
        return new d(gaw, gau, gav, str);
    }

    public static gaq a(gaw gaw, gat gat) {
        return new c(gaw, gat);
    }

    public static gaq b(gaw gaw) {
        return new a(gaw);
    }

    public static gaq a(gar gar) {
        return new f(gar);
    }

    public static gaq a(gaw gaw, gax gax) {
        return new h(gaw, gax);
    }
}
