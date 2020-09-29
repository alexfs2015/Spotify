package defpackage;

import com.spotify.music.features.premiumdestination.domain.ErrorReason;

/* renamed from: pfy reason: default package */
public abstract class pfy {

    /* renamed from: pfy$a */
    public static final class a extends pfy {
        final ErrorReason a;

        public a(ErrorReason errorReason) {
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
            sb.append("BackendRequestFailed{reason=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct4.apply(this);
        }
    }

    /* renamed from: pfy$b */
    public static final class b extends pfy {
        final gzz a;
        final long b;

        public b(gzz gzz, long j) {
            this.a = (gzz) gcr.a(gzz);
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.b == this.b && bVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Long.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BackendViewModelReceived{viewModel=");
            sb.append(this.a);
            sb.append(", ttl=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct3.apply(this);
        }
    }

    /* renamed from: pfy$c */
    public static final class c extends pfy {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CacheMiss{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct2.apply(this);
        }
    }

    /* renamed from: pfy$d */
    public static final class d extends pfy {
        final gzz a;
        final long b;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.b == this.b && dVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Long.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CachedViewModelReceived{viewModel=");
            sb.append(this.a);
            sb.append(", ttl=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct.apply(this);
        }
    }

    /* renamed from: pfy$e */
    public static final class e extends pfy {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadingIsTakingTooLong{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct5.apply(this);
        }
    }

    /* renamed from: pfy$f */
    public static final class f extends pfy {
        final String a;

        f(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UserProductChanged{productType=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6) {
            return gct6.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5, gct<f, R_> gct6);

    pfy() {
    }

    public static pfy a(String str) {
        return new f(str);
    }
}
