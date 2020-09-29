package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;

/* renamed from: qiz reason: default package */
public abstract class qiz {

    /* renamed from: qiz$a */
    public static final class a extends qiz {
        public final Throwable a;

        a(Throwable th) {
            this.a = (Throwable) gcr.a(th);
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
            sb.append("Failed{throwable=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<g> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<c> gcs5, gcs<d> gcs6, gcs<a> gcs7) {
            gcs7.accept(this);
        }
    }

    /* renamed from: qiz$b */
    public static final class b extends qiz {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InProgress{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<g> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<c> gcs5, gcs<d> gcs6, gcs<a> gcs7) {
            gcs.accept(this);
        }
    }

    /* renamed from: qiz$c */
    public static final class c extends qiz {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OfflineWithLikedContent{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<b> gcs, gcs<g> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<c> gcs5, gcs<d> gcs6, gcs<a> gcs7) {
            gcs5.accept(this);
        }
    }

    /* renamed from: qiz$d */
    public static final class d extends qiz {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OfflineWithoutLikedContent{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<b> gcs, gcs<g> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<c> gcs5, gcs<d> gcs6, gcs<a> gcs7) {
            gcs6.accept(this);
        }
    }

    /* renamed from: qiz$e */
    public static final class e extends qiz {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OnlineWithLoadedContent{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final void a(gcs<b> gcs, gcs<g> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<c> gcs5, gcs<d> gcs6, gcs<a> gcs7) {
            gcs4.accept(this);
        }
    }

    /* renamed from: qiz$f */
    public static final class f extends qiz {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowedPickerView{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final void a(gcs<b> gcs, gcs<g> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<c> gcs5, gcs<d> gcs6, gcs<a> gcs7) {
            gcs3.accept(this);
        }
    }

    /* renamed from: qiz$g */
    public static final class g extends qiz {
        public final ArtistPickerResponse a;

        g(ArtistPickerResponse artistPickerResponse) {
            this.a = (ArtistPickerResponse) gcr.a(artistPickerResponse);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Successful{response=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<g> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<c> gcs5, gcs<d> gcs6, gcs<a> gcs7) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<g> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<c> gcs5, gcs<d> gcs6, gcs<a> gcs7);

    qiz() {
    }

    public static qiz a(ArtistPickerResponse artistPickerResponse) {
        return new g(artistPickerResponse);
    }

    public static qiz a(Throwable th) {
        return new a(th);
    }
}
