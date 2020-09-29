package com.spotify.cosmos.router;

public class NativeRouter implements Router {
    private long nPtr;

    private native void init();

    public native void destroy();

    public native Lifetime resolve(Request request, ResolveCallback resolveCallback);

    public NativeRouter() {
        init();
    }
}
