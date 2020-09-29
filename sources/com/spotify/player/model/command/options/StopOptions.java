package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class StopOptions {
    public static final StopOptions EMPTY = builder().build();

    public static abstract class Builder {
        public abstract StopOptions build();

        @JsonUnwrapped
        public abstract Builder commandOptions(CommandOptions commandOptions);

        @JsonProperty("reason")
        public abstract Builder reason(StopReason stopReason);

        @JsonCreator
        public static Builder builder() {
            return StopOptions.builder();
        }
    }

    @JsonUnwrapped
    public abstract CommandOptions commandOptions();

    @JsonProperty("reason")
    public abstract StopReason reason();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().reason(StopReason.INTERACTIVE).commandOptions(CommandOptions.EMPTY);
    }
}
