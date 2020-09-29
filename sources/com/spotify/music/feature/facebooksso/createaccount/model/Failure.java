package com.spotify.music.feature.facebooksso.createaccount.model;

public enum Failure {
    NO_CONNECTION,
    OFFLINE,
    SPOTIFY_IS_DOWN,
    UNKNOWN,
    EMAIL_ALREADY_EXIST;

    public static Failure a(int i) {
        if (i == 5) {
            return SPOTIFY_IS_DOWN;
        }
        if (i != 21) {
            return UNKNOWN;
        }
        return EMAIL_ALREADY_EXIST;
    }
}
