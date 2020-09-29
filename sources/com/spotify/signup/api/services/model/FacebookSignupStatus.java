package com.spotify.signup.api.services.model;

public abstract class FacebookSignupStatus {

    public static final class Error extends FacebookSignupStatus {
        private final String message;
        private final int statusCode;

        Error(String str, int i) {
            this.message = (String) gcr.a(str);
            this.statusCode = i;
        }

        public final String message() {
            return this.message;
        }

        public final int statusCode() {
            return this.statusCode;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return error.statusCode == this.statusCode && error.message.equals(this.message);
        }

        public final int hashCode() {
            return ((this.message.hashCode() + 0) * 31) + Integer.valueOf(this.statusCode).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{message=");
            sb.append(this.message);
            sb.append(", statusCode=");
            sb.append(this.statusCode);
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

    public static final class Ok extends FacebookSignupStatus {
        private final String username;

        Ok(String str) {
            this.username = (String) gcr.a(str);
        }

        public final String username() {
            return this.username;
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

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Ok{username=");
            sb.append(this.username);
            sb.append('}');
            return sb.toString();
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

    FacebookSignupStatus() {
    }

    public static FacebookSignupStatus ok(String str) {
        return new Ok(str);
    }

    public static FacebookSignupStatus error(String str, int i) {
        return new Error(str, i);
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
