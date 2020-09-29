package com.spotify.core.orbit;

public final class OrbitSession implements OrbitSessionInterface {
    private long nOrbitSessionPtr;

    public final native void flushCaches();

    public final native void log(String str);

    public final native void login(String str, String str2);

    public final native void logout(boolean z);

    public final native void setLanguage(String str);

    private OrbitSession() {
    }
}
