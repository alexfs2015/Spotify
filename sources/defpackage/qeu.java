package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qeu reason: default package */
public abstract class qeu {

    /* renamed from: qeu$a */
    public static final class a extends qeu {
        final String a;
        final Throwable b;

        a(String str, Throwable th) {
            this.a = (String) gcr.a(str);
            this.b = (Throwable) gcr.a(th);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{uri=");
            sb.append(this.a);
            sb.append(", throwable=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: qeu$b */
    public static final class b extends qeu {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadingTimeoutCheck{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: qeu$c */
    public static final class c extends qeu {
        final MediaType a;

        c(MediaType mediaType) {
            this.a = (MediaType) gcr.a(mediaType);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MetadataLookupCompleted{mediaType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3);

    qeu() {
    }

    public static qeu a(MediaType mediaType) {
        return new c(mediaType);
    }
}
