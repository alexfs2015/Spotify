package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;

final class AutoValue_PlaySessionCommand extends PlaySessionCommand {
    private final LoggingParams loggingParams;
    private final PlayOptions playOptions;

    static final class Builder extends com.spotify.player.model.command.PlaySessionCommand.Builder {
        private LoggingParams loggingParams;
        private PlayOptions playOptions;

        Builder() {
        }

        private Builder(PlaySessionCommand playSessionCommand) {
            this.playOptions = playSessionCommand.playOptions();
            this.loggingParams = playSessionCommand.loggingParams();
        }

        public final com.spotify.player.model.command.PlaySessionCommand.Builder playOptions(PlayOptions playOptions2) {
            if (playOptions2 != null) {
                this.playOptions = playOptions2;
                return this;
            }
            throw new NullPointerException("Null playOptions");
        }

        public final com.spotify.player.model.command.PlaySessionCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final PlaySessionCommand build() {
            String str = "";
            if (this.playOptions == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playOptions");
                str = sb.toString();
            }
            if (this.loggingParams == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loggingParams");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PlaySessionCommand(this.playOptions, this.loggingParams);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_PlaySessionCommand(PlayOptions playOptions2, LoggingParams loggingParams2) {
        this.playOptions = playOptions2;
        this.loggingParams = loggingParams2;
    }

    @JsonProperty("play_options")
    public final PlayOptions playOptions() {
        return this.playOptions;
    }

    @JsonProperty("logging_params")
    public final LoggingParams loggingParams() {
        return this.loggingParams;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaySessionCommand{playOptions=");
        sb.append(this.playOptions);
        sb.append(", loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
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

    public final com.spotify.player.model.command.PlaySessionCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
