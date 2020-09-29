package com.spotify.music.behindthelyrics.presenter;

public enum CardType {
    INTRO,
    INFO,
    LYRICS,
    VERIFIED,
    CREDITS;

    public static CardType a(String str) {
        if ("intro".equals(str)) {
            return INTRO;
        }
        if ("verified".equals(str) || "iq".equals(str) || "iq_continuation".equals(str) || "annotation".equals(str)) {
            return INFO;
        }
        if ("lyrics".equals(str)) {
            return LYRICS;
        }
        if ("verified_annotation".equals(str)) {
            return VERIFIED;
        }
        if ("credits".equals(str)) {
            return CREDITS;
        }
        throw new IllegalArgumentException(String.format("%s is not a known track annotation content type", new Object[]{str}));
    }
}
