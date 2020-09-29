package defpackage;

import com.spotify.mobile.android.video.exception.BetamaxException;

/* renamed from: ngj reason: default package */
public abstract class ngj {

    /* renamed from: ngj$a */
    public static final class a extends ngj {
        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<c, R_> gee3, gee<a, R_> gee4, gee<b, R_> gee5, gee<d, R_> gee6) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Ended{}";
        }
    }

    /* renamed from: ngj$b */
    public static final class b extends ngj {
        public final BetamaxException a;

        public b(BetamaxException betamaxException) {
            this.a = (BetamaxException) gec.a(betamaxException);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<c, R_> gee3, gee<a, R_> gee4, gee<b, R_> gee5, gee<d, R_> gee6) {
            return gee5.apply(this);
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
    }

    /* renamed from: ngj$c */
    public static final class c extends ngj {
        final long a;
        final long b;

        public c(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<c, R_> gee3, gee<a, R_> gee4, gee<b, R_> gee5, gee<d, R_> gee6) {
            return gee3.apply(this);
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
    }

    /* renamed from: ngj$d */
    public static final class d extends ngj {
        public final BetamaxException a;

        public d(BetamaxException betamaxException) {
            this.a = (BetamaxException) gec.a(betamaxException);
        }

        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<c, R_> gee3, gee<a, R_> gee4, gee<b, R_> gee5, gee<d, R_> gee6) {
            return gee6.apply(this);
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
    }

    /* renamed from: ngj$e */
    public static final class e extends ngj {
        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<c, R_> gee3, gee<a, R_> gee4, gee<b, R_> gee5, gee<d, R_> gee6) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Resumed{}";
        }
    }

    /* renamed from: ngj$f */
    public static final class f extends ngj {
        public final <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<c, R_> gee3, gee<a, R_> gee4, gee<b, R_> gee5, gee<d, R_> gee6) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Started{}";
        }
    }

    ngj() {
    }

    public abstract <R_> R_ a(gee<f, R_> gee, gee<e, R_> gee2, gee<c, R_> gee3, gee<a, R_> gee4, gee<b, R_> gee5, gee<d, R_> gee6);
}
