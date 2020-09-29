package defpackage;

import com.google.common.base.Optional;

/* renamed from: gbr reason: default package */
public abstract class gbr {

    /* renamed from: gbr$a */
    public static final class a extends gbr {
        public final gbo a;

        a(gbo gbo) {
            this.a = (gbo) gec.a(gbo);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
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

    /* renamed from: gbr$b */
    public static final class b extends gbr {
        public final gbo a;
        public final gbi b;
        public final gbj c;

        b(gbo gbo, gbi gbi, gbj gbj) {
            this.a = (gbo) gec.a(gbo);
            this.b = (gbi) gec.a(gbi);
            this.c = (gbj) gec.a(gbj);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
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

    /* renamed from: gbr$c */
    public static final class c extends gbr {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
            ged9.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceYearClass{year=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gbr$d */
    public static final class d extends gbr {
        public final gbo a;
        public final gbj b;

        d(gbo gbo, gbj gbj) {
            this.a = (gbo) gec.a(gbo);
            this.b = (gbj) gec.a(gbj);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
            ged5.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b);
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

    /* renamed from: gbr$e */
    public static final class e extends gbr {
        public final gbo a;
        public final gbk b;
        public final gbl c;
        public final String d;

        e(gbo gbo, gbk gbk, gbl gbl, String str) {
            this.a = (gbo) gec.a(gbo);
            this.b = (gbk) gec.a(gbk);
            this.c = (gbl) gec.a(gbl);
            this.d = (String) gec.a(str);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a.equals(this.a) && eVar.b.equals(this.b) && eVar.c.equals(this.c) && eVar.d.equals(this.d);
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

    /* renamed from: gbr$f */
    public static final class f extends gbr {
        public final gbo a;
        public final gbl b;

        f(gbo gbo, gbl gbl) {
            this.a = (gbo) gec.a(gbo);
            this.b = (gbl) gec.a(gbl);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
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

    /* renamed from: gbr$g */
    public static final class g extends gbr {
        public final gbs a;

        g(gbs gbs) {
            this.a = (gbs) gec.a(gbs);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
            ged7.accept(this);
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
            sb.append("PsesEvent{psesEvent=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gbr$h */
    public static final class h extends gbr {
        public final gbu a;
        public final String b;
        public final long c;
        public final Optional<Integer> d;

        h(gbu gbu, String str, long j, Optional<Integer> optional) {
            this.a = (gbu) gec.a(gbu);
            this.b = (String) gec.a(str);
            this.c = j;
            this.d = (Optional) gec.a(optional);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
            ged11.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.c == this.c && hVar.a.equals(this.a) && hVar.b.equals(this.b) && hVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Long.valueOf(this.c).hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestCompleted{request=");
            sb.append(this.a);
            sb.append(", requestId=");
            sb.append(this.b);
            sb.append(", timestamp=");
            sb.append(this.c);
            sb.append(", errorCode=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gbr$i */
    public static final class i extends gbr {
        public final gbu a;
        public final String b;
        public final long c;

        i(gbu gbu, String str, long j) {
            this.a = (gbu) gec.a(gbu);
            this.b = (String) gec.a(str);
            this.c = j;
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
            ged10.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return iVar.c == this.c && iVar.a.equals(this.a) && iVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Long.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestStarted{request=");
            sb.append(this.a);
            sb.append(", requestId=");
            sb.append(this.b);
            sb.append(", timestamp=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gbr$j */
    public static final class j extends gbr {
        public final gbo a;

        j(gbo gbo) {
            this.a = (gbo) gec.a(gbo);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
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

    /* renamed from: gbr$k */
    public static final class k extends gbr {
        public final gbo a;
        public final gbt b;

        k(gbo gbo, gbt gbt) {
            this.a = (gbo) gec.a(gbo);
            this.b = (gbt) gec.a(gbt);
        }

        public final void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11) {
            ged8.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kVar.a.equals(this.a) && kVar.b.equals(this.b);
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
    }

    gbr() {
    }

    public static gbr a(gbo gbo) {
        return new j(gbo);
    }

    public static gbr a(gbo gbo, gbi gbi, gbj gbj) {
        return new b(gbo, gbi, gbj);
    }

    public static gbr a(gbo gbo, gbj gbj) {
        return new d(gbo, gbj);
    }

    public static gbr a(gbo gbo, gbk gbk, gbl gbl, String str) {
        return new e(gbo, gbk, gbl, str);
    }

    public static gbr a(gbo gbo, gbl gbl) {
        return new f(gbo, gbl);
    }

    public static gbr a(gbo gbo, gbt gbt) {
        return new k(gbo, gbt);
    }

    public static gbr a(gbs gbs) {
        return new g(gbs);
    }

    public static gbr a(gbu gbu, String str, long j2, Optional<Integer> optional) {
        h hVar = new h(gbu, str, j2, optional);
        return hVar;
    }

    public static gbr b(gbo gbo) {
        return new a(gbo);
    }

    public abstract void a(ged<j> ged, ged<f> ged2, ged<b> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6, ged<g> ged7, ged<k> ged8, ged<c> ged9, ged<i> ged10, ged<h> ged11);
}
