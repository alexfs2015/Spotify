package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation;

/* renamed from: vzw reason: default package */
public abstract class vzw {

    /* renamed from: vzw$a */
    public static final class a extends vzw {
        final String a;
        public final PasswordValidation b;

        public a(String str, PasswordValidation passwordValidation) {
            this.a = (String) gec.a(str);
            this.b = (PasswordValidation) gec.a(passwordValidation);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4) {
            return gee2.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<d> ged3, ged<c> ged4) {
            ged2.accept(this);
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
    }

    /* renamed from: vzw$b */
    public static final class b extends vzw {
        final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4) {
            return gee.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<d> ged3, ged<c> ged4) {
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
            sb.append("PasswordInputChanged{password=***");
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vzw$c */
    public static final class c extends vzw {
        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4) {
            return gee4.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<d> ged3, ged<c> ged4) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PasswordSubmitted{}";
        }
    }

    /* renamed from: vzw$d */
    public static final class d extends vzw {
        final String a;
        final defpackage.gom.a b;

        d(String str, defpackage.gom.a aVar) {
            this.a = (String) gec.a(str);
            this.b = (defpackage.gom.a) gec.a(aVar);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4) {
            return gee3.apply(this);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<d> ged3, ged<c> ged4) {
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
    }

    vzw() {
    }

    public static vzw a(String str, defpackage.gom.a aVar) {
        return new d(str, aVar);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<d, R_> gee3, gee<c, R_> gee4);

    public abstract void a(ged<b> ged, ged<a> ged2, ged<d> ged3, ged<c> ged4);
}
