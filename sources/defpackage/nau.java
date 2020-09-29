package defpackage;

import com.spotify.stories.v1.view.proto.Chapter;
import com.spotify.stories.v1.view.proto.TrackChapter;
import java.util.List;

/* renamed from: nau reason: default package */
public abstract class nau {

    /* renamed from: nau$a */
    public static final class a extends nau {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Close{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: nau$b */
    public static final class b extends nau {
        public final String a;
        public final boolean b;

        b(String str, boolean z) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: nau$c */
    public static final class c extends nau {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadStory{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    /* renamed from: nau$d */
    public static final class d extends nau {
        public final nay a;

        d(nay nay) {
            this.a = (nay) gcr.a(nay);
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

    /* renamed from: nau$e */
    public static final class e extends nau {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToPlaylist{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    /* renamed from: nau$f */
    public static final class f extends nau {
        public final int a;
        public final long b;
        public final Chapter c;

        f(int i, long j, Chapter chapter) {
            this.a = i;
            this.b = j;
            this.c = (Chapter) gcr.a(chapter);
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

    /* renamed from: nau$g */
    public static final class g extends nau {
        public final List<Chapter> a;

        g(List<Chapter> list) {
            this.a = (List) gcr.a(list);
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

    /* renamed from: nau$h */
    public static final class h extends nau {
        public final TrackChapter a;

        h(TrackChapter trackChapter) {
            this.a = (TrackChapter) gcr.a(trackChapter);
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

    /* renamed from: nau$i */
    public static final class i extends nau {
        public final nax a;

        i(nax nax) {
            this.a = (nax) gcr.a(nax);
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

    /* renamed from: nau$j */
    public static final class j extends nau {
        public final boolean a;

        j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof j) && ((j) obj).a == this.a;
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

    /* renamed from: nau$k */
    public static final class k extends nau {
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
            sb.append("UpdateStoryPlayerState{playing=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    nau() {
    }

    public static nau a(int i2, long j2, Chapter chapter) {
        return new f(i2, j2, chapter);
    }

    public static nau a(nay nay) {
        return new d(nay);
    }

    public static nau a(boolean z) {
        return new k(z);
    }

    public static nau b(boolean z) {
        return new j(z);
    }
}
