package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class LoggingParams {
    public static final LoggingParams EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return LoggingParams.builder();
        }

        public abstract LoggingParams build();

        @JsonProperty("command_initiated_time")
        public abstract Builder commandInitiatedTime(Long l);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonProperty("command_initiated_time")
    public abstract Optional<Long> commandInitiatedTime();

    public abstract Builder toBuilder();
}
