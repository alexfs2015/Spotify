package defpackage;

import com.spotify.music.ads.voice.domain.CueType;
import com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: krb reason: default package */
public abstract class krb {

    /* renamed from: krb$a */
    public static final class a extends krb {
        private final String a;

        a(String str) {
            this.a = (String) gec.a(str);
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

    /* renamed from: krb$b */
    public static final class b extends krb {
        public final String a;

        b(String str) {
            this.a = (String) gec.a(str);
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

    /* renamed from: krb$c */
    public static final class c extends krb {
        public final CueType a;

        c(CueType cueType) {
            this.a = (CueType) gec.a(cueType);
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

    /* renamed from: krb$d */
    public static final class d extends krb {
        public final String a;
        public final String b;
        public final String c;

        d(String str, String str2, String str3) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
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

    /* renamed from: krb$e */
    public static final class e extends krb {
        public final String a;
        public final String b;
        public final long c;

        e(String str, String str2, long j) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
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

    /* renamed from: krb$f */
    public static final class f extends krb {
        public final String a;
        public final kre b;

        f(String str, kre kre) {
            this.a = (String) gec.a(str);
            this.b = (kre) gec.a(kre);
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

    /* renamed from: krb$g */
    public static final class g extends krb {
        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToNextTrack{}";
        }
    }

    /* renamed from: krb$h */
    public static final class h extends krb {
        public final SpeechRecognitionCommandType a;
        public final Intent b;
        private final long c;

        h(SpeechRecognitionCommandType speechRecognitionCommandType, long j, Intent intent) {
            this.a = (SpeechRecognitionCommandType) gec.a(speechRecognitionCommandType);
            this.c = j;
            this.b = (Intent) gec.a(intent);
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

    /* renamed from: krb$i */
    public static final class i extends krb {
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

    krb() {
    }

    public static krb a(long j, int i2) {
        return new i(j, i2);
    }

    public static krb a(CueType cueType) {
        return new c(cueType);
    }

    public static krb a(SpeechRecognitionCommandType speechRecognitionCommandType, long j, Intent intent) {
        return new h(speechRecognitionCommandType, j, intent);
    }

    public static krb a(String str) {
        return new a(str);
    }

    public static krb a(String str, kre kre) {
        return new f(str, kre);
    }
}
