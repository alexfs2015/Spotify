package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class UpdateTrackCommand implements Command {
    public static final UpdateTrackCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract UpdateTrackCommand build();

        @JsonProperty("track")
        public abstract Builder track(ContextTrack contextTrack);

        @JsonCreator
        public static Builder builder() {
            return UpdateTrackCommand.builder();
        }
    }

    public abstract Builder toBuilder();

    @JsonProperty("track")
    public abstract ContextTrack track();

    public static Builder builder() {
        return new Builder().track(ContextTrack.EMPTY);
    }
}
