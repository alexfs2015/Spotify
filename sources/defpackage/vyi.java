package defpackage;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;

/* renamed from: vyi reason: default package */
public abstract class vyi {

    /* renamed from: vyi$a */
    public static final class a extends vyi {
        private final vxm a;

        a(vxm vxm) {
            this.a = (vxm) gec.a(vxm);
        }

        public final vxm a() {
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

    /* renamed from: vyi$b */
    public static final class b extends vyi {
        private final vyp a;

        b(vyp vyp) {
            this.a = (vyp) gec.a(vyp);
        }

        public final vyp a() {
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

    /* renamed from: vyi$c */
    public static final class c extends vyi {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchSignupConfiguration{}";
        }
    }

    /* renamed from: vyi$d */
    public static final class d extends vyi {
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

    /* renamed from: vyi$e */
    public static final class e extends vyi {
        public final String a;

        e(String str) {
            this.a = (String) gec.a(str);
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

    /* renamed from: vyi$f */
    public static final class f extends vyi {
        private final vzd a;

        f(vzd vzd) {
            this.a = (vzd) gec.a(vzd);
        }

        public final vzd a() {
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

    /* renamed from: vyi$g */
    public static final class g extends vyi {
        public final String a;
        public final String b;

        g(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
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

    /* renamed from: vyi$h */
    public static final class h extends vyi {
        private final vzl a;

        h(vzl vzl) {
            this.a = (vzl) gec.a(vzl);
        }

        public final vzl a() {
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

    /* renamed from: vyi$i */
    public static final class i extends vyi {
        private final vzv a;

        i(vzv vzv) {
            this.a = (vzv) gec.a(vzv);
        }

        public final vzv a() {
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

    /* renamed from: vyi$j */
    public static final class j extends vyi {
        public final String a;
        public final String b;

        j(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
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

    /* renamed from: vyi$k */
    public static final class k extends vyi {
        k() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowEmailAlreadyRegisteredErrorDialog{}";
        }
    }

    /* renamed from: vyi$l */
    public static final class l extends vyi {
        l() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowGenericErrorDialog{}";
        }
    }

    /* renamed from: vyi$m */
    public static final class m extends vyi {
        m() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof m;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowInvalidAgeErrorDialog{}";
        }
    }

    /* renamed from: vyi$n */
    public static final class n extends vyi {
        public final String a;
        public final String b;

        n(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
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

    /* renamed from: vyi$o */
    public static final class o extends vyi {
        o() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof o;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowNoConnectionErrorDialog{}";
        }
    }

    /* renamed from: vyi$p */
    public static final class p extends vyi {
        public final wbq a;

        p(wbq wbq) {
            this.a = (wbq) gec.a(wbq);
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

    /* renamed from: vyi$q */
    public static final class q extends vyi {
        public final EmailSignupRequestBody a;

        q(EmailSignupRequestBody emailSignupRequestBody) {
            this.a = (EmailSignupRequestBody) gec.a(emailSignupRequestBody);
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

    vyi() {
    }

    public static vyi a(int i2) {
        return new d(i2);
    }

    public static vyi a(String str, String str2) {
        return new g(str, str2);
    }

    public static vyi a(vxm vxm) {
        return new a(vxm);
    }

    public static vyi a(vyp vyp) {
        return new b(vyp);
    }

    public static vyi a(vzd vzd) {
        return new f(vzd);
    }

    public static vyi a(vzl vzl) {
        return new h(vzl);
    }

    public static vyi a(vzv vzv) {
        return new i(vzv);
    }
}
