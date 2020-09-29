package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;

/* renamed from: nnt reason: default package */
public abstract class nnt {

    /* renamed from: nnt$a */
    public static final class a extends nnt {
        final nnw a;

        public a(nnw nnw) {
            this.a = (nnw) gec.a(nnw);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<f, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6) {
            return gee.apply(this);
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
            sb.append("BackendHomeUpdate{homeViewState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nnt$b */
    public static final class b extends nnt {
        final nnw a;

        public b(nnw nnw) {
            this.a = (nnw) gec.a(nnw);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<f, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CachedHomeUpdate{homeViewState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nnt$c */
    public static final class c extends nnt {
        final lbg a;

        c(lbg lbg) {
            this.a = (lbg) gec.a(lbg);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<f, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6) {
            return gee5.apply(this);
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
            sb.append("ConnectionChanged{connectionState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nnt$d */
    public static final class d extends nnt {
        final nnw a;

        public d(nnw nnw) {
            this.a = (nnw) gec.a(nnw);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<f, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("OfflineHomeUpdate{homeViewState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nnt$e */
    public static final class e extends nnt {
        final RecentlyPlayedItems a;

        e(RecentlyPlayedItems recentlyPlayedItems) {
            this.a = (RecentlyPlayedItems) gec.a(recentlyPlayedItems);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<f, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RecentlyPlayedUpdated{recentlyPlayedItems=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nnt$f */
    public static final class f extends nnt {
        final nnw a;

        f(nnw nnw) {
            this.a = (nnw) gec.a(nnw);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<f, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6) {
            return gee4.apply(this);
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
            sb.append("ShowPlaceholderScreen{homeViewState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    nnt() {
    }

    public static nnt a(RecentlyPlayedItems recentlyPlayedItems) {
        return new e(recentlyPlayedItems);
    }

    public static nnt a(lbg lbg) {
        return new c(lbg);
    }

    public static nnt a(nnw nnw) {
        return new f(nnw);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<f, R_> gee4, gee<c, R_> gee5, gee<e, R_> gee6);
}
