package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;

final class AutoValue_SkipToPrevTrackCommand extends SkipToPrevTrackCommand {
    private final LoggingParams loggingParams;
    private final SkipToPrevTrackOptions options;
    private final Optional<ContextTrack> track;

    static final class Builder extends com.spotify.player.model.command.SkipToPrevTrackCommand.Builder {
        private LoggingParams loggingParams;
        private SkipToPrevTrackOptions options;
        private Optional<ContextTrack> track;

        Builder() {
            this.track = Optional.e();
        }

        private Builder(SkipToPrevTrackCommand skipToPrevTrackCommand) {
            this.track = Optional.e();
            this.track = skipToPrevTrackCommand.track();
            this.options = skipToPrevTrackCommand.options();
            this.loggingParams = skipToPrevTrackCommand.loggingParams();
        }

        public final com.spotify.player.model.command.SkipToPrevTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = Optional.b(contextTrack);
            return this;
        }

        public final com.spotify.player.model.command.SkipToPrevTrackCommand.Builder options(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            if (skipToPrevTrackOptions != null) {
                this.options = skipToPrevTrackOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.SkipToPrevTrackCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final SkipToPrevTrackCommand build() {
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
                return new AutoValue_SkipToPrevTrackCommand(this.track, this.options, this.loggingParams);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_SkipToPrevTrackCommand(Optional<ContextTrack> optional, SkipToPrevTrackOptions skipToPrevTrackOptions, LoggingParams loggingParams2) {
        this.track = optional;
        this.options = skipToPrevTrackOptions;
        this.loggingParams = loggingParams2;
    }

    @JsonProperty("track")
    public final Optional<ContextTrack> track() {
        return this.track;
    }

    @JsonProperty("options")
    public final SkipToPrevTrackOptions options() {
        return this.options;
    }

    @JsonProperty("logging_params")
    public final LoggingParams loggingParams() {
        return this.loggingParams;
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

    public final com.spotify.player.model.command.SkipToPrevTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
