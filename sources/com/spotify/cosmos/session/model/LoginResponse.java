package com.spotify.cosmos.session.model;

public abstract class LoginResponse {

    public static final class BootstrapRequired extends LoginResponse {
        private final String accessToken;

        BootstrapRequired(String str) {
            this.accessToken = (String) gec.a(str);
        }

        public final String accessToken() {
            return this.accessToken;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BootstrapRequired)) {
                return false;
            }
            return ((BootstrapRequired) obj).accessToken.equals(this.accessToken);
        }

        public final int hashCode() {
            return this.accessToken.hashCode() + 0;
        }

        public final <R_> R_ map(gee<Success, R_> gee, gee<Error, R_> gee2, gee<CodeSuccess, R_> gee3, gee<CodeRequired, R_> gee4, gee<BootstrapRequired, R_> gee5) {
            return gee5.apply(this);
        }

        public final void match(ged<Success> ged, ged<Error> ged2, ged<CodeSuccess> ged3, ged<CodeRequired> ged4, ged<BootstrapRequired> ged5) {
            ged5.accept(this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BootstrapRequired{accessToken=");
            sb.append(this.accessToken);
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class CodeRequired extends LoginResponse {
        private final String canonicalPhoneNumber;
        private final String challengeId;
        private final long codeLength;
        private final long expiresIn;
        private final int method;
        private final int retryNumber;

        CodeRequired(String str, int i, long j, String str2, long j2, int i2) {
            this.challengeId = (String) gec.a(str);
            this.method = i;
            this.codeLength = j;
            this.canonicalPhoneNumber = (String) gec.a(str2);
            this.expiresIn = j2;
            this.retryNumber = i2;
        }

        public final String canonicalPhoneNumber() {
            return this.canonicalPhoneNumber;
        }

        public final String challengeId() {
            return this.challengeId;
        }

        public final long codeLength() {
            return this.codeLength;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeRequired)) {
                return false;
            }
            CodeRequired codeRequired = (CodeRequired) obj;
            return codeRequired.method == this.method && codeRequired.codeLength == this.codeLength && codeRequired.expiresIn == this.expiresIn && codeRequired.retryNumber == this.retryNumber && codeRequired.challengeId.equals(this.challengeId) && codeRequired.canonicalPhoneNumber.equals(this.canonicalPhoneNumber);
        }

        public final long expiresIn() {
            return this.expiresIn;
        }

        public final int hashCode() {
            return ((((((((((this.challengeId.hashCode() + 0) * 31) + Integer.valueOf(this.method).hashCode()) * 31) + Long.valueOf(this.codeLength).hashCode()) * 31) + this.canonicalPhoneNumber.hashCode()) * 31) + Long.valueOf(this.expiresIn).hashCode()) * 31) + Integer.valueOf(this.retryNumber).hashCode();
        }

        public final <R_> R_ map(gee<Success, R_> gee, gee<Error, R_> gee2, gee<CodeSuccess, R_> gee3, gee<CodeRequired, R_> gee4, gee<BootstrapRequired, R_> gee5) {
            return gee4.apply(this);
        }

        public final void match(ged<Success> ged, ged<Error> ged2, ged<CodeSuccess> ged3, ged<CodeRequired> ged4, ged<BootstrapRequired> ged5) {
            ged4.accept(this);
        }

        public final int method() {
            return this.method;
        }

        public final int retryNumber() {
            return this.retryNumber;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CodeRequired{challengeId=");
            sb.append(this.challengeId);
            sb.append(", method=");
            sb.append(this.method);
            sb.append(", codeLength=");
            sb.append(this.codeLength);
            sb.append(", canonicalPhoneNumber=");
            sb.append(this.canonicalPhoneNumber);
            sb.append(", expiresIn=");
            sb.append(this.expiresIn);
            sb.append(", retryNumber=");
            sb.append(this.retryNumber);
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class CodeSuccess extends LoginResponse {
        private final String identifierToken;

        CodeSuccess(String str) {
            this.identifierToken = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeSuccess)) {
                return false;
            }
            return gec.a(((CodeSuccess) obj).identifierToken, this.identifierToken);
        }

        public final int hashCode() {
            String str = this.identifierToken;
            return (str != null ? str.hashCode() : 0) + 0;
        }

        public final String identifierToken() {
            return this.identifierToken;
        }

        public final <R_> R_ map(gee<Success, R_> gee, gee<Error, R_> gee2, gee<CodeSuccess, R_> gee3, gee<CodeRequired, R_> gee4, gee<BootstrapRequired, R_> gee5) {
            return gee3.apply(this);
        }

        public final void match(ged<Success> ged, ged<Error> ged2, ged<CodeSuccess> ged3, ged<CodeRequired> ged4, ged<BootstrapRequired> ged5) {
            ged3.accept(this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CodeSuccess{identifierToken=");
            sb.append(this.identifierToken);
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class Error extends LoginResponse {
        private final String error;
        private final int status;

        Error(int i, String str) {
            this.status = i;
            this.error = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error2 = (Error) obj;
            return error2.status == this.status && gec.a(error2.error, this.error);
        }

        public final String error() {
            return this.error;
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (Integer.valueOf(this.status).hashCode() + 0) * 31;
            String str = this.error;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final <R_> R_ map(gee<Success, R_> gee, gee<Error, R_> gee2, gee<CodeSuccess, R_> gee3, gee<CodeRequired, R_> gee4, gee<BootstrapRequired, R_> gee5) {
            return gee2.apply(this);
        }

        public final void match(ged<Success> ged, ged<Error> ged2, ged<CodeSuccess> ged3, ged<CodeRequired> ged4, ged<BootstrapRequired> ged5) {
            ged2.accept(this);
        }

        public final int status() {
            return this.status;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error{status=");
            sb.append(this.status);
            sb.append(", error=");
            sb.append(this.error);
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class Success extends LoginResponse {
        private final SessionInfo session;

        Success(SessionInfo sessionInfo) {
            this.session = (SessionInfo) gec.a(sessionInfo);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            return ((Success) obj).session.equals(this.session);
        }

        public final int hashCode() {
            return this.session.hashCode() + 0;
        }

        public final <R_> R_ map(gee<Success, R_> gee, gee<Error, R_> gee2, gee<CodeSuccess, R_> gee3, gee<CodeRequired, R_> gee4, gee<BootstrapRequired, R_> gee5) {
            return gee.apply(this);
        }

        public final void match(ged<Success> ged, ged<Error> ged2, ged<CodeSuccess> ged3, ged<CodeRequired> ged4, ged<BootstrapRequired> ged5) {
            ged.accept(this);
        }

        public final SessionInfo session() {
            return this.session;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success{session=");
            sb.append(this.session);
            sb.append('}');
            return sb.toString();
        }
    }

    LoginResponse() {
    }

    public static LoginResponse bootstrapRequired(String str) {
        return new BootstrapRequired(str);
    }

    public static LoginResponse codeRequired(String str, int i, long j, String str2, long j2, int i2) {
        CodeRequired codeRequired = new CodeRequired(str, i, j, str2, j2, i2);
        return codeRequired;
    }

    public static LoginResponse codeSuccess(String str) {
        return new CodeSuccess(str);
    }

    public static LoginResponse error(int i, String str) {
        return new Error(i, str);
    }

    public static LoginResponse success(SessionInfo sessionInfo) {
        return new Success(sessionInfo);
    }

    public final BootstrapRequired asBootstrapRequired() {
        return (BootstrapRequired) this;
    }

    public final CodeRequired asCodeRequired() {
        return (CodeRequired) this;
    }

    public final CodeSuccess asCodeSuccess() {
        return (CodeSuccess) this;
    }

    public final Error asError() {
        return (Error) this;
    }

    public final Success asSuccess() {
        return (Success) this;
    }

    public final boolean isBootstrapRequired() {
        return this instanceof BootstrapRequired;
    }

    public final boolean isCodeRequired() {
        return this instanceof CodeRequired;
    }

    public final boolean isCodeSuccess() {
        return this instanceof CodeSuccess;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isSuccess() {
        return this instanceof Success;
    }

    public abstract <R_> R_ map(gee<Success, R_> gee, gee<Error, R_> gee2, gee<CodeSuccess, R_> gee3, gee<CodeRequired, R_> gee4, gee<BootstrapRequired, R_> gee5);

    public abstract void match(ged<Success> ged, ged<Error> ged2, ged<CodeSuccess> ged3, ged<CodeRequired> ged4, ged<BootstrapRequired> ged5);
}
