package defpackage;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;

/* renamed from: vlc reason: default package */
public abstract class vlc {

    /* renamed from: vlc$a */
    public static final class a extends vlc {
        private final vkg a;

        a(vkg vkg) {
            this.a = (vkg) gcr.a(vkg);
        }

        public final vkg a() {
            return this.a;
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
            sb.append("AgeEffect{effect=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$b */
    public static final class b extends vlc {
        private final vlj a;

        b(vlj vlj) {
            this.a = (vlj) gcr.a(vlj);
        }

        public final vlj a() {
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
            sb.append("EmailEffect{effect=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$c */
    public static final class c extends vlc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchSignupConfiguration{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    /* renamed from: vlc$d */
    public static final class d extends vlc {
        public final int a;

        d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof d) && ((d) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FinishActivity{resultCode=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$e */
    public static final class e extends vlc {
        public final String a;

        e(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FinishWithRedirectToLogin{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$f */
    public static final class f extends vlc {
        private final vlx a;

        f(vlx vlx) {
            this.a = (vlx) gcr.a(vlx);
        }

        public final vlx a() {
            return this.a;
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
            sb.append("GenderEffect{effect=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$g */
    public static final class g extends vlc {
        public final String a;
        public final String b;

        g(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return gVar.a.equals(this.a) && gVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Login{username=");
            sb.append(this.a);
            sb.append(", password=***");
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$h */
    public static final class h extends vlc {
        private final vmf a;

        h(vmf vmf) {
            this.a = (vmf) gcr.a(vmf);
        }

        public final vmf a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NameEffect{effect=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$i */
    public static final class i extends vlc {
        private final vmp a;

        i(vmp vmp) {
            this.a = (vmp) gcr.a(vmp);
        }

        public final vmp a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            return ((i) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PasswordEffect{effect=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$j */
    public static final class j extends vlc {
        public final String a;
        public final String b;

        j(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return jVar.a.equals(this.a) && jVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SaveCredentials{email=");
            sb.append(this.a);
            sb.append(", password=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$k */
    public static final class k extends vlc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowEmailAlreadyRegisteredErrorDialog{}";
        }

        k() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }
    }

    /* renamed from: vlc$l */
    public static final class l extends vlc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowGenericErrorDialog{}";
        }

        l() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }
    }

    /* renamed from: vlc$m */
    public static final class m extends vlc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowInvalidAgeErrorDialog{}";
        }

        m() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof m;
        }
    }

    /* renamed from: vlc$n */
    public static final class n extends vlc {
        public final String a;
        public final String b;

        n(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return nVar.a.equals(this.a) && nVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowLoginErrorDialog{username=");
            sb.append(this.a);
            sb.append(", password=***");
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$o */
    public static final class o extends vlc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowNoConnectionErrorDialog{}";
        }

        o() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof o;
        }
    }

    /* renamed from: vlc$p */
    public static final class p extends vlc {
        public final voi a;

        p(voi voi) {
            this.a = (voi) gcr.a(voi);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return ((p) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowTermsAndConditions{termsAndConditionsModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vlc$q */
    public static final class q extends vlc {
        public final EmailSignupRequestBody a;

        q(EmailSignupRequestBody emailSignupRequestBody) {
            this.a = (EmailSignupRequestBody) gcr.a(emailSignupRequestBody);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            return ((q) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Signup{request=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vlc() {
    }

    public static vlc a(vlj vlj) {
        return new b(vlj);
    }

    public static vlc a(vmp vmp) {
        return new i(vmp);
    }

    public static vlc a(vkg vkg) {
        return new a(vkg);
    }

    public static vlc a(vlx vlx) {
        return new f(vlx);
    }

    public static vlc a(vmf vmf) {
        return new h(vmf);
    }

    public static vlc a(int i2) {
        return new d(i2);
    }

    public static vlc a(String str, String str2) {
        return new g(str, str2);
    }
}
