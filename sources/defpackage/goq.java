package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation;

/* renamed from: goq reason: default package */
public abstract class goq {

    /* renamed from: goq$a */
    public static final class a extends goq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CredentialSaved{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<d> gcs5, gcs<a> gcs6) {
            gcs6.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<a, R_> gct6) {
            return gct6.apply(this);
        }
    }

    /* renamed from: goq$b */
    public static final class b extends goq {
        final String a;

        public b(String str) {
            this.a = (String) gcr.a(str);
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<d> gcs5, gcs<a> gcs6) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<a, R_> gct6) {
            return gct.apply(this);
        }
    }

    /* renamed from: goq$c */
    public static final class c extends goq {
        final String a;
        final PasswordValidation b;

        c(String str, PasswordValidation passwordValidation) {
            this.a = (String) gcr.a(str);
            this.b = (PasswordValidation) gcr.a(passwordValidation);
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<d> gcs5, gcs<a> gcs6) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<a, R_> gct6) {
            return gct2.apply(this);
        }
    }

    /* renamed from: goq$d */
    public static final class d extends goq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SavePasswordClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<d> gcs5, gcs<a> gcs6) {
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<a, R_> gct6) {
            return gct5.apply(this);
        }
    }

    /* renamed from: goq$e */
    public static final class e extends goq {
        final String a;
        public final gor b;
        private final String c;

        e(String str, String str2, gor gor) {
            this.a = (String) gcr.a(str);
            this.c = (String) gcr.a(str2);
            this.b = (gor) gcr.a(gor);
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<d> gcs5, gcs<a> gcs6) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<a, R_> gct6) {
            return gct4.apply(this);
        }
    }

    /* renamed from: goq$f */
    public static final class f extends goq {
        final String a;
        final String b;

        public f(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<d> gcs5, gcs<a> gcs6) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<a, R_> gct6) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<a, R_> gct6);

    public abstract void a(gcs<b> gcs, gcs<c> gcs2, gcs<f> gcs3, gcs<e> gcs4, gcs<d> gcs5, gcs<a> gcs6);

    goq() {
    }

    public static goq a(String str, PasswordValidation passwordValidation) {
        return new c(str, passwordValidation);
    }

    public static goq a(String str, String str2, gor gor) {
        return new e(str, str2, gor);
    }
}
