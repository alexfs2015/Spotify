package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;

/* renamed from: tfx reason: default package */
public abstract class tfx {

    /* renamed from: tfx$a */
    public static final class a extends tfx {
        public final Throwable a;

        public a(Throwable th) {
            this.a = (Throwable) gec.a(th);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged3.accept(this);
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
            sb.append("Error{throwable=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: tfx$b */
    public static final class b extends tfx {
        public final StorylinesCardContent a;
        public final Optional<com.spotify.music.follow.FollowManager.a> b;

        public b(StorylinesCardContent storylinesCardContent, Optional<com.spotify.music.follow.FollowManager.a> optional) {
            this.a = (StorylinesCardContent) gec.a(storylinesCardContent);
            this.b = (Optional) gec.a(optional);
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
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Loaded{storylinesCardContent=");
            sb.append(this.a);
            sb.append(", followData=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: tfx$c */
    public static final class c extends tfx {
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

    tfx() {
    }

    public abstract void a(ged<c> ged, ged<b> ged2, ged<a> ged3);
}
