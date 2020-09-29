package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened;
import com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtist;
import java.util.List;

/* renamed from: kdo reason: default package */
public abstract class kdo {

    /* renamed from: kdo$a */
    public static final class a extends kdo {
        public final kfv a;

        a(kfv kfv) {
            this.a = (kfv) gcr.a(kfv);
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
            sb.append("ArtistOfTheDecade{artistOfTheDecade=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct12.apply(this);
        }
    }

    /* renamed from: kdo$b */
    public static final class b extends kdo {
        public final String a;
        public final List<kgl> b;

        b(String str, List<kgl> list) {
            this.a = (String) gcr.a(str);
            this.b = (List) gcr.a(list);
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
            sb.append("DecadeTopArtistTopSong{title=");
            sb.append(this.a);
            sb.append(", years=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct5.apply(this);
        }
    }

    /* renamed from: kdo$c */
    public static final class c extends kdo {
        public final String a;
        public final StoryParagraph b;
        public final StoryParagraph c;

        c(String str, StoryParagraph storyParagraph, StoryParagraph storyParagraph2) {
            this.a = (String) gcr.a(str);
            this.b = (StoryParagraph) gcr.a(storyParagraph);
            this.c = (StoryParagraph) gcr.a(storyParagraph2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Decades{previewUrl=");
            sb.append(this.a);
            sb.append(", paragraph1=");
            sb.append(this.b);
            sb.append(", paragraph2=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct4.apply(this);
        }
    }

    /* renamed from: kdo$d */
    public static final class d extends kdo {
        public final khb a;

        d(khb khb) {
            this.a = (khb) gcr.a(khb);
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
            sb.append("GlobalCitizen{globalCitizen=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct13.apply(this);
        }
    }

    /* renamed from: kdo$e */
    public static final class e extends kdo {
        public final String a;
        public final ImmutableList<MinutesListened> b;
        public final String c;

        e(String str, ImmutableList<MinutesListened> immutableList, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (ImmutableList) gcr.a(immutableList);
            this.c = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a.equals(this.a) && eVar.b.equals(this.b) && eVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MinutesListened{caption=");
            sb.append(this.a);
            sb.append(", minutesListenedList=");
            sb.append(this.b);
            sb.append(", previewUrl=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct11.apply(this);
        }
    }

    /* renamed from: kdo$f */
    public static final class f extends kdo {
        public final String a;
        public final ImmutableList<OtherTopArtist> b;

        f(String str, ImmutableList<OtherTopArtist> immutableList) {
            this.a = (String) gcr.a(str);
            this.b = (ImmutableList) gcr.a(immutableList);
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
            sb.append("OtherTopArtists{topArtistsTitle=");
            sb.append(this.a);
            sb.append(", otherTopArtistList=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct8.apply(this);
        }
    }

    /* renamed from: kdo$g */
    public static final class g extends kdo {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return gVar.e == this.e && gVar.a.equals(this.a) && gVar.b.equals(this.b) && gVar.c.equals(this.c) && gVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.valueOf(this.e).hashCode();
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
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct.apply(this);
        }
    }

    /* renamed from: kdo$h */
    public static final class h extends kdo {
        public final String a;
        public final String b;
        public final int c;
        public final String d;
        public final StoryParagraph e;
        public final StoryParagraph f;
        public final String g;

        h(String str, String str2, int i, String str3, StoryParagraph storyParagraph, StoryParagraph storyParagraph2, String str4) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = i;
            this.d = (String) gcr.a(str3);
            this.e = (StoryParagraph) gcr.a(storyParagraph);
            this.f = (StoryParagraph) gcr.a(storyParagraph2);
            this.g = (String) gcr.a(str4);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.c == this.c && hVar.a.equals(this.a) && hVar.b.equals(this.b) && hVar.d.equals(this.d) && hVar.e.equals(this.e) && hVar.f.equals(this.f) && hVar.g.equals(this.g);
        }

        public final int hashCode() {
            return ((((((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Integer.valueOf(this.c).hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Premium{previewUrl=");
            sb.append(this.a);
            sb.append(", greetingsMessage=");
            sb.append(this.b);
            sb.append(", greetingsYear=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", paragraph1=");
            sb.append(this.e);
            sb.append(", paragraph2=");
            sb.append(this.f);
            sb.append(", imageUrl=");
            sb.append(this.g);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct3.apply(this);
        }
    }

    /* renamed from: kdo$i */
    public static final class i extends kdo {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;
        private final String i;

        i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
            this.i = (String) gcr.a(str);
            this.a = (String) gcr.a(str2);
            this.b = (String) gcr.a(str3);
            this.c = (String) gcr.a(str4);
            this.d = (String) gcr.a(str5);
            this.e = (String) gcr.a(str6);
            this.f = (String) gcr.a(str7);
            this.g = (String) gcr.a(str8);
            this.h = z;
        }

        public final String a() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return iVar.h == this.h && iVar.i.equals(this.i) && iVar.a.equals(this.a) && iVar.b.equals(this.b) && iVar.c.equals(this.c) && iVar.d.equals(this.d) && iVar.e.equals(this.e) && iVar.f.equals(this.f) && iVar.g.equals(this.g);
        }

        public final int hashCode() {
            return ((((((((((((((((this.i.hashCode() + 0) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Boolean.valueOf(this.h).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Season{template=");
            sb.append(this.i);
            sb.append(", seasonLabel=");
            sb.append(this.a);
            sb.append(", seasonCaption=");
            sb.append(this.b);
            sb.append(", imageOne=");
            sb.append(this.c);
            sb.append(", imageTwo=");
            sb.append(this.d);
            sb.append(", imageThree=");
            sb.append(this.e);
            sb.append(", imageFour=");
            sb.append(this.f);
            sb.append(", previewUrl=");
            sb.append(this.g);
            sb.append(", isLastSeason=");
            sb.append(this.h);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct10.apply(this);
        }
    }

    /* renamed from: kdo$j */
    public static final class j extends kdo {
        public final TopArtist a;

        j(TopArtist topArtist) {
            this.a = (TopArtist) gcr.a(topArtist);
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
            sb.append("TopArtist{topArtist=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct7.apply(this);
        }
    }

    /* renamed from: kdo$k */
    public static final class k extends kdo {
        public final String a;
        public final String b;
        public final String c;
        public final List<kih> d;

        k(String str, String str2, String str3, List<kih> list) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
            this.d = (List) gcr.a(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kVar.a.equals(this.a) && kVar.b.equals(this.b) && kVar.c.equals(this.c) && kVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopGenres{title=");
            sb.append(this.a);
            sb.append(", subTitle=");
            sb.append(this.b);
            sb.append(", previewUrl=");
            sb.append(this.c);
            sb.append(", genres=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct6.apply(this);
        }
    }

    /* renamed from: kdo$l */
    public static final class l extends kdo {
        public final TopPodcasts a;

        l(TopPodcasts topPodcasts) {
            this.a = (TopPodcasts) gcr.a(topPodcasts);
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
            sb.append("TopPodcasts{topPodcasts=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct9.apply(this);
        }
    }

    /* renamed from: kdo$m */
    public static final class m extends kdo {
        public final String a;
        public final List<kja> b;
        public final kiz c;

        m(String str, List<kja> list, kiz kiz) {
            this.a = (String) gcr.a(str);
            this.b = (List) gcr.a(list);
            this.c = (kiz) gcr.a(kiz);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return mVar.a.equals(this.a) && mVar.b.equals(this.b) && mVar.c.equals(this.c);
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
            sb.append(", playlist=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<g, R_> gct, gct<m, R_> gct2, gct<h, R_> gct3, gct<c, R_> gct4, gct<b, R_> gct5, gct<k, R_> gct6, gct<j, R_> gct7, gct<f, R_> gct8, gct<l, R_> gct9, gct<i, R_> gct10, gct<e, R_> gct11, gct<a, R_> gct12, gct<d, R_> gct13);

    kdo() {
    }

    public static kdo a(String str, List<kja> list, kiz kiz) {
        return new m(str, list, kiz);
    }

    public static kdo a(String str, String str2, int i2, String str3, StoryParagraph storyParagraph, StoryParagraph storyParagraph2, String str4) {
        h hVar = new h(str, str2, 2018, str3, storyParagraph, storyParagraph2, str4);
        return hVar;
    }

    public static kdo a(String str, StoryParagraph storyParagraph, StoryParagraph storyParagraph2) {
        return new c(str, storyParagraph, storyParagraph2);
    }

    public static kdo a(String str, List<kgl> list) {
        return new b(str, list);
    }

    public static kdo a(String str, String str2, String str3, List<kih> list) {
        return new k(str, str2, str3, list);
    }

    public static kdo a(TopArtist topArtist) {
        return new j(topArtist);
    }

    public static kdo a(String str, ImmutableList<OtherTopArtist> immutableList) {
        return new f(str, immutableList);
    }

    public static kdo a(TopPodcasts topPodcasts) {
        return new l(topPodcasts);
    }

    public static kdo a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        i iVar = new i(str, str2, str3, str4, str5, str6, str7, str8, z);
        return iVar;
    }

    public static kdo a(String str, ImmutableList<MinutesListened> immutableList, String str2) {
        return new e(str, immutableList, str2);
    }

    public static kdo a(kfv kfv) {
        return new a(kfv);
    }

    public static kdo a(khb khb) {
        return new d(khb);
    }
}
