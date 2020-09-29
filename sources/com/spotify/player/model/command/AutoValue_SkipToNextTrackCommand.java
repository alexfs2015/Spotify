package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SkipToNextTrackCommand extends SkipToNextTrackCommand {
    private final LoggingParams loggingParams;
    private final CommandOptions options;
    private final Optional<ContextTrack> track;

    static final class Builder extends com.spotify.player.model.command.SkipToNextTrackCommand.Builder {
        private LoggingParams loggingParams;
        private CommandOptions options;
        private Optional<ContextTrack> track;

        Builder() {
            this.track = Optional.e();
        }

        private Builder(SkipToNextTrackCommand skipToNextTrackCommand) {
            this.track = Optional.e();
            this.track = skipToNextTrackCommand.track();
            this.options = skipToNextTrackCommand.options();
            this.loggingParams = skipToNextTrackCommand.loggingParams();
        }

        public final com.spotify.player.model.command.SkipToNextTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = Optional.b(contextTrack);
            return this;
        }

        public final com.spotify.player.model.command.SkipToNextTrackCommand.Builder options(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.options = commandOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.SkipToNextTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final SkipToNextTrackCommand build() {
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
                return new AutoValue_SkipToNextTrackCommand(this.track, this.options, this.loggingParams);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_SkipToNextTrackCommand(Optional<ContextTrack> optional, CommandOptions commandOptions, LoggingParams loggingParams2) {
        this.track = optional;
        this.options = commandOptions;
        this.loggingParams = loggingParams2;
    }

    @JsonProperty("track")
    public final Optional<ContextTrack> track() {
        return this.track;
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
        StringBuilder sb = new StringBuilder("SkipToNextTrackCommand{track=");
        sb.append(this.track);
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
        if (obj instanceof SkipToNextTrackCommand) {
            SkipToNextTrackCommand skipToNextTrackCommand = (SkipToNextTrackCommand) obj;
            return this.track.equals(skipToNextTrackCommand.track()) && this.options.equals(skipToNextTrackCommand.options()) && this.loggingParams.equals(skipToNextTrackCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    public final com.spotify.player.model.command.SkipToNextTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
