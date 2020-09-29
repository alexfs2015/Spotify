package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;

/* renamed from: ppb reason: default package */
public abstract class ppb {

    /* renamed from: ppb$a */
    public static final class a extends ppb {
        public final BannerMessage a;

        a(BannerMessage bannerMessage) {
            this.a = (BannerMessage) gcr.a(bannerMessage);
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
            sb.append("Banner{bannerMessage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: ppb$b */
    public static final class b extends ppb {
        public final QuicksilverCardMessage a;

        b(QuicksilverCardMessage quicksilverCardMessage) {
            this.a = (QuicksilverCardMessage) gcr.a(quicksilverCardMessage);
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
            sb.append("Card{cardMessage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: ppb$c */
    public static final class c extends ppb {
        public final NoteMessage a;

        c(NoteMessage noteMessage) {
            this.a = (NoteMessage) gcr.a(noteMessage);
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
            sb.append("Note{noteMessage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3);

    public abstract void a(gcs<b> gcs, gcs<a> gcs2, gcs<c> gcs3);

    ppb() {
    }

    public static ppb a(QuicksilverCardMessage quicksilverCardMessage) {
        return new b(quicksilverCardMessage);
    }

    public static ppb a(BannerMessage bannerMessage) {
        return new a(bannerMessage);
    }

    public static ppb a(NoteMessage noteMessage) {
        return new c(noteMessage);
    }
}
