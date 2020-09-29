package defpackage;

import com.spotify.music.ads.voice.domain.CueType;
import com.spotify.music.ads.voice.domain.SpeechRecognitionErrorType;

/* renamed from: knt reason: default package */
public abstract class knt {

    /* renamed from: knt$a */
    public static final class a extends knt {
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
            sb.append("AdEventPosted{eventType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct14.apply(this);
        }
    }

    /* renamed from: knt$b */
    public static final class b extends knt {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AdSlotsCleared{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct6.apply(this);
        }
    }

    /* renamed from: knt$c */
    public static final class c extends knt {
        private final boolean a;

        public c(boolean z) {
            this.a = z;
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

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct11.apply(this);
        }
    }

    /* renamed from: knt$d */
    public static final class d extends knt {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CtaClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct7.apply(this);
        }
    }

    /* renamed from: knt$e */
    public static final class e extends knt {
        final CueType a;

        e(CueType cueType) {
            this.a = (CueType) gcr.a(cueType);
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

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct12.apply(this);
        }
    }

    /* renamed from: knt$f */
    public static final class f extends knt {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InvalidUriDetected{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct13.apply(this);
        }
    }

    /* renamed from: knt$g */
    public static final class g extends knt {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlaybackBuffering{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct9.apply(this);
        }
    }

    /* renamed from: knt$h */
    public static final class h extends knt {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PlaybackPaused{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct8.apply(this);
        }
    }

    /* renamed from: knt$i */
    public static final class i extends knt {
        final long a;
        private final long b;
        private final long c;

        public i(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
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

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct10.apply(this);
        }
    }

    /* renamed from: knt$j */
    public static final class j extends knt {
        final boolean a;

        public j(boolean z) {
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
            sb.append("SpeechIntentRecognized{isPositive=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct4.apply(this);
        }
    }

    /* renamed from: knt$k */
    public static final class k extends knt {
        final SpeechRecognitionErrorType a;

        k(SpeechRecognitionErrorType speechRecognitionErrorType) {
            this.a = (SpeechRecognitionErrorType) gcr.a(speechRecognitionErrorType);
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

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct5.apply(this);
        }
    }

    /* renamed from: knt$l */
    public static final class l extends knt {
        final long a;

        public l(long j) {
            this.a = j;
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

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct3.apply(this);
        }
    }

    /* renamed from: knt$m */
    public static final class m extends knt {
        final String a;

        public m(String str) {
            this.a = (String) gcr.a(str);
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

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct2.apply(this);
        }
    }

    /* renamed from: knt$n */
    public static final class n extends knt {
        final int a;

        public n(int i) {
            this.a = i;
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

        public final <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<n, R_> gct, gct<m, R_> gct2, gct<l, R_> gct3, gct<j, R_> gct4, gct<k, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<h, R_> gct8, gct<g, R_> gct9, gct<i, R_> gct10, gct<c, R_> gct11, gct<e, R_> gct12, gct<f, R_> gct13, gct<a, R_> gct14);

    knt() {
    }

    public static knt a(SpeechRecognitionErrorType speechRecognitionErrorType) {
        return new k(speechRecognitionErrorType);
    }

    public static knt a(CueType cueType) {
        return new e(cueType);
    }

    public static knt a(String str) {
        return new a(str);
    }
}
