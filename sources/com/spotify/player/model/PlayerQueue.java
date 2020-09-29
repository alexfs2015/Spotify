package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayerQueue {
    public static final PlayerQueue EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayerQueue.builder();
        }

        public abstract PlayerQueue build();

        @JsonProperty("next_tracks")
        public abstract Builder nextTracks(ImmutableList<ContextTrack> immutableList);

        @JsonProperty("prev_tracks")
        public abstract Builder prevTracks(ImmutableList<ContextTrack> immutableList);

        @JsonProperty("revision")
        public abstract Builder revision(String str);

        @JsonProperty("track")
        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        return new Builder().revision("").nextTracks(ImmutableList.d()).prevTracks(ImmutableList.d());
    }

    @JsonProperty("next_tracks")
    public abstract ImmutableList<ContextTrack> nextTracks();

    @JsonProperty("prev_tracks")
    public abstract ImmutableList<ContextTrack> prevTracks();

    @JsonProperty("revision")
    public abstract String revision();

    public abstract Builder toBuilder();

    @JsonProperty("track")
    public abstract Optional<ContextTrack> track();
}
