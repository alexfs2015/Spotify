package defpackage;

import com.spotify.music.feature.facebooksso.createaccount.model.Failure;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;

/* renamed from: llm reason: default package */
public abstract class llm {

    /* renamed from: llm$a */
    public static final class a extends llm {
        public final Failure a;

        a(Failure failure) {
            this.a = (Failure) gcr.a(failure);
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: llm$b */
    public static final class b extends llm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InProgress{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: llm$c */
    public static final class c extends llm {
        public final SignupConfigurationResponse a;

        c(SignupConfigurationResponse signupConfigurationResponse) {
            this.a = (SignupConfigurationResponse) gcr.a(signupConfigurationResponse);
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3);

    llm() {
    }

    public static llm a(SignupConfigurationResponse signupConfigurationResponse) {
        return new c(signupConfigurationResponse);
    }

    public static llm a(Failure failure) {
        return new a(failure);
    }
}
