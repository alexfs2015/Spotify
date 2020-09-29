package com.spotify.music.feature.facebooksso.createaccount.model;

public enum Failure {
    NO_CONNECTION,
    OFFLINE,
    SPOTIFY_IS_DOWN,
    UNKNOWN,
    EMAIL_ALREADY_EXIST;

    public static Failure a(int i) {
        return i != 5 ? i != 21 ? UNKNOWN : EMAIL_ALREADY_EXIST : SPOTIFY_IS_DOWN;
    }
}
