package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.$AutoValue_PlayerOptions reason: invalid class name */
abstract class C$AutoValue_PlayerOptions extends PlayerOptions {
    private final boolean repeatingContext;
    private final boolean repeatingTrack;
    private final boolean shufflingContext;

    C$AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3) {
        this.shufflingContext = z;
        this.repeatingContext = z2;
        this.repeatingTrack = z3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerOptions) {
            PlayerOptions playerOptions = (PlayerOptions) obj;
            return this.shufflingContext == playerOptions.shufflingContext() && this.repeatingContext == playerOptions.repeatingContext() && this.repeatingTrack == playerOptions.repeatingTrack();
        }
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.shufflingContext ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.repeatingContext ? 1231 : 1237)) * 1000003;
        if (!this.repeatingTrack) {
            i = 1237;
        }
        return i2 ^ i;
    }

    @JsonProperty("repeating_context")
    public boolean repeatingContext() {
        return this.repeatingContext;
    }

    @JsonProperty("repeating_track")
    public boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    @JsonProperty("shuffling_context")
    public boolean shufflingContext() {
        return this.shufflingContext;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerOptions{shufflingContext=");
        sb.append(this.shufflingContext);
        sb.append(", repeatingContext=");
        sb.append(this.repeatingContext);
        String str = ",esn eiapgrkrcT=a";
        sb.append(", repeatingTrack=");
        sb.append(this.repeatingTrack);
        sb.append("}");
        return sb.toString();
    }
}
