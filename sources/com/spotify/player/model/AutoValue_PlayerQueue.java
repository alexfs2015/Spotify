package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

final class AutoValue_PlayerQueue extends PlayerQueue {
    private final ImmutableList<ContextTrack> nextTracks;
    private final ImmutableList<ContextTrack> prevTracks;
    private final String revision;
    private final Optional<ContextTrack> track;

    static final class Builder extends com.spotify.player.model.PlayerQueue.Builder {
        private ImmutableList<ContextTrack> nextTracks;
        private ImmutableList<ContextTrack> prevTracks;
        private String revision;
        private Optional<ContextTrack> track;

        Builder() {
            this.track = Optional.e();
        }

        private Builder(PlayerQueue playerQueue) {
            this.track = Optional.e();
            this.revision = playerQueue.revision();
            this.track = playerQueue.track();
            this.nextTracks = playerQueue.nextTracks();
            this.prevTracks = playerQueue.prevTracks();
        }

        public final PlayerQueue build() {
            String str = "";
            if (this.revision == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" revision");
                str = sb.toString();
            }
            if (this.nextTracks == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" nextTracks");
                str = sb2.toString();
            }
            if (this.prevTracks == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" prevTracks");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PlayerQueue autoValue_PlayerQueue = new AutoValue_PlayerQueue(this.revision, this.track, this.nextTracks, this.prevTracks);
                return autoValue_PlayerQueue;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.player.model.PlayerQueue.Builder nextTracks(ImmutableList<ContextTrack> immutableList) {
            if (immutableList != null) {
                this.nextTracks = immutableList;
                return this;
            }
            throw new NullPointerException("Null nextTracks");
        }

        public final com.spotify.player.model.PlayerQueue.Builder prevTracks(ImmutableList<ContextTrack> immutableList) {
            if (immutableList != null) {
                this.prevTracks = immutableList;
                return this;
            }
            throw new NullPointerException("Null prevTracks");
        }

        public final com.spotify.player.model.PlayerQueue.Builder revision(String str) {
            if (str != null) {
                this.revision = str;
                return this;
            }
            throw new NullPointerException("Null revision");
        }

        public final com.spotify.player.model.PlayerQueue.Builder track(ContextTrack contextTrack) {
            this.track = Optional.b(contextTrack);
            return this;
        }
    }

    private AutoValue_PlayerQueue(String str, Optional<ContextTrack> optional, ImmutableList<ContextTrack> immutableList, ImmutableList<ContextTrack> immutableList2) {
        this.revision = str;
        this.track = optional;
        this.nextTracks = immutableList;
        this.prevTracks = immutableList2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerQueue) {
            PlayerQueue playerQueue = (PlayerQueue) obj;
            return this.revision.equals(playerQueue.revision()) && this.track.equals(playerQueue.track()) && this.nextTracks.equals(playerQueue.nextTracks()) && this.prevTracks.equals(playerQueue.prevTracks());
        }
    }

    public final int hashCode() {
        return ((((((this.revision.hashCode() ^ 1000003) * 1000003) ^ this.track.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.prevTracks.hashCode();
    }

    @JsonProperty("next_tracks")
    public final ImmutableList<ContextTrack> nextTracks() {
        return this.nextTracks;
    }

    @JsonProperty("prev_tracks")
    public final ImmutableList<ContextTrack> prevTracks() {
        return this.prevTracks;
    }

    @JsonProperty("revision")
    public final String revision() {
        return this.revision;
    }

    public final com.spotify.player.model.PlayerQueue.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerQueue{revision=");
        sb.append(this.revision);
        sb.append(", track=");
        sb.append(this.track);
        sb.append(", nextTracks=");
        sb.append(this.nextTracks);
        sb.append(", prevTracks=");
        sb.append(this.prevTracks);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("track")
    public final Optional<ContextTrack> track() {
        return this.track;
    }
}
