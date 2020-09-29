package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SetRepeatingTrackCommand extends SetRepeatingTrackCommand {
    private final LoggingParams loggingParams;
    private final CommandOptions options;
    private final boolean value;

    static final class Builder extends com.spotify.player.model.command.SetRepeatingTrackCommand.Builder {
        private LoggingParams loggingParams;
        private CommandOptions options;
        private Boolean value;

        Builder() {
        }

        private Builder(SetRepeatingTrackCommand setRepeatingTrackCommand) {
            this.value = Boolean.valueOf(setRepeatingTrackCommand.value());
            this.options = setRepeatingTrackCommand.options();
            this.loggingParams = setRepeatingTrackCommand.loggingParams();
        }

        public final com.spotify.player.model.command.SetRepeatingTrackCommand.Builder value(boolean z) {
            this.value = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.command.SetRepeatingTrackCommand.Builder options(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.options = commandOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.SetRepeatingTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final SetRepeatingTrackCommand build() {
            String str = "";
            if (this.value == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" value");
                str = sb.toString();
            }
            if (this.options == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" options");
                str = sb2.toString();
            }
            if (this.loggingParams == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" loggingParams");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SetRepeatingTrackCommand(this.value.booleanValue(), this.options, this.loggingParams);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_SetRepeatingTrackCommand(boolean z, CommandOptions commandOptions, LoggingParams loggingParams2) {
        this.value = z;
        this.options = commandOptions;
        this.loggingParams = loggingParams2;
    }

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("value")
    public final boolean value() {
        return this.value;
    }

    @JsonProperty("options")
    public final CommandOptions options() {
        return this.options;
    }

    @JsonProperty("logging_params")
    public final LoggingParams loggingParams() {
        return this.loggingParams;
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

    public final com.spotify.player.model.command.SetRepeatingTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
