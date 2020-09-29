package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;

/* renamed from: pxx reason: default package */
public abstract class pxx {

    /* renamed from: pxx$a */
    public static final class a extends pxx {
        public final BannerMessage a;

        a(BannerMessage bannerMessage) {
            this.a = (BannerMessage) gec.a(bannerMessage);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee2.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
            ged2.accept(this);
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
    }

    /* renamed from: pxx$b */
    public static final class b extends pxx {
        public final QuicksilverCardMessage a;

        b(QuicksilverCardMessage quicksilverCardMessage) {
            this.a = (QuicksilverCardMessage) gec.a(quicksilverCardMessage);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
            ged.accept(this);
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
    }

    /* renamed from: pxx$c */
    public static final class c extends pxx {
        public final NoteMessage a;

        c(NoteMessage noteMessage) {
            this.a = (NoteMessage) gec.a(noteMessage);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee3.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
            ged3.accept(this);
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
    }

    pxx() {
    }

    public static pxx a(BannerMessage bannerMessage) {
        return new a(bannerMessage);
    }

    public static pxx a(NoteMessage noteMessage) {
        return new c(noteMessage);
    }

    public static pxx a(QuicksilverCardMessage quicksilverCardMessage) {
        return new b(quicksilverCardMessage);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3);

    public abstract void a(ged<b> ged, ged<a> ged2, ged<c> ged3);
}
