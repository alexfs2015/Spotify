package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qnx reason: default package */
public abstract class qnx {

    /* renamed from: qnx$a */
    public static final class a extends qnx {
        final String a;
        final Throwable b;

        a(String str, Throwable th) {
            this.a = (String) gec.a(str);
            this.b = (Throwable) gec.a(th);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
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
    }

    /* renamed from: qnx$b */
    public static final class b extends qnx {
        b() {
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadingTimeoutCheck{}";
        }
    }

    /* renamed from: qnx$c */
    public static final class c extends qnx {
        final MediaType a;

        c(MediaType mediaType) {
            this.a = (MediaType) gec.a(mediaType);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<a, R_> gee3) {
            return gee2.apply(this);
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
    }

    qnx() {
    }

    public static qnx a(MediaType mediaType) {
        return new c(mediaType);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<a, R_> gee3);
}
