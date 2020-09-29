package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Accessory;

/* renamed from: nxd reason: default package */
public abstract class nxd {

    /* renamed from: nxd$a */
    public static final class a extends nxd {
        final Accessory a;

        a(Accessory accessory) {
            this.a = (Accessory) gcr.a(accessory);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessoryChanged{accessory=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs7.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct7.apply(this);
        }
    }

    /* renamed from: nxd$b */
    public static final class b extends nxd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AccessoryClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct4.apply(this);
        }
    }

    /* renamed from: nxd$c */
    public static final class c extends nxd {
        final gsd a;

        c(gsd gsd) {
            this.a = (gsd) gcr.a(gsd);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectStateChanged{state=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs8.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct8.apply(this);
        }
    }

    /* renamed from: nxd$d */
    public static final class d extends nxd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NextTrackRequested{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct2.apply(this);
        }
    }

    /* renamed from: nxd$e */
    public static final class e extends nxd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NowPlayingBarClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct5.apply(this);
        }
    }

    /* renamed from: nxd$f */
    public static final class f extends nxd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlayPauseButtonClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct.apply(this);
        }
    }

    /* renamed from: nxd$g */
    public static final class g extends nxd {
        final nxp a;

        g(nxp nxp) {
            this.a = (nxp) gcr.a(nxp);
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
            sb.append("PlayerInfoChanged{playerInfo=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs6.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct6.apply(this);
        }
    }

    /* renamed from: nxd$h */
    public static final class h extends nxd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PrevTrackRequested{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct3.apply(this);
        }
    }

    /* renamed from: nxd$i */
    public static final class i extends nxd {
        final uax a;

        i(uax uax) {
            this.a = (uax) gcr.a(uax);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            return ((i) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SocialListeningStateChanged{state=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9) {
            gcs9.accept(this);
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9) {
            return gct9.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<f, R_> gct, gct<d, R_> gct2, gct<h, R_> gct3, gct<b, R_> gct4, gct<e, R_> gct5, gct<g, R_> gct6, gct<a, R_> gct7, gct<c, R_> gct8, gct<i, R_> gct9);

    public abstract void a(gcs<f> gcs, gcs<d> gcs2, gcs<h> gcs3, gcs<b> gcs4, gcs<e> gcs5, gcs<g> gcs6, gcs<a> gcs7, gcs<c> gcs8, gcs<i> gcs9);

    nxd() {
    }

    public static nxd a(nxp nxp) {
        return new g(nxp);
    }

    public static nxd a(Accessory accessory) {
        return new a(accessory);
    }

    public static nxd a(gsd gsd) {
        return new c(gsd);
    }

    public static nxd a(uax uax) {
        return new i(uax);
    }
}
