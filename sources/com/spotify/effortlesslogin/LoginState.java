package com.spotify.effortlesslogin;

public abstract class LoginState {

    public enum Type {
        LOGGED_IN,
        LOGGING_IN,
        LOGIN_FAILED
    }

    public static LoginState a(Type type) {
        return new gej(type, "");
    }

    public abstract Type a();

    public abstract String b();
}
