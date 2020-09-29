package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class SeekToCommand implements Command {
    public static final SeekToCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract SeekToCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("options")
        public abstract Builder options(CommandOptions commandOptions);

        @JsonAlias({"position"})
        @JsonProperty("value")
        public abstract Builder value(long j);

        @JsonCreator
        public static Builder builder() {
            return SeekToCommand.builder();
        }
    }

    @JsonProperty("logging_params")
    public abstract LoggingParams loggingParams();

    @JsonProperty("options")
    public abstract CommandOptions options();

    public abstract Builder toBuilder();

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("value")
    public abstract long value();

    public static Builder builder() {
        return new Builder().value(0).options(CommandOptions.EMPTY).loggingParams(LoggingParams.EMPTY);
    }
}
