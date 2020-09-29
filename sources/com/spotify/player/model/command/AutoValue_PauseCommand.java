package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_PauseCommand extends PauseCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;

    static final class Builder extends com.spotify.player.model.command.PauseCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;

        Builder() {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(PauseCommand pauseCommand) {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
            this.options = pauseCommand.options();
            this.loggingParams = pauseCommand.loggingParams();
        }

        public final PauseCommand build() {
            return new AutoValue_PauseCommand(this.options, this.loggingParams);
        }

        public final com.spotify.player.model.command.PauseCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.PauseCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.b(commandOptions);
            return this;
        }
    }

    private AutoValue_PauseCommand(Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.options = optional;
        this.loggingParams = optional2;
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

    @JsonProperty("logging_params")
    public final Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @JsonProperty("options")
    public final Optional<CommandOptions> options() {
        return this.options;
    }

    public final com.spotify.player.model.command.PauseCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PauseCommand{options=");
        sb.append(this.options);
        sb.append(", loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
    }
}
