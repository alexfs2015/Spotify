package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;

/* renamed from: svq reason: default package */
public abstract class svq {

    /* renamed from: svq$a */
    public static final class a extends svq {
        public final Throwable a;

        public a(Throwable th) {
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
            sb.append("Error{throwable=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: svq$b */
    public static final class b extends svq {
        public final StorylinesCardContent a;
        public final Optional<com.spotify.music.follow.FollowManager.a> b;

        public b(StorylinesCardContent storylinesCardContent, Optional<com.spotify.music.follow.FollowManager.a> optional) {
            this.a = (StorylinesCardContent) gcr.a(storylinesCardContent);
            this.b = (Optional) gcr.a(optional);
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

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    /* renamed from: svq$c */
    public static final class c extends svq {
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

    svq() {
    }
}
