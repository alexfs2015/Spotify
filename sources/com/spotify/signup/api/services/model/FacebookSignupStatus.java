package com.spotify.signup.api.services.model;

public abstract class FacebookSignupStatus {

    public static final class Error extends FacebookSignupStatus {
        private final String message;
        private final int statusCode;

        Error(String str, int i) {
            this.message = (String) gec.a(str);
            this.statusCode = i;
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

        public final <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2) {
            return gee2.apply(this);
        }

        public final void match(ged<Ok> ged, ged<Error> ged2) {
            ged2.accept(this);
        }

        public final String message() {
            return this.message;
        }

        public final int statusCode() {
            return this.statusCode;
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
    }

    public static final class Ok extends FacebookSignupStatus {
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

        public final <R_> R_ map(gee<Ok, R_> gee, gee<Error, R_> gee2) {
            return gee.apply(this);
        }

        public final void match(ged<Ok> ged, ged<Error> ged2) {
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

    FacebookSignupStatus() {
    }

    public static FacebookSignupStatus error(String str, int i) {
        return new Error(str, i);
    }

    public static FacebookSignupStatus ok(String str) {
        return new Ok(str);
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
