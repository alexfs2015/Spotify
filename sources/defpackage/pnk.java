package defpackage;

import com.spotify.music.features.premiumdestination.domain.ErrorReason;

/* renamed from: pnk reason: default package */
public abstract class pnk {

    /* renamed from: pnk$a */
    public static final class a extends pnk {
        final ErrorReason a;

        public a(ErrorReason errorReason) {
            this.a = (ErrorReason) gec.a(errorReason);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee4.apply(this);
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
    }

    /* renamed from: pnk$b */
    public static final class b extends pnk {
        final hcs a;
        final long b;

        public b(hcs hcs, long j) {
            this.a = (hcs) gec.a(hcs);
            this.b = j;
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee3.apply(this);
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
    }

    /* renamed from: pnk$c */
    public static final class c extends pnk {
        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CacheMiss{}";
        }
    }

    /* renamed from: pnk$d */
    public static final class d extends pnk {
        final hcs a;
        final long b;

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee.apply(this);
        }

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
    }

    /* renamed from: pnk$e */
    public static final class e extends pnk {
        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadingIsTakingTooLong{}";
        }
    }

    /* renamed from: pnk$f */
    public static final class f extends pnk {
        final String a;

        f(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6) {
            return gee6.apply(this);
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
    }

    pnk() {
    }

    public static pnk a(String str) {
        return new f(str);
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5, gee<f, R_> gee6);
}
