package defpackage;

import com.spotify.music.lyrics.model.LyricsColorsModel;

/* renamed from: suk reason: default package */
public abstract class suk {

    /* renamed from: suk$a */
    public static final class a extends suk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: suk$b */
    public static final class b extends suk {
        public final LyricsColorsModel a;

        b(LyricsColorsModel lyricsColorsModel) {
            this.a = (LyricsColorsModel) gcr.a(lyricsColorsModel);
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

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    /* renamed from: suk$c */
    public static final class c extends suk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }
    }

    public abstract void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3);

    suk() {
    }

    public static suk a(LyricsColorsModel lyricsColorsModel) {
        return new b(lyricsColorsModel);
    }
}
