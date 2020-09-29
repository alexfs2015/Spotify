package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;

final class AutoValue_PlaySessionCommand extends PlaySessionCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<PlayOptions> playOptions;

    static final class Builder extends com.spotify.player.model.command.PlaySessionCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<PlayOptions> playOptions;

        Builder() {
            this.playOptions = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(PlaySessionCommand playSessionCommand) {
            this.playOptions = Optional.e();
            this.loggingParams = Optional.e();
            this.playOptions = playSessionCommand.playOptions();
            this.loggingParams = playSessionCommand.loggingParams();
        }

        public final PlaySessionCommand build() {
            return new AutoValue_PlaySessionCommand(this.playOptions, this.loggingParams);
        }

        public final com.spotify.player.model.command.PlaySessionCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.PlaySessionCommand.Builder playOptions(PlayOptions playOptions2) {
            this.playOptions = Optional.b(playOptions2);
            return this;
        }
    }

    private AutoValue_PlaySessionCommand(Optional<PlayOptions> optional, Optional<LoggingParams> optional2) {
        this.playOptions = optional;
        this.loggingParams = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaySessionCommand) {
            PlaySessionCommand playSessionCommand = (PlaySessionCommand) obj;
            return this.playOptions.equals(playSessionCommand.playOptions()) && this.loggingParams.equals(playSessionCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((this.playOptions.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode();
    }

    @JsonProperty("logging_params")
    public final Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @JsonProperty("play_options")
    public final Optional<PlayOptions> playOptions() {
        return this.playOptions;
    }

    public final com.spotify.player.model.command.PlaySessionCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaySessionCommand{playOptions=");
        sb.append(this.playOptions);
        sb.append(", loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
    }
}
