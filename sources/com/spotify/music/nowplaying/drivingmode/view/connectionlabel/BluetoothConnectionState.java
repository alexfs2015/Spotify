package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

public final class BluetoothConnectionState {
    public final String a;
    public final State b;

    public enum State {
        CONNECTED,
        CONNECTED_UNKNOWN_DEVICE,
        DISCONNECTED
    }

    public BluetoothConnectionState(State state) {
        this(state, null);
    }

    public BluetoothConnectionState(State state, String str) {
        this.a = str;
        this.b = state;
    }
}
