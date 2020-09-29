package defpackage;

/* renamed from: gpp reason: default package */
public abstract class gpp {

    /* renamed from: gpp$a */
    public static final class a extends gpp {
        public final gpw a;

        public a(gpw gpw) {
            this.a = (gpw) gec.a(gpw);
        }

        public final void a(ged<g> ged, ged<f> ged2, ged<b> ged3, ged<d> ged4, ged<c> ged5, ged<a> ged6, ged<e> ged7) {
            ged6.accept(this);
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
    }

    /* renamed from: gpp$b */
    public static final class b extends gpp {
        public final gpw a;
        public final gpq b;
        public final gpr c;

        b(gpw gpw, gpq gpq, gpr gpr) {
            this.a = (gpw) gec.a(gpw);
            this.b = (gpq) gec.a(gpq);
            this.c = (gpr) gec.a(gpr);
        }

        public final void a(ged<g> ged, ged<f> ged2, ged<b> ged3, ged<d> ged4, ged<c> ged5, ged<a> ged6, ged<e> ged7) {
            ged3.accept(this);
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
    }

    /* renamed from: gpp$c */
    public static final class c extends gpp {
        public final gpw a;
        public final gpr b;

        c(gpw gpw, gpr gpr) {
            this.a = (gpw) gec.a(gpw);
            this.b = (gpr) gec.a(gpr);
        }

        public final void a(ged<g> ged, ged<f> ged2, ged<b> ged3, ged<d> ged4, ged<c> ged5, ged<a> ged6, ged<e> ged7) {
            ged5.accept(this);
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
    }

    /* renamed from: gpp$d */
    public static final class d extends gpp {
        public final gpw a;
        public final gps b;
        public final gpu c;
        public final String d;

        d(gpw gpw, gps gps, gpu gpu, String str) {
            this.a = (gpw) gec.a(gpw);
            this.b = (gps) gec.a(gps);
            this.c = (gpu) gec.a(gpu);
            this.d = (String) gec.a(str);
        }

        public final void a(ged<g> ged, ged<f> ged2, ged<b> ged3, ged<d> ged4, ged<c> ged5, ged<a> ged6, ged<e> ged7) {
            ged4.accept(this);
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
    }

    /* renamed from: gpp$e */
    public static final class e extends gpp {
        public final gpw a;
        public final gpt b;

        e(gpw gpw, gpt gpt) {
            this.a = (gpw) gec.a(gpw);
            this.b = (gpt) gec.a(gpt);
        }

        public final void a(ged<g> ged, ged<f> ged2, ged<b> ged3, ged<d> ged4, ged<c> ged5, ged<a> ged6, ged<e> ged7) {
            ged7.accept(this);
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
    }

    /* renamed from: gpp$f */
    public static final class f extends gpp {
        public final gpw a;
        public final gpu b;

        f(gpw gpw, gpu gpu) {
            this.a = (gpw) gec.a(gpw);
            this.b = (gpu) gec.a(gpu);
        }

        public final void a(ged<g> ged, ged<f> ged2, ged<b> ged3, ged<d> ged4, ged<c> ged5, ged<a> ged6, ged<e> ged7) {
            ged2.accept(this);
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
    }

    /* renamed from: gpp$g */
    public static final class g extends gpp {
        public final gpw a;

        g(gpw gpw) {
            this.a = (gpw) gec.a(gpw);
        }

        public final void a(ged<g> ged, ged<f> ged2, ged<b> ged3, ged<d> ged4, ged<c> ged5, ged<a> ged6, ged<e> ged7) {
            ged.accept(this);
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
    }

    gpp() {
    }

    public static gpp a(gpw gpw) {
        return new g(gpw);
    }

    public static gpp a(gpw gpw, gpq gpq, gpr gpr) {
        return new b(gpw, gpq, gpr);
    }

    public static gpp a(gpw gpw, gpr gpr) {
        return new c(gpw, gpr);
    }

    public static gpp a(gpw gpw, gps gps, gpu gpu, String str) {
        return new d(gpw, gps, gpu, str);
    }

    public static gpp a(gpw gpw, gpt gpt) {
        return new e(gpw, gpt);
    }

    public static gpp a(gpw gpw, gpu gpu) {
        return new f(gpw, gpu);
    }

    public abstract void a(ged<g> ged, ged<f> ged2, ged<b> ged3, ged<d> ged4, ged<c> ged5, ged<a> ged6, ged<e> ged7);
}
