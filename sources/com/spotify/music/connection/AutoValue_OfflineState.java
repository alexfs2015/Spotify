package com.spotify.music.connection;

import com.spotify.music.connection.OfflineState.State;

final class AutoValue_OfflineState extends OfflineState {
    private final State offlineState;

    AutoValue_OfflineState(State state) {
        if (state != null) {
            this.offlineState = state;
            return;
        }
        throw new NullPointerException("Null offlineState");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineState)) {
            return false;
        }
        return this.offlineState.equals(((OfflineState) obj).offlineState());
    }

    public final int hashCode() {
        return this.offlineState.hashCode() ^ 1000003;
    }

    public final State offlineState() {
        return this.offlineState;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineState{offlineState=");
        sb.append(this.offlineState);
        sb.append("}");
        return sb.toString();
    }
}
