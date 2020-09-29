package defpackage;

import com.spotify.music.ads.voice.domain.CueType;
import com.spotify.music.ads.voice.domain.SpeechRecognitionErrorType;

/* renamed from: krc reason: default package */
public abstract class krc {

    /* renamed from: krc$a */
    public static final class a extends krc {
        private final String a;

        a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee14.apply(this);
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
            sb.append("AdEventPosted{eventType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: krc$b */
    public static final class b extends krc {
        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AdSlotsCleared{}";
        }
    }

    /* renamed from: krc$c */
    public static final class c extends krc {
        private final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee11.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContextChangeRequested{contextChange=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: krc$d */
    public static final class d extends krc {
        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CtaClicked{}";
        }
    }

    /* renamed from: krc$e */
    public static final class e extends krc {
        final CueType a;

        e(CueType cueType) {
            this.a = (CueType) gec.a(cueType);
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee12.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof e) && ((e) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CuePlayed{cueType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: krc$f */
    public static final class f extends krc {
        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee13.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InvalidUriDetected{}";
        }
    }

    /* renamed from: krc$g */
    public static final class g extends krc {
        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee9.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlaybackBuffering{}";
        }
    }

    /* renamed from: krc$h */
    public static final class h extends krc {
        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee8.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlaybackPaused{}";
        }
    }

    /* renamed from: krc$i */
    public static final class i extends krc {
        final long a;
        private final long b;
        private final long c;

        public i(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee10.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return iVar.a == this.a && iVar.b == this.b && iVar.c == this.c;
        }

        public final int hashCode() {
            return ((((Long.valueOf(this.a).hashCode() + 0) * 31) + Long.valueOf(this.b).hashCode()) * 31) + Long.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaybackResumed{position=");
            sb.append(this.a);
            sb.append(", duration=");
            sb.append(this.b);
            sb.append(", currentTime=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: krc$j */
    public static final class j extends krc {
        final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee4.apply(this);
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
            sb.append("SpeechIntentRecognized{isPositive=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: krc$k */
    public static final class k extends krc {
        final SpeechRecognitionErrorType a;

        k(SpeechRecognitionErrorType speechRecognitionErrorType) {
            this.a = (SpeechRecognitionErrorType) gec.a(speechRecognitionErrorType);
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof k) && ((k) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SpeechRecognitionError{errorType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: krc$l */
    public static final class l extends krc {
        final long a;

        public l(long j) {
            this.a = j;
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof l) && ((l) obj).a == this.a;
        }

        public final int hashCode() {
            return Long.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SpeechResponseReceived{position=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: krc$m */
    public static final class m extends krc {
        final String a;

        public m(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee2.apply(this);
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
            sb.append("SpeechSessionStarted{sessionId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: krc$n */
    public static final class n extends krc {
        final int a;

        public n(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof n) && ((n) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TimerElapsed{timerId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    krc() {
    }

    public static krc a(CueType cueType) {
        return new e(cueType);
    }

    public static krc a(SpeechRecognitionErrorType speechRecognitionErrorType) {
        return new k(speechRecognitionErrorType);
    }

    public static krc a(String str) {
        return new a(str);
    }

    public abstract <R_> R_ a(gee<n, R_> gee, gee<m, R_> gee2, gee<l, R_> gee3, gee<j, R_> gee4, gee<k, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<h, R_> gee8, gee<g, R_> gee9, gee<i, R_> gee10, gee<c, R_> gee11, gee<e, R_> gee12, gee<f, R_> gee13, gee<a, R_> gee14);
}
