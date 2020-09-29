package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;

/* renamed from: qri reason: default package */
public abstract class qri {

    /* renamed from: qri$a */
    public static final class a extends qri {
        public final Throwable a;

        a(Throwable th) {
            this.a = (Throwable) gec.a(th);
        }

        public final void a(ged<b> ged, ged<g> ged2, ged<f> ged3, ged<e> ged4, ged<c> ged5, ged<d> ged6, ged<a> ged7) {
            ged7.accept(this);
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
    }

    /* renamed from: qri$b */
    public static final class b extends qri {
        public final void a(ged<b> ged, ged<g> ged2, ged<f> ged3, ged<e> ged4, ged<c> ged5, ged<d> ged6, ged<a> ged7) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InProgress{}";
        }
    }

    /* renamed from: qri$c */
    public static final class c extends qri {
        public final void a(ged<b> ged, ged<g> ged2, ged<f> ged3, ged<e> ged4, ged<c> ged5, ged<d> ged6, ged<a> ged7) {
            ged5.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OfflineWithLikedContent{}";
        }
    }

    /* renamed from: qri$d */
    public static final class d extends qri {
        public final void a(ged<b> ged, ged<g> ged2, ged<f> ged3, ged<e> ged4, ged<c> ged5, ged<d> ged6, ged<a> ged7) {
            ged6.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OfflineWithoutLikedContent{}";
        }
    }

    /* renamed from: qri$e */
    public static final class e extends qri {
        public final void a(ged<b> ged, ged<g> ged2, ged<f> ged3, ged<e> ged4, ged<c> ged5, ged<d> ged6, ged<a> ged7) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OnlineWithLoadedContent{}";
        }
    }

    /* renamed from: qri$f */
    public static final class f extends qri {
        public final void a(ged<b> ged, ged<g> ged2, ged<f> ged3, ged<e> ged4, ged<c> ged5, ged<d> ged6, ged<a> ged7) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowedPickerView{}";
        }
    }

    /* renamed from: qri$g */
    public static final class g extends qri {
        public final ArtistPickerResponse a;

        g(ArtistPickerResponse artistPickerResponse) {
            this.a = (ArtistPickerResponse) gec.a(artistPickerResponse);
        }

        public final void a(ged<b> ged, ged<g> ged2, ged<f> ged3, ged<e> ged4, ged<c> ged5, ged<d> ged6, ged<a> ged7) {
            ged2.accept(this);
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
    }

    qri() {
    }

    public static qri a(ArtistPickerResponse artistPickerResponse) {
        return new g(artistPickerResponse);
    }

    public static qri a(Throwable th) {
        return new a(th);
    }

    public abstract void a(ged<b> ged, ged<g> ged2, ged<f> ged3, ged<e> ged4, ged<c> ged5, ged<d> ged6, ged<a> ged7);
}
