package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.List;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class SetQueueCommand implements Command {
    public static final SetQueueCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract SetQueueCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonInclude(Include.ALWAYS)
        @JsonProperty("next_tracks")
        public abstract Builder nextTracks(List<ContextTrack> list);

        @JsonProperty("options")
        public abstract Builder options(CommandOptions commandOptions);

        @JsonInclude(Include.ALWAYS)
        @JsonProperty("prev_tracks")
        public abstract Builder prevTracks(List<ContextTrack> list);

        @JsonProperty("queue_revision")
        public abstract Builder queueRevision(String str);

        @JsonCreator
        public static Builder builder() {
            return SetQueueCommand.builder();
        }
    }

    @JsonProperty("logging_params")
    public abstract LoggingParams loggingParams();

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("next_tracks")
    public abstract ImmutableList<ContextTrack> nextTracks();

    @JsonProperty("options")
    public abstract CommandOptions options();

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("prev_tracks")
    public abstract ImmutableList<ContextTrack> prevTracks();

    @JsonProperty("queue_revision")
    public abstract Optional<String> queueRevision();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().prevTracks(ImmutableList.d()).nextTracks(ImmutableList.d()).options(CommandOptions.EMPTY).loggingParams(LoggingParams.EMPTY);
    }
}
