package com.spotify.signup.api.services.model;

import com.spotify.signup.api.services.SignupErrorStatus;
import java.util.Map;

public abstract class EmailSignupStatus {

    public static final class Error extends EmailSignupStatus {
        private final Map<String, String> errors;
        private final SignupErrorStatus status;

        Error(SignupErrorStatus signupErrorStatus, Map<String, String> map) {
            this.status = (SignupErrorStatus) gec.a(signupErrorStatus);
            this.errors = (Map) gec.a(map);
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

        public final Map<String, String> errors() {
            return this.errors;
        }

        public final int hashCode() {
            return ((this.status.hashCode() + 0) * 31) + this.errors.hashCode();
        }

        public final <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2, gee<Unknown, R_> gee3) {
            return gee2.apply(this);
        }

        public final void match(ged<Ok> ged, ged<Error> ged2, ged<Unknown> ged3) {
            ged2.accept(this);
        }

        public final SignupErrorStatus status() {
            return this.status;
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
    }

    public static final class Ok extends EmailSignupStatus {
        private final String username;

        Ok(String str) {
            this.username = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ok)) {
                return false;
            }
            return ((Ok) obj).username.equals(this.username);
        }

        public final int hashCode() {
            return this.username.hashCode() + 0;
        }

        public final <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2, gee<Unknown, R_> gee3) {
            return gee.apply(this);
        }

        public final void match(ged<Ok> ged, ged<Error> ged2, ged<Unknown> ged3) {
            ged.accept(this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Ok{username=");
            sb.append(this.username);
            sb.append('}');
            return sb.toString();
        }

        public final String username() {
            return this.username;
        }
    }

    public static final class Unknown extends EmailSignupStatus {
        Unknown() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof Unknown;
        }

        public final int hashCode() {
            return 0;
        }

        public final <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2, gee<Unknown, R_> gee3) {
            return gee3.apply(this);
        }

        public final void match(ged<Ok> ged, ged<Error> ged2, ged<Unknown> ged3) {
            ged3.accept(this);
        }

        public final String toString() {
            return "Unknown{}";
        }
    }

    EmailSignupStatus() {
    }

    public static EmailSignupStatus error(SignupErrorStatus signupErrorStatus, Map<String, String> map) {
        return new Error(signupErrorStatus, map);
    }

    public static EmailSignupStatus ok(String str) {
        return new Ok(str);
    }

    public static EmailSignupStatus unknown() {
        return new Unknown();
    }

    public final Error asError() {
        return (Error) this;
    }

    public final Ok asOk() {
        return (Ok) this;
    }

    public final Unknown asUnknown() {
        return (Unknown) this;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isOk() {
        return this instanceof Ok;
    }

    public final boolean isUnknown() {
        return this instanceof Unknown;
    }

    public abstract <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2, gee<Unknown, R_> gee3);

    public abstract void match(ged<Ok> ged, ged<Error> ged2, ged<Unknown> ged3);
}
