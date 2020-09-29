package defpackage;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;

/* renamed from: vic reason: default package */
public abstract class vic {

    /* renamed from: vic$a */
    public static final class a extends vic {
        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Pause{}";
        }
    }

    /* renamed from: vic$b */
    public static final class b extends vic {
        final PauseCommand a;

        b(PauseCommand pauseCommand) {
            this.a = (PauseCommand) gec.a(pauseCommand);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee4.apply(this);
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
    }

    /* renamed from: vic$c */
    public static final class c extends vic {
        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Resume{}";
        }
    }

    /* renamed from: vic$d */
    public static final class d extends vic {
        final ResumeCommand a;

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee2.apply(this);
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
            sb.append("ResumeWithCommand{command=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vic$e */
    public static final class e extends vic {
        final long a;

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee9.apply(this);
        }

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
    }

    /* renamed from: vic$f */
    public static final class f extends vic {
        final SeekToCommand a;

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee10.apply(this);
        }

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
    }

    /* renamed from: vic$g */
    public static final class g extends vic {
        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee5.apply(this);
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

    /* renamed from: vic$h */
    public static final class h extends vic {
        final SkipToNextTrackCommand a;

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee6.apply(this);
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
            sb.append("SkipToNextTrackWithCommand{command=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vic$i */
    public static final class i extends vic {
        i() {
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SkipToPrevTrack{}";
        }
    }

    /* renamed from: vic$j */
    public static final class j extends vic {
        final SkipToPrevTrackCommand a;

        public j(SkipToPrevTrackCommand skipToPrevTrackCommand) {
            this.a = (SkipToPrevTrackCommand) gec.a(skipToPrevTrackCommand);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee8.apply(this);
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
    }

    /* renamed from: vic$k */
    public static final class k extends vic {
        k() {
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11) {
            return gee11.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Stop{}";
        }
    }

    vic() {
    }

    public static vic a(PauseCommand pauseCommand) {
        return new b(pauseCommand);
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<a, R_> gee3, gee<b, R_> gee4, gee<g, R_> gee5, gee<h, R_> gee6, gee<i, R_> gee7, gee<j, R_> gee8, gee<e, R_> gee9, gee<f, R_> gee10, gee<k, R_> gee11);
}
