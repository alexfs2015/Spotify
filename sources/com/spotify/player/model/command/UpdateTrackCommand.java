package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class UpdateTrackCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return UpdateTrackCommand.builder(ContextTrack.create(""));
        }

        public abstract UpdateTrackCommand build();

        @JsonProperty("track")
        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder(ContextTrack contextTrack) {
        return new Builder().track(contextTrack);
    }

    public static UpdateTrackCommand create(ContextTrack contextTrack) {
        return builder(contextTrack).build();
    }

    public abstract Builder toBuilder();

    @JsonProperty("track")
    public abstract ContextTrack track();
}
