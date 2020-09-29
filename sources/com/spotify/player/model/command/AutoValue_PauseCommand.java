package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_PauseCommand extends PauseCommand {
    private final LoggingParams loggingParams;
    private final CommandOptions options;

    static final class Builder extends com.spotify.player.model.command.PauseCommand.Builder {
        private LoggingParams loggingParams;
        private CommandOptions options;

        Builder() {
        }

        private Builder(PauseCommand pauseCommand) {
            this.options = pauseCommand.options();
            this.loggingParams = pauseCommand.loggingParams();
        }

        public final com.spotify.player.model.command.PauseCommand.Builder options(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.options = commandOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.PauseCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final PauseCommand build() {
            String str = "";
            if (this.options == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" options");
                str = sb.toString();
            }
            if (this.loggingParams == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loggingParams");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PauseCommand(this.options, this.loggingParams);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_PauseCommand(CommandOptions commandOptions, LoggingParams loggingParams2) {
        this.options = commandOptions;
        this.loggingParams = loggingParams2;
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
        StringBuilder sb = new StringBuilder("PauseCommand{options=");
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
        if (obj instanceof PauseCommand) {
            PauseCommand pauseCommand = (PauseCommand) obj;
            return this.options.equals(pauseCommand.options()) && this.loggingParams.equals(pauseCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode();
    }

    public final com.spotify.player.model.command.PauseCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
