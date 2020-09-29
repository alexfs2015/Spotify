package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class CommandOptions {
    public static final CommandOptions EMPTY = builder().build();

    public static abstract class Builder {
        public abstract CommandOptions build();

        @JsonProperty("only_for_local_device")
        public abstract Builder onlyForLocalDevice(boolean z);

        @JsonProperty("override_restrictions")
        public abstract Builder overrideRestrictions(boolean z);

        @JsonProperty("system_initiated")
        public abstract Builder systemInitiated(boolean z);

        @JsonCreator
        public static Builder builder() {
            return CommandOptions.builder();
        }
    }

    @JsonProperty("only_for_local_device")
    public abstract boolean onlyForLocalDevice();

    @JsonProperty("override_restrictions")
    public abstract boolean overrideRestrictions();

    @JsonProperty("system_initiated")
    public abstract boolean systemInitiated();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().overrideRestrictions(false).onlyForLocalDevice(false).systemInitiated(false);
    }
}
