package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Track;

/* renamed from: odp reason: default package */
public abstract class odp {

    /* renamed from: odp$a */
    public static final class a extends odp {
        public final String a;
        public final Track b;

        a(String str, Track track) {
            this.a = (String) gec.a(str);
            this.b = (Track) gec.a(track);
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

    /* renamed from: odp$b */
    public static final class b extends odp {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenNowPlayingView{}";
        }
    }

    /* renamed from: odp$c */
    public static final class c extends odp {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PausePlayer{}";
        }
    }

    /* renamed from: odp$d */
    public static final class d extends odp {
        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ResumePlayer{}";
        }
    }

    /* renamed from: odp$e */
    public static final class e extends odp {
        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToNextTrack{}";
        }
    }

    /* renamed from: odp$f */
    public static final class f extends odp {
        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToPrevTrack{}";
        }
    }

    /* renamed from: odp$g */
    public static final class g extends odp {
        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TriggerPreCuration{}";
        }
    }

    /* renamed from: odp$h */
    public static final class h extends odp {
        h() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TriggerSkipEducation{}";
        }
    }

    odp() {
    }
}
