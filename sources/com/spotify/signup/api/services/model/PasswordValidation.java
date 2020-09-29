package com.spotify.signup.api.services.model;

public abstract class PasswordValidation {

    public static final class Error extends PasswordValidation {
        private final String message;
        private final int status;

        Error(int i, String str) {
            this.status = i;
            this.message = (String) gcr.a(str);
        }

        public final int status() {
            return this.status;
        }

        public final String message() {
            return this.message;
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

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{status=");
            sb.append(this.status);
            sb.append(", message=");
            sb.append(this.message);
            sb.append('}');
            return sb.toString();
        }

        public final void match(gcs<Ok> gcs, gcs<Error> gcs2) {
            gcs2.accept(this);
        }

        public final <R_> R_ map(gct<Ok, R_> gct, gct<Error, R_> gct2) {
            return gct2.apply(this);
        }
    }

    public static final class Ok extends PasswordValidation {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Ok{}";
        }

        Ok() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof Ok;
        }

        public final void match(gcs<Ok> gcs, gcs<Error> gcs2) {
            gcs.accept(this);
        }

        public final <R_> R_ map(gct<Ok, R_> gct, gct<Error, R_> gct2) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ map(gct<Ok, R_> gct, gct<Error, R_> gct2);

    public abstract void match(gcs<Ok> gcs, gcs<Error> gcs2);

    PasswordValidation() {
    }

    public static PasswordValidation ok() {
        return new Ok();
    }

    public static PasswordValidation error(int i, String str) {
        return new Error(i, str);
    }

    public final boolean isOk() {
        return this instanceof Ok;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final Ok asOk() {
        return (Ok) this;
    }

    public final Error asError() {
        return (Error) this;
    }
}
