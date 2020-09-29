package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;
import java.util.Map;

final class AutoValue_PreparePlayOptions extends PreparePlayOptions {
    private final boolean alwaysPlaySomething;
    private final AudioStream audioStream;
    private final ImmutableMap<String, Object> configurationOverride;
    private final boolean initiallyPaused;
    private final Optional<String> license;
    private final Optional<String> playbackId;
    private final PlayerOptionOverrides playerOptionsOverride;
    private final PrefetchLevel prefetchLevel;
    private final Optional<Long> seekTo;
    private final String sessionId;
    private final SkipToTrack skipTo;
    private final Suppressions suppressions;
    private final boolean systemInitiated;

    static final class Builder extends com.spotify.player.model.command.options.PreparePlayOptions.Builder {
        private Boolean alwaysPlaySomething;
        private AudioStream audioStream;
        private ImmutableMap<String, Object> configurationOverride;
        private Boolean initiallyPaused;
        private Optional<String> license;
        private Optional<String> playbackId;
        private PlayerOptionOverrides playerOptionsOverride;
        private PrefetchLevel prefetchLevel;
        private Optional<Long> seekTo;
        private String sessionId;
        private SkipToTrack skipTo;
        private Suppressions suppressions;
        private Boolean systemInitiated;

        Builder() {
            this.playbackId = Optional.e();
            this.seekTo = Optional.e();
            this.license = Optional.e();
        }

        private Builder(PreparePlayOptions preparePlayOptions) {
            this.playbackId = Optional.e();
            this.seekTo = Optional.e();
            this.license = Optional.e();
            this.playbackId = preparePlayOptions.playbackId();
            this.alwaysPlaySomething = Boolean.valueOf(preparePlayOptions.alwaysPlaySomething());
            this.skipTo = preparePlayOptions.skipTo();
            this.seekTo = preparePlayOptions.seekTo();
            this.initiallyPaused = Boolean.valueOf(preparePlayOptions.initiallyPaused());
            this.systemInitiated = Boolean.valueOf(preparePlayOptions.systemInitiated());
            this.playerOptionsOverride = preparePlayOptions.playerOptionsOverride();
            this.suppressions = preparePlayOptions.suppressions();
            this.prefetchLevel = preparePlayOptions.prefetchLevel();
            this.audioStream = preparePlayOptions.audioStream();
            this.sessionId = preparePlayOptions.sessionId();
            this.license = preparePlayOptions.license();
            this.configurationOverride = preparePlayOptions.configurationOverride();
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder playbackId(String str) {
            this.playbackId = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder alwaysPlaySomething(boolean z) {
            this.alwaysPlaySomething = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder skipTo(SkipToTrack skipToTrack) {
            if (skipToTrack != null) {
                this.skipTo = skipToTrack;
                return this;
            }
            throw new NullPointerException("Null skipTo");
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder seekTo(Long l) {
            this.seekTo = Optional.b(l);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder initiallyPaused(boolean z) {
            this.initiallyPaused = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder systemInitiated(boolean z) {
            this.systemInitiated = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder playerOptionsOverride(PlayerOptionOverrides playerOptionOverrides) {
            if (playerOptionOverrides != null) {
                this.playerOptionsOverride = playerOptionOverrides;
                return this;
            }
            throw new NullPointerException("Null playerOptionsOverride");
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder suppressions(Suppressions suppressions2) {
            if (suppressions2 != null) {
                this.suppressions = suppressions2;
                return this;
            }
            throw new NullPointerException("Null suppressions");
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder prefetchLevel(PrefetchLevel prefetchLevel2) {
            if (prefetchLevel2 != null) {
                this.prefetchLevel = prefetchLevel2;
                return this;
            }
            throw new NullPointerException("Null prefetchLevel");
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder audioStream(AudioStream audioStream2) {
            if (audioStream2 != null) {
                this.audioStream = audioStream2;
                return this;
            }
            throw new NullPointerException("Null audioStream");
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder license(String str) {
            this.license = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.options.PreparePlayOptions.Builder configurationOverride(Map<String, Object> map) {
            this.configurationOverride = ImmutableMap.a(map);
            return this;
        }

        public final PreparePlayOptions build() {
            String str = "";
            if (this.alwaysPlaySomething == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" alwaysPlaySomething");
                str = sb.toString();
            }
            if (this.skipTo == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" skipTo");
                str = sb2.toString();
            }
            if (this.initiallyPaused == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" initiallyPaused");
                str = sb3.toString();
            }
            if (this.systemInitiated == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" systemInitiated");
                str = sb4.toString();
            }
            if (this.playerOptionsOverride == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" playerOptionsOverride");
                str = sb5.toString();
            }
            if (this.suppressions == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" suppressions");
                str = sb6.toString();
            }
            if (this.prefetchLevel == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" prefetchLevel");
                str = sb7.toString();
            }
            if (this.audioStream == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" audioStream");
                str = sb8.toString();
            }
            if (this.sessionId == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" sessionId");
                str = sb9.toString();
            }
            if (this.configurationOverride == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" configurationOverride");
                str = sb10.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PreparePlayOptions autoValue_PreparePlayOptions = new AutoValue_PreparePlayOptions(this.playbackId, this.alwaysPlaySomething.booleanValue(), this.skipTo, this.seekTo, this.initiallyPaused.booleanValue(), this.systemInitiated.booleanValue(), this.playerOptionsOverride, this.suppressions, this.prefetchLevel, this.audioStream, this.sessionId, this.license, this.configurationOverride);
                return autoValue_PreparePlayOptions;
            }
            StringBuilder sb11 = new StringBuilder("Missing required properties:");
            sb11.append(str);
            throw new IllegalStateException(sb11.toString());
        }
    }

    private AutoValue_PreparePlayOptions(Optional<String> optional, boolean z, SkipToTrack skipToTrack, Optional<Long> optional2, boolean z2, boolean z3, PlayerOptionOverrides playerOptionOverrides, Suppressions suppressions2, PrefetchLevel prefetchLevel2, AudioStream audioStream2, String str, Optional<String> optional3, ImmutableMap<String, Object> immutableMap) {
        this.playbackId = optional;
        this.alwaysPlaySomething = z;
        this.skipTo = skipToTrack;
        this.seekTo = optional2;
        this.initiallyPaused = z2;
        this.systemInitiated = z3;
        this.playerOptionsOverride = playerOptionOverrides;
        this.suppressions = suppressions2;
        this.prefetchLevel = prefetchLevel2;
        this.audioStream = audioStream2;
        this.sessionId = str;
        this.license = optional3;
        this.configurationOverride = immutableMap;
    }

    @JsonProperty("playback_id")
    public final Optional<String> playbackId() {
        return this.playbackId;
    }

    @JsonProperty("always_play_something")
    public final boolean alwaysPlaySomething() {
        return this.alwaysPlaySomething;
    }

    @JsonProperty("skip_to")
    public final SkipToTrack skipTo() {
        return this.skipTo;
    }

    @JsonProperty("seek_to")
    public final Optional<Long> seekTo() {
        return this.seekTo;
    }

    @JsonProperty("initially_paused")
    public final boolean initiallyPaused() {
        return this.initiallyPaused;
    }

    @JsonProperty("system_initiated")
    public final boolean systemInitiated() {
        return this.systemInitiated;
    }

    @JsonProperty("player_options_override")
    public final PlayerOptionOverrides playerOptionsOverride() {
        return this.playerOptionsOverride;
    }

    @JsonProperty("suppressions")
    public final Suppressions suppressions() {
        return this.suppressions;
    }

    @JsonProperty("prefetch_level")
    public final PrefetchLevel prefetchLevel() {
        return this.prefetchLevel;
    }

    @JsonProperty("audio_stream")
    public final AudioStream audioStream() {
        return this.audioStream;
    }

    @JsonProperty("session_id")
    public final String sessionId() {
        return this.sessionId;
    }

    @JsonProperty("license")
    public final Optional<String> license() {
        return this.license;
    }

    @JsonProperty("configuration_override")
    public final ImmutableMap<String, Object> configurationOverride() {
        return this.configurationOverride;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreparePlayOptions) {
            PreparePlayOptions preparePlayOptions = (PreparePlayOptions) obj;
            return this.playbackId.equals(preparePlayOptions.playbackId()) && this.alwaysPlaySomething == preparePlayOptions.alwaysPlaySomething() && this.skipTo.equals(preparePlayOptions.skipTo()) && this.seekTo.equals(preparePlayOptions.seekTo()) && this.initiallyPaused == preparePlayOptions.initiallyPaused() && this.systemInitiated == preparePlayOptions.systemInitiated() && this.playerOptionsOverride.equals(preparePlayOptions.playerOptionsOverride()) && this.suppressions.equals(preparePlayOptions.suppressions()) && this.prefetchLevel.equals(preparePlayOptions.prefetchLevel()) && this.audioStream.equals(preparePlayOptions.audioStream()) && this.sessionId.equals(preparePlayOptions.sessionId()) && this.license.equals(preparePlayOptions.license()) && this.configurationOverride.equals(preparePlayOptions.configurationOverride());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.playbackId.hashCode() ^ 1000003) * 1000003) ^ (this.alwaysPlaySomething ? 1231 : 1237)) * 1000003) ^ this.skipTo.hashCode()) * 1000003) ^ this.seekTo.hashCode()) * 1000003) ^ (this.initiallyPaused ? 1231 : 1237)) * 1000003;
        if (!this.systemInitiated) {
            i = 1237;
        }
        return ((((((((((((((hashCode ^ i) * 1000003) ^ this.playerOptionsOverride.hashCode()) * 1000003) ^ this.suppressions.hashCode()) * 1000003) ^ this.prefetchLevel.hashCode()) * 1000003) ^ this.audioStream.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.configurationOverride.hashCode();
    }

    public final com.spotify.player.model.command.options.PreparePlayOptions.Builder toBuilder() {
        return new Builder(this);
    }
}
