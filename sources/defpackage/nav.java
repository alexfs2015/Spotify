package defpackage;

import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.stories.v1.view.proto.Story;

/* renamed from: nav reason: default package */
public abstract class nav {

    /* renamed from: nav$a */
    public static final class a extends nav {
        private final Story a;

        public a(Story story) {
            this.a = (Story) gcr.a(story);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4) {
            return gct3.apply(this);
        }
    }

    /* renamed from: nav$b */
    public static final class b extends nav {
        private final Story a;

        public b(Story story) {
            this.a = (Story) gcr.a(story);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: nav$c */
    public static final class c extends nav {
        private final BetamaxException a;

        c(BetamaxException betamaxException) {
            this.a = (BetamaxException) gcr.a(betamaxException);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: nav$d */
    public static final class d extends nav {
        private final Throwable a;

        public d(Throwable th) {
            this.a = (Throwable) gcr.a(th);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4);

    nav() {
    }

    public static nav a(BetamaxException betamaxException) {
        return new c(betamaxException);
    }
}
