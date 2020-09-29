package com.spotify.music.genie;

public abstract class Wish {

    public enum Action {
        DO_NOTHING,
        PLAY_CURRENT_SESSION,
        PLAY_URI
    }

    public abstract String a();

    public abstract Action b();

    public static Wish a(Action action) {
        return new rhc(null, action);
    }

    public static Wish a(String str) {
        return new rhc(str, Action.PLAY_URI);
    }
}
