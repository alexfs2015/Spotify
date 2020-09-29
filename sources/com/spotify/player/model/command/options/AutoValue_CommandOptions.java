package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_CommandOptions extends CommandOptions {
    private final boolean onlyForLocalDevice;
    private final boolean overrideRestrictions;
    private final boolean systemInitiated;

    static final class Builder extends com.spotify.player.model.command.options.CommandOptions.Builder {
        private Boolean onlyForLocalDevice;
        private Boolean overrideRestrictions;
        private Boolean systemInitiated;

        Builder() {
        }

        private Builder(CommandOptions commandOptions) {
            this.overrideRestrictions = Boolean.valueOf(commandOptions.overrideRestrictions());
            this.onlyForLocalDevice = Boolean.valueOf(commandOptions.onlyForLocalDevice());
            this.systemInitiated = Boolean.valueOf(commandOptions.systemInitiated());
        }

        public final com.spotify.player.model.command.options.CommandOptions.Builder overrideRestrictions(boolean z) {
            this.overrideRestrictions = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.command.options.CommandOptions.Builder onlyForLocalDevice(boolean z) {
            this.onlyForLocalDevice = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.command.options.CommandOptions.Builder systemInitiated(boolean z) {
            this.systemInitiated = Boolean.valueOf(z);
            return this;
        }

        public final CommandOptions build() {
            String str = "";
            if (this.overrideRestrictions == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" overrideRestrictions");
                str = sb.toString();
            }
            if (this.onlyForLocalDevice == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" onlyForLocalDevice");
                str = sb2.toString();
            }
            if (this.systemInitiated == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" systemInitiated");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CommandOptions(this.overrideRestrictions.booleanValue(), this.onlyForLocalDevice.booleanValue(), this.systemInitiated.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_CommandOptions(boolean z, boolean z2, boolean z3) {
        this.overrideRestrictions = z;
        this.onlyForLocalDevice = z2;
        this.systemInitiated = z3;
    }

    @JsonProperty("override_restrictions")
    public final boolean overrideRestrictions() {
        return this.overrideRestrictions;
    }

    @JsonProperty("only_for_local_device")
    public final boolean onlyForLocalDevice() {
        return this.onlyForLocalDevice;
    }

    @JsonProperty("system_initiated")
    public final boolean systemInitiated() {
        return this.systemInitiated;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommandOptions) {
            CommandOptions commandOptions = (CommandOptions) obj;
            return this.overrideRestrictions == commandOptions.overrideRestrictions() && this.onlyForLocalDevice == commandOptions.onlyForLocalDevice() && this.systemInitiated == commandOptions.systemInitiated();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((this.overrideRestrictions ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.onlyForLocalDevice ? 1231 : 1237)) * 1000003;
        if (!this.systemInitiated) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final com.spotify.player.model.command.options.CommandOptions.Builder toBuilder() {
        return new Builder(this);
    }
}
