package defpackage;

import android.net.Uri;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;
import com.spotify.music.features.profile.model.ProfileListItem;

/* renamed from: pse reason: default package */
public abstract class pse {

    /* renamed from: pse$a */
    public static final class a extends pse {
        final ProfileListItem a;

        public a(ProfileListItem profileListItem) {
            this.a = (ProfileListItem) gec.a(profileListItem);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            return gee15.apply(this);
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
            sb.append("ArtistItemClicked{profileListItem=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$b */
    public static final class b extends pse {
        final ProfileV2VolatileModel a;

        b(ProfileV2VolatileModel profileV2VolatileModel) {
            this.a = (ProfileV2VolatileModel) gec.a(profileV2VolatileModel);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<b, R_> gee18 = gee;
            return gee.apply(this);
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
            sb.append("BackendProfileData{profileV2VolatileModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$c */
    public static final class c extends pse {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<c, R_> gee18 = gee2;
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BackendProfileDataFailed{}";
        }
    }

    /* renamed from: pse$d */
    public static final class d extends pse {
        final boolean a;

        d(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<d, R_> gee18 = gee6;
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof d) && ((d) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionChanged{connected=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$e */
    public static final class e extends pse {
        final Response a;

        e(Response response) {
            this.a = (Response) gec.a(response);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<e, R_> gee18 = gee3;
            return gee3.apply(this);
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
            sb.append("CoreProfileData{response=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$f */
    public static final class f extends pse {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<f, R_> gee18 = gee7;
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EditProfileClicked{}";
        }
    }

    /* renamed from: pse$g */
    public static final class g extends pse {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<g, R_> gee18 = gee8;
            return gee8.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FollowClicked{}";
        }
    }

    /* renamed from: pse$h */
    public static final class h extends pse {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<h, R_> gee18 = gee10;
            return gee10.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FollowersClicked{}";
        }
    }

    /* renamed from: pse$i */
    public static final class i extends pse {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<i, R_> gee18 = gee11;
            return gee11.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FollowingClicked{}";
        }
    }

    /* renamed from: pse$j */
    public static final class j extends pse {
        final ProfileListItem a;

        public j(ProfileListItem profileListItem) {
            this.a = (ProfileListItem) gec.a(profileListItem);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
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
            sb.append("PlaylistItemClicked{profileListItem=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$k */
    public static final class k extends pse {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<k, R_> gee18 = gee9;
            return gee9.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PublicPlaylistsClicked{}";
        }
    }

    /* renamed from: pse$l */
    public static final class l extends pse {
        final prg a;

        l(prg prg) {
            this.a = (prg) gec.a(prg);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<l, R_> gee18 = gee5;
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            return ((l) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PublicPlaylistsLoaded{publicPlaylists=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$m */
    public static final class m extends pse {
        final prg a;

        m(prg prg) {
            this.a = (prg) gec.a(prg);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<m, R_> gee18 = gee4;
            return gee4.apply(this);
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
            sb.append("RecentlyPlayedArtistsLoaded{recentlyPlayedArtists=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$n */
    public static final class n extends pse {
        final String a;

        n(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            return gee16.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            return ((n) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReportAbuseUrl{url=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$o */
    public static final class o extends pse {
        final Uri a;

        o(Uri uri) {
            this.a = (Uri) gec.a(uri);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            return gee17.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            return ((o) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReportAbuseWebTokenUri{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pse$p */
    public static final class p extends pse {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<p, R_> gee18 = gee13;
            return gee13.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof p;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SeeAllPublicPlaylistsClicked{}";
        }
    }

    /* renamed from: pse$q */
    public static final class q extends pse {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17) {
            gee<q, R_> gee18 = gee12;
            return gee12.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof q;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SeeAllRecentlyPlayedArtistsClicked{}";
        }
    }

    pse() {
    }

    public static pse a(Uri uri) {
        return new o(uri);
    }

    public static pse a(Response response) {
        return new e(response);
    }

    public static pse a(ProfileV2VolatileModel profileV2VolatileModel) {
        return new b(profileV2VolatileModel);
    }

    public static pse a(String str) {
        return new n(str);
    }

    public static pse a(prg prg) {
        return new m(prg);
    }

    public static pse a(boolean z) {
        return new d(z);
    }

    public static pse b(prg prg) {
        return new l(prg);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<e, R_> gee3, gee<m, R_> gee4, gee<l, R_> gee5, gee<d, R_> gee6, gee<f, R_> gee7, gee<g, R_> gee8, gee<k, R_> gee9, gee<h, R_> gee10, gee<i, R_> gee11, gee<q, R_> gee12, gee<p, R_> gee13, gee<j, R_> gee14, gee<a, R_> gee15, gee<n, R_> gee16, gee<o, R_> gee17);
}
