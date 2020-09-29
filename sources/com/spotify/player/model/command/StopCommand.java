package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.StopOptions;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class StopCommand implements Command {
    public static final StopCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract StopCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("options")
        public abstract Builder options(StopOptions stopOptions);

        @JsonCreator
        public static Builder builder() {
            return StopCommand.builder();
        }
    }

    @JsonProperty("logging_params")
    public abstract LoggingParams loggingParams();

    @JsonProperty("options")
    public abstract StopOptions options();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().options(StopOptions.EMPTY).loggingParams(LoggingParams.EMPTY);
    }
}
