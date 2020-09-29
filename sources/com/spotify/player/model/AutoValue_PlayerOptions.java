package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_PlayerOptions extends PlayerOptions {
    private final boolean repeatingContext;
    private final boolean repeatingTrack;
    private final boolean shufflingContext;

    static final class Builder extends com.spotify.player.model.PlayerOptions.Builder {
        private Boolean repeatingContext;
        private Boolean repeatingTrack;
        private Boolean shufflingContext;

        Builder() {
        }

        private Builder(PlayerOptions playerOptions) {
            this.shufflingContext = Boolean.valueOf(playerOptions.shufflingContext());
            this.repeatingContext = Boolean.valueOf(playerOptions.repeatingContext());
            this.repeatingTrack = Boolean.valueOf(playerOptions.repeatingTrack());
        }

        public final PlayerOptions build() {
            String str = "";
            if (this.shufflingContext == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" shufflingContext");
                str = sb.toString();
            }
            if (this.repeatingContext == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" repeatingContext");
                str = sb2.toString();
            }
            if (this.repeatingTrack == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" repeatingTrack");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayerOptions(this.shufflingContext.booleanValue(), this.repeatingContext.booleanValue(), this.repeatingTrack.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.player.model.PlayerOptions.Builder repeatingContext(boolean z) {
            this.repeatingContext = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.PlayerOptions.Builder repeatingTrack(boolean z) {
            this.repeatingTrack = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.PlayerOptions.Builder shufflingContext(boolean z) {
            this.shufflingContext = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3) {
        this.shufflingContext = z;
        this.repeatingContext = z2;
        this.repeatingTrack = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerOptions) {
            PlayerOptions playerOptions = (PlayerOptions) obj;
            return this.shufflingContext == playerOptions.shufflingContext() && this.repeatingContext == playerOptions.repeatingContext() && this.repeatingTrack == playerOptions.repeatingTrack();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((this.shufflingContext ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.repeatingContext ? 1231 : 1237)) * 1000003;
        if (!this.repeatingTrack) {
            i = 1237;
        }
        return i2 ^ i;
    }

    @JsonProperty("repeating_context")
    public final boolean repeatingContext() {
        return this.repeatingContext;
    }

    @JsonProperty("repeating_track")
    public final boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    @JsonProperty("shuffling_context")
    public final boolean shufflingContext() {
        return this.shufflingContext;
    }

    public final com.spotify.player.model.PlayerOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerOptions{shufflingContext=");
        sb.append(this.shufflingContext);
        sb.append(", repeatingContext=");
        sb.append(this.repeatingContext);
        sb.append(", repeatingTrack=");
        sb.append(this.repeatingTrack);
        sb.append("}");
        return sb.toString();
    }
}
