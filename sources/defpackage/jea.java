package defpackage;

import com.spotify.mobile.android.sso.ErrorMessage;

/* renamed from: jea reason: default package */
public abstract class jea {

    /* renamed from: jea$a */
    public static final class a extends jea {
        public final String a;
        public final String b;
        public final int c;
        public final String d;

        a(String str, String str2, int i, String str3) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = i;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.c == this.c && aVar.a.equals(this.a) && aVar.b.equals(this.b) && gcr.a(aVar.d, this.d);
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

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<e> gcs4, gcs<c> gcs5) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<e, R_> gct4, gct<c, R_> gct5) {
            return gct.apply(this);
        }
    }

    /* renamed from: jea$b */
    public static final class b extends jea {
        public final String a;
        public final String b;
        public final String c;

        b(String str, String str2, String str3) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b) && gcr.a(bVar.c, this.c);
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

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<e> gcs4, gcs<c> gcs5) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<e, R_> gct4, gct<c, R_> gct5) {
            return gct2.apply(this);
        }
    }

    /* renamed from: jea$c */
    public static final class c extends jea {
        public final ErrorMessage a;

        c(ErrorMessage errorMessage) {
            this.a = (ErrorMessage) gcr.a(errorMessage);
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

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<e> gcs4, gcs<c> gcs5) {
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<e, R_> gct4, gct<c, R_> gct5) {
            return gct5.apply(this);
        }
    }

    /* renamed from: jea$d */
    public static final class d extends jea {
        public final ErrorMessage a;
        public final String b;
        public final String c;

        d(ErrorMessage errorMessage, String str, String str2) {
            this.a = (ErrorMessage) gcr.a(errorMessage);
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a == this.a && gcr.a(dVar.b, this.b) && gcr.a(dVar.c, this.c);
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

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<e> gcs4, gcs<c> gcs5) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<e, R_> gct4, gct<c, R_> gct5) {
            return gct3.apply(this);
        }
    }

    /* renamed from: jea$e */
    public static final class e extends jea {
        public final ErrorMessage a;
        public final String b;
        public final String c;

        e(ErrorMessage errorMessage, String str, String str2) {
            this.a = (ErrorMessage) gcr.a(errorMessage);
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a == this.a && gcr.a(eVar.b, this.b) && gcr.a(eVar.c, this.c);
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

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<e> gcs4, gcs<c> gcs5) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<e, R_> gct4, gct<c, R_> gct5) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<e, R_> gct4, gct<c, R_> gct5);

    public abstract void a(gcs<a> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<e> gcs4, gcs<c> gcs5);

    jea() {
    }

    public static jea a(ErrorMessage errorMessage, String str, String str2) {
        return new d(errorMessage, str, str2);
    }
}
