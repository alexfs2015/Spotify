package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class LoggingParams {
    public static final LoggingParams EMPTY = builder().build();

    public static abstract class Builder {
        public abstract LoggingParams build();

        @JsonProperty("command_initiated_time")
        public abstract Builder commandInitiatedTime(Long l);

        @JsonProperty("command_received_time")
        public abstract Builder commandReceivedTime(Long l);

        @JsonCreator
        public static Builder builder() {
            return LoggingParams.builder();
        }
    }

    @JsonProperty("command_initiated_time")
    public abstract Optional<Long> commandInitiatedTime();

    @JsonProperty("command_received_time")
    public abstract Optional<Long> commandReceivedTime();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
