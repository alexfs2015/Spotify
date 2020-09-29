package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.$AutoValue_PlayerOptionsOverrides reason: invalid class name */
abstract class C$AutoValue_PlayerOptionsOverrides extends PlayerOptionsOverrides {
    private final Boolean repeatingContext;
    private final Boolean repeatingTrack;
    private final Boolean shufflingContext;

    C$AutoValue_PlayerOptionsOverrides(Boolean bool, Boolean bool2, Boolean bool3) {
        this.shufflingContext = bool;
        this.repeatingContext = bool2;
        this.repeatingTrack = bool3;
    }

    @JsonProperty("shuffling_context")
    public Boolean shufflingContext() {
        return this.shufflingContext;
    }

    @JsonProperty("repeating_context")
    public Boolean repeatingContext() {
        return this.repeatingContext;
    }

    @JsonProperty("repeating_track")
    public Boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerOptionsOverrides{shufflingContext=");
        sb.append(this.shufflingContext);
        sb.append(", repeatingContext=");
        sb.append(this.repeatingContext);
        sb.append(", repeatingTrack=");
        sb.append(this.repeatingTrack);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerOptionsOverrides) {
            PlayerOptionsOverrides playerOptionsOverrides = (PlayerOptionsOverrides) obj;
            Boolean bool = this.shufflingContext;
            if (bool != null ? bool.equals(playerOptionsOverrides.shufflingContext()) : playerOptionsOverrides.shufflingContext() == null) {
                Boolean bool2 = this.repeatingContext;
                if (bool2 != null ? bool2.equals(playerOptionsOverrides.repeatingContext()) : playerOptionsOverrides.repeatingContext() == null) {
                    Boolean bool3 = this.repeatingTrack;
                    return bool3 != null ? bool3.equals(playerOptionsOverrides.repeatingTrack()) : playerOptionsOverrides.repeatingTrack() == null;
                }
            }
        }
    }

    public int hashCode() {
        Boolean bool = this.shufflingContext;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        Boolean bool2 = this.repeatingContext;
        int hashCode2 = (hashCode ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.repeatingTrack;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode2 ^ i;
    }
}
