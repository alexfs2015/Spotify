package defpackage;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;

/* renamed from: uwl reason: default package */
public abstract class uwl {

    /* renamed from: uwl$a */
    public static final class a extends uwl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Pause{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct3.apply(this);
        }
    }

    /* renamed from: uwl$b */
    public static final class b extends uwl {
        final PauseCommand a;

        b(PauseCommand pauseCommand) {
            this.a = (PauseCommand) gcr.a(pauseCommand);
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
            sb.append("PauseWithCommand{command=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct4.apply(this);
        }
    }

    /* renamed from: uwl$c */
    public static final class c extends uwl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Resume{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct.apply(this);
        }
    }

    /* renamed from: uwl$d */
    public static final class d extends uwl {
        final ResumeCommand a;

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
            sb.append("ResumeWithCommand{command=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct2.apply(this);
        }
    }

    /* renamed from: uwl$e */
    public static final class e extends uwl {
        final long a;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof e) && ((e) obj).a == this.a;
        }

        public final int hashCode() {
            return Long.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SeekTo{ms=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct9.apply(this);
        }
    }

    /* renamed from: uwl$f */
    public static final class f extends uwl {
        final SeekToCommand a;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SeekToWithCommand{command=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct10.apply(this);
        }
    }

    /* renamed from: uwl$g */
    public static final class g extends uwl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToNextTrack{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct5.apply(this);
        }
    }

    /* renamed from: uwl$h */
    public static final class h extends uwl {
        final SkipToNextTrackCommand a;

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
            sb.append("SkipToNextTrackWithCommand{command=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct6.apply(this);
        }
    }

    /* renamed from: uwl$i */
    public static final class i extends uwl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToPrevTrack{}";
        }

        i() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct7.apply(this);
        }
    }

    /* renamed from: uwl$j */
    public static final class j extends uwl {
        final SkipToPrevTrackCommand a;

        public j(SkipToPrevTrackCommand skipToPrevTrackCommand) {
            this.a = (SkipToPrevTrackCommand) gcr.a(skipToPrevTrackCommand);
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
            sb.append("SkipToPrevTrackWithCommand{command=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct8.apply(this);
        }
    }

    /* renamed from: uwl$k */
    public static final class k extends uwl {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Stop{}";
        }

        k() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11) {
            return gct11.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<h, R_> gct6, gct<i, R_> gct7, gct<j, R_> gct8, gct<e, R_> gct9, gct<f, R_> gct10, gct<k, R_> gct11);

    uwl() {
    }

    public static uwl a(PauseCommand pauseCommand) {
        return new b(pauseCommand);
    }
}
