package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation;

/* renamed from: vmq reason: default package */
public abstract class vmq {

    /* renamed from: vmq$a */
    public static final class a extends vmq {
        final String a;
        public final PasswordValidation b;

        public a(String str, PasswordValidation passwordValidation) {
            this.a = (String) gcr.a(str);
            this.b = (PasswordValidation) gcr.a(passwordValidation);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.b == this.b && aVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LocalPasswordValidationReceived{password=***");
            sb.append(", validation=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<d> gcs3, gcs<c> gcs4) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vmq$b */
    public static final class b extends vmq {
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
            sb.append("PasswordInputChanged{password=***");
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<d> gcs3, gcs<c> gcs4) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4) {
            return gct.apply(this);
        }
    }

    /* renamed from: vmq$c */
    public static final class c extends vmq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PasswordSubmitted{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<d> gcs3, gcs<c> gcs4) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: vmq$d */
    public static final class d extends vmq {
        final String a;
        final defpackage.gmx.a b;

        d(String str, defpackage.gmx.a aVar) {
            this.a = (String) gcr.a(str);
            this.b = (defpackage.gmx.a) gcr.a(aVar);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RemotePasswordValidationReceived{password=***");
            sb.append(", validationResult=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2, gcs<d> gcs3, gcs<c> gcs4) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4);

    public abstract void a(gcs<b> gcs, gcs<a> gcs2, gcs<d> gcs3, gcs<c> gcs4);

    vmq() {
    }

    public static vmq a(String str, defpackage.gmx.a aVar) {
        return new d(str, aVar);
    }
}
