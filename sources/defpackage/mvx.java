package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: mvx reason: default package */
public abstract class mvx {

    /* renamed from: mvx$a */
    public static final class a extends mvx {
        final String a;
        private final String b;

        a(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<a, R_> gee17 = gee7;
            return gee7.apply(this);
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
    }

    /* renamed from: mvx$b */
    public static final class b extends mvx {
        final boolean a;

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            return gee16.apply(this);
        }

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
    }

    /* renamed from: mvx$c */
    public static final class c extends mvx {
        final Optional<String> a;
        private final String b;

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<c, R_> gee17 = gee11;
            return gee11.apply(this);
        }

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
    }

    /* renamed from: mvx$d */
    public static final class d extends mvx {
        final String a;
        final String b;

        public d(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<d, R_> gee17 = gee9;
            return gee9.apply(this);
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
    }

    /* renamed from: mvx$e */
    public static final class e extends mvx {
        e() {
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<e, R_> gee17 = gee6;
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FeedRefreshFailed{}";
        }
    }

    /* renamed from: mvx$f */
    public static final class f extends mvx {
        final ImmutableList<mvr> a;

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<f, R_> gee17 = gee5;
            return gee5.apply(this);
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
            sb.append("FeedRefreshSucceeded{items=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: mvx$g */
    public static final class g extends mvx {
        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<g, R_> gee17 = gee3;
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchDataFailed{}";
        }
    }

    /* renamed from: mvx$h */
    public static final class h extends mvx {
        final ImmutableList<mvr> a;

        public h(ImmutableList<mvr> immutableList) {
            this.a = (ImmutableList) gec.a(immutableList);
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<h, R_> gee17 = gee2;
            return gee2.apply(this);
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
    }

    /* renamed from: mvx$i */
    public static final class i extends mvx {
        final String a;

        public i(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<i, R_> gee17 = gee12;
            return gee12.apply(this);
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
    }

    /* renamed from: mvx$j */
    public static final class j extends mvx {
        final mvm a;

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            return gee14.apply(this);
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
            sb.append("FollowArtistFailed{artist=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: mvx$k */
    public static final class k extends mvx {
        k() {
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<k, R_> gee17 = gee13;
            return gee13.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FollowArtistSucceeded{}";
        }
    }

    /* renamed from: mvx$l */
    public static final class l extends mvx {
        l() {
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<l, R_> gee17 = gee;
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Init{}";
        }
    }

    /* renamed from: mvx$m */
    public static final class m extends mvx {
        final List<mvm> a;

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<m, R_> gee17 = gee8;
            return gee8.apply(this);
        }

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
    }

    /* renamed from: mvx$n */
    public static final class n extends mvx {
        final String a;
        final String b;

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<n, R_> gee17 = gee10;
            return gee10.apply(this);
        }

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
    }

    /* renamed from: mvx$o */
    public static final class o extends mvx {
        o() {
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            return gee15.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof o;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlayerStateChanged{}";
        }
    }

    /* renamed from: mvx$p */
    public static final class p extends mvx {
        p() {
        }

        public final <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16) {
            gee<p, R_> gee17 = gee4;
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof p;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PulledToRefresh{}";
        }
    }

    mvx() {
    }

    public static mvx a(String str, String str2) {
        return new a(str, str2);
    }

    public abstract <R_> R_ a(gee<l, R_> gee, gee<h, R_> gee2, gee<g, R_> gee3, gee<p, R_> gee4, gee<f, R_> gee5, gee<e, R_> gee6, gee<a, R_> gee7, gee<m, R_> gee8, gee<d, R_> gee9, gee<n, R_> gee10, gee<c, R_> gee11, gee<i, R_> gee12, gee<k, R_> gee13, gee<j, R_> gee14, gee<o, R_> gee15, gee<b, R_> gee16);
}
