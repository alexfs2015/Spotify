package defpackage;

import com.spotify.mobile.android.video.exception.BetamaxException;

/* renamed from: nbb reason: default package */
public abstract class nbb {

    /* renamed from: nbb$a */
    public static final class a extends nbb {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Ended{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<c, R_> gct3, gct<a, R_> gct4, gct<b, R_> gct5, gct<d, R_> gct6) {
            return gct4.apply(this);
        }
    }

    /* renamed from: nbb$b */
    public static final class b extends nbb {
        public final BetamaxException a;

        public b(BetamaxException betamaxException) {
            this.a = (BetamaxException) gcr.a(betamaxException);
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
            sb.append("Error{exception=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<c, R_> gct3, gct<a, R_> gct4, gct<b, R_> gct5, gct<d, R_> gct6) {
            return gct5.apply(this);
        }
    }

    /* renamed from: nbb$c */
    public static final class c extends nbb {
        final long a;
        final long b;

        public c(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a == this.a && cVar.b == this.b;
        }

        public final int hashCode() {
            return ((Long.valueOf(this.a).hashCode() + 0) * 31) + Long.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaybackPositionChanged{playbackPositionMs=");
            sb.append(this.a);
            sb.append(", playbackDurationMs=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<c, R_> gct3, gct<a, R_> gct4, gct<b, R_> gct5, gct<d, R_> gct6) {
            return gct3.apply(this);
        }
    }

    /* renamed from: nbb$d */
    public static final class d extends nbb {
        public final BetamaxException a;

        public d(BetamaxException betamaxException) {
            this.a = (BetamaxException) gcr.a(betamaxException);
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
            sb.append("RecoverableError{exception=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<c, R_> gct3, gct<a, R_> gct4, gct<b, R_> gct5, gct<d, R_> gct6) {
            return gct6.apply(this);
        }
    }

    /* renamed from: nbb$e */
    public static final class e extends nbb {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Resumed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<c, R_> gct3, gct<a, R_> gct4, gct<b, R_> gct5, gct<d, R_> gct6) {
            return gct2.apply(this);
        }
    }

    /* renamed from: nbb$f */
    public static final class f extends nbb {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Started{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<c, R_> gct3, gct<a, R_> gct4, gct<b, R_> gct5, gct<d, R_> gct6) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<f, R_> gct, gct<e, R_> gct2, gct<c, R_> gct3, gct<a, R_> gct4, gct<b, R_> gct5, gct<d, R_> gct6);

    nbb() {
    }
}
