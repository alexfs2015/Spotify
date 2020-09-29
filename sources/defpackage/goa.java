package defpackage;

/* renamed from: goa reason: default package */
public abstract class goa {

    /* renamed from: goa$a */
    public static final class a extends goa {
        public final goh a;

        public a(goh goh) {
            this.a = (goh) gcr.a(goh);
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

        public final void a(gcs<g> gcs, gcs<f> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<e> gcs7) {
            gcs6.accept(this);
        }
    }

    /* renamed from: goa$b */
    public static final class b extends goa {
        public final goh a;
        public final gob b;
        public final goc c;

        b(goh goh, gob gob, goc goc) {
            this.a = (goh) gcr.a(goh);
            this.b = (gob) gcr.a(gob);
            this.c = (goc) gcr.a(goc);
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

        public final void a(gcs<g> gcs, gcs<f> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<e> gcs7) {
            gcs3.accept(this);
        }
    }

    /* renamed from: goa$c */
    public static final class c extends goa {
        public final goh a;
        public final goc b;

        c(goh goh, goc goc) {
            this.a = (goh) gcr.a(goh);
            this.b = (goc) gcr.a(goc);
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

        public final void a(gcs<g> gcs, gcs<f> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<e> gcs7) {
            gcs5.accept(this);
        }
    }

    /* renamed from: goa$d */
    public static final class d extends goa {
        public final goh a;
        public final god b;
        public final gof c;
        public final String d;

        d(goh goh, god god, gof gof, String str) {
            this.a = (goh) gcr.a(goh);
            this.b = (god) gcr.a(god);
            this.c = (gof) gcr.a(gof);
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

        public final void a(gcs<g> gcs, gcs<f> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<e> gcs7) {
            gcs4.accept(this);
        }
    }

    /* renamed from: goa$e */
    public static final class e extends goa {
        public final goh a;
        public final goe b;

        e(goh goh, goe goe) {
            this.a = (goh) gcr.a(goh);
            this.b = (goe) gcr.a(goe);
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
            sb.append("Generic{screen=");
            sb.append(this.a);
            sb.append(", event=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<f> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<e> gcs7) {
            gcs7.accept(this);
        }
    }

    /* renamed from: goa$f */
    public static final class f extends goa {
        public final goh a;
        public final gof b;

        f(goh goh, gof gof) {
            this.a = (goh) gcr.a(goh);
            this.b = (gof) gcr.a(gof);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a.equals(this.a) && fVar.b.equals(this.b);
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

        public final void a(gcs<g> gcs, gcs<f> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<e> gcs7) {
            gcs2.accept(this);
        }
    }

    /* renamed from: goa$g */
    public static final class g extends goa {
        public final goh a;

        g(goh goh) {
            this.a = (goh) gcr.a(goh);
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

        public final void a(gcs<g> gcs, gcs<f> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<e> gcs7) {
            gcs.accept(this);
        }
    }

    public abstract void a(gcs<g> gcs, gcs<f> gcs2, gcs<b> gcs3, gcs<d> gcs4, gcs<c> gcs5, gcs<a> gcs6, gcs<e> gcs7);

    goa() {
    }

    public static goa a(goh goh) {
        return new g(goh);
    }

    public static goa a(goh goh, gof gof) {
        return new f(goh, gof);
    }

    public static goa a(goh goh, gob gob, goc goc) {
        return new b(goh, gob, goc);
    }

    public static goa a(goh goh, god god, gof gof, String str) {
        return new d(goh, god, gof, str);
    }

    public static goa a(goh goh, goc goc) {
        return new c(goh, goc);
    }

    public static goa a(goh goh, goe goe) {
        return new e(goh, goe);
    }
}
