package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SetShufflingContextCommand extends SetShufflingContextCommand {
    private final LoggingParams loggingParams;
    private final CommandOptions options;
    private final boolean value;

    static final class Builder extends com.spotify.player.model.command.SetShufflingContextCommand.Builder {
        private LoggingParams loggingParams;
        private CommandOptions options;
        private Boolean value;

        Builder() {
        }

        private Builder(SetShufflingContextCommand setShufflingContextCommand) {
            this.value = Boolean.valueOf(setShufflingContextCommand.value());
            this.options = setShufflingContextCommand.options();
            this.loggingParams = setShufflingContextCommand.loggingParams();
        }

        public final com.spotify.player.model.command.SetShufflingContextCommand.Builder value(boolean z) {
            this.value = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.command.SetShufflingContextCommand.Builder options(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.options = commandOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.SetShufflingContextCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final SetShufflingContextCommand build() {
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
                return new AutoValue_SetShufflingContextCommand(this.value.booleanValue(), this.options, this.loggingParams);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_SetShufflingContextCommand(boolean z, CommandOptions commandOptions, LoggingParams loggingParams2) {
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
        StringBuilder sb = new StringBuilder("SetShufflingContextCommand{value=");
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
        if (obj instanceof SetShufflingContextCommand) {
            SetShufflingContextCommand setShufflingContextCommand = (SetShufflingContextCommand) obj;
            return this.value == setShufflingContextCommand.value() && this.options.equals(setShufflingContextCommand.options()) && this.loggingParams.equals(setShufflingContextCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return (((((this.value ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    public final com.spotify.player.model.command.SetShufflingContextCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
