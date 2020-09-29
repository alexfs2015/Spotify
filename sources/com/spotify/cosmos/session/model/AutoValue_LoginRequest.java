package com.spotify.cosmos.session.model;

final class AutoValue_LoginRequest extends LoginRequest {
    private final LoginCredentials credentials;
    private final LoginOptions options;

    AutoValue_LoginRequest(LoginCredentials loginCredentials, LoginOptions loginOptions) {
        if (loginCredentials != null) {
            this.credentials = loginCredentials;
            this.options = loginOptions;
            return;
        }
        throw new NullPointerException("Null credentials");
    }

    public final LoginCredentials credentials() {
        return this.credentials;
    }

    public final LoginOptions options() {
        return this.options;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginRequest{credentials=");
        sb.append(this.credentials);
        sb.append(", options=");
        sb.append(this.options);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoginRequest) {
            LoginRequest loginRequest = (LoginRequest) obj;
            if (this.credentials.equals(loginRequest.credentials())) {
                LoginOptions loginOptions = this.options;
                return loginOptions != null ? loginOptions.equals(loginRequest.options()) : loginRequest.options() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.credentials.hashCode() ^ 1000003) * 1000003;
        LoginOptions loginOptions = this.options;
        return hashCode ^ (loginOptions == null ? 0 : loginOptions.hashCode());
    }
}
