package defpackage;

import com.spotify.stories.v1.view.proto.Chapter;
import com.spotify.stories.v1.view.proto.TrackChapter;
import java.util.List;

/* renamed from: ngc reason: default package */
public abstract class ngc {

    /* renamed from: ngc$a */
    public static final class a extends ngc {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Close{}";
        }
    }

    /* renamed from: ngc$b */
    public static final class b extends ngc {
        public final String a;
        public final boolean b;

        b(String str, boolean z) {
            this.a = (String) gec.a(str);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.b == this.b && bVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HeartChapter{trackUri=");
            sb.append(this.a);
            sb.append(", hearted=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngc$c */
    public static final class c extends ngc {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadStory{}";
        }
    }

    /* renamed from: ngc$d */
    public static final class d extends ngc {
        public final ngg a;

        d(ngg ngg) {
            this.a = (ngg) gec.a(ngg);
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
            sb.append("Log{log=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngc$e */
    public static final class e extends ngc {
        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToPlaylist{}";
        }
    }

    /* renamed from: ngc$f */
    public static final class f extends ngc {
        public final int a;
        public final long b;
        public final Chapter c;

        f(int i, long j, Chapter chapter) {
            this.a = i;
            this.b = j;
            this.c = (Chapter) gec.a(chapter);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a == this.a && fVar.b == this.b && fVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((Integer.valueOf(this.a).hashCode() + 0) * 31) + Long.valueOf(this.b).hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayChapter{index=");
            sb.append(this.a);
            sb.append(", positionMs=");
            sb.append(this.b);
            sb.append(", chapter=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngc$g */
    public static final class g extends ngc {
        public final List<Chapter> a;

        g(List<Chapter> list) {
            this.a = (List) gec.a(list);
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
            sb.append("PreFetchTrackCoverImages{chapters=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngc$h */
    public static final class h extends ngc {
        public final TrackChapter a;

        h(TrackChapter trackChapter) {
            this.a = (TrackChapter) gec.a(trackChapter);
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
            sb.append("ShowContextMenu{trackChapter=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngc$i */
    public static final class i extends ngc {
        public final ngf a;

        i(ngf ngf) {
            this.a = (ngf) gec.a(ngf);
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
            sb.append("ShowFeedback{feedback=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngc$j */
    public static final class j extends ngc {
        public final nga a;

        j(nga nga) {
            this.a = (nga) gec.a(nga);
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
            sb.append("UpdateAudioFocus{newAudioFocusState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngc$k */
    public static final class k extends ngc {
        public final boolean a;

        k(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof k) && ((k) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateContextPlayerState{playing=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngc$l */
    public static final class l extends ngc {
        public final boolean a;

        l(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof l) && ((l) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateStoryPlayerState{playing=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    ngc() {
    }

    public static ngc a(int i2, long j2, Chapter chapter) {
        return new f(i2, j2, chapter);
    }

    public static ngc a(nga nga) {
        return new j(nga);
    }

    public static ngc a(ngg ngg) {
        return new d(ngg);
    }

    public static ngc a(boolean z) {
        return new l(z);
    }

    public static ngc b(boolean z) {
        return new k(z);
    }
}
