package com.spotify.music.genie;

public abstract class Wish {

    public enum Action {
        DO_NOTHING,
        PLAY_CURRENT_SESSION,
        PLAY_URI
    }

    public static Wish a(Action action) {
        return new rqe(null, action);
    }

    public static Wish a(String str) {
        return new rqe(str, Action.PLAY_URI);
    }

    public abstract String a();

    public abstract Action b();
}
