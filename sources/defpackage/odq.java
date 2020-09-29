package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Accessory;

/* renamed from: odq reason: default package */
public abstract class odq {

    /* renamed from: odq$a */
    public static final class a extends odq {
        final Accessory a;

        a(Accessory accessory) {
            this.a = (Accessory) gec.a(accessory);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee7.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged7.accept(this);
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
    }

    /* renamed from: odq$b */
    public static final class b extends odq {
        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee4.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AccessoryClicked{}";
        }
    }

    /* renamed from: odq$c */
    public static final class c extends odq {
        final gud a;

        c(gud gud) {
            this.a = (gud) gec.a(gud);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee8.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged8.accept(this);
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
    }

    /* renamed from: odq$d */
    public static final class d extends odq {
        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee2.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NextTrackRequested{}";
        }
    }

    /* renamed from: odq$e */
    public static final class e extends odq {
        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee5.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged5.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NowPlayingBarClicked{}";
        }
    }

    /* renamed from: odq$f */
    public static final class f extends odq {
        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlayPauseButtonClicked{}";
        }
    }

    /* renamed from: odq$g */
    public static final class g extends odq {
        final oec a;

        g(oec oec) {
            this.a = (oec) gec.a(oec);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee6.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged6.accept(this);
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
    }

    /* renamed from: odq$h */
    public static final class h extends odq {
        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee3.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PrevTrackRequested{}";
        }
    }

    /* renamed from: odq$i */
    public static final class i extends odq {
        final uns a;

        i(uns uns) {
            this.a = (uns) gec.a(uns);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9) {
            return gee9.apply(this);
        }

        public final void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9) {
            ged9.accept(this);
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
    }

    odq() {
    }

    public static odq a(Accessory accessory) {
        return new a(accessory);
    }

    public static odq a(gud gud) {
        return new c(gud);
    }

    public static odq a(oec oec) {
        return new g(oec);
    }

    public static odq a(uns uns) {
        return new i(uns);
    }

    public abstract <R_> R_ a(gee<f, R_> gee, gee<d, R_> gee2, gee<h, R_> gee3, gee<b, R_> gee4, gee<e, R_> gee5, gee<g, R_> gee6, gee<a, R_> gee7, gee<c, R_> gee8, gee<i, R_> gee9);

    public abstract void a(ged<f> ged, ged<d> ged2, ged<h> ged3, ged<b> ged4, ged<e> ged5, ged<g> ged6, ged<a> ged7, ged<c> ged8, ged<i> ged9);
}
