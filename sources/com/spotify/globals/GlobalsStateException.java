package com.spotify.globals;

public class GlobalsStateException extends IllegalStateException {
    private static final long serialVersionUID = 8124569723805217900L;

    public GlobalsStateException(String str) {
        super(str);
    }
}
