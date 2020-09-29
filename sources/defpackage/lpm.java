package defpackage;

import com.spotify.music.feature.facebooksso.createaccount.model.Failure;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;

/* renamed from: lpm reason: default package */
public abstract class lpm {

    /* renamed from: lpm$a */
    public static final class a extends lpm {
        public final Failure a;

        a(Failure failure) {
            this.a = (Failure) gec.a(failure);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed{failure=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: lpm$b */
    public static final class b extends lpm {
        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InProgress{}";
        }
    }

    /* renamed from: lpm$c */
    public static final class c extends lpm {
        public final SignupConfigurationResponse a;

        c(SignupConfigurationResponse signupConfigurationResponse) {
            this.a = (SignupConfigurationResponse) gec.a(signupConfigurationResponse);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged2.accept(this);
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
            sb.append("Successful{response=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    lpm() {
    }

    public static lpm a(Failure failure) {
        return new a(failure);
    }

    public static lpm a(SignupConfigurationResponse signupConfigurationResponse) {
        return new c(signupConfigurationResponse);
    }

    public abstract void a(ged<b> ged, ged<c> ged2, ged<a> ged3);
}
