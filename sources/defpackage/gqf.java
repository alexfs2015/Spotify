package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation;

/* renamed from: gqf reason: default package */
public abstract class gqf {

    /* renamed from: gqf$a */
    public static final class a extends gqf {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<a, R_> gee6) {
            return gee6.apply(this);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<f> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6) {
            ged6.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CredentialSaved{}";
        }
    }

    /* renamed from: gqf$b */
    public static final class b extends gqf {
        final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<a, R_> gee6) {
            return gee.apply(this);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<f> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6) {
            ged.accept(this);
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
            sb.append("PasswordChanged{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gqf$c */
    public static final class c extends gqf {
        final String a;
        final PasswordValidation b;

        c(String str, PasswordValidation passwordValidation) {
            this.a = (String) gec.a(str);
            this.b = (PasswordValidation) gec.a(passwordValidation);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<a, R_> gee6) {
            return gee2.apply(this);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<f> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b == this.b && cVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PasswordValidated{password=");
            sb.append(this.a);
            sb.append(", valid=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gqf$d */
    public static final class d extends gqf {
        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<a, R_> gee6) {
            return gee5.apply(this);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<f> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6) {
            ged5.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SavePasswordClicked{}";
        }
    }

    /* renamed from: gqf$e */
    public static final class e extends gqf {
        final String a;
        public final gqg b;
        private final String c;

        e(String str, String str2, gqg gqg) {
            this.a = (String) gec.a(str);
            this.c = (String) gec.a(str2);
            this.b = (gqg) gec.a(gqg);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<a, R_> gee6) {
            return gee4.apply(this);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<f> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6) {
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
            return eVar.a.equals(this.a) && eVar.c.equals(this.c) && eVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SavePasswordFailed{password=");
            sb.append(this.a);
            sb.append(", username=");
            sb.append(this.c);
            sb.append(", reason=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gqf$f */
    public static final class f extends gqf {
        final String a;
        final String b;

        public f(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<a, R_> gee6) {
            return gee3.apply(this);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<f> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a.equals(this.a) && fVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SavePasswordSuccessful{password=");
            sb.append(this.a);
            sb.append(", username=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    gqf() {
    }

    public static gqf a(String str, PasswordValidation passwordValidation) {
        return new c(str, passwordValidation);
    }

    public static gqf a(String str, String str2, gqg gqg) {
        return new e(str, str2, gqg);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<c, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<a, R_> gee6);

    public abstract void a(ged<b> ged, ged<c> ged2, ged<f> ged3, ged<e> ged4, ged<d> ged5, ged<a> ged6);
}
