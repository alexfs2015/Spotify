package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class SkipToNextTrackCommand implements Command {
    public static final SkipToNextTrackCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract SkipToNextTrackCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("options")
        public abstract Builder options(CommandOptions commandOptions);

        @JsonProperty("track")
        public abstract Builder track(ContextTrack contextTrack);

        @JsonCreator
        public static Builder builder() {
            return SkipToNextTrackCommand.builder();
        }
    }

    @JsonProperty("logging_params")
    public abstract LoggingParams loggingParams();

    @JsonProperty("options")
    public abstract CommandOptions options();

    public abstract Builder toBuilder();

    @JsonProperty("track")
    public abstract Optional<ContextTrack> track();

    public static Builder builder() {
        return new Builder().options(CommandOptions.EMPTY).loggingParams(LoggingParams.EMPTY);
    }
}
