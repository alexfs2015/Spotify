package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_AddToQueueCommand extends AddToQueueCommand {
    private final LoggingParams loggingParams;
    private final CommandOptions options;
    private final ContextTrack track;

    static final class Builder extends com.spotify.player.model.command.AddToQueueCommand.Builder {
        private LoggingParams loggingParams;
        private CommandOptions options;
        private ContextTrack track;

        Builder() {
        }

        private Builder(AddToQueueCommand addToQueueCommand) {
            this.track = addToQueueCommand.track();
            this.options = addToQueueCommand.options();
            this.loggingParams = addToQueueCommand.loggingParams();
        }

        public final com.spotify.player.model.command.AddToQueueCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack != null) {
                this.track = contextTrack;
                return this;
            }
            throw new NullPointerException("Null track");
        }

        public final com.spotify.player.model.command.AddToQueueCommand.Builder options(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.options = commandOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.AddToQueueCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final AddToQueueCommand build() {
            String str = "";
            if (this.track == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" track");
                str = sb.toString();
            }
            if (this.options == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" options");
                str = sb2.toString();
            }
            if (this.loggingParams == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" loggingParams");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_AddToQueueCommand(this.track, this.options, this.loggingParams);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_AddToQueueCommand(ContextTrack contextTrack, CommandOptions commandOptions, LoggingParams loggingParams2) {
        this.track = contextTrack;
        this.options = commandOptions;
        this.loggingParams = loggingParams2;
    }

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("track")
    public final ContextTrack track() {
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
        StringBuilder sb = new StringBuilder("AddToQueueCommand{track=");
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
        if (obj instanceof AddToQueueCommand) {
            AddToQueueCommand addToQueueCommand = (AddToQueueCommand) obj;
            return this.track.equals(addToQueueCommand.track()) && this.options.equals(addToQueueCommand.options()) && this.loggingParams.equals(addToQueueCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    public final com.spotify.player.model.command.AddToQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
