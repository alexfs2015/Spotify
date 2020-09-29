package defpackage;

import com.spotify.mobile.android.storylines.model.StorylinesCardContent;

/* renamed from: svp reason: default package */
public abstract class svp {

    /* renamed from: svp$a */
    public static final class a extends svp {
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
            sb.append("Error{throwable=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: svp$b */
    public static final class b extends svp {
        public final StorylinesCardContent a;

        b(StorylinesCardContent storylinesCardContent) {
            this.a = (StorylinesCardContent) gcr.a(storylinesCardContent);
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
            sb.append("Loaded{storylinesContent=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: svp$c */
    public static final class c extends svp {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3);

    svp() {
    }

    public static svp a(StorylinesCardContent storylinesCardContent) {
        return new b(storylinesCardContent);
    }

    public static svp a(Throwable th) {
        return new a(th);
    }
}
