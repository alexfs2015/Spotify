package defpackage;

import com.spotify.music.lyrics.model.LyricsColorsModel;

/* renamed from: ter reason: default package */
public abstract class ter {

    /* renamed from: ter$a */
    public static final class a extends ter {
        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error{}";
        }
    }

    /* renamed from: ter$b */
    public static final class b extends ter {
        public final LyricsColorsModel a;

        b(LyricsColorsModel lyricsColorsModel) {
            this.a = (LyricsColorsModel) gec.a(lyricsColorsModel);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged2.accept(this);
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
            sb.append("Loaded{trackLyricsAndColors=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ter$c */
    public static final class c extends ter {
        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    ter() {
    }

    public static ter a(LyricsColorsModel lyricsColorsModel) {
        return new b(lyricsColorsModel);
    }

    public abstract void a(ged<c> ged, ged<b> ged2, ged<a> ged3);
}
