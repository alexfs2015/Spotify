package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;

/* renamed from: nhx reason: default package */
public abstract class nhx {

    /* renamed from: nhx$a */
    public static final class a extends nhx {
        final nia a;

        public a(nia nia) {
            this.a = (nia) gcr.a(nia);
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

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<f, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6) {
            return gct.apply(this);
        }
    }

    /* renamed from: nhx$b */
    public static final class b extends nhx {
        final nia a;

        public b(nia nia) {
            this.a = (nia) gcr.a(nia);
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

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<f, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6) {
            return gct2.apply(this);
        }
    }

    /* renamed from: nhx$c */
    public static final class c extends nhx {
        final kxx a;

        c(kxx kxx) {
            this.a = (kxx) gcr.a(kxx);
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

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<f, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6) {
            return gct5.apply(this);
        }
    }

    /* renamed from: nhx$d */
    public static final class d extends nhx {
        final nia a;

        public d(nia nia) {
            this.a = (nia) gcr.a(nia);
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

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<f, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6) {
            return gct3.apply(this);
        }
    }

    /* renamed from: nhx$e */
    public static final class e extends nhx {
        final RecentlyPlayedItems a;

        e(RecentlyPlayedItems recentlyPlayedItems) {
            this.a = (RecentlyPlayedItems) gcr.a(recentlyPlayedItems);
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

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<f, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6) {
            return gct6.apply(this);
        }
    }

    /* renamed from: nhx$f */
    public static final class f extends nhx {
        final nia a;

        f(nia nia) {
            this.a = (nia) gcr.a(nia);
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

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<f, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<f, R_> gct4, gct<c, R_> gct5, gct<e, R_> gct6);

    nhx() {
    }

    public static nhx a(nia nia) {
        return new f(nia);
    }

    public static nhx a(kxx kxx) {
        return new c(kxx);
    }

    public static nhx a(RecentlyPlayedItems recentlyPlayedItems) {
        return new e(recentlyPlayedItems);
    }
}
