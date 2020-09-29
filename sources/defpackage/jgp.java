package defpackage;

import com.spotify.mobile.android.sso.ErrorMessage;

/* renamed from: jgp reason: default package */
public abstract class jgp {

    /* renamed from: jgp$a */
    public static final class a extends jgp {
        public final String a;
        public final String b;
        public final int c;
        public final String d;

        a(String str, String str2, int i, String str3) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = i;
            this.d = str3;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<e, R_> gee4, gee<c, R_> gee5) {
            return gee.apply(this);
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<d> ged3, ged<e> ged4, ged<c> ged5) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.c == this.c && aVar.a.equals(this.a) && aVar.b.equals(this.b) && gec.a(aVar.d, this.d);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Integer.valueOf(this.c).hashCode()) * 31;
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AuthorizationAccessTokenResponse{accessToken=");
            sb.append(this.a);
            sb.append(", responseRedirectUri=");
            sb.append(this.b);
            sb.append(", expiresIn=");
            sb.append(this.c);
            sb.append(", state=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jgp$b */
    public static final class b extends jgp {
        public final String a;
        public final String b;
        public final String c;

        b(String str, String str2, String str3) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = str3;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<e, R_> gee4, gee<c, R_> gee5) {
            return gee2.apply(this);
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<d> ged3, ged<e> ged4, ged<c> ged5) {
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
            return bVar.a.equals(this.a) && bVar.b.equals(this.b) && gec.a(bVar.c, this.c);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31;
            String str = this.c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AuthorizationCodeResponse{code=");
            sb.append(this.a);
            sb.append(", responseRedirectUri=");
            sb.append(this.b);
            sb.append(", state=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jgp$c */
    public static final class c extends jgp {
        public final ErrorMessage a;

        c(ErrorMessage errorMessage) {
            this.a = (ErrorMessage) gec.a(errorMessage);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<e, R_> gee4, gee<c, R_> gee5) {
            return gee5.apply(this);
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<d> ged3, ged<e> ged4, ged<c> ged5) {
            ged5.accept(this);
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
            sb.append("AuthorizationEmptyResponse{errorMessage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jgp$d */
    public static final class d extends jgp {
        public final ErrorMessage a;
        public final String b;
        public final String c;

        d(ErrorMessage errorMessage, String str, String str2) {
            this.a = (ErrorMessage) gec.a(errorMessage);
            this.b = str;
            this.c = str2;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<e, R_> gee4, gee<c, R_> gee5) {
            return gee3.apply(this);
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<d> ged3, ged<e> ged4, ged<c> ged5) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a == this.a && gec.a(dVar.b, this.b) && gec.a(dVar.c, this.c);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (this.a.hashCode() + 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AuthorizationErrorResponse{errorMessage=");
            sb.append(this.a);
            sb.append(", errorDescription=");
            sb.append(this.b);
            sb.append(", state=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jgp$e */
    public static final class e extends jgp {
        public final ErrorMessage a;
        public final String b;
        public final String c;

        e(ErrorMessage errorMessage, String str, String str2) {
            this.a = (ErrorMessage) gec.a(errorMessage);
            this.b = str;
            this.c = str2;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<e, R_> gee4, gee<c, R_> gee5) {
            return gee4.apply(this);
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<d> ged3, ged<e> ged4, ged<c> ged5) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a == this.a && gec.a(eVar.b, this.b) && gec.a(eVar.c, this.c);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (this.a.hashCode() + 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AuthorizationUnknownResponse{errorMessage=");
            sb.append(this.a);
            sb.append(", responseRedirectUri=");
            sb.append(this.b);
            sb.append(", state=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    jgp() {
    }

    public static jgp a(ErrorMessage errorMessage, String str, String str2) {
        return new d(errorMessage, str, str2);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2, gee<d, R_> gee3, gee<e, R_> gee4, gee<c, R_> gee5);

    public abstract void a(ged<a> ged, ged<b> ged2, ged<d> ged3, ged<e> ged4, ged<c> ged5);
}
