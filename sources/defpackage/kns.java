package defpackage;

import com.spotify.music.ads.voice.domain.CueType;
import com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: kns reason: default package */
public abstract class kns {

    /* renamed from: kns$a */
    public static final class a extends kns {
        private final String a;

        a(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("ClearAdSlots{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kns$b */
    public static final class b extends kns {
        public final String a;

        b(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("PlayContextUri{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kns$c */
    public static final class c extends kns {
        public final CueType a;

        c(CueType cueType) {
            this.a = (CueType) gcr.a(cueType);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayCue{cueType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kns$d */
    public static final class d extends kns {
        public final String a;
        public final String b;
        public final String c;

        d(String str, String str2, String str3) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b) && dVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PostSpeechError{sessionId=");
            sb.append(this.a);
            sb.append(", adId=");
            sb.append(this.b);
            sb.append(", message=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kns$e */
    public static final class e extends kns {
        public final String a;
        public final String b;
        public final long c;

        e(String str, String str2, long j) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.c == this.c && eVar.a.equals(this.a) && eVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Long.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PostSpeechReceived{sessionId=");
            sb.append(this.a);
            sb.append(", adId=");
            sb.append(this.b);
            sb.append(", position=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kns$f */
    public static final class f extends kns {
        public final String a;
        public final knv b;

        f(String str, knv knv) {
            this.a = (String) gcr.a(str);
            this.b = (knv) gcr.a(knv);
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
            sb.append("PostVoiceAdLog{eventType=");
            sb.append(this.a);
            sb.append(", voiceAdMetadata=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kns$g */
    public static final class g extends kns {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToNextTrack{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }
    }

    /* renamed from: kns$h */
    public static final class h extends kns {
        public final SpeechRecognitionCommandType a;
        public final Intent b;
        private final long c;

        h(SpeechRecognitionCommandType speechRecognitionCommandType, long j, Intent intent) {
            this.a = (SpeechRecognitionCommandType) gcr.a(speechRecognitionCommandType);
            this.c = j;
            this.b = (Intent) gcr.a(intent);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a == this.a && hVar.c == this.c && hVar.b == this.b;
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + Long.valueOf(this.c).hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SpeechRecognitionCommand{command=");
            sb.append(this.a);
            sb.append(", microphoneListeningPeriod=");
            sb.append(this.c);
            sb.append(", intent=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kns$i */
    public static final class i extends kns {
        public final long a;
        public final int b;

        i(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return iVar.a == this.a && iVar.b == this.b;
        }

        public final int hashCode() {
            return ((Long.valueOf(this.a).hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StartDelayTimer{delay=");
            sb.append(this.a);
            sb.append(", timerId=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    kns() {
    }

    public static kns a(long j, int i2) {
        return new i(j, i2);
    }

    public static kns a(SpeechRecognitionCommandType speechRecognitionCommandType, long j, Intent intent) {
        return new h(speechRecognitionCommandType, j, intent);
    }

    public static kns a(String str) {
        return new a(str);
    }

    public static kns a(CueType cueType) {
        return new c(cueType);
    }

    public static kns a(String str, knv knv) {
        return new f(str, knv);
    }
}
