package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SetRepeatingTrackCommand extends SetRepeatingTrackCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final boolean value;

    static final class Builder extends com.spotify.player.model.command.SetRepeatingTrackCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private Boolean value;

        Builder() {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(SetRepeatingTrackCommand setRepeatingTrackCommand) {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
            this.value = Boolean.valueOf(setRepeatingTrackCommand.value());
            this.options = setRepeatingTrackCommand.options();
            this.loggingParams = setRepeatingTrackCommand.loggingParams();
        }

        public final SetRepeatingTrackCommand build() {
            String str = "";
            if (this.value == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" value");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SetRepeatingTrackCommand(this.value.booleanValue(), this.options, this.loggingParams);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.command.SetRepeatingTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.SetRepeatingTrackCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.b(commandOptions);
            return this;
        }

        public final com.spotify.player.model.command.SetRepeatingTrackCommand.Builder value(boolean z) {
            this.value = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_SetRepeatingTrackCommand(boolean z, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.value = z;
        this.options = optional;
        this.loggingParams = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetRepeatingTrackCommand) {
            SetRepeatingTrackCommand setRepeatingTrackCommand = (SetRepeatingTrackCommand) obj;
            return this.value == setRepeatingTrackCommand.value() && this.options.equals(setRepeatingTrackCommand.options()) && this.loggingParams.equals(setRepeatingTrackCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return (((((this.value ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @JsonProperty("logging_params")
    public final Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @JsonProperty("options")
    public final Optional<CommandOptions> options() {
        return this.options;
    }

    public final com.spotify.player.model.command.SetRepeatingTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetRepeatingTrackCommand{value=");
        sb.append(this.value);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("value")
    public final boolean value() {
        return this.value;
    }
}
