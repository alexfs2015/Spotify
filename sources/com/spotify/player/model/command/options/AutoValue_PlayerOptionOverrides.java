package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

final class AutoValue_PlayerOptionOverrides extends PlayerOptionOverrides {
    private final Optional<Boolean> repeatingContext;
    private final Optional<Boolean> repeatingTrack;
    private final Optional<Boolean> shufflingContext;

    static final class Builder extends com.spotify.player.model.command.options.PlayerOptionOverrides.Builder {
        private Optional<Boolean> repeatingContext;
        private Optional<Boolean> repeatingTrack;
        private Optional<Boolean> shufflingContext;

        Builder() {
            this.shufflingContext = Optional.e();
            this.repeatingContext = Optional.e();
            this.repeatingTrack = Optional.e();
        }

        private Builder(PlayerOptionOverrides playerOptionOverrides) {
            this.shufflingContext = Optional.e();
            this.repeatingContext = Optional.e();
            this.repeatingTrack = Optional.e();
            this.shufflingContext = playerOptionOverrides.shufflingContext();
            this.repeatingContext = playerOptionOverrides.repeatingContext();
            this.repeatingTrack = playerOptionOverrides.repeatingTrack();
        }

        public final com.spotify.player.model.command.options.PlayerOptionOverrides.Builder shufflingContext(Boolean bool) {
            this.shufflingContext = Optional.b(bool);
            return this;
        }

        public final com.spotify.player.model.command.options.PlayerOptionOverrides.Builder repeatingContext(Boolean bool) {
            this.repeatingContext = Optional.b(bool);
            return this;
        }

        public final com.spotify.player.model.command.options.PlayerOptionOverrides.Builder repeatingTrack(Boolean bool) {
            this.repeatingTrack = Optional.b(bool);
            return this;
        }

        public final PlayerOptionOverrides build() {
            return new AutoValue_PlayerOptionOverrides(this.shufflingContext, this.repeatingContext, this.repeatingTrack);
        }
    }

    private AutoValue_PlayerOptionOverrides(Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3) {
        this.shufflingContext = optional;
        this.repeatingContext = optional2;
        this.repeatingTrack = optional3;
    }

    @JsonProperty("shuffling_context")
    public final Optional<Boolean> shufflingContext() {
        return this.shufflingContext;
    }

    @JsonProperty("repeating_context")
    public final Optional<Boolean> repeatingContext() {
        return this.repeatingContext;
    }

    @JsonProperty("repeating_track")
    public final Optional<Boolean> repeatingTrack() {
        return this.repeatingTrack;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerOptionOverrides{shufflingContext=");
        sb.append(this.shufflingContext);
        sb.append(", repeatingContext=");
        sb.append(this.repeatingContext);
        sb.append(", repeatingTrack=");
        sb.append(this.repeatingTrack);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerOptionOverrides) {
            PlayerOptionOverrides playerOptionOverrides = (PlayerOptionOverrides) obj;
            return this.shufflingContext.equals(playerOptionOverrides.shufflingContext()) && this.repeatingContext.equals(playerOptionOverrides.repeatingContext()) && this.repeatingTrack.equals(playerOptionOverrides.repeatingTrack());
        }
    }

    public final int hashCode() {
        return ((((this.shufflingContext.hashCode() ^ 1000003) * 1000003) ^ this.repeatingContext.hashCode()) * 1000003) ^ this.repeatingTrack.hashCode();
    }

    public final com.spotify.player.model.command.options.PlayerOptionOverrides.Builder toBuilder() {
        return new Builder(this);
    }
}
