package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

final class AutoValue_LoggingParams extends LoggingParams {
    private final Optional<Long> commandInitiatedTime;
    private final Optional<Long> commandReceivedTime;

    static final class Builder extends com.spotify.player.model.command.options.LoggingParams.Builder {
        private Optional<Long> commandInitiatedTime;
        private Optional<Long> commandReceivedTime;

        Builder() {
            this.commandInitiatedTime = Optional.e();
            this.commandReceivedTime = Optional.e();
        }

        private Builder(LoggingParams loggingParams) {
            this.commandInitiatedTime = Optional.e();
            this.commandReceivedTime = Optional.e();
            this.commandInitiatedTime = loggingParams.commandInitiatedTime();
            this.commandReceivedTime = loggingParams.commandReceivedTime();
        }

        public final com.spotify.player.model.command.options.LoggingParams.Builder commandInitiatedTime(Long l) {
            this.commandInitiatedTime = Optional.b(l);
            return this;
        }

        public final com.spotify.player.model.command.options.LoggingParams.Builder commandReceivedTime(Long l) {
            this.commandReceivedTime = Optional.b(l);
            return this;
        }

        public final LoggingParams build() {
            return new AutoValue_LoggingParams(this.commandInitiatedTime, this.commandReceivedTime);
        }
    }

    private AutoValue_LoggingParams(Optional<Long> optional, Optional<Long> optional2) {
        this.commandInitiatedTime = optional;
        this.commandReceivedTime = optional2;
    }

    @JsonProperty("command_initiated_time")
    public final Optional<Long> commandInitiatedTime() {
        return this.commandInitiatedTime;
    }

    @JsonProperty("command_received_time")
    public final Optional<Long> commandReceivedTime() {
        return this.commandReceivedTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingParams{commandInitiatedTime=");
        sb.append(this.commandInitiatedTime);
        sb.append(", commandReceivedTime=");
        sb.append(this.commandReceivedTime);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoggingParams) {
            LoggingParams loggingParams = (LoggingParams) obj;
            return this.commandInitiatedTime.equals(loggingParams.commandInitiatedTime()) && this.commandReceivedTime.equals(loggingParams.commandReceivedTime());
        }
    }

    public final int hashCode() {
        return ((this.commandInitiatedTime.hashCode() ^ 1000003) * 1000003) ^ this.commandReceivedTime.hashCode();
    }

    public final com.spotify.player.model.command.options.LoggingParams.Builder toBuilder() {
        return new Builder(this);
    }
}
