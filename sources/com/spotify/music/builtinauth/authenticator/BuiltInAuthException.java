package com.spotify.music.builtinauth.authenticator;

public class BuiltInAuthException extends RuntimeException {
    private static final long serialVersionUID = 0;
    public final AuthError mError;

    public enum AuthError {
        ERROR_USER_NOT_AUTHORIZED,
        ERROR_NOT_LOGGED_IN,
        ERROR_OFFLINE_MODE_ACTIVE,
        ERROR_AUTHENTICATION_FAILED
    }

    public BuiltInAuthException(AuthError authError) {
        this.mError = authError;
    }

    public String getMessage() {
        return this.mError.toString();
    }

    public String toString() {
        return String.format("BuiltInAuthException{%s}", new Object[]{this.mError});
    }
}
