package defpackage;

import com.spotify.playlist.models.offline.WaitingReason;

/* renamed from: uzf reason: default package */
public abstract class uzf {

    /* renamed from: uzf$a */
    public static final class a extends uzf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AvailableOffline{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8) {
            return gct4.apply(this);
        }
    }

    /* renamed from: uzf$b */
    public static final class b extends uzf {
        public final int a;

        b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Downloading{syncProgress=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8) {
            return gct3.apply(this);
        }
    }

    /* renamed from: uzf$c */
    public static final class c extends uzf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8) {
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8) {
            return gct5.apply(this);
        }
    }

    /* renamed from: uzf$d */
    public static final class d extends uzf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Exceeded{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8) {
            gcs7.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8) {
            return gct7.apply(this);
        }
    }

    /* renamed from: uzf$e */
    public static final class e extends uzf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Expired{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8) {
            gcs6.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8) {
            return gct6.apply(this);
        }
    }

    /* renamed from: uzf$f */
    public static final class f extends uzf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotAvailableOffline{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8) {
            return gct.apply(this);
        }
    }

    /* renamed from: uzf$g */
    public static final class g extends uzf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Resync{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8) {
            gcs8.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8) {
            return gct8.apply(this);
        }
    }

    /* renamed from: uzf$h */
    public static final class h extends uzf {
        public final WaitingReason a;
        public final int b;

        h(WaitingReason waitingReason, int i) {
            this.a = (WaitingReason) gcr.a(waitingReason);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a == this.a && hVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Waiting{waitingReason=");
            sb.append(this.a);
            sb.append(", syncProgress=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<f, R_> gct, gct<h, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6, gct<d, R_> gct7, gct<g, R_> gct8);

    public abstract void a(gcs<f> gcs, gcs<h> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<c> gcs5, gcs<e> gcs6, gcs<d> gcs7, gcs<g> gcs8);

    uzf() {
    }

    public static uzf a(WaitingReason waitingReason, int i) {
        return new h(waitingReason, i);
    }

    public static uzf a(int i) {
        return new b(i);
    }
}
