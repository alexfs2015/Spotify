package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

final class AutoValue_CommandOptions extends CommandOptions {
    private final Optional<Boolean> onlyForLocalDevice;
    private final Optional<Boolean> overrideRestrictions;
    private final Optional<Boolean> systemInitiated;

    static final class Builder extends com.spotify.player.model.command.options.CommandOptions.Builder {
        private Optional<Boolean> onlyForLocalDevice;
        private Optional<Boolean> overrideRestrictions;
        private Optional<Boolean> systemInitiated;

        Builder() {
            this.overrideRestrictions = Optional.e();
            this.onlyForLocalDevice = Optional.e();
            this.systemInitiated = Optional.e();
        }

        private Builder(CommandOptions commandOptions) {
            this.overrideRestrictions = Optional.e();
            this.onlyForLocalDevice = Optional.e();
            this.systemInitiated = Optional.e();
            this.overrideRestrictions = commandOptions.overrideRestrictions();
            this.onlyForLocalDevice = commandOptions.onlyForLocalDevice();
            this.systemInitiated = commandOptions.systemInitiated();
        }

        public final CommandOptions build() {
            return new AutoValue_CommandOptions(this.overrideRestrictions, this.onlyForLocalDevice, this.systemInitiated);
        }

        public final com.spotify.player.model.command.options.CommandOptions.Builder onlyForLocalDevice(boolean z) {
            this.onlyForLocalDevice = Optional.b(Boolean.valueOf(z));
            return this;
        }

        public final com.spotify.player.model.command.options.CommandOptions.Builder overrideRestrictions(boolean z) {
            this.overrideRestrictions = Optional.b(Boolean.valueOf(z));
            return this;
        }

        public final com.spotify.player.model.command.options.CommandOptions.Builder systemInitiated(boolean z) {
            this.systemInitiated = Optional.b(Boolean.valueOf(z));
            return this;
        }
    }

    private AutoValue_CommandOptions(Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3) {
        this.overrideRestrictions = optional;
        this.onlyForLocalDevice = optional2;
        this.systemInitiated = optional3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommandOptions) {
            CommandOptions commandOptions = (CommandOptions) obj;
            return this.overrideRestrictions.equals(commandOptions.overrideRestrictions()) && this.onlyForLocalDevice.equals(commandOptions.onlyForLocalDevice()) && this.systemInitiated.equals(commandOptions.systemInitiated());
        }
    }

    public final int hashCode() {
        return ((((this.overrideRestrictions.hashCode() ^ 1000003) * 1000003) ^ this.onlyForLocalDevice.hashCode()) * 1000003) ^ this.systemInitiated.hashCode();
    }

    @JsonProperty("only_for_local_device")
    public final Optional<Boolean> onlyForLocalDevice() {
        return this.onlyForLocalDevice;
    }

    @JsonProperty("override_restrictions")
    public final Optional<Boolean> overrideRestrictions() {
        return this.overrideRestrictions;
    }

    @JsonProperty("system_initiated")
    public final Optional<Boolean> systemInitiated() {
        return this.systemInitiated;
    }

    public final com.spotify.player.model.command.options.CommandOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommandOptions{overrideRestrictions=");
        sb.append(this.overrideRestrictions);
        sb.append(", onlyForLocalDevice=");
        sb.append(this.onlyForLocalDevice);
        sb.append(", systemInitiated=");
        sb.append(this.systemInitiated);
        sb.append("}");
        return sb.toString();
    }
}
