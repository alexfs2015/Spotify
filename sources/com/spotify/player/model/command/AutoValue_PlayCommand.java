package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;

final class AutoValue_PlayCommand extends PlayCommand {
    private final Context context;
    private final Optional<LoggingParams> loggingParams;
    private final Optional<PreparePlayOptions> options;
    private final Optional<PlayOptions> playOptions;
    private final PlayOrigin playOrigin;

    static final class Builder extends com.spotify.player.model.command.PlayCommand.Builder {
        private Context context;
        private Optional<LoggingParams> loggingParams;
        private Optional<PreparePlayOptions> options;
        private Optional<PlayOptions> playOptions;
        private PlayOrigin playOrigin;

        Builder() {
            this.options = Optional.e();
            this.playOptions = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(PlayCommand playCommand) {
            this.options = Optional.e();
            this.playOptions = Optional.e();
            this.loggingParams = Optional.e();
            this.context = playCommand.context();
            this.playOrigin = playCommand.playOrigin();
            this.options = playCommand.options();
            this.playOptions = playCommand.playOptions();
            this.loggingParams = playCommand.loggingParams();
        }

        public final PlayCommand build() {
            String str = "";
            if (this.context == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" context");
                str = sb.toString();
            }
            if (this.playOrigin == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playOrigin");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PlayCommand autoValue_PlayCommand = new AutoValue_PlayCommand(this.context, this.playOrigin, this.options, this.playOptions, this.loggingParams);
                return autoValue_PlayCommand;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final com.spotify.player.model.command.PlayCommand.Builder context(Context context2) {
            if (context2 != null) {
                this.context = context2;
                return this;
            }
            throw new NullPointerException("Null context");
        }

        public final com.spotify.player.model.command.PlayCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.PlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            this.options = Optional.b(preparePlayOptions);
            return this;
        }

        public final com.spotify.player.model.command.PlayCommand.Builder playOptions(PlayOptions playOptions2) {
            this.playOptions = Optional.b(playOptions2);
            return this;
        }

        public final com.spotify.player.model.command.PlayCommand.Builder playOrigin(PlayOrigin playOrigin2) {
            if (playOrigin2 != null) {
                this.playOrigin = playOrigin2;
                return this;
            }
            throw new NullPointerException("Null playOrigin");
        }
    }

    private AutoValue_PlayCommand(Context context2, PlayOrigin playOrigin2, Optional<PreparePlayOptions> optional, Optional<PlayOptions> optional2, Optional<LoggingParams> optional3) {
        this.context = context2;
        this.playOrigin = playOrigin2;
        this.options = optional;
        this.playOptions = optional2;
        this.loggingParams = optional3;
    }

    @JsonProperty("context")
    public final Context context() {
        return this.context;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayCommand) {
            PlayCommand playCommand = (PlayCommand) obj;
            return this.context.equals(playCommand.context()) && this.playOrigin.equals(playCommand.playOrigin()) && this.options.equals(playCommand.options()) && this.playOptions.equals(playCommand.playOptions()) && this.loggingParams.equals(playCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((((((((this.context.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.playOptions.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @JsonProperty("logging_params")
    public final Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @JsonProperty("options")
    public final Optional<PreparePlayOptions> options() {
        return this.options;
    }

    @JsonProperty("play_options")
    public final Optional<PlayOptions> playOptions() {
        return this.playOptions;
    }

    @JsonProperty("play_origin")
    public final PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    public final com.spotify.player.model.command.PlayCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayCommand{context=");
        sb.append(this.context);
        sb.append(", playOrigin=");
        sb.append(this.playOrigin);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", playOptions=");
        sb.append(this.playOptions);
        sb.append(", loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
    }
}
