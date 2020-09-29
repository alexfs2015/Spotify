package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class SkipToPrevTrackCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return SkipToPrevTrackCommand.builder();
        }

        public abstract SkipToPrevTrackCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("options")
        public abstract Builder options(SkipToPrevTrackOptions skipToPrevTrackOptions);

        @JsonProperty("track")
        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkipToPrevTrackCommand create() {
        return builder().build();
    }

    @JsonProperty("logging_params")
    public abstract Optional<LoggingParams> loggingParams();

    @JsonProperty("options")
    public abstract Optional<SkipToPrevTrackOptions> options();

    public abstract Builder toBuilder();

    @JsonProperty("track")
    public abstract Optional<ContextTrack> track();
}
