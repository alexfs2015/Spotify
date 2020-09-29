package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: mrh reason: default package */
public abstract class mrh {

    /* renamed from: mrh$a */
    public static final class a extends mrh {
        final String a;
        private final String b;

        a(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ArtistClicked{artistUri=");
            sb.append(this.a);
            sb.append(", feedItemId=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<a, R_> gct17 = gct7;
            return gct7.apply(this);
        }
    }

    /* renamed from: mrh$b */
    public static final class b extends mrh {
        final boolean a;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectivityChanged{online=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            return gct16.apply(this);
        }
    }

    /* renamed from: mrh$c */
    public static final class c extends mrh {
        final Optional<String> a;
        private final String b;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b.equals(this.b) && cVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.b.hashCode() + 0) * 31) + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContextMenuClicked{feedItemId=");
            sb.append(this.b);
            sb.append(", trackUri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<c, R_> gct17 = gct11;
            return gct11.apply(this);
        }
    }

    /* renamed from: mrh$d */
    public static final class d extends mrh {
        final String a;
        final String b;

        public d(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
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
            sb.append("EntityClicked{entityUri=");
            sb.append(this.a);
            sb.append(", feedItemId=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<d, R_> gct17 = gct9;
            return gct9.apply(this);
        }
    }

    /* renamed from: mrh$e */
    public static final class e extends mrh {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FeedRefreshFailed{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<e, R_> gct17 = gct6;
            return gct6.apply(this);
        }
    }

    /* renamed from: mrh$f */
    public static final class f extends mrh {
        final ImmutableList<mrb> a;

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
            sb.append("FeedRefreshSucceeded{items=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<f, R_> gct17 = gct5;
            return gct5.apply(this);
        }
    }

    /* renamed from: mrh$g */
    public static final class g extends mrh {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchDataFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<g, R_> gct17 = gct3;
            return gct3.apply(this);
        }
    }

    /* renamed from: mrh$h */
    public static final class h extends mrh {
        final ImmutableList<mrb> a;

        public h(ImmutableList<mrb> immutableList) {
            this.a = (ImmutableList) gcr.a(immutableList);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FetchDataSucceeded{items=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<h, R_> gct17 = gct2;
            return gct2.apply(this);
        }
    }

    /* renamed from: mrh$i */
    public static final class i extends mrh {
        final String a;

        public i(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("FollowArtistClicked{artistUri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<i, R_> gct17 = gct12;
            return gct12.apply(this);
        }
    }

    /* renamed from: mrh$j */
    public static final class j extends mrh {
        final mqw a;

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
            sb.append("FollowArtistFailed{artist=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            return gct14.apply(this);
        }
    }

    /* renamed from: mrh$k */
    public static final class k extends mrh {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FollowArtistSucceeded{}";
        }

        k() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<k, R_> gct17 = gct13;
            return gct13.apply(this);
        }
    }

    /* renamed from: mrh$l */
    public static final class l extends mrh {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Init{}";
        }

        l() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<l, R_> gct17 = gct;
            return gct.apply(this);
        }
    }

    /* renamed from: mrh$m */
    public static final class m extends mrh {
        final List<mqw> a;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            return ((m) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("OtherArtistsClicked{artists=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<m, R_> gct17 = gct8;
            return gct8.apply(this);
        }
    }

    /* renamed from: mrh$n */
    public static final class n extends mrh {
        final String a;
        final String b;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return nVar.a.equals(this.a) && nVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayPauseClicked{feedItemId=");
            sb.append(this.a);
            sb.append(", trackUri=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<n, R_> gct17 = gct10;
            return gct10.apply(this);
        }
    }

    /* renamed from: mrh$o */
    public static final class o extends mrh {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlayerStateChanged{}";
        }

        o() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof o;
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            return gct15.apply(this);
        }
    }

    /* renamed from: mrh$p */
    public static final class p extends mrh {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PulledToRefresh{}";
        }

        p() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof p;
        }

        public final <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16) {
            gct<p, R_> gct17 = gct4;
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<l, R_> gct, gct<h, R_> gct2, gct<g, R_> gct3, gct<p, R_> gct4, gct<f, R_> gct5, gct<e, R_> gct6, gct<a, R_> gct7, gct<m, R_> gct8, gct<d, R_> gct9, gct<n, R_> gct10, gct<c, R_> gct11, gct<i, R_> gct12, gct<k, R_> gct13, gct<j, R_> gct14, gct<o, R_> gct15, gct<b, R_> gct16);

    mrh() {
    }

    public static mrh a(String str, String str2) {
        return new a(str, str2);
    }
}
