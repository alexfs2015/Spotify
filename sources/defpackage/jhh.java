package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;

/* renamed from: jhh reason: default package */
public abstract class jhh {

    /* renamed from: jhh$a */
    public static final class a extends jhh {
        public final String a;
        private final String b;
        private final String c;

        a(String str, String str2, String str3) {
            this.b = (String) gec.a(str);
            this.a = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.b.equals(this.b) && aVar.a.equals(this.a) && aVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.b.hashCode() + 0) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DeliverAccessToken{token=");
            sb.append(this.b);
            sb.append(", responseRedirectUri=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jhh$b */
    public static final class b extends jhh {
        public final String a;
        private final String b;
        private final String c;

        b(String str, String str2, String str3) {
            this.b = (String) gec.a(str);
            this.a = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.b.equals(this.b) && bVar.a.equals(this.a) && bVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.b.hashCode() + 0) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DeliverAuthCode{code=");
            sb.append(this.b);
            sb.append(", responseRedirectUri=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jhh$c */
    public static final class c extends jhh {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadGoogleV1AppFlipFlag{}";
        }
    }

    /* renamed from: jhh$d */
    public static final class d extends jhh {
        public final Uri a;
        public final String b;
        public final jhb c;

        d(Uri uri, String str, jhb jhb) {
            this.a = (Uri) gec.a(uri);
            this.b = (String) gec.a(str);
            this.c = (jhb) gec.a(jhb);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b) && dVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestUserAuthorization{accountsRequestUri=");
            sb.append(this.a);
            sb.append(", requestRedirectUri=");
            sb.append(this.b);
            sb.append(", cookie=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jhh$e */
    public static final class e extends jhh {
        public final AuthorizationRequest a;
        public final jhb b;

        e(AuthorizationRequest authorizationRequest, jhb jhb) {
            this.a = (AuthorizationRequest) gec.a(authorizationRequest);
            this.b = (jhb) gec.a(jhb);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a.equals(this.a) && eVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SendAccountsRequest{request=");
            sb.append(this.a);
            sb.append(", cookie=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jhh$f */
    public static final class f extends jhh {
        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SendBakeryRequest{}";
        }
    }

    /* renamed from: jhh$g */
    public static final class g extends jhh {
        public final ErrorMessage a;
        public final String b;

        g(ErrorMessage errorMessage, String str) {
            this.a = (ErrorMessage) gec.a(errorMessage);
            this.b = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return gVar.a == this.a && gVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SendErrorAndFinish{errorMessage=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jhh$h */
    public static final class h extends jhh {
        public final ErrorMessage a;
        public final String b;
        public final String c;

        h(ErrorMessage errorMessage, String str, String str2) {
            this.a = (ErrorMessage) gec.a(errorMessage);
            this.b = (String) gec.a(str);
            this.c = (String) gec.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a == this.a && hVar.b.equals(this.b) && hVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SendErrorWithDescriptionAndFinish{errorMessage=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", state=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jhh$i */
    public static final class i extends jhh {
        public final ErrorMessage a;
        public final int b;
        public final String c;

        i(ErrorMessage errorMessage, int i, String str) {
            this.a = (ErrorMessage) gec.a(errorMessage);
            this.b = i;
            this.c = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return iVar.a == this.a && iVar.b == this.b && iVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SendErrorWithDescriptionResAndFinish{errorMessage=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", state=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: jhh$j */
    public static final class j extends jhh {
        j() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof j;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StartAuthorizationTimeoutTimer{}";
        }
    }

    /* renamed from: jhh$k */
    public static final class k extends jhh {
        k() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StartLoginActivity{}";
        }
    }

    /* renamed from: jhh$l */
    public static final class l extends jhh {
        l() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SubscribeToStateChanges{}";
        }
    }

    jhh() {
    }

    public static jhh a(Uri uri, String str, jhb jhb) {
        return new d(uri, str, jhb);
    }

    public static jhh a(ErrorMessage errorMessage, int i2, String str) {
        return new i(errorMessage, i2, str);
    }

    public static jhh a(ErrorMessage errorMessage, String str) {
        return new g(errorMessage, str);
    }

    public static jhh a(ErrorMessage errorMessage, String str, String str2) {
        return new h(errorMessage, str, str2);
    }
}
