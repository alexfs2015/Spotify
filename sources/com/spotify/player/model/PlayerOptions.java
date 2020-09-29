package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = Builder.class)
public abstract class PlayerOptions {
    public static final PlayerOptions EMPTY = builder().build();

    public static abstract class Builder {
        public abstract PlayerOptions build();

        @JsonProperty("repeating_context")
        public abstract Builder repeatingContext(boolean z);

        @JsonProperty("repeating_track")
        public abstract Builder repeatingTrack(boolean z);

        @JsonProperty("shuffling_context")
        public abstract Builder shufflingContext(boolean z);

        @JsonCreator
        public static Builder builder() {
            return PlayerOptions.builder();
        }
    }

    @JsonProperty("repeating_context")
    public abstract boolean repeatingContext();

    @JsonProperty("repeating_track")
    public abstract boolean repeatingTrack();

    @JsonProperty("shuffling_context")
    public abstract boolean shufflingContext();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().shufflingContext(false).repeatingContext(false).repeatingTrack(false);
    }
}
