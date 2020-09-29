package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class PlaySessionCommand implements Command {
    public static final PlaySessionCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract PlaySessionCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("play_options")
        public abstract Builder playOptions(PlayOptions playOptions);

        @JsonCreator
        public static Builder builder() {
            return PlaySessionCommand.builder();
        }
    }

    @JsonProperty("logging_params")
    public abstract LoggingParams loggingParams();

    @JsonProperty("play_options")
    public abstract PlayOptions playOptions();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().playOptions(PlayOptions.EMPTY).loggingParams(LoggingParams.EMPTY);
    }
}
