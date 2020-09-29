package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;
import java.util.Collections;
import java.util.Map;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class PreparePlayOptions {
    public static final PreparePlayOptions EMPTY = builder().build();

    public static abstract class Builder {
        @JsonProperty("always_play_something")
        public abstract Builder alwaysPlaySomething(boolean z);

        @JsonProperty("audio_stream")
        public abstract Builder audioStream(AudioStream audioStream);

        public abstract PreparePlayOptions build();

        @JsonProperty("configuration_override")
        public abstract Builder configurationOverride(Map<String, Object> map);

        @JsonProperty("initially_paused")
        public abstract Builder initiallyPaused(boolean z);

        @JsonProperty("license")
        public abstract Builder license(String str);

        @JsonProperty("playback_id")
        public abstract Builder playbackId(String str);

        @JsonProperty("player_options_override")
        public abstract Builder playerOptionsOverride(PlayerOptionOverrides playerOptionOverrides);

        @JsonProperty("prefetch_level")
        public abstract Builder prefetchLevel(PrefetchLevel prefetchLevel);

        @JsonProperty("seek_to")
        public abstract Builder seekTo(Long l);

        @JsonProperty("session_id")
        public abstract Builder sessionId(String str);

        @JsonProperty("skip_to")
        public abstract Builder skipTo(SkipToTrack skipToTrack);

        @JsonProperty("suppressions")
        public abstract Builder suppressions(Suppressions suppressions);

        @JsonProperty("system_initiated")
        public abstract Builder systemInitiated(boolean z);

        @JsonCreator
        public static Builder builder() {
            return PreparePlayOptions.builder();
        }
    }

    @JsonProperty("always_play_something")
    public abstract boolean alwaysPlaySomething();

    @JsonProperty("audio_stream")
    public abstract AudioStream audioStream();

    @JsonProperty("configuration_override")
    public abstract ImmutableMap<String, Object> configurationOverride();

    @JsonProperty("initially_paused")
    public abstract boolean initiallyPaused();

    @JsonProperty("license")
    public abstract Optional<String> license();

    @JsonProperty("playback_id")
    public abstract Optional<String> playbackId();

    @JsonProperty("player_options_override")
    public abstract PlayerOptionOverrides playerOptionsOverride();

    @JsonProperty("prefetch_level")
    public abstract PrefetchLevel prefetchLevel();

    @JsonProperty("seek_to")
    public abstract Optional<Long> seekTo();

    @JsonProperty("session_id")
    public abstract String sessionId();

    @JsonProperty("skip_to")
    public abstract SkipToTrack skipTo();

    @JsonProperty("suppressions")
    public abstract Suppressions suppressions();

    @JsonProperty("system_initiated")
    public abstract boolean systemInitiated();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().alwaysPlaySomething(false).skipTo(SkipToTrack.EMPTY).initiallyPaused(false).systemInitiated(false).playerOptionsOverride(PlayerOptionOverrides.EMPTY).suppressions(Suppressions.EMPTY).prefetchLevel(PrefetchLevel.NONE).audioStream(AudioStream.DEFAULT).sessionId("").configurationOverride(Collections.emptyMap());
    }
}
