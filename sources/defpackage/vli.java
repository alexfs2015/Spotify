package defpackage;

import com.spotify.playlist.models.offline.WaitingReason;

/* renamed from: vli reason: default package */
public abstract class vli {

    /* renamed from: vli$a */
    public static final class a extends vli {
        public final <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8) {
            return gee4.apply(this);
        }

        public final void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AvailableOffline{}";
        }
    }

    /* renamed from: vli$b */
    public static final class b extends vli {
        public final int a;

        b(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8) {
            return gee3.apply(this);
        }

        public final void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8) {
            ged3.accept(this);
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
    }

    /* renamed from: vli$c */
    public static final class c extends vli {
        c() {
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8) {
            return gee5.apply(this);
        }

        public final void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8) {
            ged5.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error{}";
        }
    }

    /* renamed from: vli$d */
    public static final class d extends vli {
        d() {
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8) {
            return gee7.apply(this);
        }

        public final void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8) {
            ged7.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Exceeded{}";
        }
    }

    /* renamed from: vli$e */
    public static final class e extends vli {
        e() {
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8) {
            return gee6.apply(this);
        }

        public final void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8) {
            ged6.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Expired{}";
        }
    }

    /* renamed from: vli$f */
    public static final class f extends vli {
        public final <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8) {
            return gee.apply(this);
        }

        public final void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotAvailableOffline{}";
        }
    }

    /* renamed from: vli$g */
    public static final class g extends vli {
        g() {
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8) {
            return gee8.apply(this);
        }

        public final void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8) {
            ged8.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Resync{}";
        }
    }

    /* renamed from: vli$h */
    public static final class h extends vli {
        public final WaitingReason a;
        public final int b;

        h(WaitingReason waitingReason, int i) {
            this.a = (WaitingReason) gec.a(waitingReason);
            this.b = i;
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8) {
            return gee2.apply(this);
        }

        public final void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8) {
            ged2.accept(this);
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
    }

    vli() {
    }

    public static vli a(int i) {
        return new b(i);
    }

    public static vli a(WaitingReason waitingReason, int i) {
        return new h(waitingReason, i);
    }

    public abstract <R_> R_ a(gee<f, R_> gee, gee<h, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6, gee<d, R_> gee7, gee<g, R_> gee8);

    public abstract void a(ged<f> ged, ged<h> ged2, ged<b> ged3, ged<a> ged4, ged<c> ged5, ged<e> ged6, ged<d> ged7, ged<g> ged8);
}
