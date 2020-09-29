package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayOptions {
    public static final PlayOptions EMPTY = builder().build();

    public static abstract class Builder {
        public abstract PlayOptions build();

        @JsonUnwrapped
        public abstract Builder commandOptions(CommandOptions commandOptions);

        @JsonProperty("operation")
        public abstract Builder operation(PlayOperation playOperation);

        @JsonProperty("trigger")
        public abstract Builder trigger(PlayTrigger playTrigger);

        @JsonCreator
        public static Builder builder() {
            return PlayOptions.builder();
        }
    }

    @JsonUnwrapped
    public abstract CommandOptions commandOptions();

    @JsonProperty("operation")
    public abstract PlayOperation operation();

    public abstract Builder toBuilder();

    @JsonProperty("trigger")
    public abstract PlayTrigger trigger();

    public static Builder builder() {
        return new Builder().operation(PlayOperation.REPLACE).trigger(PlayTrigger.IMMEDIATELY).commandOptions(CommandOptions.EMPTY);
    }
}
