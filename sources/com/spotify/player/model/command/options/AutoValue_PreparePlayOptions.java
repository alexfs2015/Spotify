package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;

final class AutoValue_PreparePlayOptions extends PreparePlayOptions {
    private final Optional<Boolean> alwaysPlaySomething;
    private final Optional<AudioStream> audioStream;
    private final ImmutableMap<String, Object> configurationOverride;
    private final Optional<Boolean> initiallyPaused;
    private final Optional<String> license;
    private final Optional<String> playbackId;
    private final Optional<PlayerOptionOverrides> playerOptionsOverride;
    private final Optional<PrefetchLevel> prefetchLevel;
    private final Optional<Long> seekTo;
    private final Optional<String> sessionId;
    private final Optional<SkipToTrack> skipTo;
    private final Optional<Suppressions> suppressions;
    private final Optional<Boolean> systemInitiated;

    static final class Builder extends com.spotify.player.model.command.options.PreparePlayOptions.Builder {
        private Optional<Boolean> alwaysPlaySomething;
        private Optional<AudioStream> audioStream;
        private ImmutableMap<String, Object> configurationOverride;
        private Optional<Boolean> initiallyPaused;
        private Optional<String> license;
        private Optional<String> playbackId;
        private Optional<PlayerOptionOverrides> playerOptionsOverride;
        private Optional<PrefetchLevel> prefetchLevel;
        private Optional<Long> seekTo;
        private Optional<String> sessionId;
        private Optional<SkipToTrack> skipTo;
        private Optional<Suppressions> suppressions;
        private Optional<Boolean> systemInitiated;

        Builder() {
            this.playbackId = Optional.e();
            this.alwaysPlaySomething = Optional.e();
            this.skipTo = Optional.e();
            this.seekTo = Optional.e();
            this.initiallyPaused = Optional.e();
            this.systemInitiated = Optional.e();
            this.playerOptionsOverride = Optional.e();
            this.suppressions = Optional.e();
            this.prefetchLevel = Optional.e();
            this.audioStream = Optional.e();
            this.sessionId = Optional.e();
            this.license = Optional.e();
        }

        private Builder(PreparePlayOptions preparePlayOptions) {
            this.playbackId = Optional.e();
            this.alwaysPlaySomething = Optional.e();
            this.skipTo = Optional.e();
            this.seekTo = Optional.e();
            this.initiallyPaused = Optional.e();
            this.systemInitiated = Optional.e();
            this.playerOptionsOverride = Optional.e();
            this.suppressions = Optional.e();
            this.prefetchLevel = Optional.e();
            this.audioStream = Optional.e();
            this.sessionId = Optional.e();
            this.license = Optional.e();
            this.playbackId = preparePlayOptions.playbackId();
            this.alwaysPlaySomething = preparePlayOptions.alwaysPlaySomething();
            this.skipTo = preparePlayOptions.skipTo();
            this.seekTo = preparePlayOptions.seekTo();
            this.initiallyPaused = preparePlayOptions.initiallyPaused();
            this.systemInitiated = preparePlayOptions.systemInitiated();
            this.playerOptionsOverride = preparePlayOptions.playerOptionsOverride();
            this.suppressions = preparePlayOptions.suppressions();
            this.prefetchLevel = preparePlayOptions.prefetchLevel();
            this.audioStream = preparePlayOptions.audioStream();
            this.sessionId = preparePlayOptions.sessionId();
            this.license = preparePlayOptions.license();
            this.configurationOverride = preparePlayOptions.configurationOverride();
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder alwaysPlaySomething(boolean z) {
            this.alwaysPlaySomething = Optional.b(Boolean.valueOf(z));
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder audioStream(AudioStream audioStream2) {
            this.audioStream = Optional.b(audioStream2);
            return this;
        }

        public final PreparePlayOptions build() {
            String str = "";
            if (this.configurationOverride == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" configurationOverride");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PreparePlayOptions autoValue_PreparePlayOptions = new AutoValue_PreparePlayOptions(this.playbackId, this.alwaysPlaySomething, this.skipTo, this.seekTo, this.initiallyPaused, this.systemInitiated, this.playerOptionsOverride, this.suppressions, this.prefetchLevel, this.audioStream, this.sessionId, this.license, this.configurationOverride);
                return autoValue_PreparePlayOptions;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder configurationOverride(ImmutableMap<String, Object> immutableMap) {
            if (immutableMap != null) {
                this.configurationOverride = immutableMap;
                return this;
            }
            throw new NullPointerException("Null configurationOverride");
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder initiallyPaused(boolean z) {
            this.initiallyPaused = Optional.b(Boolean.valueOf(z));
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder license(String str) {
            this.license = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder playbackId(String str) {
            this.playbackId = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder playerOptionsOverride(PlayerOptionOverrides playerOptionOverrides) {
            this.playerOptionsOverride = Optional.b(playerOptionOverrides);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder prefetchLevel(PrefetchLevel prefetchLevel2) {
            this.prefetchLevel = Optional.b(prefetchLevel2);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder seekTo(Long l) {
            this.seekTo = Optional.b(l);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder sessionId(String str) {
            this.sessionId = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder skipTo(SkipToTrack skipToTrack) {
            this.skipTo = Optional.b(skipToTrack);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder suppressions(Suppressions suppressions2) {
            this.suppressions = Optional.b(suppressions2);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder systemInitiated(boolean z) {
            this.systemInitiated = Optional.b(Boolean.valueOf(z));
            return this;
        }
    }

    private AutoValue_PreparePlayOptions(Optional<String> optional, Optional<Boolean> optional2, Optional<SkipToTrack> optional3, Optional<Long> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, Optional<PlayerOptionOverrides> optional7, Optional<Suppressions> optional8, Optional<PrefetchLevel> optional9, Optional<AudioStream> optional10, Optional<String> optional11, Optional<String> optional12, ImmutableMap<String, Object> immutableMap) {
        this.playbackId = optional;
        this.alwaysPlaySomething = optional2;
        this.skipTo = optional3;
        this.seekTo = optional4;
        this.initiallyPaused = optional5;
        this.systemInitiated = optional6;
        this.playerOptionsOverride = optional7;
        this.suppressions = optional8;
        this.prefetchLevel = optional9;
        this.audioStream = optional10;
        this.sessionId = optional11;
        this.license = optional12;
        this.configurationOverride = immutableMap;
    }

    @JsonProperty("always_play_something")
    public final Optional<Boolean> alwaysPlaySomething() {
        return this.alwaysPlaySomething;
    }

    @JsonProperty("audio_stream")
    public final Optional<AudioStream> audioStream() {
        return this.audioStream;
    }

    @JsonProperty("configuration_override")
    public final ImmutableMap<String, Object> configurationOverride() {
        return this.configurationOverride;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreparePlayOptions) {
            PreparePlayOptions preparePlayOptions = (PreparePlayOptions) obj;
            return this.playbackId.equals(preparePlayOptions.playbackId()) && this.alwaysPlaySomething.equals(preparePlayOptions.alwaysPlaySomething()) && this.skipTo.equals(preparePlayOptions.skipTo()) && this.seekTo.equals(preparePlayOptions.seekTo()) && this.initiallyPaused.equals(preparePlayOptions.initiallyPaused()) && this.systemInitiated.equals(preparePlayOptions.systemInitiated()) && this.playerOptionsOverride.equals(preparePlayOptions.playerOptionsOverride()) && this.suppressions.equals(preparePlayOptions.suppressions()) && this.prefetchLevel.equals(preparePlayOptions.prefetchLevel()) && this.audioStream.equals(preparePlayOptions.audioStream()) && this.sessionId.equals(preparePlayOptions.sessionId()) && this.license.equals(preparePlayOptions.license()) && this.configurationOverride.equals(preparePlayOptions.configurationOverride());
        }
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.playbackId.hashCode() ^ 1000003) * 1000003) ^ this.alwaysPlaySomething.hashCode()) * 1000003) ^ this.skipTo.hashCode()) * 1000003) ^ this.seekTo.hashCode()) * 1000003) ^ this.initiallyPaused.hashCode()) * 1000003) ^ this.systemInitiated.hashCode()) * 1000003) ^ this.playerOptionsOverride.hashCode()) * 1000003) ^ this.suppressions.hashCode()) * 1000003) ^ this.prefetchLevel.hashCode()) * 1000003) ^ this.audioStream.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.configurationOverride.hashCode();
    }

    @JsonProperty("initially_paused")
    public final Optional<Boolean> initiallyPaused() {
        return this.initiallyPaused;
    }

    @JsonProperty("license")
    public final Optional<String> license() {
        return this.license;
    }

    @JsonProperty("playback_id")
    public final Optional<String> playbackId() {
        return this.playbackId;
    }

    @JsonProperty("player_options_override")
    public final Optional<PlayerOptionOverrides> playerOptionsOverride() {
        return this.playerOptionsOverride;
    }

    @JsonProperty("prefetch_level")
    public final Optional<PrefetchLevel> prefetchLevel() {
        return this.prefetchLevel;
    }

    @JsonProperty("seek_to")
    public final Optional<Long> seekTo() {
        return this.seekTo;
    }

    @JsonProperty("session_id")
    public final Optional<String> sessionId() {
        return this.sessionId;
    }

    @JsonProperty("skip_to")
    public final Optional<SkipToTrack> skipTo() {
        return this.skipTo;
    }

    @JsonProperty("suppressions")
    public final Optional<Suppressions> suppressions() {
        return this.suppressions;
    }

    @JsonProperty("system_initiated")
    public final Optional<Boolean> systemInitiated() {
        return this.systemInitiated;
    }

    public final com.spotify.player.model.command.options.PreparePlayOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreparePlayOptions{playbackId=");
        sb.append(this.playbackId);
        sb.append(", alwaysPlaySomething=");
        sb.append(this.alwaysPlaySomething);
        sb.append(", skipTo=");
        sb.append(this.skipTo);
        sb.append(", seekTo=");
        sb.append(this.seekTo);
        sb.append(", initiallyPaused=");
        sb.append(this.initiallyPaused);
        sb.append(", systemInitiated=");
        sb.append(this.systemInitiated);
        sb.append(", playerOptionsOverride=");
        sb.append(this.playerOptionsOverride);
        sb.append(", suppressions=");
        sb.append(this.suppressions);
        sb.append(", prefetchLevel=");
        sb.append(this.prefetchLevel);
        sb.append(", audioStream=");
        sb.append(this.audioStream);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", license=");
        sb.append(this.license);
        sb.append(", configurationOverride=");
        sb.append(this.configurationOverride);
        sb.append("}");
        return sb.toString();
    }
}
