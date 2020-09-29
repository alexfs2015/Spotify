package com.spotify.libs.connect;

public final class ConnectStates {

    public enum State {
        NONE,
        CONNECTING,
        PLAYING_FROM,
        DEVICES_AVAILABLE,
        NO_DEVICES
    }
}
