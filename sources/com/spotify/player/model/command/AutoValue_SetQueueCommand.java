package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Collection;
import java.util.List;

final class AutoValue_SetQueueCommand extends SetQueueCommand {
    private final LoggingParams loggingParams;
    private final ImmutableList<ContextTrack> nextTracks;
    private final CommandOptions options;
    private final ImmutableList<ContextTrack> prevTracks;
    private final Optional<String> queueRevision;

    static final class Builder extends com.spotify.player.model.command.SetQueueCommand.Builder {
        private LoggingParams loggingParams;
        private ImmutableList<ContextTrack> nextTracks;
        private CommandOptions options;
        private ImmutableList<ContextTrack> prevTracks;
        private Optional<String> queueRevision;

        Builder() {
            this.queueRevision = Optional.e();
        }

        private Builder(SetQueueCommand setQueueCommand) {
            this.queueRevision = Optional.e();
            this.queueRevision = setQueueCommand.queueRevision();
            this.prevTracks = setQueueCommand.prevTracks();
            this.nextTracks = setQueueCommand.nextTracks();
            this.options = setQueueCommand.options();
            this.loggingParams = setQueueCommand.loggingParams();
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder queueRevision(String str) {
            this.queueRevision = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder prevTracks(List<ContextTrack> list) {
            this.prevTracks = ImmutableList.a((Collection<? extends E>) list);
            return this;
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder nextTracks(List<ContextTrack> list) {
            this.nextTracks = ImmutableList.a((Collection<? extends E>) list);
            return this;
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder options(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.options = commandOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final SetQueueCommand build() {
            String str = "";
            if (this.prevTracks == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" prevTracks");
                str = sb.toString();
            }
            if (this.nextTracks == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" nextTracks");
                str = sb2.toString();
            }
            if (this.options == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" options");
                str = sb3.toString();
            }
            if (this.loggingParams == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" loggingParams");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                AutoValue_SetQueueCommand autoValue_SetQueueCommand = new AutoValue_SetQueueCommand(this.queueRevision, this.prevTracks, this.nextTracks, this.options, this.loggingParams);
                return autoValue_SetQueueCommand;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private AutoValue_SetQueueCommand(Optional<String> optional, ImmutableList<ContextTrack> immutableList, ImmutableList<ContextTrack> immutableList2, CommandOptions commandOptions, LoggingParams loggingParams2) {
        this.queueRevision = optional;
        this.prevTracks = immutableList;
        this.nextTracks = immutableList2;
        this.options = commandOptions;
        this.loggingParams = loggingParams2;
    }

    @JsonProperty("queue_revision")
    public final Optional<String> queueRevision() {
        return this.queueRevision;
    }

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("prev_tracks")
    public final ImmutableList<ContextTrack> prevTracks() {
        return this.prevTracks;
    }

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("next_tracks")
    public final ImmutableList<ContextTrack> nextTracks() {
        return this.nextTracks;
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
        StringBuilder sb = new StringBuilder("SetQueueCommand{queueRevision=");
        sb.append(this.queueRevision);
        sb.append(", prevTracks=");
        sb.append(this.prevTracks);
        sb.append(", nextTracks=");
        sb.append(this.nextTracks);
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
        if (obj instanceof SetQueueCommand) {
            SetQueueCommand setQueueCommand = (SetQueueCommand) obj;
            return this.queueRevision.equals(setQueueCommand.queueRevision()) && this.prevTracks.equals(setQueueCommand.prevTracks()) && this.nextTracks.equals(setQueueCommand.nextTracks()) && this.options.equals(setQueueCommand.options()) && this.loggingParams.equals(setQueueCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((((((((this.queueRevision.hashCode() ^ 1000003) * 1000003) ^ this.prevTracks.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    public final com.spotify.player.model.command.SetQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
