package com.spotify.rcs.model;

public enum Platform implements b {
    UNKNOWN(0),
    ANDROID(1),
    BACKEND(2),
    IOS(3),
    WEB(4),
    UNRECOGNIZED(-1);
    
    final int value;

    static {
        new Object() {
        };
    }

    private Platform(int i) {
        this.value = i;
    }

    public final int a() {
        return this.value;
    }
}
