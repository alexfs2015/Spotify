package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SkipToNextTrackCommand extends SkipToNextTrackCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final Optional<ContextTrack> track;

    static final class Builder extends com.spotify.player.model.command.SkipToNextTrackCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private Optional<ContextTrack> track;

        Builder() {
            this.track = Optional.e();
            this.options = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(SkipToNextTrackCommand skipToNextTrackCommand) {
            this.track = Optional.e();
            this.options = Optional.e();
            this.loggingParams = Optional.e();
            this.track = skipToNextTrackCommand.track();
            this.options = skipToNextTrackCommand.options();
            this.loggingParams = skipToNextTrackCommand.loggingParams();
        }

        public final SkipToNextTrackCommand build() {
            return new AutoValue_SkipToNextTrackCommand(this.track, this.options, this.loggingParams);
        }

        public final com.spotify.player.model.command.SkipToNextTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.SkipToNextTrackCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.b(commandOptions);
            return this;
        }

        public final com.spotify.player.model.command.SkipToNextTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = Optional.b(contextTrack);
            return this;
        }
    }

    private AutoValue_SkipToNextTrackCommand(Optional<ContextTrack> optional, Optional<CommandOptions> optional2, Optional<LoggingParams> optional3) {
        this.track = optional;
        this.options = optional2;
        this.loggingParams = optional3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToNextTrackCommand) {
            SkipToNextTrackCommand skipToNextTrackCommand = (SkipToNextTrackCommand) obj;
            return this.track.equals(skipToNextTrackCommand.track()) && this.options.equals(skipToNextTrackCommand.options()) && this.loggingParams.equals(skipToNextTrackCommand.loggingParams());
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
    public final Optional<CommandOptions> options() {
        return this.options;
    }

    public final com.spotify.player.model.command.SkipToNextTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipToNextTrackCommand{track=");
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
