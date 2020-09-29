package defpackage;

import com.spotify.music.features.premiumdestination.domain.ErrorReason;

/* renamed from: pnm reason: default package */
public abstract class pnm {

    /* renamed from: pnm$a */
    public static final class a extends pnm {
        public final ErrorReason a;

        a(ErrorReason errorReason) {
            this.a = (ErrorReason) gec.a(errorReason);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee2.apply(this);
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
    }

    /* renamed from: pnm$b */
    public static final class b extends pnm {
        private final hcs a;

        b(hcs hcs) {
            this.a = (hcs) gec.a(hcs);
        }

        public final hcs a() {
            return this.a;
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee.apply(this);
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
    }

    /* renamed from: pnm$c */
    public static final class c extends pnm {
        public final boolean a;

        c(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee3.apply(this);
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
    }

    pnm() {
    }

    public static pnm a(hcs hcs) {
        return new b(hcs);
    }

    public static pnm a(boolean z) {
        return new c(z);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3);
}
