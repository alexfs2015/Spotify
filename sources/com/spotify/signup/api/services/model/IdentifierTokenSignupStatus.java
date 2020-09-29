package com.spotify.signup.api.services.model;

import com.spotify.signup.api.services.SignupErrorStatus;
import java.util.Map;

public abstract class IdentifierTokenSignupStatus {

    public static final class Error extends IdentifierTokenSignupStatus {
        private final Map<String, String> errors;
        private final SignupErrorStatus status;

        Error(SignupErrorStatus signupErrorStatus, Map<String, String> map) {
            this.status = (SignupErrorStatus) gcr.a(signupErrorStatus);
            this.errors = (Map) gcr.a(map);
        }

        public final SignupErrorStatus status() {
            return this.status;
        }

        public final Map<String, String> errors() {
            return this.errors;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return error.status == this.status && error.errors.equals(this.errors);
        }

        public final int hashCode() {
            return ((this.status.hashCode() + 0) * 31) + this.errors.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{status=");
            sb.append(this.status);
            sb.append(", errors=");
            sb.append(this.errors);
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Ok> gcs, gcs<Error> gcs2, gcs<Unknown> gcs3) {
            gcs2.accept(this);
        }

        public final <R_> R_ map(gct<Ok, R_> gct, gct<Error, R_> gct2, gct<Unknown, R_> gct3) {
            return gct2.apply(this);
        }
    }

    public static final class Ok extends IdentifierTokenSignupStatus {
        private final String oneTimeToken;
        private final String username;

        Ok(String str, String str2) {
            this.username = (String) gcr.a(str);
            this.oneTimeToken = (String) gcr.a(str2);
        }

        public final String username() {
            return this.username;
        }

        public final String oneTimeToken() {
            return this.oneTimeToken;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ok)) {
                return false;
            }
            Ok ok = (Ok) obj;
            return ok.username.equals(this.username) && ok.oneTimeToken.equals(this.oneTimeToken);
        }

        public final int hashCode() {
            return ((this.username.hashCode() + 0) * 31) + this.oneTimeToken.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Ok{username=");
            sb.append(this.username);
            sb.append(", oneTimeToken=");
            sb.append(this.oneTimeToken);
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Ok> gcs, gcs<Error> gcs2, gcs<Unknown> gcs3) {
            gcs.accept(this);
        }

        public final <R_> R_ map(gct<Ok, R_> gct, gct<Error, R_> gct2, gct<Unknown, R_> gct3) {
            return gct.apply(this);
        }
    }

    public static final class Unknown extends IdentifierTokenSignupStatus {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unknown{}";
        }

        Unknown() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof Unknown;
        }

        public final void match(gcs<Ok> gcs, gcs<Error> gcs2, gcs<Unknown> gcs3) {
            gcs3.accept(this);
        }

        public final <R_> R_ map(gct<Ok, R_> gct, gct<Error, R_> gct2, gct<Unknown, R_> gct3) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ map(gct<Ok, R_> gct, gct<Error, R_> gct2, gct<Unknown, R_> gct3);

    public abstract void match(gcs<Ok> gcs, gcs<Error> gcs2, gcs<Unknown> gcs3);

    IdentifierTokenSignupStatus() {
    }

    public static IdentifierTokenSignupStatus ok(String str, String str2) {
        return new Ok(str, str2);
    }

    public static IdentifierTokenSignupStatus error(SignupErrorStatus signupErrorStatus, Map<String, String> map) {
        return new Error(signupErrorStatus, map);
    }

    public static IdentifierTokenSignupStatus unknown() {
        return new Unknown();
    }

    public final boolean isOk() {
        return this instanceof Ok;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isUnknown() {
        return this instanceof Unknown;
    }

    public final Ok asOk() {
        return (Ok) this;
    }

    public final Error asError() {
        return (Error) this;
    }

    public final Unknown asUnknown() {
        return (Unknown) this;
    }
}
