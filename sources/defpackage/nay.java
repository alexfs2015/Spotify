package defpackage;

/* renamed from: nay reason: default package */
public abstract class nay {

    /* renamed from: nay$a */
    public static final class a extends nay {
        public final int a;

        a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioPlaying{itemIndex=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<a> gcs17 = gcs10;
            gcs10.accept(this);
        }
    }

    /* renamed from: nay$b */
    public static final class b extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BackButtonPressed{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<b> gcs17 = gcs5;
            gcs5.accept(this);
        }
    }

    /* renamed from: nay$c */
    public static final class c extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CloseClicked{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<c> gcs17 = gcs3;
            gcs3.accept(this);
        }
    }

    /* renamed from: nay$d */
    public static final class d extends nay {
        public final int a;

        d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof d) && ((d) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContextMenuPressed{itemIndex=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<d> gcs17 = gcs7;
            gcs7.accept(this);
        }
    }

    /* renamed from: nay$e */
    public static final class e extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ContextPlayerResumed{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<e> gcs17 = gcs4;
            gcs4.accept(this);
        }
    }

    /* renamed from: nay$f */
    public static final class f extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EmptyChapter{}";
        }

        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs15.accept(this);
        }
    }

    /* renamed from: nay$g */
    public static final class g extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EmptyStory{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs14.accept(this);
        }
    }

    /* renamed from: nay$h */
    public static final class h extends nay {
        public final int a;
        public final boolean b;

        h(int i, boolean z) {
            this.a = i;
            this.b = z;
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
            return ((Integer.valueOf(this.a).hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HeartButtonClicked{itemIndex=");
            sb.append(this.a);
            sb.append(", hearted=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<h> gcs17 = gcs6;
            gcs6.accept(this);
        }
    }

    /* renamed from: nay$i */
    public static final class i extends nay {
        public final int a;

        i(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof i) && ((i) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NextChapterClicked{itemIndex=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<i> gcs17 = gcs;
            gcs.accept(this);
        }
    }

    /* renamed from: nay$j */
    public static final class j extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlaybackError{}";
        }

        j() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof j;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs16.accept(this);
        }
    }

    /* renamed from: nay$k */
    public static final class k extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlaylistCoverPressed{}";
        }

        k() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<k> gcs17 = gcs8;
            gcs8.accept(this);
        }
    }

    /* renamed from: nay$l */
    public static final class l extends nay {
        public final int a;

        l(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof l) && ((l) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PreviousChapterClicked{itemIndex=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<l> gcs17 = gcs2;
            gcs2.accept(this);
        }
    }

    /* renamed from: nay$m */
    public static final class m extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StoryFetched{}";
        }

        m() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof m;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<m> gcs17 = gcs12;
            gcs12.accept(this);
        }
    }

    /* renamed from: nay$n */
    public static final class n extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StoryFetchingFailed{}";
        }

        n() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof n;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<n> gcs17 = gcs13;
            gcs13.accept(this);
        }
    }

    /* renamed from: nay$o */
    public static final class o extends nay {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StoryViewShown{}";
        }

        o() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof o;
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<o> gcs17 = gcs11;
            gcs11.accept(this);
        }
    }

    /* renamed from: nay$p */
    public static final class p extends nay {
        public final int a;

        p(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof p) && ((p) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("VideoPlaying{itemIndex=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16) {
            gcs<p> gcs17 = gcs9;
            gcs9.accept(this);
        }
    }

    public abstract void a(gcs<i> gcs, gcs<l> gcs2, gcs<c> gcs3, gcs<e> gcs4, gcs<b> gcs5, gcs<h> gcs6, gcs<d> gcs7, gcs<k> gcs8, gcs<p> gcs9, gcs<a> gcs10, gcs<o> gcs11, gcs<m> gcs12, gcs<n> gcs13, gcs<g> gcs14, gcs<f> gcs15, gcs<j> gcs16);

    nay() {
    }

    public static nay a(int i2) {
        return new i(i2);
    }
}
