package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Track;

/* renamed from: nxc reason: default package */
public abstract class nxc {

    /* renamed from: nxc$a */
    public static final class a extends nxc {
        public final String a;
        public final Track b;

        a(String str, Track track) {
            this.a = (String) gcr.a(str);
            this.b = (Track) gcr.a(track);
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
            sb.append("HeartTrack{contextUri=");
            sb.append(this.a);
            sb.append(", track=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nxc$b */
    public static final class b extends nxc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenNowPlayingView{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: nxc$c */
    public static final class c extends nxc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PausePlayer{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    /* renamed from: nxc$d */
    public static final class d extends nxc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ResumePlayer{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }
    }

    /* renamed from: nxc$e */
    public static final class e extends nxc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToNextTrack{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    /* renamed from: nxc$f */
    public static final class f extends nxc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToPrevTrack{}";
        }

        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }
    }

    /* renamed from: nxc$g */
    public static final class g extends nxc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TriggerPreCuration{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }
    }

    /* renamed from: nxc$h */
    public static final class h extends nxc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TriggerSkipEducation{}";
        }

        h() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }
    }

    nxc() {
    }
}
