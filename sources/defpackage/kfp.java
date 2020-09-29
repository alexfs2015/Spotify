package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened;
import java.util.List;

/* renamed from: kfp reason: default package */
public abstract class kfp {

    /* renamed from: kfp$a */
    public static final class a extends kfp {
        public final kii a;
        final khv b;

        public a(kii kii, khv khv) {
            this.a = (kii) gec.a(kii);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee13.apply(this);
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
            sb.append("ArtistOfTheDecade{artistOfTheDecade=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$b */
    public static final class b extends kfp {
        public final kiu a;
        final khv b;

        b(kiu kiu, khv khv) {
            this.a = (kiu) gec.a(kiu);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DecadeTopArtistTopSong{decadeTopData=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$c */
    public static final class c extends kfp {
        public final String a;
        public final StoryParagraph b;
        public final StoryParagraph c;
        final khv d;

        c(String str, StoryParagraph storyParagraph, StoryParagraph storyParagraph2, khv khv) {
            this.a = (String) gec.a(str);
            this.b = (StoryParagraph) gec.a(storyParagraph);
            this.c = (StoryParagraph) gec.a(storyParagraph2);
            this.d = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c) && cVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Decades{previewUrl=");
            sb.append(this.a);
            sb.append(", paragraph1=");
            sb.append(this.b);
            sb.append(", paragraph2=");
            sb.append(this.c);
            sb.append(", shareable=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$d */
    public static final class d extends kfp {
        public final kjo a;
        final khv b;

        d(kjo kjo, khv khv) {
            this.a = (kjo) gec.a(kjo);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee14.apply(this);
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
            sb.append("GlobalCitizen{globalCitizen=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$e */
    public static final class e extends kfp {
        public final String a;
        public final ImmutableList<MinutesListened> b;
        public final String c;
        final khv d;

        e(String str, ImmutableList<MinutesListened> immutableList, String str2, khv khv) {
            this.a = (String) gec.a(str);
            this.b = (ImmutableList) gec.a(immutableList);
            this.c = (String) gec.a(str2);
            this.d = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee12.apply(this);
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
            sb.append("MinutesListened{caption=");
            sb.append(this.a);
            sb.append(", minutesListenedList=");
            sb.append(this.b);
            sb.append(", previewUrl=");
            sb.append(this.c);
            sb.append(", shareable=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$f */
    public static final class f extends kfp {
        public final kke a;
        final khv b;

        f(kke kke, khv khv) {
            this.a = (kke) gec.a(kke);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee9.apply(this);
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
            sb.append("OtherTopArtists{otherTopArtists=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$g */
    public static final class g extends kfp {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;
        final khv f;

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return gVar.e == this.e && gVar.a.equals(this.a) && gVar.b.equals(this.b) && gVar.c.equals(this.c) && gVar.d.equals(this.d) && gVar.f.equals(this.f);
        }

        public final int hashCode() {
            return ((((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.valueOf(this.e).hashCode()) * 31) + this.f.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Placeholder{previewUrl=");
            sb.append(this.a);
            sb.append(", imageUrl=");
            sb.append(this.b);
            sb.append(", trackName=");
            sb.append(this.c);
            sb.append(", artistName=");
            sb.append(this.d);
            sb.append(", backgroundColor=");
            sb.append(this.e);
            sb.append(", shareable=");
            sb.append(this.f);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$h */
    public static final class h extends kfp {
        public final String a;
        public final String b;
        public final StoryParagraph c;
        public final String d;
        public final StoryParagraph e;
        public final StoryParagraph f;
        public final String g;
        final khv h;

        public h(String str, String str2, StoryParagraph storyParagraph, String str3, StoryParagraph storyParagraph2, StoryParagraph storyParagraph3, String str4, khv khv) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (StoryParagraph) gec.a(storyParagraph);
            this.d = (String) gec.a(str3);
            this.e = (StoryParagraph) gec.a(storyParagraph2);
            this.f = (StoryParagraph) gec.a(storyParagraph3);
            this.g = (String) gec.a(str4);
            this.h = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a.equals(this.a) && hVar.b.equals(this.b) && hVar.c.equals(this.c) && hVar.d.equals(this.d) && hVar.e.equals(this.e) && hVar.f.equals(this.f) && hVar.g.equals(this.g) && hVar.h.equals(this.h);
        }

        public final int hashCode() {
            return ((((((((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Premium{previewUrl=");
            sb.append(this.a);
            sb.append(", thanksMessage=");
            sb.append(this.b);
            sb.append(", greetingsMessage=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", paragraph1=");
            sb.append(this.e);
            sb.append(", paragraph2=");
            sb.append(this.f);
            sb.append(", imageUrl=");
            sb.append(this.g);
            sb.append(", shareable=");
            sb.append(this.h);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$i */
    public static final class i extends kfp {
        public final kkq a;
        final khv b;

        i(kkq kkq, khv khv) {
            this.a = (kkq) gec.a(kkq);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee11.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return iVar.a.equals(this.a) && iVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Season{season=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$j */
    public static final class j extends kfp {
        public final kky a;
        final khv b;

        public j(kky kky, khv khv) {
            this.a = (kky) gec.a(kky);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee15.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return jVar.a.equals(this.a) && jVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SummaryCard{summary=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$k */
    public static final class k extends kfp {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        final khv g;

        public k(String str, String str2, String str3, String str4, String str5, String str6, khv khv) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
            this.d = (String) gec.a(str4);
            this.e = (String) gec.a(str5);
            this.f = (String) gec.a(str6);
            this.g = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kVar.a.equals(this.a) && kVar.b.equals(this.b) && kVar.c.equals(this.c) && kVar.d.equals(this.d) && kVar.e.equals(this.e) && kVar.f.equals(this.f) && kVar.g.equals(this.g);
        }

        public final int hashCode() {
            return ((((((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Top100Playlist{previewUrl=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", imageUrl=");
            sb.append(this.c);
            sb.append(", spotifyUri=");
            sb.append(this.d);
            sb.append(", buttonTextEnabled=");
            sb.append(this.e);
            sb.append(", buttonTextDisabled=");
            sb.append(this.f);
            sb.append(", shareable=");
            sb.append(this.g);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$l */
    public static final class l extends kfp {
        public final TopArtist a;
        final khv b;

        l(TopArtist topArtist, khv khv) {
            this.a = (TopArtist) gec.a(topArtist);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee8.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return lVar.a.equals(this.a) && lVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopArtist{topArtist=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$m */
    public static final class m extends kfp {
        public final kls a;
        final khv b;

        m(kls kls, khv khv) {
            this.a = (kls) gec.a(kls);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return mVar.a.equals(this.a) && mVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopGenres{topGenres=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$n */
    public static final class n extends kfp {
        public final TopPodcasts a;
        final khv b;

        n(TopPodcasts topPodcasts, khv khv) {
            this.a = (TopPodcasts) gec.a(topPodcasts);
            this.b = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
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
            sb.append("TopPodcasts{topPodcasts=");
            sb.append(this.a);
            sb.append(", shareable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kfp$o */
    public static final class o extends kfp {
        public final String a;
        public final List<kmg> b;
        final khv c;

        o(String str, List<kmg> list, khv khv) {
            this.a = (String) gec.a(str);
            this.b = (List) gec.a(list);
            this.c = (khv) gec.a(khv);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return oVar.a.equals(this.a) && oVar.b.equals(this.b) && oVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopSongs{title=");
            sb.append(this.a);
            sb.append(", tracks=");
            sb.append(this.b);
            sb.append(", shareable=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    kfp() {
    }

    public static kfp a(TopArtist topArtist, khv khv) {
        return new l(topArtist, khv);
    }

    public static kfp a(TopPodcasts topPodcasts, khv khv) {
        return new n(topPodcasts, khv);
    }

    public static kfp a(String str, ImmutableList<MinutesListened> immutableList, String str2, khv khv) {
        return new e(str, immutableList, str2, khv);
    }

    public static kfp a(String str, StoryParagraph storyParagraph, StoryParagraph storyParagraph2, khv khv) {
        return new c(str, storyParagraph, storyParagraph2, khv);
    }

    public static kfp a(String str, List<kmg> list, khv khv) {
        return new o(str, list, khv);
    }

    public static kfp a(kiu kiu, khv khv) {
        return new b(kiu, khv);
    }

    public static kfp a(kjo kjo, khv khv) {
        return new d(kjo, khv);
    }

    public static kfp a(kke kke, khv khv) {
        return new f(kke, khv);
    }

    public static kfp a(kkq kkq, khv khv) {
        return new i(kkq, khv);
    }

    public static kfp a(kls kls, khv khv) {
        return new m(kls, khv);
    }

    public abstract <R_> R_ a(gee<g, R_> gee, gee<o, R_> gee2, gee<k, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<b, R_> gee6, gee<m, R_> gee7, gee<l, R_> gee8, gee<f, R_> gee9, gee<n, R_> gee10, gee<i, R_> gee11, gee<e, R_> gee12, gee<a, R_> gee13, gee<d, R_> gee14, gee<j, R_> gee15);
}
