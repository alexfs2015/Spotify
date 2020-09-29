package com.spotify.signup.api.services.model;

public abstract class PasswordValidation {

    public static final class Error extends PasswordValidation {
        private final String message;
        private final int status;

        Error(int i, String str) {
            this.status = i;
            this.message = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return error.status == this.status && error.message.equals(this.message);
        }

        public final int hashCode() {
            return ((Integer.valueOf(this.status).hashCode() + 0) * 31) + this.message.hashCode();
        }

        public final <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2) {
            return gee2.apply(this);
        }

        public final void match(ged<Ok> ged, ged<Error> ged2) {
            ged2.accept(this);
        }

        public final String message() {
            return this.message;
        }

        public final int status() {
            return this.status;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{status=");
            sb.append(this.status);
            sb.append(", message=");
            sb.append(this.message);
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class Ok extends PasswordValidation {
        Ok() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof Ok;
        }

        public final int hashCode() {
            return 0;
        }

        public final <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2) {
            return gee.apply(this);
        }

        public final void match(ged<Ok> ged, ged<Error> ged2) {
            ged.accept(this);
        }

        public final String toString() {
            return "Ok{}";
        }
    }

    PasswordValidation() {
    }

    public static PasswordValidation error(int i, String str) {
        return new Error(i, str);
    }

    public static PasswordValidation ok() {
        return new Ok();
    }

    public final Error asError() {
        return (Error) this;
    }

    public final Ok asOk() {
        return (Ok) this;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isOk() {
        return this instanceof Ok;
    }

    public abstract <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2);

    public abstract void match(ged<Ok> ged, ged<Error> ged2);
}
