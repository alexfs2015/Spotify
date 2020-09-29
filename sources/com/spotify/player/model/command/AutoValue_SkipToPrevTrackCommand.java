package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;

final class AutoValue_SkipToPrevTrackCommand extends SkipToPrevTrackCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<SkipToPrevTrackOptions> options;
    private final Optional<ContextTrack> track;

    static final class Builder extends com.spotify.player.model.command.SkipToPrevTrackCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<SkipToPrevTrackOptions> options;
        private Optional<ContextTrack> track;

        Builder() {
            this.track = Optional.e();
            this.options = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(SkipToPrevTrackCommand skipToPrevTrackCommand) {
            this.track = Optional.e();
            this.options = Optional.e();
            this.loggingParams = Optional.e();
            this.track = skipToPrevTrackCommand.track();
            this.options = skipToPrevTrackCommand.options();
            this.loggingParams = skipToPrevTrackCommand.loggingParams();
        }

        public final SkipToPrevTrackCommand build() {
            return new AutoValue_SkipToPrevTrackCommand(this.track, this.options, this.loggingParams);
        }

        public final com.spotify.player.model.command.SkipToPrevTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.SkipToPrevTrackCommand.Builder options(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            this.options = Optional.b(skipToPrevTrackOptions);
            return this;
        }

        public final com.spotify.player.model.command.SkipToPrevTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = Optional.b(contextTrack);
            return this;
        }
    }

    private AutoValue_SkipToPrevTrackCommand(Optional<ContextTrack> optional, Optional<SkipToPrevTrackOptions> optional2, Optional<LoggingParams> optional3) {
        this.track = optional;
        this.options = optional2;
        this.loggingParams = optional3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToPrevTrackCommand) {
            SkipToPrevTrackCommand skipToPrevTrackCommand = (SkipToPrevTrackCommand) obj;
            return this.track.equals(skipToPrevTrackCommand.track()) && this.options.equals(skipToPrevTrackCommand.options()) && this.loggingParams.equals(skipToPrevTrackCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @JsonProperty("logging_params")
    public final Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @JsonProperty("options")
    public final Optional<SkipToPrevTrackOptions> options() {
        return this.options;
    }

    public final com.spotify.player.model.command.SkipToPrevTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipToPrevTrackCommand{track=");
        sb.append(this.track);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("track")
    public final Optional<ContextTrack> track() {
        return this.track;
    }
}
