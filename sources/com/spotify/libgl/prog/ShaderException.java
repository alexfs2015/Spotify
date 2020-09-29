package com.spotify.libgl.prog;

public class ShaderException extends Exception {
    private static final long serialVersionUID = 7205457241285638425L;

    public ShaderException(String str) {
        super(str);
    }

    public ShaderException(String str, Throwable th) {
        super(str, th);
    }
}
