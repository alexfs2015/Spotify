package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;

final class AutoValue_PlayCommand extends PlayCommand {
    private final Context context;
    private final LoggingParams loggingParams;
    private final PreparePlayOptions options;
    private final PlayOptions playOptions;
    private final PlayOrigin playOrigin;

    static final class Builder extends com.spotify.player.model.command.PlayCommand.Builder {
        private Context context;
        private LoggingParams loggingParams;
        private PreparePlayOptions options;
        private PlayOptions playOptions;
        private PlayOrigin playOrigin;

        Builder() {
        }

        private Builder(PlayCommand playCommand) {
            this.context = playCommand.context();
            this.playOrigin = playCommand.playOrigin();
            this.options = playCommand.options();
            this.playOptions = playCommand.playOptions();
            this.loggingParams = playCommand.loggingParams();
        }

        public final com.spotify.player.model.command.PlayCommand.Builder context(Context context2) {
            if (context2 != null) {
                this.context = context2;
                return this;
            }
            throw new NullPointerException("Null context");
        }

        public final com.spotify.player.model.command.PlayCommand.Builder playOrigin(PlayOrigin playOrigin2) {
            if (playOrigin2 != null) {
                this.playOrigin = playOrigin2;
                return this;
            }
            throw new NullPointerException("Null playOrigin");
        }

        public final com.spotify.player.model.command.PlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            if (preparePlayOptions != null) {
                this.options = preparePlayOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.PlayCommand.Builder playOptions(PlayOptions playOptions2) {
            if (playOptions2 != null) {
                this.playOptions = playOptions2;
                return this;
            }
            throw new NullPointerException("Null playOptions");
        }

        public final com.spotify.player.model.command.PlayCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
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
            if (this.options == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" options");
                str = sb3.toString();
            }
            if (this.playOptions == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" playOptions");
                str = sb4.toString();
            }
            if (this.loggingParams == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" loggingParams");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PlayCommand autoValue_PlayCommand = new AutoValue_PlayCommand(this.context, this.playOrigin, this.options, this.playOptions, this.loggingParams);
                return autoValue_PlayCommand;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    private AutoValue_PlayCommand(Context context2, PlayOrigin playOrigin2, PreparePlayOptions preparePlayOptions, PlayOptions playOptions2, LoggingParams loggingParams2) {
        this.context = context2;
        this.playOrigin = playOrigin2;
        this.options = preparePlayOptions;
        this.playOptions = playOptions2;
        this.loggingParams = loggingParams2;
    }

    @JsonProperty("context")
    public final Context context() {
        return this.context;
    }

    @JsonProperty("play_origin")
    public final PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @JsonProperty("options")
    public final PreparePlayOptions options() {
        return this.options;
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

    public final com.spotify.player.model.command.PlayCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
