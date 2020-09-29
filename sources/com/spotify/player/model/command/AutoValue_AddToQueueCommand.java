package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_AddToQueueCommand extends AddToQueueCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final ContextTrack track;

    static final class Builder extends com.spotify.player.model.command.AddToQueueCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private ContextTrack track;

        Builder() {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(AddToQueueCommand addToQueueCommand) {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
            this.track = addToQueueCommand.track();
            this.options = addToQueueCommand.options();
            this.loggingParams = addToQueueCommand.loggingParams();
        }

        public final AddToQueueCommand build() {
            String str = "";
            if (this.track == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" track");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_AddToQueueCommand(this.track, this.options, this.loggingParams);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.command.AddToQueueCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.AddToQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.b(commandOptions);
            return this;
        }

        public final com.spotify.player.model.command.AddToQueueCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack != null) {
                this.track = contextTrack;
                return this;
            }
            throw new NullPointerException("Null track");
        }
    }

    private AutoValue_AddToQueueCommand(ContextTrack contextTrack, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.track = contextTrack;
        this.options = optional;
        this.loggingParams = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddToQueueCommand) {
            AddToQueueCommand addToQueueCommand = (AddToQueueCommand) obj;
            return this.track.equals(addToQueueCommand.track()) && this.options.equals(addToQueueCommand.options()) && this.loggingParams.equals(addToQueueCommand.loggingParams());
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

    public final com.spotify.player.model.command.AddToQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddToQueueCommand{track=");
        sb.append(this.track);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("track")
    public final ContextTrack track() {
        return this.track;
    }
}
