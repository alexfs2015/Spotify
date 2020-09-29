package defpackage;

import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.stories.v1.view.proto.Story;

/* renamed from: ngd reason: default package */
public abstract class ngd {

    /* renamed from: ngd$a */
    public static final class a extends ngd {
        private final Story a;

        public a(Story story) {
            this.a = (Story) gec.a(story);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4) {
            return gee3.apply(this);
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
            sb.append("EmptyChapter{story=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngd$b */
    public static final class b extends ngd {
        private final Story a;

        public b(Story story) {
            this.a = (Story) gec.a(story);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4) {
            return gee2.apply(this);
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
            sb.append("EmptyStory{story=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngd$c */
    public static final class c extends ngd {
        private final BetamaxException a;

        c(BetamaxException betamaxException) {
            this.a = (BetamaxException) gec.a(betamaxException);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaybackError{exception=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ngd$d */
    public static final class d extends ngd {
        private final Throwable a;

        public d(Throwable th) {
            this.a = (Throwable) gec.a(th);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4) {
            return gee.apply(this);
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
            sb.append("StoryFetchingFailed{throwable=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    ngd() {
    }

    public static ngd a(BetamaxException betamaxException) {
        return new c(betamaxException);
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4);
}
