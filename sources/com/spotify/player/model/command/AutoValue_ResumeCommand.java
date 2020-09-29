package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_ResumeCommand extends ResumeCommand {
    private final LoggingParams loggingParams;
    private final CommandOptions options;

    static final class Builder extends com.spotify.player.model.command.ResumeCommand.Builder {
        private LoggingParams loggingParams;
        private CommandOptions options;

        Builder() {
        }

        private Builder(ResumeCommand resumeCommand) {
            this.options = resumeCommand.options();
            this.loggingParams = resumeCommand.loggingParams();
        }

        public final com.spotify.player.model.command.ResumeCommand.Builder options(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.options = commandOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.ResumeCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final ResumeCommand build() {
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
                return new AutoValue_ResumeCommand(this.options, this.loggingParams);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_ResumeCommand(CommandOptions commandOptions, LoggingParams loggingParams2) {
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
        StringBuilder sb = new StringBuilder("ResumeCommand{options=");
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
        if (obj instanceof ResumeCommand) {
            ResumeCommand resumeCommand = (ResumeCommand) obj;
            return this.options.equals(resumeCommand.options()) && this.loggingParams.equals(resumeCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode();
    }

    public final com.spotify.player.model.command.ResumeCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
