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
    private final Optional<LoggingParams> loggingParams;
    private final ImmutableList<ContextTrack> nextTracks;
    private final Optional<CommandOptions> options;
    private final ImmutableList<ContextTrack> prevTracks;
    private final String queueRevision;

    static final class Builder extends com.spotify.player.model.command.SetQueueCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private ImmutableList<ContextTrack> nextTracks;
        private Optional<CommandOptions> options;
        private ImmutableList<ContextTrack> prevTracks;
        private String queueRevision;

        Builder() {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(SetQueueCommand setQueueCommand) {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
            this.queueRevision = setQueueCommand.queueRevision();
            this.prevTracks = setQueueCommand.prevTracks();
            this.nextTracks = setQueueCommand.nextTracks();
            this.options = setQueueCommand.options();
            this.loggingParams = setQueueCommand.loggingParams();
        }

        public final SetQueueCommand build() {
            String str = "";
            if (this.queueRevision == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" queueRevision");
                str = sb.toString();
            }
            if (this.prevTracks == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" prevTracks");
                str = sb2.toString();
            }
            if (this.nextTracks == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" nextTracks");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_SetQueueCommand autoValue_SetQueueCommand = new AutoValue_SetQueueCommand(this.queueRevision, this.prevTracks, this.nextTracks, this.options, this.loggingParams);
                return autoValue_SetQueueCommand;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder nextTracks(List<ContextTrack> list) {
            this.nextTracks = ImmutableList.a((Collection<? extends E>) list);
            return this;
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.b(commandOptions);
            return this;
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder prevTracks(List<ContextTrack> list) {
            this.prevTracks = ImmutableList.a((Collection<? extends E>) list);
            return this;
        }

        public final com.spotify.player.model.command.SetQueueCommand.Builder queueRevision(String str) {
            if (str != null) {
                this.queueRevision = str;
                return this;
            }
            throw new NullPointerException("Null queueRevision");
        }
    }

    private AutoValue_SetQueueCommand(String str, ImmutableList<ContextTrack> immutableList, ImmutableList<ContextTrack> immutableList2, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.queueRevision = str;
        this.prevTracks = immutableList;
        this.nextTracks = immutableList2;
        this.options = optional;
        this.loggingParams = optional2;
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

    @JsonProperty("logging_params")
    public final Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("next_tracks")
    public final ImmutableList<ContextTrack> nextTracks() {
        return this.nextTracks;
    }

    @JsonProperty("options")
    public final Optional<CommandOptions> options() {
        return this.options;
    }

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("prev_tracks")
    public final ImmutableList<ContextTrack> prevTracks() {
        return this.prevTracks;
    }

    @JsonProperty("queue_revision")
    public final String queueRevision() {
        return this.queueRevision;
    }

    public final com.spotify.player.model.command.SetQueueCommand.Builder toBuilder() {
        return new Builder(this);
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
}
