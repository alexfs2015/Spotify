package defpackage;

import com.spotify.music.features.premiumdestination.domain.ErrorReason;

/* renamed from: pga reason: default package */
public abstract class pga {

    /* renamed from: pga$a */
    public static final class a extends pga {
        public final ErrorReason a;

        a(ErrorReason errorReason) {
            this.a = (ErrorReason) gcr.a(errorReason);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{reason=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: pga$b */
    public static final class b extends pga {
        private final gzz a;

        b(gzz gzz) {
            this.a = (gzz) gcr.a(gzz);
        }

        public final gzz a() {
            return this.a;
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
            sb.append("Loaded{viewModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: pga$c */
    public static final class c extends pga {
        public final boolean a;

        c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Uninitialized{loading=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3);

    pga() {
    }

    public static pga a(gzz gzz) {
        return new b(gzz);
    }

    public static pga a(boolean z) {
        return new c(z);
    }
}
