package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class AddToQueueCommand implements Command {
    public static final AddToQueueCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract AddToQueueCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("options")
        public abstract Builder options(CommandOptions commandOptions);

        @JsonProperty("track")
        public abstract Builder track(ContextTrack contextTrack);

        @JsonCreator
        public static Builder builder() {
            return AddToQueueCommand.builder();
        }
    }

    @JsonProperty("logging_params")
    public abstract LoggingParams loggingParams();

    @JsonProperty("options")
    public abstract CommandOptions options();

    public abstract Builder toBuilder();

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("track")
    public abstract ContextTrack track();

    public static Builder builder() {
        return new Builder().track(ContextTrack.EMPTY).options(CommandOptions.EMPTY).loggingParams(LoggingParams.EMPTY);
    }
}
