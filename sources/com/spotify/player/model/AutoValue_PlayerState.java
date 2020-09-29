package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;

final class AutoValue_PlayerState extends PlayerState {
    private final AudioStream audioStream;
    private final ImmutableMap<String, String> contextMetadata;
    private final Restrictions contextRestrictions;
    private final String contextUri;
    private final String contextUrl;
    private final Optional<Long> duration;
    private final Optional<ContextIndex> index;
    private final boolean isBuffering;
    private final boolean isPaused;
    private final boolean isPlaying;
    private final boolean isSystemInitiated;
    private final ImmutableList<ContextTrack> nextTracks;
    private final PlayerOptions options;
    private final ImmutableMap<String, String> pageMetadata;
    private final Optional<PlayOrigin> playOrigin;
    private final Optional<String> playbackId;
    private final Optional<Double> playbackSpeed;
    private final Optional<Long> positionAsOfTimestamp;
    private final ImmutableList<ContextTrack> prevTracks;
    private final String queueRevision;
    private final Restrictions restrictions;
    private final String sessionId;
    private final Suppressions suppressions;
    private final long timestamp;
    private final Optional<ContextTrack> track;

    static final class Builder extends com.spotify.player.model.PlayerState.Builder {
        private AudioStream audioStream;
        private ImmutableMap<String, String> contextMetadata;
        private Restrictions contextRestrictions;
        private String contextUri;
        private String contextUrl;
        private Optional<Long> duration;
        private Optional<ContextIndex> index;
        private Boolean isBuffering;
        private Boolean isPaused;
        private Boolean isPlaying;
        private Boolean isSystemInitiated;
        private ImmutableList<ContextTrack> nextTracks;
        private PlayerOptions options;
        private ImmutableMap<String, String> pageMetadata;
        private Optional<PlayOrigin> playOrigin;
        private Optional<String> playbackId;
        private Optional<Double> playbackSpeed;
        private Optional<Long> positionAsOfTimestamp;
        private ImmutableList<ContextTrack> prevTracks;
        private String queueRevision;
        private Restrictions restrictions;
        private String sessionId;
        private Suppressions suppressions;
        private Long timestamp;
        private Optional<ContextTrack> track;

        Builder() {
            this.playOrigin = Optional.e();
            this.index = Optional.e();
            this.track = Optional.e();
            this.playbackId = Optional.e();
            this.playbackSpeed = Optional.e();
            this.positionAsOfTimestamp = Optional.e();
            this.duration = Optional.e();
        }

        private Builder(PlayerState playerState) {
            this.playOrigin = Optional.e();
            this.index = Optional.e();
            this.track = Optional.e();
            this.playbackId = Optional.e();
            this.playbackSpeed = Optional.e();
            this.positionAsOfTimestamp = Optional.e();
            this.duration = Optional.e();
            this.timestamp = Long.valueOf(playerState.timestamp());
            this.contextUri = playerState.contextUri();
            this.contextUrl = playerState.contextUrl();
            this.contextRestrictions = playerState.contextRestrictions();
            this.playOrigin = playerState.playOrigin();
            this.index = playerState.index();
            this.track = playerState.track();
            this.playbackId = playerState.playbackId();
            this.playbackSpeed = playerState.playbackSpeed();
            this.positionAsOfTimestamp = playerState.positionAsOfTimestamp();
            this.duration = playerState.duration();
            this.isPlaying = Boolean.valueOf(playerState.isPlaying());
            this.isPaused = Boolean.valueOf(playerState.isPaused());
            this.isBuffering = Boolean.valueOf(playerState.isBuffering());
            this.isSystemInitiated = Boolean.valueOf(playerState.isSystemInitiated());
            this.options = playerState.options();
            this.restrictions = playerState.restrictions();
            this.suppressions = playerState.suppressions();
            this.prevTracks = playerState.prevTracks();
            this.nextTracks = playerState.nextTracks();
            this.contextMetadata = playerState.contextMetadata();
            this.pageMetadata = playerState.pageMetadata();
            this.sessionId = playerState.sessionId();
            this.queueRevision = playerState.queueRevision();
            this.audioStream = playerState.audioStream();
        }

        public final com.spotify.player.model.PlayerState.Builder audioStream(AudioStream audioStream2) {
            if (audioStream2 != null) {
                this.audioStream = audioStream2;
                return this;
            }
            throw new NullPointerException("Null audioStream");
        }

        public final PlayerState build() {
            String str = "";
            if (this.timestamp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" timestamp");
                str = sb.toString();
            }
            if (this.contextUri == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" contextUri");
                str = sb2.toString();
            }
            if (this.contextUrl == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" contextUrl");
                str = sb3.toString();
            }
            if (this.contextRestrictions == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" contextRestrictions");
                str = sb4.toString();
            }
            if (this.isPlaying == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isPlaying");
                str = sb5.toString();
            }
            if (this.isPaused == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isPaused");
                str = sb6.toString();
            }
            if (this.isBuffering == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" isBuffering");
                str = sb7.toString();
            }
            if (this.isSystemInitiated == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" isSystemInitiated");
                str = sb8.toString();
            }
            if (this.options == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" options");
                str = sb9.toString();
            }
            if (this.restrictions == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" restrictions");
                str = sb10.toString();
            }
            if (this.suppressions == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" suppressions");
                str = sb11.toString();
            }
            if (this.prevTracks == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" prevTracks");
                str = sb12.toString();
            }
            if (this.nextTracks == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" nextTracks");
                str = sb13.toString();
            }
            if (this.contextMetadata == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" contextMetadata");
                str = sb14.toString();
            }
            if (this.pageMetadata == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" pageMetadata");
                str = sb15.toString();
            }
            if (this.sessionId == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" sessionId");
                str = sb16.toString();
            }
            if (this.queueRevision == null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(" queueRevision");
                str = sb17.toString();
            }
            if (this.audioStream == null) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append(" audioStream");
                str = sb18.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PlayerState autoValue_PlayerState = new AutoValue_PlayerState(this.timestamp.longValue(), this.contextUri, this.contextUrl, this.contextRestrictions, this.playOrigin, this.index, this.track, this.playbackId, this.playbackSpeed, this.positionAsOfTimestamp, this.duration, this.isPlaying.booleanValue(), this.isPaused.booleanValue(), this.isBuffering.booleanValue(), this.isSystemInitiated.booleanValue(), this.options, this.restrictions, this.suppressions, this.prevTracks, this.nextTracks, this.contextMetadata, this.pageMetadata, this.sessionId, this.queueRevision, this.audioStream);
                return autoValue_PlayerState;
            }
            StringBuilder sb19 = new StringBuilder("Missing required properties:");
            sb19.append(str);
            throw new IllegalStateException(sb19.toString());
        }

        public final com.spotify.player.model.PlayerState.Builder contextMetadata(Map<String, String> map) {
            this.contextMetadata = ImmutableMap.a(map);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder contextRestrictions(Restrictions restrictions2) {
            if (restrictions2 != null) {
                this.contextRestrictions = restrictions2;
                return this;
            }
            throw new NullPointerException("Null contextRestrictions");
        }

        public final com.spotify.player.model.PlayerState.Builder contextUri(String str) {
            if (str != null) {
                this.contextUri = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        public final com.spotify.player.model.PlayerState.Builder contextUrl(String str) {
            if (str != null) {
                this.contextUrl = str;
                return this;
            }
            throw new NullPointerException("Null contextUrl");
        }

        public final com.spotify.player.model.PlayerState.Builder duration(Long l) {
            this.duration = Optional.b(l);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder index(ContextIndex contextIndex) {
            this.index = Optional.b(contextIndex);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder isBuffering(boolean z) {
            this.isBuffering = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder isPaused(boolean z) {
            this.isPaused = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder isPlaying(boolean z) {
            this.isPlaying = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder isSystemInitiated(boolean z) {
            this.isSystemInitiated = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder nextTracks(List<ContextTrack> list) {
            this.nextTracks = ImmutableList.a((Collection<? extends E>) list);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder options(PlayerOptions playerOptions) {
            if (playerOptions != null) {
                this.options = playerOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.PlayerState.Builder pageMetadata(Map<String, String> map) {
            this.pageMetadata = ImmutableMap.a(map);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder playOrigin(PlayOrigin playOrigin2) {
            this.playOrigin = Optional.b(playOrigin2);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder playbackId(String str) {
            this.playbackId = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder playbackSpeed(Double d) {
            this.playbackSpeed = Optional.b(d);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder positionAsOfTimestamp(Long l) {
            this.positionAsOfTimestamp = Optional.b(l);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder prevTracks(List<ContextTrack> list) {
            this.prevTracks = ImmutableList.a((Collection<? extends E>) list);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder queueRevision(String str) {
            if (str != null) {
                this.queueRevision = str;
                return this;
            }
            throw new NullPointerException("Null queueRevision");
        }

        public final com.spotify.player.model.PlayerState.Builder restrictions(Restrictions restrictions2) {
            if (restrictions2 != null) {
                this.restrictions = restrictions2;
                return this;
            }
            throw new NullPointerException("Null restrictions");
        }

        public final com.spotify.player.model.PlayerState.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final com.spotify.player.model.PlayerState.Builder suppressions(Suppressions suppressions2) {
            if (suppressions2 != null) {
                this.suppressions = suppressions2;
                return this;
            }
            throw new NullPointerException("Null suppressions");
        }

        public final com.spotify.player.model.PlayerState.Builder timestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }

        public final com.spotify.player.model.PlayerState.Builder track(ContextTrack contextTrack) {
            this.track = Optional.b(contextTrack);
            return this;
        }
    }

    private AutoValue_PlayerState(long j, String str, String str2, Restrictions restrictions2, Optional<PlayOrigin> optional, Optional<ContextIndex> optional2, Optional<ContextTrack> optional3, Optional<String> optional4, Optional<Double> optional5, Optional<Long> optional6, Optional<Long> optional7, boolean z, boolean z2, boolean z3, boolean z4, PlayerOptions playerOptions, Restrictions restrictions3, Suppressions suppressions2, ImmutableList<ContextTrack> immutableList, ImmutableList<ContextTrack> immutableList2, ImmutableMap<String, String> immutableMap, ImmutableMap<String, String> immutableMap2, String str3, String str4, AudioStream audioStream2) {
        this.timestamp = j;
        this.contextUri = str;
        this.contextUrl = str2;
        this.contextRestrictions = restrictions2;
        this.playOrigin = optional;
        this.index = optional2;
        this.track = optional3;
        this.playbackId = optional4;
        this.playbackSpeed = optional5;
        this.positionAsOfTimestamp = optional6;
        this.duration = optional7;
        this.isPlaying = z;
        this.isPaused = z2;
        this.isBuffering = z3;
        this.isSystemInitiated = z4;
        this.options = playerOptions;
        this.restrictions = restrictions3;
        this.suppressions = suppressions2;
        this.prevTracks = immutableList;
        this.nextTracks = immutableList2;
        this.contextMetadata = immutableMap;
        this.pageMetadata = immutableMap2;
        this.sessionId = str3;
        this.queueRevision = str4;
        this.audioStream = audioStream2;
    }

    @JsonProperty("audio_stream")
    public final AudioStream audioStream() {
        return this.audioStream;
    }

    @JsonProperty("context_metadata")
    public final ImmutableMap<String, String> contextMetadata() {
        return this.contextMetadata;
    }

    @JsonProperty("context_restrictions")
    public final Restrictions contextRestrictions() {
        return this.contextRestrictions;
    }

    @JsonProperty("context_uri")
    public final String contextUri() {
        return this.contextUri;
    }

    @JsonProperty("context_url")
    public final String contextUrl() {
        return this.contextUrl;
    }

    @JsonProperty("duration")
    public final Optional<Long> duration() {
        return this.duration;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerState) {
            PlayerState playerState = (PlayerState) obj;
            return this.timestamp == playerState.timestamp() && this.contextUri.equals(playerState.contextUri()) && this.contextUrl.equals(playerState.contextUrl()) && this.contextRestrictions.equals(playerState.contextRestrictions()) && this.playOrigin.equals(playerState.playOrigin()) && this.index.equals(playerState.index()) && this.track.equals(playerState.track()) && this.playbackId.equals(playerState.playbackId()) && this.playbackSpeed.equals(playerState.playbackSpeed()) && this.positionAsOfTimestamp.equals(playerState.positionAsOfTimestamp()) && this.duration.equals(playerState.duration()) && this.isPlaying == playerState.isPlaying() && this.isPaused == playerState.isPaused() && this.isBuffering == playerState.isBuffering() && this.isSystemInitiated == playerState.isSystemInitiated() && this.options.equals(playerState.options()) && this.restrictions.equals(playerState.restrictions()) && this.suppressions.equals(playerState.suppressions()) && this.prevTracks.equals(playerState.prevTracks()) && this.nextTracks.equals(playerState.nextTracks()) && this.contextMetadata.equals(playerState.contextMetadata()) && this.pageMetadata.equals(playerState.pageMetadata()) && this.sessionId.equals(playerState.sessionId()) && this.queueRevision.equals(playerState.queueRevision()) && this.audioStream.equals(playerState.audioStream());
        }
    }

    public final int hashCode() {
        long j = this.timestamp;
        int i = 1231;
        int hashCode = (((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.contextUri.hashCode()) * 1000003) ^ this.contextUrl.hashCode()) * 1000003) ^ this.contextRestrictions.hashCode()) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.index.hashCode()) * 1000003) ^ this.track.hashCode()) * 1000003) ^ this.playbackId.hashCode()) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003) ^ this.positionAsOfTimestamp.hashCode()) * 1000003) ^ this.duration.hashCode()) * 1000003) ^ (this.isPlaying ? 1231 : 1237)) * 1000003) ^ (this.isPaused ? 1231 : 1237)) * 1000003) ^ (this.isBuffering ? 1231 : 1237)) * 1000003;
        if (!this.isSystemInitiated) {
            i = 1237;
        }
        return this.audioStream.hashCode() ^ ((((((((((((((((((((hashCode ^ i) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.restrictions.hashCode()) * 1000003) ^ this.suppressions.hashCode()) * 1000003) ^ this.prevTracks.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.contextMetadata.hashCode()) * 1000003) ^ this.pageMetadata.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.queueRevision.hashCode()) * 1000003);
    }

    @JsonProperty("index")
    public final Optional<ContextIndex> index() {
        return this.index;
    }

    @JsonProperty("is_buffering")
    public final boolean isBuffering() {
        return this.isBuffering;
    }

    @JsonProperty("is_paused")
    public final boolean isPaused() {
        return this.isPaused;
    }

    @JsonProperty("is_playing")
    public final boolean isPlaying() {
        return this.isPlaying;
    }

    @JsonProperty("is_system_initiated")
    public final boolean isSystemInitiated() {
        return this.isSystemInitiated;
    }

    @JsonProperty("future")
    public final ImmutableList<ContextTrack> nextTracks() {
        return this.nextTracks;
    }

    @JsonProperty("options")
    public final PlayerOptions options() {
        return this.options;
    }

    @JsonProperty("page_metadata")
    public final ImmutableMap<String, String> pageMetadata() {
        return this.pageMetadata;
    }

    @JsonProperty("play_origin")
    public final Optional<PlayOrigin> playOrigin() {
        return this.playOrigin;
    }

    @JsonProperty("playback_id")
    public final Optional<String> playbackId() {
        return this.playbackId;
    }

    @JsonProperty("playback_speed")
    public final Optional<Double> playbackSpeed() {
        return this.playbackSpeed;
    }

    @JsonProperty("position_as_of_timestamp")
    public final Optional<Long> positionAsOfTimestamp() {
        return this.positionAsOfTimestamp;
    }

    @JsonProperty("reverse")
    public final ImmutableList<ContextTrack> prevTracks() {
        return this.prevTracks;
    }

    @JsonProperty("queue_revision")
    public final String queueRevision() {
        return this.queueRevision;
    }

    @JsonProperty("restrictions")
    public final Restrictions restrictions() {
        return this.restrictions;
    }

    @JsonProperty("session_id")
    public final String sessionId() {
        return this.sessionId;
    }

    @JsonProperty("suppressions")
    public final Suppressions suppressions() {
        return this.suppressions;
    }

    @JsonProperty("timestamp")
    public final long timestamp() {
        return this.timestamp;
    }

    public final com.spotify.player.model.PlayerState.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerState{timestamp=");
        sb.append(this.timestamp);
        sb.append(", contextUri=");
        sb.append(this.contextUri);
        sb.append(", contextUrl=");
        sb.append(this.contextUrl);
        sb.append(", contextRestrictions=");
        sb.append(this.contextRestrictions);
        sb.append(", playOrigin=");
        sb.append(this.playOrigin);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", track=");
        sb.append(this.track);
        sb.append(", playbackId=");
        sb.append(this.playbackId);
        sb.append(", playbackSpeed=");
        sb.append(this.playbackSpeed);
        sb.append(", positionAsOfTimestamp=");
        sb.append(this.positionAsOfTimestamp);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", isPlaying=");
        sb.append(this.isPlaying);
        sb.append(", isPaused=");
        sb.append(this.isPaused);
        sb.append(", isBuffering=");
        sb.append(this.isBuffering);
        sb.append(", isSystemInitiated=");
        sb.append(this.isSystemInitiated);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", restrictions=");
        sb.append(this.restrictions);
        sb.append(", suppressions=");
        sb.append(this.suppressions);
        sb.append(", prevTracks=");
        sb.append(this.prevTracks);
        sb.append(", nextTracks=");
        sb.append(this.nextTracks);
        sb.append(", contextMetadata=");
        sb.append(this.contextMetadata);
        sb.append(", pageMetadata=");
        sb.append(this.pageMetadata);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", queueRevision=");
        sb.append(this.queueRevision);
        sb.append(", audioStream=");
        sb.append(this.audioStream);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("track")
    public final Optional<ContextTrack> track() {
        return this.track;
    }
}
