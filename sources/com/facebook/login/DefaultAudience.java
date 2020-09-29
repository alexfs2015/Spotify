package com.facebook.login;

public enum DefaultAudience {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");
    
    public final String nativeProtocolAudience;

    private DefaultAudience(String str) {
        this.nativeProtocolAudience = str;
    }
}
