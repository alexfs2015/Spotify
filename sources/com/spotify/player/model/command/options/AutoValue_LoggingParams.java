package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

final class AutoValue_LoggingParams extends LoggingParams {
    private final Optional<Long> commandInitiatedTime;

    static final class Builder extends com.spotify.player.model.command.options.LoggingParams.Builder {
        private Optional<Long> commandInitiatedTime;

        Builder() {
            this.commandInitiatedTime = Optional.e();
        }

        private Builder(LoggingParams loggingParams) {
            this.commandInitiatedTime = Optional.e();
            this.commandInitiatedTime = loggingParams.commandInitiatedTime();
        }

        public final LoggingParams build() {
            return new AutoValue_LoggingParams(this.commandInitiatedTime);
        }

        public final com.spotify.player.model.command.options.LoggingParams.Builder commandInitiatedTime(Long l) {
            this.commandInitiatedTime = Optional.b(l);
            return this;
        }
    }

    private AutoValue_LoggingParams(Optional<Long> optional) {
        this.commandInitiatedTime = optional;
    }

    @JsonProperty("command_initiated_time")
    public final Optional<Long> commandInitiatedTime() {
        return this.commandInitiatedTime;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoggingParams)) {
            return false;
        }
        return this.commandInitiatedTime.equals(((LoggingParams) obj).commandInitiatedTime());
    }

    public final int hashCode() {
        return this.commandInitiatedTime.hashCode() ^ 1000003;
    }

    public final com.spotify.player.model.command.options.LoggingParams.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingParams{commandInitiatedTime=");
        sb.append(this.commandInitiatedTime);
        sb.append("}");
        return sb.toString();
    }
}
