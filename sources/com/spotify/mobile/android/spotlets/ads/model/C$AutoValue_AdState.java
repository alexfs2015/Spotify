package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_AdState reason: invalid class name */
abstract class C$AutoValue_AdState extends AdState {
    private final State state;

    C$AutoValue_AdState(State state2) {
        if (state2 != null) {
            this.state = state2;
            return;
        }
        throw new NullPointerException("Null state");
    }

    @JsonProperty("state")
    public State getState() {
        return this.state;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdState{state=");
        sb.append(this.state);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdState)) {
            return false;
        }
        return this.state.equals(((AdState) obj).getState());
    }

    public int hashCode() {
        return this.state.hashCode() ^ 1000003;
    }
}
