package com.spotify.core.orbit;

public interface OrbitSessionInterface {
    void flushCaches();

    void log(String str);

    void login(String str, String str2);

    void logout(boolean z);

    void setLanguage(String str);
}
