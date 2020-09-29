package defpackage;

import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;

/* renamed from: pjr reason: default package */
public abstract class pjr {

    /* renamed from: pjr$a */
    public static final class a extends pjr {
        final boolean a;

        a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionChanged{connected=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4) {
            return gct3.apply(this);
        }
    }

    /* renamed from: pjr$b */
    public static final class b extends pjr {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EditProfileClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: pjr$c */
    public static final class c extends pjr {
        final ProfileV2VolatileModel a;

        c(ProfileV2VolatileModel profileV2VolatileModel) {
            this.a = (ProfileV2VolatileModel) gcr.a(profileV2VolatileModel);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ProfileData{profileV2VolatileModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4) {
            return gct.apply(this);
        }
    }

    /* renamed from: pjr$d */
    public static final class d extends pjr {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ProfileDataFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<a, R_> gct3, gct<b, R_> gct4);

    pjr() {
    }

    public static pjr a(ProfileV2VolatileModel profileV2VolatileModel) {
        return new c(profileV2VolatileModel);
    }

    public static pjr a(boolean z) {
        return new a(z);
    }
}
