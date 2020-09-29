package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_StopCommand extends StopCommand {
    private final Optional<LoggingParams> loggingParams;

    static final class Builder extends com.spotify.player.model.command.StopCommand.Builder {
        private Optional<LoggingParams> loggingParams;

        Builder() {
            this.loggingParams = Optional.e();
        }

        private Builder(StopCommand stopCommand) {
            this.loggingParams = Optional.e();
            this.loggingParams = stopCommand.loggingParams();
        }

        public final StopCommand build() {
            return new AutoValue_StopCommand(this.loggingParams);
        }

        public final com.spotify.player.model.command.StopCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }
    }

    private AutoValue_StopCommand(Optional<LoggingParams> optional) {
        this.loggingParams = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StopCommand)) {
            return false;
        }
        return this.loggingParams.equals(((StopCommand) obj).loggingParams());
    }

    public final int hashCode() {
        return this.loggingParams.hashCode() ^ 1000003;
    }

    @JsonProperty("logging_params")
    public final Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    public final com.spotify.player.model.command.StopCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopCommand{loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
    }
}
